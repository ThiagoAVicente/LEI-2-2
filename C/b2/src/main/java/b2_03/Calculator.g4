grammar Calculator;

program:
    stat* EOF
    ;
stat:
    expr? NEWLINE
    ;
expr:
        expr op = ('*'|'/'|'%') expr
    |   expr op = ('+'|'-') expr
    |   Integer
    |   '(' expr ')'
    ;

// data types
Integer:
    [0-9]+;

NEWLINE:
    '\r'?'\n';

WS:
    [ \t]+ -> skip;
Comment:
    '#' .*? '\n' -> skip;
