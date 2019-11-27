// Generated from C:/Users/Dom/Desktop/WAT/JFK/AssemblerInterpreter/src\Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(GrammarParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#mov_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov_expression(GrammarParser.Mov_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#push_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush_expression(GrammarParser.Push_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#int0x80_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt0x80_expression(GrammarParser.Int0x80_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#xor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expression(GrammarParser.Xor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_operation(GrammarParser.Math_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(GrammarParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#source_register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_register(GrammarParser.Source_registerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#target_register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_register(GrammarParser.Target_registerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#plus_or_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_or_minus(GrammarParser.Plus_or_minusContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(GrammarParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#left_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_bracket(GrammarParser.Left_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#right_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_bracket(GrammarParser.Right_bracketContext ctx);
}