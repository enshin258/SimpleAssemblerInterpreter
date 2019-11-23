import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command;
        AssemblerGrammarHelper assemblerGrammarHelper = new AssemblerGrammarHelper();
        MyVisitor visitor = new MyVisitor(assemblerGrammarHelper);
        int line_of_command = 0;

        while(scanner.hasNext())
        {
            command = scanner.nextLine();
            line_of_command++;

            CharStream charStream = CharStreams.fromString(command);
            AssemblerGrammarLexer lexer = new AssemblerGrammarLexer(charStream);
            lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            AssemblerGrammarParser parser = new AssemblerGrammarParser(tokenStream);
            parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
            ParseTree parseTree = parser.instruction();
            visitor.visit(parseTree);

            if(parser.getNumberOfSyntaxErrors() > 0){
                System.out.println(line_of_command + " Error");
                assemblerGrammarHelper.cleanUp();
                //assemblerGrammarHelper.getActualStatus();
                continue;
            }

            try {
                assemblerGrammarHelper.prepareDataStringBasedOnInput();
                assemblerGrammarHelper.executeCommand();
                //assemblerGrammarHelper.getActualStatus();
                assemblerGrammarHelper.cleanUp();
            }
            catch (UnsupportedOperationException e){
                System.out.println(line_of_command + " Error");
                assemblerGrammarHelper.cleanUp();
                //assemblerGrammarHelper.getActualStatus();
            }
        }
    }
}
