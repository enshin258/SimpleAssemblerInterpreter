// Generated from C:/Users/Dom/Desktop/WAT/JFK/AssemblerInterpreter/src\AssemblerGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblerGrammarParser}.
 */
public interface AssemblerGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(AssemblerGrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(AssemblerGrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#mov_expression}.
	 * @param ctx the parse tree
	 */
	void enterMov_expression(AssemblerGrammarParser.Mov_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#mov_expression}.
	 * @param ctx the parse tree
	 */
	void exitMov_expression(AssemblerGrammarParser.Mov_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#push_expression}.
	 * @param ctx the parse tree
	 */
	void enterPush_expression(AssemblerGrammarParser.Push_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#push_expression}.
	 * @param ctx the parse tree
	 */
	void exitPush_expression(AssemblerGrammarParser.Push_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#int0x80_expression}.
	 * @param ctx the parse tree
	 */
	void enterInt0x80_expression(AssemblerGrammarParser.Int0x80_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#int0x80_expression}.
	 * @param ctx the parse tree
	 */
	void exitInt0x80_expression(AssemblerGrammarParser.Int0x80_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void enterXor_expression(AssemblerGrammarParser.Xor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void exitXor_expression(AssemblerGrammarParser.Xor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterMath_operation(AssemblerGrammarParser.Math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitMath_operation(AssemblerGrammarParser.Math_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AssemblerGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AssemblerGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(AssemblerGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(AssemblerGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(AssemblerGrammarParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(AssemblerGrammarParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#source_register}.
	 * @param ctx the parse tree
	 */
	void enterSource_register(AssemblerGrammarParser.Source_registerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#source_register}.
	 * @param ctx the parse tree
	 */
	void exitSource_register(AssemblerGrammarParser.Source_registerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#target_register}.
	 * @param ctx the parse tree
	 */
	void enterTarget_register(AssemblerGrammarParser.Target_registerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#target_register}.
	 * @param ctx the parse tree
	 */
	void exitTarget_register(AssemblerGrammarParser.Target_registerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AssemblerGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AssemblerGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#plus_or_minus}.
	 * @param ctx the parse tree
	 */
	void enterPlus_or_minus(AssemblerGrammarParser.Plus_or_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#plus_or_minus}.
	 * @param ctx the parse tree
	 */
	void exitPlus_or_minus(AssemblerGrammarParser.Plus_or_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(AssemblerGrammarParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(AssemblerGrammarParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#left_bracket}.
	 * @param ctx the parse tree
	 */
	void enterLeft_bracket(AssemblerGrammarParser.Left_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#left_bracket}.
	 * @param ctx the parse tree
	 */
	void exitLeft_bracket(AssemblerGrammarParser.Left_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#right_bracket}.
	 * @param ctx the parse tree
	 */
	void enterRight_bracket(AssemblerGrammarParser.Right_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#right_bracket}.
	 * @param ctx the parse tree
	 */
	void exitRight_bracket(AssemblerGrammarParser.Right_bracketContext ctx);
}