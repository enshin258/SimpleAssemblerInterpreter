import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String command;
        AssemblerHelper assemblerHelper = new AssemblerHelper();
        MyVisitor visitor = new MyVisitor(assemblerHelper);

        while(scanner.hasNext())
        {
            command = scanner.nextLine();
            command=command.replaceAll("\t","");
            command=command.trim();
            if(command.equals(""))
            {
                continue;
            }

            CharStream charStream = CharStreams.fromString(command);
            GrammarLexer lexer = new GrammarLexer(charStream);
            lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            GrammarParser parser = new GrammarParser(tokenStream);
            parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
            ParseTree parseTree = parser.instruction();
            visitor.visit(parseTree);

            //funkcja .getActualStatus() sluzy do wyswietlania zawartosci assemblera w celach pomocniczych

            if(parser.getNumberOfSyntaxErrors() > 0){
                System.out.println("Error");
                assemblerHelper.cleanUp();
                //assemblerHelper.getActualStatus();
                continue;
            }

            try {
                assemblerHelper.prepareDataStringBasedOnInput();
                assemblerHelper.executeCommand();
                //assemblerHelper.getActualStatus();
                assemblerHelper.cleanUp();
            }
            catch (UnsupportedOperationException | RecognitionException e){
                System.out.println("Error");
                assemblerHelper.cleanUp();
                //assemblerHelper.getActualStatus();
            }
        }
    }
}
