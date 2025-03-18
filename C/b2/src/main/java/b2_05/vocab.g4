grammar vocab;

program:
    line* EOF
    ;

line:
    Integer sp='-' String NEWLINE
    ;
Integer: [0-9]+;
String: [a-z]+;
NEWLINE:
    '\r'?'\n'
    ;
WS: [ \t]+ -> skip;