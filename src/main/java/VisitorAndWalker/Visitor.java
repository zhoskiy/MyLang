package VisitorAndWalker;

import antlr4.GrammaticaBaseVisitor;
import antlr4.GrammaticaParser;
import block.Function;
import block.FunctionCall;
import block.FunctionParam;
import block.MainFunction;
import expession.Number;
import expession.*;
import my.Abstraction;
import my.Type;
import statement.*;

import java.util.*;

public class Visitor extends GrammaticaBaseVisitor<Abstraction> {

    private static final TreeMap<String, Map<String, String>> varTable = new TreeMap<>();
    private static final Map<String, String> varsMemory = new HashMap<>();
    private static final Map<String, List<Abstraction>> functionParamsMemory = new HashMap<>();


    @Override
    public Abstraction visitDefineVar(GrammaticaParser.DefineVarContext ctx) {
        checkForLegalVar(ctx.ID(0).getText());

        NameAndValue nameAndValue;
        DefineVar defineVar;
        Expression expression;
        if (ctx.expr() != null) {
            nameAndValue = new NameAndValue(ctx.ID(0).getText());
            expression = (Expression) visit(ctx.expr());
            defineVar = new DefineVar(new Type(ctx.TYPE().getText()), nameAndValue, expression);
            varsMemory.put(nameAndValue.getName(), ctx.TYPE().getText());
        } else {
            if (ctx.ID().size() == 1 && ctx.NUMBER() == null && ctx.FLOAT() == null) {
                nameAndValue = new NameAndValue(ctx.ID(0).getText());
            } else if (ctx.ID().size() == 2) {
                nameAndValue = new NameAndValue(ctx.ID(0).getText(), ctx.ID(1).getText());
            } else {
                String a;
                if (!ctx.NUMBER().getText().isEmpty()) {
                    a = ctx.NUMBER().getText();
                } else {
                    a = ctx.FLOAT().getText();
                }

                nameAndValue = new NameAndValue(ctx.ID(0).getText(), a);
            }

            varsMemory.put(nameAndValue.getName(), ctx.TYPE().getText());
            defineVar = new DefineVar(new Type(ctx.TYPE().getText()), nameAndValue);
        }

        return defineVar;
    }

    @Override
    public Abstraction visitAssigningValue(GrammaticaParser.AssigningValueContext ctx) {
        NameAndValue nameAndValue = new NameAndValue(ctx.ID().getText());
        return new AssigningVar(nameAndValue, (Expression) visit(ctx.expr()));
    }

    @Override
    public Abstraction visitAssigValueExp(GrammaticaParser.AssigValueExpContext ctx) {
        return visitAssigningValue(ctx.assigningValue());
    }

    @Override
    public Abstraction visitDefVarExp(GrammaticaParser.DefVarExpContext ctx) {
        return visitDefineVar(ctx.defineVar());
    }

    @Override
    public Abstraction visitPlusMinusExp(GrammaticaParser.PlusMinusExpContext ctx) {
        PlusMinus plusMinus;
        String operation;
        if (ctx.PLUS() != null) {
            operation = "+";
        } else {
            operation = "-";
        }

        plusMinus = new PlusMinus((Expression) visit(ctx.expr(0)), (Expression) visit(ctx.expr(1)), operation);
        return plusMinus;
    }

    @Override
    public Abstraction visitIdExp(GrammaticaParser.IdExpContext ctx) {
        return new Id(ctx.ID().getText());
    }

    @Override
    public Abstraction visitMultDivExp(GrammaticaParser.MultDivExpContext ctx) {
        MultDiv multDiv;
        String operation;
        if (ctx.MULT() != null) {
            operation = "*";
        } else {
            operation = "/";
        }

        multDiv = new MultDiv((Expression) visit(ctx.expr(0)), (Expression) visit(ctx.expr(1)), operation);
        return multDiv;
    }

    @Override
    public Abstraction visitPowExp(GrammaticaParser.PowExpContext ctx) {
        return new PowExp((Expression) visit(ctx.expr(0)), (Expression) visit(ctx.expr(1)));
    }

    @Override
    public Abstraction visitNumberExp(GrammaticaParser.NumberExpContext ctx) {
        return new Number(ctx.NUMBER().getText());
    }

    @Override
    public Abstraction visitBracketsExp(GrammaticaParser.BracketsExpContext ctx) {
        return new BracketsExp((Expression) visit(ctx.expr()));
    }

