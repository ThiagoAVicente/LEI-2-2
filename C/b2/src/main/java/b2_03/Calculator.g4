grammar Calculator;

program:
    stat* EOF
    ;
stat:
    expr? NEWLINE
    ;
expr:
        // sig=('+'|'-')? expr
        expr op = ('*'|'/'|'%') expr
    |   expr op = ('+'|'-') expr
    |   sig=('+'|'-')? Integer
    |   sig=('+'|'-')?'(' expr ')'
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
