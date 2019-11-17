public class MyVisitor extends AssemblerGrammarBaseVisitor<Object> {
    private AssemblerGrammarHelper assemblerGrammarHelper;

    MyVisitor(AssemblerGrammarHelper assemblerGrammarHelper) {
        this.assemblerGrammarHelper = assemblerGrammarHelper;
    }

    @Override public Object visitInstruction(AssemblerGrammarParser.InstructionContext ctx) {
        ////System.out.println("INSTRUCTION, ctx: " + ctx.getText());
        return visitChildren(ctx);
    }

    @Override public Object visitMov_expression(AssemblerGrammarParser.Mov_expressionContext ctx) {
        //System.out.println("MOV, ctx: " + ctx.getText());

        assemblerGrammarHelper.handleMov();
        return visitChildren(ctx);
    }

    @Override public Object visitPush_expression(AssemblerGrammarParser.Push_expressionContext ctx) {
        //System.out.println("PUSH, ctx: " + ctx.getText());

        assemblerGrammarHelper.handlePush();
        return visitChildren(ctx);
    }

    @Override public Object visitInt0x80_expression(AssemblerGrammarParser.Int0x80_expressionContext ctx) {
        //System.out.println("INT 0x80, ctx: " + ctx.getText());

        assemblerGrammarHelper.handleInt();
        return visitChildren(ctx);
    }

    @Override public Object visitXor_expression(AssemblerGrammarParser.Xor_expressionContext ctx) {
        //System.out.println("XOR, ctx: " + ctx.getText());

        assemblerGrammarHelper.handleXor();
        return visitChildren(ctx);
    }

    @Override public Object visitMath_operation(AssemblerGrammarParser.Math_operationContext ctx) {
        //System.out.println("MATH, ctx: " + ctx.getText());

        return visitChildren(ctx);
    }

    @Override public Object visitTerm(AssemblerGrammarParser.TermContext ctx) {
        //System.out.println("TERM, ctx: " + ctx.getText());

        return visitChildren(ctx);
    }

    @Override public Object visitFactor(AssemblerGrammarParser.FactorContext ctx) {
        //System.out.println("FACTOR, ctx: " + ctx.getText());

        return visitChildren(ctx);
    }

    @Override public Object visitOperand(AssemblerGrammarParser.OperandContext ctx) {
        //System.out.println("OPERAND, ctx: " + ctx.getText());

        return visitChildren(ctx);
    }

    @Override public Object visitSource_register(AssemblerGrammarParser.Source_registerContext ctx) {
        //System.out.println("SOURCE REGISTER, ctx: " + ctx.getText());

        assemblerGrammarHelper.addRegisterValueToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitTarget_register(AssemblerGrammarParser.Target_registerContext ctx) {
        //System.out.println("TARGET REGISTER, ctx: " + ctx.getText());

        assemblerGrammarHelper.setTargetRegister(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitNumber(AssemblerGrammarParser.NumberContext ctx) {
        //System.out.println("NUMBER, ctx: " + ctx.getText());

        assemblerGrammarHelper.addNumberToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitPlus_or_minus(AssemblerGrammarParser.Plus_or_minusContext ctx) {
        //System.out.println("PLUS OR MINUS, ctx: " + ctx.getText());

        assemblerGrammarHelper.addPlusOrMinusOperatorToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitMultiplication(AssemblerGrammarParser.MultiplicationContext ctx) {
        //System.out.println("MULTIPLICATION, ctx: " + ctx.getText());

        assemblerGrammarHelper.addMultiplicationOperatorToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitLeft_bracket(AssemblerGrammarParser.Left_bracketContext ctx) {
        //System.out.println("LEFT BRACKET, ctx: " + ctx.getText());

        assemblerGrammarHelper.addLeftBracketToList(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitRight_bracket(AssemblerGrammarParser.Right_bracketContext ctx) {
        //System.out.println("RIGHT BRACKET, ctx: " + ctx.getText());

        assemblerGrammarHelper.addRightBracketToList(ctx);
        return visitChildren(ctx);
    }
}
