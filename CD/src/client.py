"""CD Chat client program"""
import logging
import sys
import socket
import json
import selectors
import os
import fcntl
import signal

from .protocol import CDProto, CDProtoBadFormat, Message

logging.basicConfig(filename=f"{sys.argv[0]}.log", level=logging.DEBUG)

class Client:
    """Chat Client process."""

    def __init__(self, name: str = "Foo") -> None:
        """Initializes chat client."""

        # valores associados ao cliente
        self.name:str = name
        self.channel:str = "none"

        # socket
        self.socket:socket.socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.socket.setsockopt(socket.SOL_SOCKET,socket.SO_REUSEADDR,1)

        # seletor para lidar com input do teclado e eventos de socket
        self.sel:selectors.DefaultSelector = selectors.DefaultSelector()

    def connect(self) -> None:
        """Connect to chat server and setup stdin flags."""

        # conectar ao server
        ip:str = '127.0.0.1'
        porta:int = 8000
        self.socket.connect( (ip,porta) )

        # registrar cliente
        mssg:Message = CDProto.register(self.name)
        CDProto.send_msg(self.socket,mssg)

        # stdin flags
        # set sys.stdin non-blocking
        if sys.stdin.isatty():
            orig_fl = fcntl.fcntl(sys.stdin, fcntl.F_GETFL)
            fcntl.fcntl(sys.stdin, fcntl.F_SETFL, orig_fl | os.O_NONBLOCK)

    def display_prompt(self,s:str = "",previous:int = 1) -> None:
        if previous:
            sys.stdout.write("\033[F") # linha anterior
        sys.stdout.write("\033[G") # inicio da linha
        sys.stdout.write("\033[K") # apagar linha

        sys.stdout.write(s+f"[{self.channel}]{self.name}->>")
        sys.stdout.flush()

    def kb_input(self, stdin, _) -> None:
        # ler input atual
        input_data:str = stdin.read()
        if input_data.endswith('\n'):

            # [REQUESITO] comando exit para sair
            if input_data.strip() == "exit":
                exit(0)

            if len( input_data.strip() ) != 0:

                # nova menssagem a se enviar
                mssg:Message = Message()

                # [REQUESITO] comando /join <canal> para entrar em outro canal
                if input_data.startswith("/join"):
                    # menssagem do tipo join
                    # separar input por partes
                    parts = input_data.strip().split()
                    parts = list(map(lambda x: x.strip(), parts))

                    # verificar se foi indicado um canal
                    if len(parts[1]) != 0:
                        self.channel = parts[1]
                        mssg = CDProto.join(parts[1])

                else:
                    # menssagem de texto
                    mssg = CDProto.message(input_data,self.channel)

                # enviar menssagem
                CDProto.send_msg(self.socket,mssg)

            self.display_prompt()

    def receive(self,server_socket:socket.socket,_) -> None:

        # receber menssagem do servidor
        try:
            mssg:Message = CDProto.recv_msg(server_socket)
        except CDProtoBadFormat:
            print("\nConexão foi forçada a terminar...")
            exit(0)
        
        data:dict = json.loads(mssg.content)
        message:str = data["message"]

        self.display_prompt(s =message, previous=0)

    def loop(self) -> None:
        """Loop indefinetely."""

        # registar eventos no seletor
        self.sel.register(sys.stdin, selectors.EVENT_READ, self.kb_input) # evento do teclado
        self.sel.register(self.socket, selectors.EVENT_READ, self.receive) # evento do socket

        # prompt inicial
        self.display_prompt()

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
