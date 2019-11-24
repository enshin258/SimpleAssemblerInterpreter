import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class AssemblerGrammarHelper {

    private Command command;
    private Stack<String> stack;

    private Register eax;
    private Register ebx;
    private Register ecx;
    private Register edx;

    private Register targetRegister;
    private List<Object> mathOperationElementsList;
    private String dataStringBasedOnInput;

    AssemblerGrammarHelper() {
        this.stack = new Stack<String>();
        this.eax = new Register("eax","???");
        this.ebx = new Register("ebx","???");
        this.ecx = new Register("ecx","???");
        this.edx = new Register("edx","???");
        this.mathOperationElementsList = new ArrayList<>();
        this.dataStringBasedOnInput = "";
    }
    void cleanUp()
    {
        this.mathOperationElementsList.clear();
        this.dataStringBasedOnInput="";
    }
    private String prepareStringFromContextText(String sourceString)
    {
        String changedString = sourceString;
        changedString = changedString.replaceAll(" ","");
        changedString = changedString.replaceAll(",","");
        changedString = changedString.replaceAll("%","");
        return changedString;
    }
    void addRegisterValueToList(AssemblerGrammarParser.Source_registerContext ctx)
    {
        String registerTextRepresentation = prepareStringFromContextText(ctx.getText());
        switch (registerTextRepresentation)
        {
            case "eax":
            {
                this.mathOperationElementsList.add(eax.getValue());
                break;
            }
            case "ebx":
            {
                this.mathOperationElementsList.add(ebx.getValue());
                break;
            }
            case "ecx":
            {
                this.mathOperationElementsList.add(ecx.getValue());
                break;
            }
            case "edx":
            {
                this.mathOperationElementsList.add(edx.getValue());
                break;
            }
        }
    }
    void setTargetRegister(AssemblerGrammarParser.Target_registerContext ctx) {
        String registerTextRepresentation = prepareStringFromContextText(ctx.getText());
        switch (registerTextRepresentation)
        {
            case "eax":
            {
                this.targetRegister = eax;
                break;
            }
            case "ebx":
            {
                this.targetRegister = ebx;
                break;
            }
            case "ecx":
            {
                this.targetRegister = ecx;
                break;
            }
            case "edx":
            {
                this.targetRegister = edx;
                break;
            }
        }
    }
    void addNumberOrSymbolToList(ParserRuleContext ctx)
    {
        String tempString = prepareStringFromContextText(ctx.getText());
        this.mathOperationElementsList.add(tempString);
    }
    void handleMov()
    {
        this.command = Command.MOV;
    }
    void handlePush()
    {
        this.command = Command.PUSH;
    }
    void handleInt()
    {
        this.command = Command.INT0x80;
    }
    void handleXor()
    {
        this.command = Command.XOR;
    }
    void prepareDataStringBasedOnInput()
    {
        this.dataStringBasedOnInput="";
        StringBuilder stringResult= new StringBuilder();
        for (Object o:this.mathOperationElementsList) {
            if(o.equals("???"))
            {
                this.dataStringBasedOnInput="???";
                return;
            }
            else
            {
                stringResult.append(o.toString()).append(" ");
            }
        }
        this.dataStringBasedOnInput = stringResult.toString();
    }
    void executeCommand()
    {
        String tempResult;
        switch (this.command)
        {
            case MOV:
            {
                if(this.dataStringBasedOnInput.equals("???"))
                {
                    this.targetRegister.setValue("???");
                }
                else
                {
                    int tempInt = MathExpressionCalculator.calculateMathExpressionBasedOnString(this.dataStringBasedOnInput);
                    tempResult = Integer.toString(tempInt);
                    this.targetRegister.setValue(tempResult);
                }
                break;

            }
            case XOR:
            {

                if(this.dataStringBasedOnInput.equals("???") || this.targetRegister.getValue().equals("???"))
                {
                    if(this.dataStringBasedOnInput.equals("???") && this.targetRegister.getValue().equals("???") )
                    {
                        this.targetRegister.setValue("0");
                    }
                    else
                    {
                        this.targetRegister.setValue("???");
                    }
                }
                else
                {
                    int tempInt = MathExpressionCalculator.calculateMathExpressionBasedOnString(this.dataStringBasedOnInput);
                    tempResult = Integer.toString(tempInt ^ Integer.parseInt(this.targetRegister.getValue()));
                    this.targetRegister.setValue(tempResult);
                }
                break;
            }
            case PUSH:
            {
                if(this.dataStringBasedOnInput.equals("???"))
                {
                    this.stack.push("???");
                }
                else
                {
                    int tempInt = MathExpressionCalculator.calculateMathExpressionBasedOnString(this.dataStringBasedOnInput);
                    tempResult = Integer.toString(tempInt);
                    this.stack.push(tempResult);
                }
                break;
            }
            case INT0x80:
            {
                if(!this.stack.isEmpty())
                {
                    System.out.println(this.stack.pop());
                }
                else
                {
                    System.out.println("???");
                }
                break;
            }
        }
    }
    void getActualStatus()
    {
        System.out.println("************");
        System.out.println("***ASSEMBLER DATA***");
        System.out.println("************");
        System.out.println("***LAST COMMAND***");
        System.out.println(this.command);
        System.out.println("***STACK***");
        System.out.println(this.stack.toString());
        System.out.println("***EAX***");
        System.out.println(this.eax.getValue());
        System.out.println("***EBX***");
        System.out.println(this.ebx.getValue());
        System.out.println("***ECX***");
        System.out.println(this.ecx.getValue());
        System.out.println("***EDX***");
        System.out.println(this.edx.getValue());
        System.out.println("***LAST TARGET REGISTER***");
        System.out.println(this.targetRegister.toString());
        System.out.println("***LAST MATH OPERATOR LIST***");
        System.out.println(this.mathOperationElementsList.toString());
        System.out.println("***LAST STRING REPRESENTATION OF LAST INPUT DATA***");
        System.out.println(this.dataStringBasedOnInput);
        System.out.println("************");
    }
}
