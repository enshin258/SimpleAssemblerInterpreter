public class MyVisitor extends GrammarBaseVisitor<Object> {
    private AssemblerHelper assemblerHelper;

    MyVisitor(AssemblerHelper assemblerHelper) {
        this.assemblerHelper = assemblerHelper;
    }

    @Override public Object visitInstruction(GrammarParser.InstructionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitMov_expression(GrammarParser.Mov_expressionContext ctx) {
        assemblerHelper.handleMov();
        return visitChildren(ctx);
    }

    @Override public Object visitPush_expression(GrammarParser.Push_expressionContext ctx) {
        assemblerHelper.handlePush();
        return visitChildren(ctx);
    }

    @Override public Object visitInt0x80_expression(GrammarParser.Int0x80_expressionContext ctx) {
        assemblerHelper.handleInt();
        return visitChildren(ctx);
    }

    @Override public Object visitXor_expression(GrammarParser.Xor_expressionContext ctx) {
        assemblerHelper.handleXor();
        return visitChildren(ctx);
    }

    @Override public Object visitMath_operation(GrammarParser.Math_operationContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitTerm(GrammarParser.TermContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitFactor(GrammarParser.FactorContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitOperand(GrammarParser.OperandContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitSource_register(GrammarParser.Source_registerContext ctx) {
        assemblerHelper.addRegisterValueToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitTarget_register(GrammarParser.Target_registerContext ctx) {
        assemblerHelper.setTargetRegister(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitNumber(GrammarParser.NumberContext ctx) {
        assemblerHelper.addNumberOrSymbolToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitPlus_or_minus(GrammarParser.Plus_or_minusContext ctx) {
        assemblerHelper.addNumberOrSymbolToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitMultiplication(GrammarParser.MultiplicationContext ctx) {
        assemblerHelper.addNumberOrSymbolToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitLeft_bracket(GrammarParser.Left_bracketContext ctx) {
        assemblerHelper.addNumberOrSymbolToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitRight_bracket(GrammarParser.Right_bracketContext ctx) {
        assemblerHelper.addNumberOrSymbolToList(ctx);
        return visitChildren(ctx);
    }
}
