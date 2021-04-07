// Generated from D:/Study/6 ñåì/ßÏÈÑ/MyLang/src/main/java/antlr4\Grammatica.g4 by ANTLR 4.9.1
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PLUS=11, MINUS=12, MULT=13, DIV=14, POW=15, UNAROPERATION=16, 
		TYPE=17, TYPEFUNC=18, NAMEFUNC=19, NEWLINE=20, IF=21, RETURN=22, WHILE=23, 
		DO=24, FOR=25, ID=26, NUMBER=27, FLOAT=28, COMPARE=29, WHITESPACE=30;
	public static final int
		RULE_function = 0, RULE_functionCall = 1, RULE_functionMain = 2, RULE_functionalParam = 3, 
		RULE_param = 4, RULE_program = 5, RULE_blockStatement = 6, RULE_expr = 7, 
		RULE_stat = 8, RULE_assigningValue = 9, RULE_defineVar = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"function", "functionCall", "functionMain", "functionalParam", "param", 
			"program", "blockStatement", "expr", "stat", "assigningValue", "defineVar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'):'", "')'", "'{'", "'}'", "','", "'if('", "'for('", "';'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'^'", null, null, null, null, null, 
			"'if'", "'bratishka_ia_pokushat_prines'", "'while'", "'do:'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PLUS", 
			"MINUS", "MULT", "DIV", "POW", "UNAROPERATION", "TYPE", "TYPEFUNC", "NAMEFUNC", 
			"NEWLINE", "IF", "RETURN", "WHILE", "DO", "FOR", "ID", "NUMBER", "FLOAT", 
			"COMPARE", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode TYPEFUNC() { return getToken(GrammaticaParser.TYPEFUNC, 0); }
		public TerminalNode NAMEFUNC() { return getToken(GrammaticaParser.NAMEFUNC, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GrammaticaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammaticaParser.NEWLINE, i);
		}
		public FunctionalParamContext functionalParam() {
			return getRuleContext(FunctionalParamContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(TYPEFUNC);
			setState(23);
			match(NAMEFUNC);
			setState(24);
			match(T__0);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TYPE) | (1L << NAMEFUNC) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) {
				{
				setState(25);
				functionalParam();
				}
			}

			setState(28);
			match(T__1);
			setState(29);
			match(NEWLINE);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					blockStatement();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(36);
			match(NEWLINE);
			setState(37);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode NAMEFUNC() { return getToken(GrammaticaParser.NAMEFUNC, 0); }
		public TerminalNode NEWLINE() { return getToken(GrammaticaParser.NEWLINE, 0); }
		public FunctionalParamContext functionalParam() {
			return getRuleContext(FunctionalParamContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(NAMEFUNC);
			setState(40);
			match(T__0);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TYPE) | (1L << NAMEFUNC) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) {
				{
				setState(41);
				functionalParam();
				}
			}

			setState(44);
			match(T__2);
			setState(45);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionMainContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public FunctionMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionMain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterFunctionMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitFunctionMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitFunctionMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionMainContext functionMain() throws RecognitionException {
		FunctionMainContext _localctx = new FunctionMainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionMain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__3);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << TYPE) | (1L << NAMEFUNC) | (1L << NEWLINE) | (1L << RETURN) | (1L << WHILE) | (1L << DO) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(48);
				blockStatement();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionalParamContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public FunctionalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterFunctionalParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitFunctionalParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitFunctionalParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalParamContext functionalParam() throws RecognitionException {
		FunctionalParamContext _localctx = new FunctionalParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			param();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(57);
				match(T__5);
				setState(58);
				param();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMEFUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				functionCall();
				}
				break;
			case T__0:
			case TYPE:
			case ID:
			case NUMBER:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public FunctionMainContext functionMain() {
			return getRuleContext(FunctionMainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPEFUNC) {
				{
				{
				setState(68);
				function();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			functionMain();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	 
		public BlockStatementContext() { }
		public void copyFrom(BlockStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewlineStateContext extends BlockStatementContext {
		public TerminalNode NEWLINE() { return getToken(GrammaticaParser.NEWLINE, 0); }
		public NewlineStateContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterNewlineState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitNewlineState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitNewlineState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallStateContext extends BlockStatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStateContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterFunctionCallState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitFunctionCallState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitFunctionCallState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementContext extends BlockStatementContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public StatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockStatement);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMEFUNC:
				_localctx = new FunctionCallStateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				functionCall();
				}
				break;
			case NEWLINE:
				_localctx = new NewlineStateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(NEWLINE);
				}
				break;
			case T__0:
			case T__6:
			case T__7:
			case TYPE:
			case RETURN:
			case WHILE:
			case DO:
			case ID:
			case NUMBER:
			case FLOAT:
				_localctx = new StatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryOperExpContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public TerminalNode UNAROPERATION() { return getToken(GrammaticaParser.UNAROPERATION, 0); }
		public UnaryOperExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterUnaryOperExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitUnaryOperExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitUnaryOperExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareExpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(GrammaticaParser.COMPARE, 0); }
		public CompareExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterCompareExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitCompareExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitCompareExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefVarExpContext extends ExprContext {
		public DefineVarContext defineVar() {
			return getRuleContext(DefineVarContext.class,0);
		}
		public DefVarExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterDefVarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitDefVarExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitDefVarExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusExpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GrammaticaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammaticaParser.MINUS, 0); }
		public PlusMinusExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterPlusMinusExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitPlusMinusExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitPlusMinusExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(GrammaticaParser.NUMBER, 0); }
		public NumberExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterNumberExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitNumberExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitNumberExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExpContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public IdExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterIdExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitIdExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitIdExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(GrammaticaParser.POW, 0); }
		public PowExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterPowExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitPowExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitPowExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssigValueExpContext extends ExprContext {
		public AssigningValueContext assigningValue() {
			return getRuleContext(AssigningValueContext.class,0);
		}
		public AssigValueExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterAssigValueExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitAssigValueExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitAssigValueExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivExpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(GrammaticaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GrammaticaParser.DIV, 0); }
		public MultDivExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterMultDivExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitMultDivExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitMultDivExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsExpContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracketsExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterBracketsExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitBracketsExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitBracketsExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new BracketsExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				match(T__0);
				setState(83);
				expr(0);
				setState(84);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new UnaryOperExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(ID);
				setState(87);
				match(UNAROPERATION);
				}
				break;
			case 3:
				{
				_localctx = new DefVarExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				defineVar();
				}
				break;
			case 4:
				{
				_localctx = new AssigValueExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				assigningValue();
				}
				break;
			case 5:
				{
				_localctx = new NumberExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(NUMBER);
				}
				break;
			case 6:
				{
				_localctx = new IdExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(95);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new PowExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(98);
						match(POW);
						setState(99);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(101);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new CompareExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(104);
						match(COMPARE);
						setState(105);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StatContext {
		public TerminalNode WHILE() { return getToken(GrammaticaParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(GrammaticaParser.COMPARE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GrammaticaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammaticaParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatementContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GrammaticaParser.NEWLINE, 0); }
		public ExprStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GrammaticaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammaticaParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ForStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileStatementContext extends StatContext {
		public TerminalNode DO() { return getToken(GrammaticaParser.DO, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GrammaticaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammaticaParser.NEWLINE, i);
		}
		public TerminalNode WHILE() { return getToken(GrammaticaParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(GrammaticaParser.COMPARE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public DoWhileStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GrammaticaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammaticaParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatContext {
		public TerminalNode RETURN() { return getToken(GrammaticaParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stat);
		int _la;
		try {
			int _alt;
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case TYPE:
			case ID:
			case NUMBER:
			case FLOAT:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				expr(0);
				setState(112);
				match(NEWLINE);
				}
				break;
			case T__6:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__6);
				setState(115);
				expr(0);
				setState(116);
				match(T__1);
				setState(117);
				match(NEWLINE);
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					stat();
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << TYPE) | (1L << RETURN) | (1L << WHILE) | (1L << DO) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
				setState(123);
				match(NEWLINE);
				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(WHILE);
				setState(126);
				match(T__0);
				setState(127);
				expr(0);
				setState(128);
				match(COMPARE);
				setState(129);
				expr(0);
				setState(130);
				match(T__1);
				setState(131);
				match(NEWLINE);
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					stat();
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << TYPE) | (1L << RETURN) | (1L << WHILE) | (1L << DO) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
				setState(137);
				match(NEWLINE);
				}
				break;
			case T__7:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(T__7);
				setState(140);
				expr(0);
				setState(141);
				match(T__8);
				setState(142);
				expr(0);
				setState(143);
				match(T__8);
				setState(144);
				expr(0);
				setState(145);
				match(T__1);
				setState(146);
				match(NEWLINE);
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					stat();
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << TYPE) | (1L << RETURN) | (1L << WHILE) | (1L << DO) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
				setState(152);
				match(NEWLINE);
				}
				break;
			case DO:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				match(DO);
				setState(155);
				match(NEWLINE);
				setState(157); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(156);
						stat();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(159); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(161);
				match(WHILE);
				setState(162);
				match(T__0);
				setState(163);
				expr(0);
				setState(164);
				match(COMPARE);
				setState(165);
				expr(0);
				setState(166);
				match(T__2);
				setState(167);
				match(NEWLINE);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(RETURN);
				setState(170);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigningValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigningValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigningValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterAssigningValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitAssigningValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitAssigningValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigningValueContext assigningValue() throws RecognitionException {
		AssigningValueContext _localctx = new AssigningValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assigningValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ID);
			setState(174);
			match(T__9);
			setState(175);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineVarContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GrammaticaParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammaticaParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(GrammaticaParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(GrammaticaParser.FLOAT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefineVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterDefineVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitDefineVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitDefineVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineVarContext defineVar() throws RecognitionException {
		DefineVarContext _localctx = new DefineVarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defineVar);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(TYPE);
				setState(178);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(TYPE);
				setState(180);
				match(ID);
				setState(181);
				match(T__9);
				setState(182);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(TYPE);
				setState(185);
				match(ID);
				setState(186);
				match(T__9);
				setState(187);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(TYPE);
				setState(189);
				match(ID);
				setState(190);
				match(T__9);
				setState(191);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\5\2\35\n\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2"+
		"%\13\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\4\3\4\7\4\64\n\4"+
		"\f\4\16\4\67\13\4\3\4\3\4\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\6\3\6"+
		"\5\6E\n\6\3\7\7\7H\n\7\f\7\16\7K\13\7\3\7\3\7\3\b\3\b\3\b\5\bR\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\6\nz\n\n\r\n\16\n{\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\6\n\u0088\n\n\r\n\16\n\u0089\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\6\n\u0097\n\n\r\n\16\n\u0098\3\n\3\n\3\n\3\n\3\n\6\n\u00a0\n"+
		"\n\r\n\16\n\u00a1\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ae\n"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00c3\n\f\3\f\2\3\20\r\2\4\6\b\n\f\16\20\22\24\26\2\4"+
		"\3\2\17\20\3\2\r\16\2\u00d8\2\30\3\2\2\2\4)\3\2\2\2\6\61\3\2\2\2\b:\3"+
		"\2\2\2\nD\3\2\2\2\fI\3\2\2\2\16Q\3\2\2\2\20^\3\2\2\2\22\u00ad\3\2\2\2"+
		"\24\u00af\3\2\2\2\26\u00c2\3\2\2\2\30\31\7\24\2\2\31\32\7\25\2\2\32\34"+
		"\7\3\2\2\33\35\5\b\5\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37"+
		"\7\4\2\2\37#\7\26\2\2 \"\5\16\b\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2"+
		"\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\26\2\2\'(\7\26\2\2(\3\3\2\2\2)*\7\25\2\2"+
		"*,\7\3\2\2+-\5\b\5\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\5\2\2/\60\7\26"+
		"\2\2\60\5\3\2\2\2\61\65\7\6\2\2\62\64\5\16\b\2\63\62\3\2\2\2\64\67\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\7\2\29"+
		"\7\3\2\2\2:?\5\n\6\2;<\7\b\2\2<>\5\n\6\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2"+
		"?@\3\2\2\2@\t\3\2\2\2A?\3\2\2\2BE\5\4\3\2CE\5\20\t\2DB\3\2\2\2DC\3\2\2"+
		"\2E\13\3\2\2\2FH\5\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2"+
		"\2\2KI\3\2\2\2LM\5\6\4\2M\r\3\2\2\2NR\5\4\3\2OR\7\26\2\2PR\5\22\n\2QN"+
		"\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\17\3\2\2\2ST\b\t\1\2TU\7\3\2\2UV\5\20\t"+
		"\2VW\7\5\2\2W_\3\2\2\2XY\7\34\2\2Y_\7\22\2\2Z_\5\26\f\2[_\5\24\13\2\\"+
		"_\7\35\2\2]_\7\34\2\2^S\3\2\2\2^X\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2"+
		"\2^]\3\2\2\2_n\3\2\2\2`a\f\13\2\2ab\t\2\2\2bm\5\20\t\fcd\f\n\2\2de\7\21"+
		"\2\2em\5\20\t\13fg\f\t\2\2gh\t\3\2\2hm\5\20\t\nij\f\b\2\2jk\7\37\2\2k"+
		"m\5\20\t\tl`\3\2\2\2lc\3\2\2\2lf\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2o\21\3\2\2\2pn\3\2\2\2qr\5\20\t\2rs\7\26\2\2s\u00ae\3\2\2\2"+
		"tu\7\t\2\2uv\5\20\t\2vw\7\4\2\2wy\7\26\2\2xz\5\22\n\2yx\3\2\2\2z{\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\26\2\2~\u00ae\3\2\2\2\177\u0080"+
		"\7\31\2\2\u0080\u0081\7\3\2\2\u0081\u0082\5\20\t\2\u0082\u0083\7\37\2"+
		"\2\u0083\u0084\5\20\t\2\u0084\u0085\7\4\2\2\u0085\u0087\7\26\2\2\u0086"+
		"\u0088\5\22\n\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\26\2\2\u008c"+
		"\u00ae\3\2\2\2\u008d\u008e\7\n\2\2\u008e\u008f\5\20\t\2\u008f\u0090\7"+
		"\13\2\2\u0090\u0091\5\20\t\2\u0091\u0092\7\13\2\2\u0092\u0093\5\20\t\2"+
		"\u0093\u0094\7\4\2\2\u0094\u0096\7\26\2\2\u0095\u0097\5\22\n\2\u0096\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\7\26\2\2\u009b\u00ae\3\2\2\2\u009c\u009d\7"+
		"\32\2\2\u009d\u009f\7\26\2\2\u009e\u00a0\5\22\n\2\u009f\u009e\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\7\31\2\2\u00a4\u00a5\7\3\2\2\u00a5\u00a6\5\20\t\2"+
		"\u00a6\u00a7\7\37\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa"+
		"\7\26\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ae\5\20\t"+
		"\2\u00adq\3\2\2\2\u00adt\3\2\2\2\u00ad\177\3\2\2\2\u00ad\u008d\3\2\2\2"+
		"\u00ad\u009c\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\23\3\2\2\2\u00af\u00b0"+
		"\7\34\2\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\5\20\t\2\u00b2\25\3\2\2\2\u00b3"+
		"\u00b4\7\23\2\2\u00b4\u00c3\7\34\2\2\u00b5\u00b6\7\23\2\2\u00b6\u00b7"+
		"\7\34\2\2\u00b7\u00b8\7\f\2\2\u00b8\u00c3\7\35\2\2\u00b9\u00c3\7\36\2"+
		"\2\u00ba\u00bb\7\23\2\2\u00bb\u00bc\7\34\2\2\u00bc\u00bd\7\f\2\2\u00bd"+
		"\u00c3\7\34\2\2\u00be\u00bf\7\23\2\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1"+
		"\7\f\2\2\u00c1\u00c3\5\20\t\2\u00c2\u00b3\3\2\2\2\u00c2\u00b5\3\2\2\2"+
		"\u00c2\u00b9\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\27"+
		"\3\2\2\2\23\34#,\65?DIQ^ln{\u0089\u0098\u00a1\u00ad\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}