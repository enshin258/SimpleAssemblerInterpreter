# SimpleAssemblerInterpreter
Simple Pseudo Assembler Interpterer created using ANTLR4 library.

The program simulates an assembler with a stack and 4 registers: eax, ebx, ecx and edx

Available commands are: mov , xor , push and int 0x80

mov - move result of mathematical expression or register value to register
example: mov 2+2, %ecx      //ecx=4

xor - perform XOR operation and save result in register
example : xor %ebx, %ebx      //ebx=0

push - push value at the top of the stack
example: push 2     //stack=[4]

int 0x80 - pop value from top of the stack
example: int 0x80     //print 4

