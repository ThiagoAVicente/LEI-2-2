parser grammar myParser;

options {
    tokenVocab = myLexer;
}

program:
    line * EOF
    ;

line:
    ( assign | expr | print )? NW
    ;

print:
    PRINTOP expr
    ;

assign :
    VarName EQUAL expr
    ;

expr :
    sig = (PLUS|MINUS) expr                     #SignalExpr
    | LeftP expr RightP                         #ParentesisExpr
    | expr op=(MULTIPLY|DIVIDE|REMAINDER) expr  #BinaryExpr
    | expr op=(PLUS|MINUS) expr                 #BinaryExpr
    | Integer                                   #IntegerExpr
    | VarName                                   #VariableExpr
    ;