    @Override
    public Abstraction visitCompareExp(GrammaticaParser.CompareExpContext ctx) {
//        System.out.println("check compare " + ctx.expr(0).getText() + " " + ctx.expr(1).getText());
        checkForIllegalVar(ctx.expr(0).getText());
        if (visit(ctx.expr(1)).getClass() == Id.class)
            checkForIllegalVar(ctx.expr(1).getText());

        return new Compare((Expression) visit(ctx.expr(0)), (Expression) visit(ctx.expr(1)), ctx.COMPARE().getText());
    }

    @Override
    public Abstraction visitUnaryOperExp(GrammaticaParser.UnaryOperExpContext ctx) {
        checkForIllegalVar(ctx.ID().getText());

        return new UnaryOperation(new Id(ctx.ID().getText()), ctx.UNAROPERATION().getText());
    }

    @Override
    public Abstraction visitIfStatement(GrammaticaParser.IfStatementContext ctx) {
        ArrayList<Abstraction> statements = new ArrayList<>();
        for (GrammaticaParser.StatContext statContext : ctx.stat()) {
            statements.add(visit(statContext));
        }
        return new IfStatement((Expression) visit(ctx.expr()), statements);
    }

    @Override
    public Abstraction visitExprStatement(GrammaticaParser.ExprStatementContext ctx) {
        boolean newline = true;
        return new ExpressionStatement((Expression) visit(ctx.expr()), newline);
    }

    @Override
    public Abstraction visitReturnStatement(GrammaticaParser.ReturnStatementContext ctx) {
        return new ReturnStatement((Expression) visit(ctx.expr()));
    }

    @Override
    public Abstraction visitForStatement(GrammaticaParser.ForStatementContext ctx) {

        Expression var = (Expression) visit(ctx.expr(0));
        String nameFun = null;
        List<Expression> expressions = new ArrayList<>();
        if (var.getClass() == DefineVar.class) {
            DefineVar defineVar = (DefineVar) var;
            varsMemory.put(defineVar.getNameAndValue().getName(), defineVar.getType().toString());
            nameFun = varTable.lastKey();
//            System.out.println(nameFun);
            varTable.get(nameFun).put(defineVar.getNameAndValue().getName(), defineVar.getType().toString());
            expressions.add(defineVar);
        } else expressions.add(var);

        for (int i = 1; i < ctx.expr().size(); i++) {
            expressions.add((Expression) visit(ctx.expr(i)));
        }

        ArrayList<Abstraction> statements = new ArrayList<>();
        for (GrammaticaParser.StatContext statContext : ctx.stat()) {
            statements.add(visit(statContext));
        }

        if (var.getClass() == DefineVar.class)
            varTable.get(nameFun).remove(((DefineVar) var).getNameAndValue().getName());

        return new ForStatement(expressions, statements);
    }

    @Override
    public Abstraction visitPrintStatement(GrammaticaParser.PrintStatementContext ctx) {
        return new PrintStatement((Expression) visit(ctx.expr()));
    }

    @Override
    public Abstraction visitWhileStatement(GrammaticaParser.WhileStatementContext ctx) {
        Compare compare = new Compare((Expression) visit(ctx.expr(0)), (Expression) visit(ctx.expr(1)), ctx.COMPARE().getText());

        ArrayList<Abstraction> statements = new ArrayList<>();
        for (GrammaticaParser.StatContext statContext : ctx.stat()) {
            statements.add(visit(statContext));
        }

        return new WhileStatement(compare, statements);
    }

    @Override
    public Abstraction visitDoWhileStatement(GrammaticaParser.DoWhileStatementContext ctx) {
        Compare compare = new Compare((Expression) visit(ctx.expr(0)), (Expression) visit(ctx.expr(1)), ctx.COMPARE().getText());

        ArrayList<Abstraction> statements = new ArrayList<>();
        for (GrammaticaParser.StatContext statContext : ctx.stat()) {
            statements.add(visit(statContext));
        }
        return new DoStatement(compare, statements);
    }

    @Override
    public Abstraction visitNewlineState(GrammaticaParser.NewlineStateContext ctx) {
        return new NewlineStatement();
    }

    @Override
    public Abstraction visitStatement(GrammaticaParser.StatementContext ctx) {
        return visit(ctx.stat());
    }

    @Override
    public Abstraction visitFunctionCallState(GrammaticaParser.FunctionCallStateContext ctx) {
        return visitFunctionCall(ctx.functionCall());
    }

