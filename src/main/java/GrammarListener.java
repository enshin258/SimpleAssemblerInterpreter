// Generated from C:/Users/Dom/Desktop/WAT/JFK/AssemblerInterpreter/src\Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(GrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(GrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mov_expression}.
	 * @param ctx the parse tree
	 */
	void enterMov_expression(GrammarParser.Mov_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mov_expression}.
	 * @param ctx the parse tree
	 */
	void exitMov_expression(GrammarParser.Mov_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#push_expression}.
	 * @param ctx the parse tree
	 */
	void enterPush_expression(GrammarParser.Push_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#push_expression}.
	 * @param ctx the parse tree
	 */
	void exitPush_expression(GrammarParser.Push_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#int0x80_expression}.
	 * @param ctx the parse tree
	 */
	void enterInt0x80_expression(GrammarParser.Int0x80_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#int0x80_expression}.
	 * @param ctx the parse tree
	 */
	void exitInt0x80_expression(GrammarParser.Int0x80_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void enterXor_expression(GrammarParser.Xor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void exitXor_expression(GrammarParser.Xor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterMath_operation(GrammarParser.Math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitMath_operation(GrammarParser.Math_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(GrammarParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(GrammarParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#source_register}.
	 * @param ctx the parse tree
	 */
	void enterSource_register(GrammarParser.Source_registerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#source_register}.
	 * @param ctx the parse tree
	 */
	void exitSource_register(GrammarParser.Source_registerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#target_register}.
	 * @param ctx the parse tree
	 */
	void enterTarget_register(GrammarParser.Target_registerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#target_register}.
	 * @param ctx the parse tree
	 */
	void exitTarget_register(GrammarParser.Target_registerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#plus_or_minus}.
	 * @param ctx the parse tree
	 */
	void enterPlus_or_minus(GrammarParser.Plus_or_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#plus_or_minus}.
	 * @param ctx the parse tree
	 */
	void exitPlus_or_minus(GrammarParser.Plus_or_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(GrammarParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(GrammarParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#left_bracket}.
	 * @param ctx the parse tree
	 */
	void enterLeft_bracket(GrammarParser.Left_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#left_bracket}.
	 * @param ctx the parse tree
	 */
	void exitLeft_bracket(GrammarParser.Left_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#right_bracket}.
	 * @param ctx the parse tree
	 */
	void enterRight_bracket(GrammarParser.Right_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#right_bracket}.
	 * @param ctx the parse tree
	 */
	void exitRight_bracket(GrammarParser.Right_bracketContext ctx);
}