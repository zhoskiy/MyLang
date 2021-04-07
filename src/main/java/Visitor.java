import antlr4.GrammaticaBaseVisitor;
import antlr4.GrammaticaParser;
import block.*;
import expession.*;
import expession.Number;
import my.Abstraction;
import my.Type;
import statement.*;

import java.util.ArrayList;

public class Visitor extends GrammaticaBaseVisitor<Abstraction> {
    private String programText;

    @Override
    public Abstraction visitDefineVar(GrammaticaParser.DefineVarContext ctx) {
        NameAndValue nameAndValue;
        DefineVar defineVar;
        Expression expression;
        if (ctx.expr() != null) {
            nameAndValue = new NameAndValue(ctx.ID(0).getText());
            expression = (Expression) visit(ctx.expr());
            defineVar = new DefineVar(new Type(ctx.TYPE().getText()), nameAndValue, expression);
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

            defineVar = new DefineVar(new Type(ctx.TYPE().getText()), nameAndValue);
        }

        programText += defineVar;
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
        return new Compare((Expression) visit(ctx.expr(0)), (Expression) visit(ctx.expr(1)), ctx.COMPARE().getText());
    }

    @Override
    public Abstraction visitUnaryOperExp(GrammaticaParser.UnaryOperExpContext ctx) {
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
        ArrayList<Abstraction> statements = new ArrayList<>();
        for (GrammaticaParser.StatContext statContext : ctx.stat()) {
            statements.add(visit(statContext));
        }
        ArrayList<Expression> expression = new ArrayList<>();
        for (GrammaticaParser.ExprContext exprContext : ctx.expr()) {
            expression.add((Expression) visit(exprContext));
        }
        return new ForStatement(expression, statements);
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
        if (ctx.functionalParam() != null) {
            return new FunctionCall(ctx.NAMEFUNC().getText(), (FunctionParam) visit(ctx.functionalParam()));
        } else {
            return new FunctionCall(ctx.NAMEFUNC().getText());
        }
    }

    @Override
    public Abstraction visitFunctionMain(GrammaticaParser.FunctionMainContext ctx) {
        ArrayList<Abstraction> blocks = new ArrayList<>();
        for (GrammaticaParser.BlockStatementContext block : ctx.blockStatement()) {
            blocks.add(visit(block));
        }
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
            return visit(ctx.expr());
        } else return visit(ctx.functionCall());
    }

    @Override
    public Abstraction visitFunction(GrammaticaParser.FunctionContext ctx) {
        ArrayList<Abstraction> blocks = new ArrayList<>();
        for (GrammaticaParser.BlockStatementContext block : ctx.blockStatement()) {
            blocks.add(visit(block));
        }
        if (ctx.functionalParam() != null){
            return new Function(ctx.TYPEFUNC().getText(), ctx.NAMEFUNC().getText(), (FunctionParam) visit(ctx.functionalParam()), blocks);
        }
        return new Function(ctx.TYPEFUNC().getText(), ctx.NAMEFUNC().getText(), blocks);
    }

    @Override
    public Abstraction visitProgram(GrammaticaParser.ProgramContext ctx) {
        if (ctx.function() != null){
            ArrayList<Abstraction> functions = new ArrayList<>();
            for (GrammaticaParser.FunctionContext fun : ctx.function()) {
                functions.add(visit(fun));
            }
            return new StartProgram(functions, (MainFunction) visit(ctx.functionMain()));
        }
        return new StartProgram((MainFunction) visit(ctx.functionMain()));
    }
}