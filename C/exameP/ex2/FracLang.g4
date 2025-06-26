grammar FracLang;

main: (line ';')* EOF;

line
    : input
    | output
    | read
    ;

input
    : ID '<=' expr
    ;

output
    : 'display' expr
    ;

expr
    : sig=('+'|'-') expr                         #ExprSig
    | '(' expr ')'                               #ExprParen
    | expr op=('*'|':') expr                     #ExprMult
    | expr op=('+'|'-') expr                     #ExprSum
    | opr                                        #ExprSimple
    | read                                       #ExprRead
    | reduce                                     #ExprReduce
    ;

reduce:
    'reduce' expr;

read:
    'read' TEXT;

opr
    : ID
    | numeric
    ;

numeric
    : int
    | frac
    ;

int:
    INTEGER;
frac:
    int '/' int;

ID: [a-z]+;
TEXT:'"'~[/"]*'"';
INTEGER: [0-9]+;

NW: '\r'? '\n' -> skip;
WS: [ \t]+ -> skip;
COMMENT: '--' ~[\r\n]* -> skip;
