// Generated from C:/Users/Dom/Desktop/WAT/JFK/AssemblerInterpreter/src\AssemblerGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssemblerGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssemblerGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(AssemblerGrammarParser.PruleContext ctx);
}