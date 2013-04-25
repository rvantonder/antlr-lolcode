grammar Small;

// file: (functionalDecl | varDecl)+ ;

// PROGRAM STRUCTURE
file: 'HAI' NEWLINE block 'KTHXBYE' NEWLINE EOF ; 

block: statement* ;

// TYPES

identifier: ID ;

// STATEMENTS

statement
  : print
  | assignment
  | declaration
  ;

print: 'VISIBLE' exprlist 'BANG'? NEWLINE ;

assignment: identifier 'R' expr NEWLINE ;

declaration: 'I HAS A' identifier init ;

init: ('ITZ' expr | 'ITZ LIEK A' identifier) NEWLINE ;

exprlist: expr (',' expr)* ;

expr returns [int value]
  : constant
  | identifier
  ;

constant: BOOLEAN | INTEGER | STRING;

BOOLEAN : 'WIN' | 'FAIL' ;

ID : LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INTEGER : [0-9]+ ;

WS : [ \t\r]+ -> skip ;

COMMENT
  : 'BTW' .*? NEWLINE -> skip
  ;

fragment QUOTE: '\"' ;

STRING : QUOTE .*? QUOTE { setText(getText().substring(1, getText().length()-1)); };

NEWLINE : '\n' ;
