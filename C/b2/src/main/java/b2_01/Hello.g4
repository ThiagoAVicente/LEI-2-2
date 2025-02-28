grammar Hello;

action: (greetings | bye )* EOF;
greetings : 'hello' ID+ ;
bye: 'bye' ID+; // List<TerminalNode)
ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip ;
