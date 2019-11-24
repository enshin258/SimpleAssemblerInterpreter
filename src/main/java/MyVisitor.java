public class MyVisitor extends AssemblerGrammarBaseVisitor<Object> {
    private AssemblerGrammarHelper assemblerGrammarHelper;

    MyVisitor(AssemblerGrammarHelper assemblerGrammarHelper) {
        this.assemblerGrammarHelper = assemblerGrammarHelper;
    }

    @Override public Object visitInstruction(AssemblerGrammarParser.InstructionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitMov_expression(AssemblerGrammarParser.Mov_expressionContext ctx) {
        assemblerGrammarHelper.handleMov();
        return visitChildren(ctx);
    }

    @Override public Object visitPush_expression(AssemblerGrammarParser.Push_expressionContext ctx) {
        assemblerGrammarHelper.handlePush();
        return visitChildren(ctx);
    }

    @Override public Object visitInt0x80_expression(AssemblerGrammarParser.Int0x80_expressionContext ctx) {
        assemblerGrammarHelper.handleInt();
        return visitChildren(ctx);
    }

    @Override public Object visitXor_expression(AssemblerGrammarParser.Xor_expressionContext ctx) {
        assemblerGrammarHelper.handleXor();
        return visitChildren(ctx);
    }

    @Override public Object visitMath_operation(AssemblerGrammarParser.Math_operationContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitTerm(AssemblerGrammarParser.TermContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitFactor(AssemblerGrammarParser.FactorContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitOperand(AssemblerGrammarParser.OperandContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitSource_register(AssemblerGrammarParser.Source_registerContext ctx) {
        assemblerGrammarHelper.addRegisterValueToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitTarget_register(AssemblerGrammarParser.Target_registerContext ctx) {
        assemblerGrammarHelper.setTargetRegister(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitNumber(AssemblerGrammarParser.NumberContext ctx) {
        assemblerGrammarHelper.addNumberOrSymbolToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitPlus_or_minus(AssemblerGrammarParser.Plus_or_minusContext ctx) {
        assemblerGrammarHelper.addNumberOrSymbolToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitMultiplication(AssemblerGrammarParser.MultiplicationContext ctx) {
        assemblerGrammarHelper.addNumberOrSymbolToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitLeft_bracket(AssemblerGrammarParser.Left_bracketContext ctx) {
        assemblerGrammarHelper.addNumberOrSymbolToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitRight_bracket(AssemblerGrammarParser.Right_bracketContext ctx) {
        assemblerGrammarHelper.addNumberOrSymbolToList(ctx);
        return visitChildren(ctx);
    }
}
