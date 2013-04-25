grammar Small;

// file: (functionalDecl | varDecl)+ ;

// PROGRAM STRUCTURE
file: 'HAI' NEWLINE block 'KTHXBYE' NEWLINE EOF ; 

block: statement* ;

// TYPES

identifier: ID | ((ID | constant) APOSTROPHE)? 'SRS' expr ;

// STATEMENTS

statement
  : print
  | assignment
  | declaration
  | ifthenelse
  | loop
  | input
  | cast
  | expr NEWLINE
  | emptyline 
  ;

print: 'VISIBLE' exprlist 'BANG'? NEWLINE ;

assignment: identifier 'R' expr NEWLINE ;

declaration: identifier 'HAS A' identifier init ;

init: ('ITZ' expr | 'ITZ A' type | 'ITZ LIEK A' identifier)? NEWLINE ;

ifthenelse: 'O RLY?' NEWLINE 'YA RLY' NEWLINE block elseifcond* elsecond? 'OIC' NEWLINE ;

elseifcond: 'MEBBE' expr NEWLINE block ;

elsecond: 'NO WAI' NEWLINE block ;

loop: 'IM IN YR' identifier loopupdate? loopguard? NEWLINE block 'IM OUTTA YR' identifier NEWLINE ;

loopupdate: loopupdateop 'YR' identifier ;

loopupdateop: 'UPPIN' | 'NERFIN' ; // TODO there's more

loopguard: ('TIL' | 'WILE') expr ;

input: 'GIMMEH' identifier NEWLINE ;

cast: identifier 'IS NOW A' type NEWLINE ;

exprlist: expr (',' expr)* ;

emptyline: NEWLINE -> skip ;

expr
  : constant
  | identifier
  | opexpr
  ;

opexpr 
  : unaryop
  | binaryop
  | naryop
  ;

unaryop: 'NOT' expr ;

binaryop: binaryoptype expr 'AN'? expr ;

binaryoptype
  : 'SUM OF'
  | 'DIFF OF'
  | 'PRODUKT OF'
  | 'QUOSHUNT OF'
  | 'MOD OF'
  | 'BIGGR OF'
  | 'SMALLR OF'
  | 'BOTH OF'
  | 'EITHER OF'
  | 'WON OF'
  | 'BOTH SAEM'
  | 'DIFFRINT'
  ;

naryop: naryoptype naryopargs 'MKAY' ;

naryoptype: 'ALL OF' | 'ANY OF' | 'SMOOSH' ;

naryopargs: expr naryoparg+ ;

naryoparg: 'AN'? expr ;

constant: BOOLEAN | INTEGER | STRING;

type: 'NUMBR' | 'NUMBAR' | 'YARN' | 'TROOF' | 'NOOB' | 'BUKKIT';

APOSTROPHE: '\'Z' ;

BOOLEAN : 'WIN' | 'FAIL' ;

ID : LETTER (LETTER | [0-9])* ;

fragment LETTER : [a-zA-Z] ;

INTEGER : [0-9]+ ;

WS : [ \t\r]+ -> skip ;

COMMENT
  : 'BTW' .*? NEWLINE -> skip ;

MULTICOMMENT
  : 'OBTW' NEWLINE .*? 'TLDR' NEWLINE -> skip ;

BANG: '!' ;

fragment QUOTE: '\"' ;

STRING : QUOTE .*? QUOTE { setText(getText().substring(1, getText().length()-1)); };

NEWLINE : '\n' | ', ' ;
