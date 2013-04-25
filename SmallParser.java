// Generated from Small.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmallParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		BOOLEAN=10, ID=11, INTEGER=12, WS=13, COMMENT=14, STRING=15, NEWLINE=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'VISIBLE'", "'I HAS A'", "'HAI'", "'ITZ'", "'ITZ LIEK A'", 
		"'BANG'", "'R'", "','", "'KTHXBYE'", "BOOLEAN", "ID", "INTEGER", "WS", 
		"COMMENT", "STRING", "'\n'"
	};
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_identifier = 2, RULE_statement = 3, 
		RULE_print = 4, RULE_assignment = 5, RULE_declaration = 6, RULE_init = 7, 
		RULE_exprlist = 8, RULE_expr = 9, RULE_constant = 10;
	public static final String[] ruleNames = {
		"file", "block", "identifier", "statement", "print", "assignment", "declaration", 
		"init", "exprlist", "expr", "constant"
	};

	@Override
	public String getGrammarFileName() { return "Small.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmallParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(SmallParser.NEWLINE); }
		public TerminalNode EOF() { return getToken(SmallParser.EOF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(SmallParser.NEWLINE, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(3);
			setState(23); match(NEWLINE);
			setState(24); block();
			setState(25); match(9);
			setState(26); match(NEWLINE);
			setState(27); match(EOF);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << ID))) != 0)) {
				{
				{
				setState(29); statement();
				}
				}
				setState(34);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SmallParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(ID);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(40);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); print();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 3);
				{
				setState(39); declaration();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SmallParser.NEWLINE, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(1);
			setState(43); exprlist();
			setState(45);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(44); match(6);
				}
			}

			setState(47); match(NEWLINE);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SmallParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); identifier();
			setState(50); match(7);
			setState(51); expr();
			setState(52); match(NEWLINE);
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

	public static class DeclarationContext extends ParserRuleContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(2);
			setState(55); identifier();
			setState(56); init();
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

	public static class InitContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SmallParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			switch (_input.LA(1)) {
			case 4:
				{
				setState(58); match(4);
				setState(59); expr();
				}
				break;
			case 5:
				{
				setState(60); match(5);
				setState(61); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(64); match(NEWLINE);
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

	public static class ExprlistContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitExprlist(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); expr();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==8) {
				{
				{
				setState(67); match(8);
				setState(68); expr();
				}
				}
				setState(73);
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

	public static class ExprContext extends ParserRuleContext {
		public int value;
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); constant();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); identifier();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SmallParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SmallParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(SmallParser.STRING, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\2\3\22S\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3!\n\3"+
		"\f\3\16\3$\13\3\3\4\3\4\3\5\3\5\3\5\5\5+\n\5\3\6\3\6\3\6\5\6\60\n\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tA\n\t\3"+
		"\t\3\t\3\n\3\n\3\n\7\nH\n\n\f\n\16\nK\13\n\3\13\3\13\5\13O\n\13\3\f\3"+
		"\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\5\f\f\16\16\21\21N\2\30\3\2"+
		"\2\2\4\"\3\2\2\2\6%\3\2\2\2\b*\3\2\2\2\n,\3\2\2\2\f\63\3\2\2\2\168\3\2"+
		"\2\2\20@\3\2\2\2\22D\3\2\2\2\24N\3\2\2\2\26P\3\2\2\2\30\31\7\5\2\2\31"+
		"\32\7\22\2\2\32\33\5\4\3\2\33\34\7\13\2\2\34\35\7\22\2\2\35\36\7\1\2\2"+
		"\36\3\3\2\2\2\37!\5\b\5\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2"+
		"#\5\3\2\2\2$\"\3\2\2\2%&\7\r\2\2&\7\3\2\2\2\'+\5\n\6\2(+\5\f\7\2)+\5\16"+
		"\b\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\t\3\2\2\2,-\7\3\2\2-/\5\22\n\2.\60"+
		"\7\b\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\22\2\2\62\13\3\2"+
		"\2\2\63\64\5\6\4\2\64\65\7\t\2\2\65\66\5\24\13\2\66\67\7\22\2\2\67\r\3"+
		"\2\2\289\7\4\2\29:\5\6\4\2:;\5\20\t\2;\17\3\2\2\2<=\7\6\2\2=A\5\24\13"+
		"\2>?\7\7\2\2?A\5\6\4\2@<\3\2\2\2@>\3\2\2\2AB\3\2\2\2BC\7\22\2\2C\21\3"+
		"\2\2\2DI\5\24\13\2EF\7\n\2\2FH\5\24\13\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2"+
		"IJ\3\2\2\2J\23\3\2\2\2KI\3\2\2\2LO\5\26\f\2MO\5\6\4\2NL\3\2\2\2NM\3\2"+
		"\2\2O\25\3\2\2\2PQ\t\2\2\2Q\27\3\2\2\2\b\"*/@IN";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}