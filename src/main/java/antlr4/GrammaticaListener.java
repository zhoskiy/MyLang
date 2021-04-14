// Generated from D:/Study/6 ñåì/ßÏÈÑ/MyLang/src/main/java/antlr4\Grammatica.g4 by ANTLR 4.9.1
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammaticaParser}.
 */
public interface GrammaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GrammaticaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GrammaticaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GrammaticaParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GrammaticaParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#functionMain}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMain(GrammaticaParser.FunctionMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#functionMain}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMain(GrammaticaParser.FunctionMainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#functionalParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalParam(GrammaticaParser.FunctionalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#functionalParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalParam(GrammaticaParser.FunctionalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GrammaticaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GrammaticaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallState}
	 * labeled alternative in {@link GrammaticaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallState(GrammaticaParser.FunctionCallStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallState}
	 * labeled alternative in {@link GrammaticaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallState(GrammaticaParser.FunctionCallStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newlineState}
	 * labeled alternative in {@link GrammaticaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterNewlineState(GrammaticaParser.NewlineStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newlineState}
	 * labeled alternative in {@link GrammaticaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitNewlineState(GrammaticaParser.NewlineStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement}
	 * labeled alternative in {@link GrammaticaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammaticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement}
	 * labeled alternative in {@link GrammaticaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammaticaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#assigningValue}.
	 * @param ctx the parse tree
	 */
	void enterAssigningValue(GrammaticaParser.AssigningValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#assigningValue}.
	 * @param ctx the parse tree
	 */
	void exitAssigningValue(GrammaticaParser.AssigningValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#defineVar}.
	 * @param ctx the parse tree
	 */
	void enterDefineVar(GrammaticaParser.DefineVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#defineVar}.
	 * @param ctx the parse tree
	 */
	void exitDefineVar(GrammaticaParser.DefineVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperExp(GrammaticaParser.UnaryOperExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperExp(GrammaticaParser.UnaryOperExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExp(GrammaticaParser.CompareExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExp(GrammaticaParser.CompareExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defVarExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDefVarExp(GrammaticaParser.DefVarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defVarExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDefVarExp(GrammaticaParser.DefVarExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExp(GrammaticaParser.PlusMinusExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExp(GrammaticaParser.PlusMinusExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExp(GrammaticaParser.NumberExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExp(GrammaticaParser.NumberExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExp(GrammaticaParser.IdExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExp(GrammaticaParser.IdExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExp(GrammaticaParser.PowExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExp(GrammaticaParser.PowExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigValueExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssigValueExp(GrammaticaParser.AssigValueExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigValueExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssigValueExp(GrammaticaParser.AssigValueExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExp(GrammaticaParser.MultDivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExp(GrammaticaParser.MultDivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketsExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBracketsExp(GrammaticaParser.BracketsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketsExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBracketsExp(GrammaticaParser.BracketsExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(GrammaticaParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(GrammaticaParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GrammaticaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GrammaticaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(GrammaticaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(GrammaticaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(GrammaticaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(GrammaticaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(GrammaticaParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(GrammaticaParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(GrammaticaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(GrammaticaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(GrammaticaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(GrammaticaParser.PrintStatementContext ctx);
}