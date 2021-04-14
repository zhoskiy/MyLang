// Generated from D:/Study/6 ñåì/ßÏÈÑ/MyLang/src/main/java/antlr4\Grammatica.g4 by ANTLR 4.9.1
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GrammaticaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GrammaticaParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#functionMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionMain(GrammaticaParser.FunctionMainContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#functionalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalParam(GrammaticaParser.FunctionalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GrammaticaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallState}
	 * labeled alternative in {@link GrammaticaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallState(GrammaticaParser.FunctionCallStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newlineState}
	 * labeled alternative in {@link GrammaticaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewlineState(GrammaticaParser.NewlineStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement}
	 * labeled alternative in {@link GrammaticaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammaticaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#assigningValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigningValue(GrammaticaParser.AssigningValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#defineVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineVar(GrammaticaParser.DefineVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperExp(GrammaticaParser.UnaryOperExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExp(GrammaticaParser.CompareExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defVarExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefVarExp(GrammaticaParser.DefVarExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExp(GrammaticaParser.PlusMinusExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExp(GrammaticaParser.NumberExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExp(GrammaticaParser.IdExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExp(GrammaticaParser.PowExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigValueExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigValueExp(GrammaticaParser.AssigValueExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDivExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivExp(GrammaticaParser.MultDivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketsExp}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsExp(GrammaticaParser.BracketsExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(GrammaticaParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GrammaticaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(GrammaticaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(GrammaticaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(GrammaticaParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(GrammaticaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link GrammaticaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(GrammaticaParser.PrintStatementContext ctx);
}