"""CD Chat server program."""
import logging
from .protocol import CDProto, CDProtoBadFormat, Message
import socket
import selectors
import json
import signal

logging.basicConfig(filename="server.log", level=logging.DEBUG)

class Server:
    """Chat Server process."""

    def __init__(self) -> None:
        ## criar socket do servidor

        ip:str = '127.0.0.1'
        porta:int = 8000

        # criar selector para receber vários sockets
        self.sel = selectors.DefaultSelector()

        # criar socket
        self.server_socket:socket.socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.server_socket.setsockopt(socket.SOL_SOCKET,socket.SO_REUSEADDR,1)
        self.server_socket.bind((ip, porta)) # server no localhost na porta 80

        self.socket2name:dict = {}                         # nome de usuário associado a um socket
        self.channels:dict = {"none":[]}                 # dicionário para associar canais aos sockets.
        self.socket2channel:dict = {}                      # conal a que um socket está associado

        print( f"....................\nip:{ip}\nporta:{porta}\n....................\n"  )

    def accept(self,sock,_) -> None:

        # receber socket
        (clientsocket, address) = sock.accept()

        # alterar o callback associado no selector
        self.sel.register(clientsocket, selectors.EVENT_READ, self.receive)

        # atualizar tabelas adicionais
        self.socket2name[clientsocket] = "anonimo"
        logging.info(f"{address} connected")

    def processRegister(self,client_socket, data) -> None:

        # atualizar informação nas tabelas auxiliares e associar o socket ao canal default
        self.socket2name[client_socket] = data["user"]
        self.channels["none"] = self.channels["none"] + [client_socket]
        self.socket2channel[client_socket] = "none"

        logging.info(f"{data["user"]} foi registado")

    def processJoin(self,client_socket,data) -> None:

        # mudar o usuário de canal
        channel:str = data["channel"]
        previous_channel = self.socket2channel[client_socket]

        # adicionar novos valores nas tabelas auxiliades
        if channel in self.channels:
            # canal já exite
            self.channels[channel] = self.channels[channel] + [client_socket]
        else:
            # novo canal
            self.channels[channel] = [client_socket]

        # atualizar tabelas auxiliares
        self.socket2channel[client_socket] = channel
        self.channels[previous_channel].remove(client_socket)

        logging.info(f"{self.socket2name[client_socket]}: {previous_channel} --> {channel}")

    def processMessage(self,client_socket,data,mssg) -> None:

        # nome do usuário a enviar a menssagem
        user = self.socket2name[client_socket]

        # encontrar canal a ser usado
        channel:str = "none"
        if "channel" in data:
            channel = data["channel"]

        if not channel in self.channels:
            logging.error(f"{channel} não foi encontrado na lista de canais \
                Menssagem de {user}")
            return

        # adicionar o nome do remetente na menssagem
        message:str = data["message"]
        message_cUser:str = f"{user}: {message}"
        data["message"] = message_cUser

        Message_toSend:Message = CDProto.message("")
        Message_toSend.content = json.dumps(data)

        # enviar a menssagem para todos os sockets do canal
        for sck in self.channels[channel]:
            CDProto.send_msg(sck,Message_toSend)

        print(f"[{channel}]{self.socket2name[client_socket]}: {message}",end="")

    def disconnect(self,client_socket) -> None:

        # processo de desconectar usuário
        self.sel.unregister(client_socket)
        client_socket.close()

        # encontrar canal
        channel:str = self.socket2channel.pop(client_socket, None)
        name:str = self.socket2name[client_socket]

        if channel == None: return

        # atualizar tabelas auxiliares
        self.channels[channel].remove(client_socket)
        del self.socket2name[client_socket]
        if len(self.channels[channel]) == 0 and channel != "none":
            # apagar entrada do canal caso o canal já não for usado
            del self.channels[channel]

        logging.info (f"{name} saiu da conexão.")

    def receive(self, client_socket, _) -> None:

        mssg:Message = Message()

        # receber menssagem do socket do cliente
        try:
            mssg = CDProto.recv_msg(client_socket)
        except CDProtoBadFormat as e:
            # conexão terminada
            logging.error(f"Erro de formato: {e}")
            self.disconnect(client_socket)
            return

        # identificar tipo de menssagem
        data_json:str = mssg.content
        data:dict = json.loads(data_json)
        cmd:str = data["command"]

        # processar os tipos de menssagem
        if cmd == "join":
            self.processJoin(client_socket,data)
        elif cmd == "register":
            self.processRegister(client_socket,data)
        elif cmd == "message":
            self.processMessage(client_socket,data,mssg)
        else:
            logging.error(f"Commando inválido recebido: {cmd}")

    def loop(self) -> None:
        """Loop indefinetely."""

        # preparar socket
        self.server_socket.listen(100)
        self.sel.register(self.server_socket,selectors.EVENT_READ,self.accept)

        while 2:

            events:list = self.sel.select()
            for key, _ in events:
                callback = key.data
                callback(key.fileobj,_)

def close(sig, frame) -> None:
    # função para fechar o servidor
    print("terminando...")
    exit(0)

# usar control c para fechar server sem erro no terminal
signal.signal(signal.SIGINT, close)
