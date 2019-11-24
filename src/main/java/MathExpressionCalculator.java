import java.util.Stack;

class MathExpressionCalculator {
    static int calculateMathExpressionBasedOnString(String expression)
    {
        char[] tokens = expression.toCharArray();

        Stack<Integer> numbers = new Stack<>();

        Stack<Character> mathSymbols = new Stack<>();

        for (int i = 0; i < tokens.length; i++)
        {
            if (tokens[i] == ' ')
                continue;

            if (tokens[i] >= '0' && tokens[i] <= '9')
            {
                StringBuilder tempStringBuilder = new StringBuilder();
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    tempStringBuilder.append(tokens[i++]);
                numbers.push(Integer.parseInt(tempStringBuilder.toString()));
            }

            else if (tokens[i] == '(')
                mathSymbols.push(tokens[i]);

            else if (tokens[i] == ')')
            {
                while (mathSymbols.peek() != '(')
                    numbers.push(applySymbol(mathSymbols.pop(), numbers.pop(), numbers.pop()));
                mathSymbols.pop();
            }

            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*')
            {
                while (!mathSymbols.empty() && hasPrecedence(tokens[i], mathSymbols.peek()))
                    numbers.push(applySymbol(mathSymbols.pop(), numbers.pop(), numbers.pop()));

                mathSymbols.push(tokens[i]);
            }
        }

        while (!mathSymbols.empty())
            numbers.push(applySymbol(mathSymbols.pop(), numbers.pop(), numbers.pop()));

        int returnValue = numbers.pop();
        numbers.clear();
        mathSymbols.clear();
        return returnValue;
    }

    private static boolean hasPrecedence(char symbol1, char symbol2)
    {
        if (symbol2 == '(' || symbol2 == ')')
            return false;
        return (symbol1 != '*') || (symbol2 != '+' && symbol2 != '-');
    }

    private static int applySymbol(char symbol, int b, int a)
    {
        switch (symbol)
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
