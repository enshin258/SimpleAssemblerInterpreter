grammar AssemblerGrammar;

instruction: ('mov' ' ' mov_expression | 'push' ' ' push_expression | int0x80_expression | 'xor' ' ' xor_expression) ' '* ('\n'|EOF);

mov_expression: math_operation ' '? ',' ' '? target_register;
push_expression: math_operation;
int0x80_expression:' '? 'int' ' '? '0x80';
xor_expression: math_operation ' '? ',' ' '? target_register;


math_operation: term | math_operation  ' '?plus_or_minus' '? term;
term: factor | term ' '? multiplication ' '? factor;
factor: operand | left_bracket ' '? math_operation ' '? right_bracket ' '?;
operand: ' '? source_register ' '? |  number ;

source_register: REGISTER;
target_register: REGISTER;

number: NUMBERSYMBOL;
plus_or_minus: PLUSORMINUSSYMBOL;
multiplication: MULTIPLICATIONSYMBOL;
left_bracket: LEFTBRACKET;
right_bracket: RIGHTBRACKET;


REGISTER: ('%eax' | '%ebx' | '%ecx' | '%edx');
NUMBERSYMBOL: [0-9]+;
PLUSORMINUSSYMBOL: ('+'|'-');
MULTIPLICATIONSYMBOL: '*';
LEFTBRACKET: '(';
RIGHTBRACKET: ')';

