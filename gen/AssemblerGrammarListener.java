// Generated from C:/Users/Dom/Desktop/WAT/JFK/AssemblerInterpreter/src\AssemblerGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblerGrammarParser}.
 */
public interface AssemblerGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(AssemblerGrammarParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(AssemblerGrammarParser.PruleContext ctx);
}