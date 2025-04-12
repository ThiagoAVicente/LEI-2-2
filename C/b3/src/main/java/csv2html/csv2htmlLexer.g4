lexer grammar csv2htmlLexer;

Content: ~[;\n\r]+  ;

DELIMITER: ';'  ;

NW: '\r'? '\n'  ;

WS:
    [ \t]+ -> skip;