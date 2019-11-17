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
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(AssemblerGrammarParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#mov_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov_expression(AssemblerGrammarParser.Mov_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#push_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush_expression(AssemblerGrammarParser.Push_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#int0x80_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt0x80_expression(AssemblerGrammarParser.Int0x80_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#xor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expression(AssemblerGrammarParser.Xor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_operation(AssemblerGrammarParser.Math_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(AssemblerGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(AssemblerGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(AssemblerGrammarParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#source_register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_register(AssemblerGrammarParser.Source_registerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#target_register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_register(AssemblerGrammarParser.Target_registerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AssemblerGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#plus_or_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_or_minus(AssemblerGrammarParser.Plus_or_minusContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(AssemblerGrammarParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#left_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_bracket(AssemblerGrammarParser.Left_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGrammarParser#right_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_bracket(AssemblerGrammarParser.Right_bracketContext ctx);
}