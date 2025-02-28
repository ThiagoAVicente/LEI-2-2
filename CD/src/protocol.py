"""Protocol for chat server - Computação Distribuida Assignment 1."""
import json
from datetime import datetime
from socket import AF_INET, socket
import pickle
from typing import Optional

def createMsg(data:str,rec:bytes):

    # transformar num dicionario
    try:
        d = json.loads(data)
    except:
        raise CDProtoBadFormat(rec)

    # verificar campo de comando
    cmd = d.get("command",None)
    if cmd == None:
        raise CDProtoBadFormat(rec)

    # menssagem join
    if cmd == "join":
        if not "channel" in d:
            raise CDProtoBadFormat(rec)
        return CDProto.join(d["channel"])

    # menssagem register
    if cmd == "register":
        if not "user" in d:
            raise CDProtoBadFormat(rec)
        return CDProto.register(d["user"])

    # text message
    mssg = Message()
    if not "message" in d:
        raise CDProtoBadFormat(rec)
    if "channel" in d:
        mssg = CDProto.message(d["message"],d["channel"])
    else:
        mssg = CDProto.message(d["message"])

    # manter timestamp
    content = mssg.content
    content = json.loads(content)
    content["ts"] = d["ts"]
    mssg.content = json.dumps(content)

    return mssg

class Message:
    """Message Type."""
    def __init__(self) -> None:
        self.content = json.dumps([])

    def __str__(self) -> str:
        return self.content

class JoinMessage(Message):
    """Message to join a chat channel."""
    def __init__(self,chn:str) -> None:
        super().__init__()
        x = {
            "command":"join",
            "channel":chn
        }
        self.content = json.dumps(x)

class RegisterMessage(Message):
    """Message to register username in the server."""
    def __init__(self,username:str) -> None:
        super().__init__()
        x = {
            "command":"register",
            "user":username
        }
        self.content = json.dumps(x)

class TextMessage(Message):
    """Message to chat with other clients."""
    def __init__(self,message:str,channel:str) -> None:
        super().__init__()
        x = {
            "command":"message",
            "message":message,
            "ts":int(datetime.now().timestamp())
        }
        if channel:
            x["channel"] = channel
        self.content = json.dumps(x)

class CDProto:
    """Computação Distribuida Protocol."""

    @classmethod
    def register(cls, username: str) -> RegisterMessage:
        """Creates a RegisterMessage object."""
        return RegisterMessage(username)

    @classmethod
    def join(cls, channel: str) -> JoinMessage:
        """Creates a JoinMessage object."""
        return JoinMessage(channel)

    @classmethod
    def message(cls, message: str, channel: str = None) -> TextMessage:
        """Creates a TextMessage object."""
        return TextMessage(message,channel)


    @classmethod
    def send_msg(cls, connection: socket, msg: Message):
        """Sends through a connection a Message object."""

        toSend = str(msg.content).encode("utf-8")

        # colocar tamanho para passar nos testes
        # sz é importante para que dados não sejam perdidos
        sz = len(toSend).to_bytes(2, "big")
        connection.send(sz + toSend) # deve ser usado o sendall para que , atravês de um loop, todos os dados sejam enviados
        

    @classmethod
    def recv_msg(cls, connection: socket) -> Message:
        """Receives through a connection a Message object."""

        # ler tamanho do conteudo
        try:
            sz = connection.recv(2)
        except:
            raise CDProtoBadFormat

        # ler conteudo
        sz = int.from_bytes(sz, "big")
        rec = connection.recv(sz)
        if not rec:
            raise CDProtoBadFormat
        # transformar num objeto da classe menssagem
        mssg = rec.decode("utf-8")
        return createMsg(mssg,rec)



class CDProtoBadFormat(Exception):
    """Exception when source message is not CDProto."""

    def __init__(self, original_msg: bytes=None) :
        """Store original message that triggered exception."""
        self._original = original_msg

    @property
    def original_msg(self) -> str:
        """Retrieve original message as a string."""
        return self._original.decode("utf-8")
