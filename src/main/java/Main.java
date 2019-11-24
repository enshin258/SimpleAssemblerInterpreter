import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command;
        AssemblerGrammarHelper assemblerGrammarHelper = new AssemblerGrammarHelper();
        MyVisitor visitor = new MyVisitor(assemblerGrammarHelper);

        while(scanner.hasNext())
        {
            command = scanner.nextLine();

            CharStream charStream = CharStreams.fromString(command);
            AssemblerGrammarLexer lexer = new AssemblerGrammarLexer(charStream);
            lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            AssemblerGrammarParser parser = new AssemblerGrammarParser(tokenStream);
            parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
            ParseTree parseTree = parser.instruction();
            visitor.visit(parseTree);

            //funkcja .getActualStatus() sluzy do wyswietlania zawartosci assemblera w celach pomocniczych

            if(parser.getNumberOfSyntaxErrors() > 0){
                System.out.println("Error");
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
            catch (UnsupportedOperationException | RecognitionException e){
                System.out.println("Error");
                assemblerGrammarHelper.cleanUp();
                //assemblerGrammarHelper.getActualStatus();
            }
        }
    }
}
