grammar perguntasGrammar;

program:
    line* EOF
    ;

line:
      NEWLINE
    | Comment NEWLINE
    | cotacao NEWLINE
    | pergunta NEWLINE
    ;

opcao:
    TextoMultilinha':' cotacao EL NEWLINE?;

pergunta:
    Texto '(' TextoMultilinha ') {' NEWLINE? opcao+ '}'
    ;


cotacao:
    '0'        #Cotacao0
    | '100'    #Cotacao100
    ;

// texto multilinha
TextoMultilinha:
    '"' ( ~["] | '""' | NEWLINE )* '"';

// texto normal
Texto:
    [a-zA-Z][a-zA-Z0-9.à-úÀ-Ú ]*;

NEWLINE:
    '\r'? '\n';

WS:
    [ \t]+ -> skip;

// token para colocar no final da linha
EL:
    ';';

Comment:
    '#' ~[\r\n]* -> skip;