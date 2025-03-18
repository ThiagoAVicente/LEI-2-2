grammar Calculator;

program:
    stat* EOF
    ;
stat:
    (expr|assi)* NEWLINE
    ;
assi:
    VarName '=' expr
    ;
expr:
    sig = ('+'|'-') expr           #ExprSigned
    | expr op = ('*'|'/'|'%') expr #ExprMultDivMod
    |   expr op = ('+'|'-') expr   #ExprAddSub
    |   Integer                    #ExprInteger
    | VarName                      #ExprVarName
    |   '(' expr ')'               #ExprParentesis
    ;

VarName:
    [a-zA-Z]+;
// data types
Integer:
    [0-9]+;

NEWLINE:
    '\r'?'\n';

WS:
    [ \t]+ -> skip;
Comment:
    '#' .*? '\n' -> skip;
