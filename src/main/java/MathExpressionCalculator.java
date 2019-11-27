import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class MathExpressionCalculator
{
     static Stack<Integer> digitsStack = new Stack<>();
     static Stack<Character> mathSymbolsStack = new Stack<>();
     static char[] tokens ;


     public static int calculateMathExpressionBasedOnString(String expression)
     {
          tokens = expression.toCharArray();
          for (int i = 0; i < tokens.length; i++)
          {
               if (tokens[i] == ' ')
                    continue;

               if (tokens[i] >= '0' && tokens[i] <= '9')
               {
                    StringBuffer stringBuffer = new StringBuffer();
                    while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    {
                         stringBuffer.append(tokens[i++]);
                    }
                    digitsStack.push(Integer.parseInt(stringBuffer.toString()));
               }

               else if (tokens[i] == '(')
               {
                    mathSymbolsStack.push(tokens[i]);
               }

               else if (tokens[i] == ')')
               {
                    while (mathSymbolsStack.peek() != '(')
                    {
                         digitsStack.push(calculate(mathSymbolsStack.pop(), digitsStack.pop(), digitsStack.pop()));
                    }
                    mathSymbolsStack.pop();
               }

               else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*')
               {
                    //negative number
                    if(tokens[i] == '-' && mathSymbolsStack.isEmpty() && digitsStack.isEmpty())
                    {
                          return negativeNumber();
                    }
                    while (!mathSymbolsStack.empty() && hasPrecedence(tokens[i], mathSymbolsStack.peek()))
                    {
                         digitsStack.push(calculate(mathSymbolsStack.pop(), digitsStack.pop(), digitsStack.pop()));
                    }

                    mathSymbolsStack.push(tokens[i]);
               }
          }
          while (!mathSymbolsStack.empty())
               digitsStack.push(calculate(mathSymbolsStack.pop(), digitsStack.pop(), digitsStack.pop()));

          int result = digitsStack.pop();
          digitsStack.clear();
          mathSymbolsStack.clear();
          return result;
     }
     private static int negativeNumber()
     {
          StringBuilder tempStringBuffer = new StringBuilder();
          for(int j = 1;j < tokens.length; j++)
          {
               if (tokens[j] >= '0' && tokens[j] <= '9')
               {
                    while (j < tokens.length && tokens[j] >= '0' && tokens[j] <= '9')
                    {
                         tempStringBuffer.append(tokens[j++]);
                    }
               }
          }
          return (-Integer.parseInt(tempStringBuffer.toString()));

     }

     private static boolean hasPrecedence(char op1, char op2)
     {
          if (op2 == '(' || op2 == ')')
               return false;
          if ((op1 == '*') && (op2 == '+' || op2 == '-'))
               return false;
          else
               return true;
     }
     
     private static int calculate(char op, int b, int a)
     {
          switch (op)
          {
               case '+':
                    return a + b;
               case '-':
                    return a - b;
               case '*':
                    return a * b;
          }
          return 0;
     }
}
