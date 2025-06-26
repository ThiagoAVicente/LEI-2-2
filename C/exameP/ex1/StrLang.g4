grammar StrLang;

program:
    stat* EOF
    ;

stat: 
        NW 
    |   print 
    |   expr
    |   assign
    ;

print:
    'print' expr
    ;
input:
    'input' '(' expr ')'
    ;
assign:
    ID ':' expr
    ;
expr:
      expr '+' expr       #ExprConcat
    | expr '-' expr       #ExprRemove
    | 'trim' expr             #ExprTrim
    | '(' expr ')'            #ExprParens
    | expr '/' expr '/' expr  #ExprReplace
    | STRING                  #ExprString
    | ID                      #ExprId
    | input                   #ExprInput
    ;

ID: [a-zA-Z][a-zA-Z0-9_]*;
NW: '\r'? '\n' -> skip;
WS: [ \t]+ -> skip;
STRING : '"' ~["]* '"' ;
COMMENT: '//' ~[\r\n]* -> skip;