    @Override
    public Abstraction visitFunctionCall(GrammaticaParser.FunctionCallContext ctx) {
        if (!functionParamsMemory.containsKey(ctx.NAMEFUNC().getText())) {
            try {
                throw new Exception("Illegal function call");
            } catch (Exception e) {
                e.printStackTrace();
                Walker.setErrors(true);
            }

        } else if (functionParamsMemory.get(ctx.NAMEFUNC().getText()).size() != ctx.functionalParam().param().size()) {
            try {
                throw new Exception("Illegal number of function parameters");
            } catch (Exception e) {
                e.printStackTrace();
                Walker.setErrors(true);
            }
        }

        if (ctx.functionalParam() != null) {
            return new FunctionCall(ctx.NAMEFUNC().getText(), (FunctionParam) visit(ctx.functionalParam()));
        } else {
            return new FunctionCall(ctx.NAMEFUNC().getText());
        }
    }

    @Override
    public Abstraction visitFunctionMain(GrammaticaParser.FunctionMainContext ctx) {

        Map<String, String> funcVars = new HashMap<>();
        varsMemory.clear();
        varTable.put("main", funcVars);

        ArrayList<Abstraction> blocks = new ArrayList<>();
        for (GrammaticaParser.BlockStatementContext block : ctx.blockStatement()) {
            blocks.add(visit(block));
            varTable.get("main").putAll(varsMemory);
        }

        varsMemory.clear();
        return new MainFunction(blocks);
    }

    @Override
    public Abstraction visitFunctionalParam(GrammaticaParser.FunctionalParamContext ctx) {
        ArrayList<Abstraction> parameters = new ArrayList<>();
        for (GrammaticaParser.ParamContext param : ctx.param()) {
            parameters.add(visit(param));
        }
        return new FunctionParam(parameters);
    }

    @Override
    public Abstraction visitParam(GrammaticaParser.ParamContext ctx) {
        if (ctx.expr() != null) {
            if (visit(ctx.expr()).getClass() == DefineVar.class) {
                DefineVar defineVar = (DefineVar) visit(ctx.expr());
                varsMemory.put(defineVar.getNameAndValue().getName(), defineVar.getType().toString());
            }
            return visit(ctx.expr());
        } else return visit(ctx.functionCall());
    }

    @Override
    public Abstraction visitFunction(GrammaticaParser.FunctionContext ctx) {
        varsMemory.clear();

        Map<String, String> funcVars = new HashMap<>(varsMemory);
        varTable.put(ctx.NAMEFUNC().getText(), funcVars);

        ArrayList<Abstraction> blocks = new ArrayList<>();
        for (GrammaticaParser.BlockStatementContext block : ctx.blockStatement()) {
            varTable.get(ctx.NAMEFUNC().getText()).putAll(varsMemory);
            blocks.add(visit(block));
        }

        varTable.get(ctx.NAMEFUNC().getText()).putAll(varsMemory);

        if (ctx.functionalParam() != null) {
            FunctionParam param = (FunctionParam) visit(ctx.functionalParam());
            functionParamsMemory.put(ctx.NAMEFUNC().getText(), param.getParameters());
            return new Function(ctx.TYPEFUNC().getText(), ctx.NAMEFUNC().getText(), (FunctionParam) visit(ctx.functionalParam()), blocks);
        }
        return new Function(ctx.TYPEFUNC().getText(), ctx.NAMEFUNC().getText(), blocks);
    }

    @Override
    public Abstraction visitProgram(GrammaticaParser.ProgramContext ctx) {

        if (ctx.function() != null) {
            ArrayList<Abstraction> functions = new ArrayList<>();
            for (GrammaticaParser.FunctionContext fun : ctx.function()) {
                functions.add(visit(fun));
            }
            return new StartProgram(functions, (MainFunction) visit(ctx.functionMain()));
        }
        return new StartProgram((MainFunction) visit(ctx.functionMain()));
    }

    private void checkForIllegalVar(String var) {
//        System.out.println("check illegal in " + varTable.lastEntry().getKey() + " at " + var + "\n" + varTable);
        if (!varTable.lastEntry().getValue().containsKey(var)) {
            try {
                throw new Exception("Illegal variable used: " + var);
            } catch (Exception e) {
                e.printStackTrace();
                Walker.setErrors(true);
            }
        }

    }

    private void checkForLegalVar(String var) {
//        System.out.println("check legal in " + varTable.lastEntry().getKey() + " at " + var + "\n" + varTable);
        if (varTable.lastEntry().getValue().containsKey(var)) {
            try {
                throw new Exception("Variable used: " + var);
            } catch (Exception e) {
                e.printStackTrace();
                Walker.setErrors(true);
            }
        }

    }
}