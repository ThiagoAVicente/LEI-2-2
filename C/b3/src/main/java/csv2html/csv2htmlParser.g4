parser grammar csv2htmlParser;

options {
    tokenVocab = csv2htmlLexer;
}

program:
    line+ EOF
    ;

line:
    content (DELIMITER content?)* NW?
    ;

content:
    Content
    ;