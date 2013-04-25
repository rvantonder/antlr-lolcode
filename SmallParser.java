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
		T__48=1, T__47=2, T__46=3, T__45=4, T__44=5, T__43=6, T__42=7, T__41=8, 
		T__40=9, T__39=10, T__38=11, T__37=12, T__36=13, T__35=14, T__34=15, T__33=16, 
		T__32=17, T__31=18, T__30=19, T__29=20, T__28=21, T__27=22, T__26=23, 
		T__25=24, T__24=25, T__23=26, T__22=27, T__21=28, T__20=29, T__19=30, 
		T__18=31, T__17=32, T__16=33, T__15=34, T__14=35, T__13=36, T__12=37, 
		T__11=38, T__10=39, T__9=40, T__8=41, T__7=42, T__6=43, T__5=44, T__4=45, 
		T__3=46, T__2=47, T__1=48, T__0=49, APOSTROPHE=50, BOOLEAN=51, ID=52, 
		INTEGER=53, WS=54, COMMENT=55, MULTICOMMENT=56, BANG=57, STRING=58, NEWLINE=59;
	public static final String[] tokenNames = {
		"<INVALID>", "'OIC'", "'NUMBAR'", "'UPPIN'", "'WILE'", "'BOTH OF'", "'MEBBE'", 
		"'BUKKIT'", "'GIMMEH'", "'NOOB'", "'YARN'", "'HAI'", "'QUOSHUNT OF'", 
		"'SRS'", "'BANG'", "'AN'", "'MKAY'", "'PRODUKT OF'", "'VISIBLE'", "'KTHXBYE'", 
		"'NUMBR'", "'EITHER OF'", "'NOT'", "'NERFIN'", "'ITZ A'", "'IM OUTTA YR'", 
		"'BOTH SAEM'", "','", "'SUM OF'", "'SMALLR OF'", "'BIGGR OF'", "'WON OF'", 
		"'ALL OF'", "'DIFFRINT'", "'SMOOSH'", "'O RLY?'", "'DIFF OF'", "'ITZ LIEK A'", 
		"'NO WAI'", "'YA RLY'", "'IS NOW A'", "'TIL'", "'ITZ'", "'TROOF'", "'R'", 
		"'MOD OF'", "'YR'", "'ANY OF'", "'IM IN YR'", "'HAS A'", "''Z'", "BOOLEAN", 
		"ID", "INTEGER", "WS", "COMMENT", "MULTICOMMENT", "'!'", "STRING", "NEWLINE"
	};
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_identifier = 2, RULE_statement = 3, 
		RULE_print = 4, RULE_assignment = 5, RULE_declaration = 6, RULE_init = 7, 
		RULE_ifthenelse = 8, RULE_elseifcond = 9, RULE_elsecond = 10, RULE_loop = 11, 
		RULE_loopupdate = 12, RULE_loopupdateop = 13, RULE_loopguard = 14, RULE_input = 15, 
		RULE_cast = 16, RULE_exprlist = 17, RULE_expr = 18, RULE_opexpr = 19, 
		RULE_unaryop = 20, RULE_binaryop = 21, RULE_binaryoptype = 22, RULE_naryop = 23, 
		RULE_naryoptype = 24, RULE_naryopargs = 25, RULE_naryoparg = 26, RULE_constant = 27, 
		RULE_type = 28;
	public static final String[] ruleNames = {
		"file", "block", "identifier", "statement", "print", "assignment", "declaration", 
		"init", "ifthenelse", "elseifcond", "elsecond", "loop", "loopupdate", 
		"loopupdateop", "loopguard", "input", "cast", "exprlist", "expr", "opexpr", 
		"unaryop", "binaryop", "binaryoptype", "naryop", "naryoptype", "naryopargs", 
		"naryoparg", "constant", "type"
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
			setState(58); match(11);
			setState(59); match(NEWLINE);
			setState(60); block();
			setState(61); match(19);
			setState(62); match(NEWLINE);
			setState(63); match(EOF);
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
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 8) | (1L << 12) | (1L << 13) | (1L << 17) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 26) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 45) | (1L << 47) | (1L << 48) | (1L << BOOLEAN) | (1L << ID) | (1L << INTEGER) | (1L << STRING) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(65); statement();
				}
				}
				setState(70);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode APOSTROPHE() { return getToken(SmallParser.APOSTROPHE, 0); }
		public TerminalNode ID() { return getToken(SmallParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		int _la;
		try {
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << ID) | (1L << INTEGER) | (1L << STRING))) != 0)) {
					{
					setState(74);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(72); match(ID);
						}
						break;
					case BOOLEAN:
					case INTEGER:
					case STRING:
						{
						setState(73); constant();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(76); match(APOSTROPHE);
					}
				}

				setState(79); match(13);
				setState(80); expr();
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

	public static class StatementContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public IfthenelseContext ifthenelse() {
			return getRuleContext(IfthenelseContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SmallParser.NEWLINE, 0); }
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); print();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); assignment();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85); declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86); ifthenelse();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87); loop();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88); input();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89); cast();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90); expr();
				setState(91); match(NEWLINE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(93); match(NEWLINE);
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
			setState(96); match(18);
			setState(97); exprlist();
			setState(99);
			_la = _input.LA(1);
			if (_la==14) {
				{
				setState(98); match(14);
				}
			}

			setState(101); match(NEWLINE);
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
			setState(103); identifier();
			setState(104); match(44);
			setState(105); expr();
			setState(106); match(NEWLINE);
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
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
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
			setState(108); identifier();
			setState(109); match(49);
			setState(110); identifier();
			setState(111); init();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(119);
			switch (_input.LA(1)) {
			case 42:
				{
				setState(113); match(42);
				setState(114); expr();
				}
				break;
			case 24:
				{
				setState(115); match(24);
				setState(116); type();
				}
				break;
			case 37:
				{
				setState(117); match(37);
				setState(118); identifier();
				}
				break;
			case NEWLINE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(121); match(NEWLINE);
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

	public static class IfthenelseContext extends ParserRuleContext {
		public ElsecondContext elsecond() {
			return getRuleContext(ElsecondContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SmallParser.NEWLINE); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseifcondContext elseifcond(int i) {
			return getRuleContext(ElseifcondContext.class,i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(SmallParser.NEWLINE, i);
		}
		public List<ElseifcondContext> elseifcond() {
			return getRuleContexts(ElseifcondContext.class);
		}
		public IfthenelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthenelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterIfthenelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitIfthenelse(this);
		}
	}

	public final IfthenelseContext ifthenelse() throws RecognitionException {
		IfthenelseContext _localctx = new IfthenelseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifthenelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(35);
			setState(124); match(NEWLINE);
			setState(125); match(39);
			setState(126); match(NEWLINE);
			setState(127); block();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6) {
				{
				{
				setState(128); elseifcond();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			_la = _input.LA(1);
			if (_la==38) {
				{
				setState(134); elsecond();
				}
			}

			setState(137); match(1);
			setState(138); match(NEWLINE);
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

	public static class ElseifcondContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SmallParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseifcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterElseifcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitElseifcond(this);
		}
	}

	public final ElseifcondContext elseifcond() throws RecognitionException {
		ElseifcondContext _localctx = new ElseifcondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseifcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(6);
			setState(141); expr();
			setState(142); match(NEWLINE);
			setState(143); block();
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

	public static class ElsecondContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SmallParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElsecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsecond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterElsecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitElsecond(this);
		}
	}

	public final ElsecondContext elsecond() throws RecognitionException {
		ElsecondContext _localctx = new ElsecondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elsecond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(38);
			setState(146); match(NEWLINE);
			setState(147); block();
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

	public static class LoopContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public LoopguardContext loopguard() {
			return getRuleContext(LoopguardContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SmallParser.NEWLINE); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(SmallParser.NEWLINE, i);
		}
		public LoopupdateContext loopupdate() {
			return getRuleContext(LoopupdateContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(48);
			setState(150); identifier();
			setState(152);
			_la = _input.LA(1);
			if (_la==3 || _la==23) {
				{
				setState(151); loopupdate();
				}
			}

			setState(155);
			_la = _input.LA(1);
			if (_la==4 || _la==41) {
				{
				setState(154); loopguard();
				}
			}

			setState(157); match(NEWLINE);
			setState(158); block();
			setState(159); match(25);
			setState(160); identifier();
			setState(161); match(NEWLINE);
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

	public static class LoopupdateContext extends ParserRuleContext {
		public LoopupdateopContext loopupdateop() {
			return getRuleContext(LoopupdateopContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LoopupdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopupdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterLoopupdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitLoopupdate(this);
		}
	}

	public final LoopupdateContext loopupdate() throws RecognitionException {
		LoopupdateContext _localctx = new LoopupdateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loopupdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); loopupdateop();
			setState(164); match(46);
			setState(165); identifier();
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

	public static class LoopupdateopContext extends ParserRuleContext {
		public LoopupdateopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopupdateop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterLoopupdateop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitLoopupdateop(this);
		}
	}

	public final LoopupdateopContext loopupdateop() throws RecognitionException {
		LoopupdateopContext _localctx = new LoopupdateopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopupdateop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==3 || _la==23) ) {
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

	public static class LoopguardContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LoopguardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopguard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterLoopguard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitLoopguard(this);
		}
	}

	public final LoopguardContext loopguard() throws RecognitionException {
		LoopguardContext _localctx = new LoopguardContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loopguard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==4 || _la==41) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(170); expr();
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SmallParser.NEWLINE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(8);
			setState(173); identifier();
			setState(174); match(NEWLINE);
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

	public static class CastContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SmallParser.NEWLINE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitCast(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); identifier();
			setState(177); match(40);
			setState(178); type();
			setState(179); match(NEWLINE);
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
		enterRule(_localctx, 34, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); expr();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==27) {
				{
				{
				setState(182); match(27);
				setState(183); expr();
				}
				}
				setState(188);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OpexprContext opexpr() {
			return getRuleContext(OpexprContext.class,0);
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
		enterRule(_localctx, 36, RULE_expr);
		try {
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); constant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); identifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); opexpr();
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

	public static class OpexprContext extends ParserRuleContext {
		public UnaryopContext unaryop() {
			return getRuleContext(UnaryopContext.class,0);
		}
		public BinaryopContext binaryop() {
			return getRuleContext(BinaryopContext.class,0);
		}
		public NaryopContext naryop() {
			return getRuleContext(NaryopContext.class,0);
		}
		public OpexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterOpexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitOpexpr(this);
		}
	}

	public final OpexprContext opexpr() throws RecognitionException {
		OpexprContext _localctx = new OpexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_opexpr);
		try {
			setState(197);
			switch (_input.LA(1)) {
			case 22:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); unaryop();
				}
				break;
			case 5:
			case 12:
			case 17:
			case 21:
			case 26:
			case 28:
			case 29:
			case 30:
			case 31:
			case 33:
			case 36:
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); binaryop();
				}
				break;
			case 32:
			case 34:
			case 47:
				enterOuterAlt(_localctx, 3);
				{
				setState(196); naryop();
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

	public static class UnaryopContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterUnaryop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitUnaryop(this);
		}
	}

	public final UnaryopContext unaryop() throws RecognitionException {
		UnaryopContext _localctx = new UnaryopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(22);
			setState(200); expr();
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

	public static class BinaryopContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinaryoptypeContext binaryoptype() {
			return getRuleContext(BinaryoptypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public BinaryopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterBinaryop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitBinaryop(this);
		}
	}

	public final BinaryopContext binaryop() throws RecognitionException {
		BinaryopContext _localctx = new BinaryopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_binaryop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); binaryoptype();
			setState(203); expr();
			setState(205);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(204); match(15);
				}
			}

			setState(207); expr();
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

	public static class BinaryoptypeContext extends ParserRuleContext {
		public BinaryoptypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryoptype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterBinaryoptype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitBinaryoptype(this);
		}
	}

	public final BinaryoptypeContext binaryoptype() throws RecognitionException {
		BinaryoptypeContext _localctx = new BinaryoptypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_binaryoptype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 12) | (1L << 17) | (1L << 21) | (1L << 26) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 33) | (1L << 36) | (1L << 45))) != 0)) ) {
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

	public static class NaryopContext extends ParserRuleContext {
		public NaryopargsContext naryopargs() {
			return getRuleContext(NaryopargsContext.class,0);
		}
		public NaryoptypeContext naryoptype() {
			return getRuleContext(NaryoptypeContext.class,0);
		}
		public NaryopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naryop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterNaryop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitNaryop(this);
		}
	}

	public final NaryopContext naryop() throws RecognitionException {
		NaryopContext _localctx = new NaryopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_naryop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); naryoptype();
			setState(212); naryopargs();
			setState(213); match(16);
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

	public static class NaryoptypeContext extends ParserRuleContext {
		public NaryoptypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naryoptype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterNaryoptype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitNaryoptype(this);
		}
	}

	public final NaryoptypeContext naryoptype() throws RecognitionException {
		NaryoptypeContext _localctx = new NaryoptypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_naryoptype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 32) | (1L << 34) | (1L << 47))) != 0)) ) {
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

	public static class NaryopargsContext extends ParserRuleContext {
		public NaryopargContext naryoparg(int i) {
			return getRuleContext(NaryopargContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<NaryopargContext> naryoparg() {
			return getRuleContexts(NaryopargContext.class);
		}
		public NaryopargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naryopargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterNaryopargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitNaryopargs(this);
		}
	}

	public final NaryopargsContext naryopargs() throws RecognitionException {
		NaryopargsContext _localctx = new NaryopargsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_naryopargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); expr();
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218); naryoparg();
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << 21) | (1L << 22) | (1L << 26) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 45) | (1L << 47) | (1L << BOOLEAN) | (1L << ID) | (1L << INTEGER) | (1L << STRING))) != 0) );
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

	public static class NaryopargContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NaryopargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naryoparg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterNaryoparg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitNaryoparg(this);
		}
	}

	public final NaryopargContext naryoparg() throws RecognitionException {
		NaryopargContext _localctx = new NaryopargContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_naryoparg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(223); match(15);
				}
			}

			setState(226); expr();
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
		enterRule(_localctx, 54, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 9) | (1L << 10) | (1L << 20) | (1L << 43))) != 0)) ) {
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
		"\2\3=\u00eb\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3E\n\3\f\3\16\3H\13\3\3\4\3\4\3\4\5"+
		"\4M\n\4\3\4\5\4P\n\4\3\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5a\n\5\3\6\3\6\3\6\5\6f\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tz\n\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u0084\n\n\f\n\16\n\u0087\13\n\3\n\5\n\u008a\n\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u009b"+
		"\n\r\3\r\5\r\u009e\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\7\23\u00bb\n\23\f\23\16\23\u00be\13\23\3\24\3\24\3\24\5\24"+
		"\u00c3\n\24\3\25\3\25\3\25\5\25\u00c8\n\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\5\27\u00d0\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\6\33\u00de\n\33\r\33\16\33\u00df\3\34\5\34\u00e3\n\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:\2\b\4\5\5\31\31\4\6\6++\13\7\7\16\16\23\23"+
		"\27\27\34\34\36!##&&//\5\"\"$$\61\61\5\65\65\67\67<<\7\4\4\t\t\13\f\26"+
		"\26--\u00e9\2<\3\2\2\2\4F\3\2\2\2\6S\3\2\2\2\b`\3\2\2\2\nb\3\2\2\2\fi"+
		"\3\2\2\2\16n\3\2\2\2\20y\3\2\2\2\22}\3\2\2\2\24\u008e\3\2\2\2\26\u0093"+
		"\3\2\2\2\30\u0097\3\2\2\2\32\u00a5\3\2\2\2\34\u00a9\3\2\2\2\36\u00ab\3"+
		"\2\2\2 \u00ae\3\2\2\2\"\u00b2\3\2\2\2$\u00b7\3\2\2\2&\u00c2\3\2\2\2(\u00c7"+
		"\3\2\2\2*\u00c9\3\2\2\2,\u00cc\3\2\2\2.\u00d3\3\2\2\2\60\u00d5\3\2\2\2"+
		"\62\u00d9\3\2\2\2\64\u00db\3\2\2\2\66\u00e2\3\2\2\28\u00e6\3\2\2\2:\u00e8"+
		"\3\2\2\2<=\7\r\2\2=>\7=\2\2>?\5\4\3\2?@\7\25\2\2@A\7=\2\2AB\7\1\2\2B\3"+
		"\3\2\2\2CE\5\b\5\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\5\3\2\2\2"+
		"HF\3\2\2\2IT\7\66\2\2JM\7\66\2\2KM\58\35\2LJ\3\2\2\2LK\3\2\2\2MN\3\2\2"+
		"\2NP\7\64\2\2OL\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\17\2\2RT\5&\24\2SI\3\2"+
		"\2\2SO\3\2\2\2T\7\3\2\2\2Ua\5\n\6\2Va\5\f\7\2Wa\5\16\b\2Xa\5\22\n\2Ya"+
		"\5\30\r\2Za\5 \21\2[a\5\"\22\2\\]\5&\24\2]^\7=\2\2^a\3\2\2\2_a\7=\2\2"+
		"`U\3\2\2\2`V\3\2\2\2`W\3\2\2\2`X\3\2\2\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2"+
		"`\\\3\2\2\2`_\3\2\2\2a\t\3\2\2\2bc\7\24\2\2ce\5$\23\2df\7\20\2\2ed\3\2"+
		"\2\2ef\3\2\2\2fg\3\2\2\2gh\7=\2\2h\13\3\2\2\2ij\5\6\4\2jk\7.\2\2kl\5&"+
		"\24\2lm\7=\2\2m\r\3\2\2\2no\5\6\4\2op\7\63\2\2pq\5\6\4\2qr\5\20\t\2r\17"+
		"\3\2\2\2st\7,\2\2tz\5&\24\2uv\7\32\2\2vz\5:\36\2wx\7\'\2\2xz\5\6\4\2y"+
		"s\3\2\2\2yu\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7=\2\2|\21\3\2\2\2"+
		"}~\7%\2\2~\177\7=\2\2\177\u0080\7)\2\2\u0080\u0081\7=\2\2\u0081\u0085"+
		"\5\4\3\2\u0082\u0084\5\24\13\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008a\5\26\f\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008c\7\3\2\2\u008c\u008d\7=\2\2\u008d\23\3"+
		"\2\2\2\u008e\u008f\7\b\2\2\u008f\u0090\5&\24\2\u0090\u0091\7=\2\2\u0091"+
		"\u0092\5\4\3\2\u0092\25\3\2\2\2\u0093\u0094\7(\2\2\u0094\u0095\7=\2\2"+
		"\u0095\u0096\5\4\3\2\u0096\27\3\2\2\2\u0097\u0098\7\62\2\2\u0098\u009a"+
		"\5\6\4\2\u0099\u009b\5\32\16\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u009d\3\2\2\2\u009c\u009e\5\36\20\2\u009d\u009c\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7=\2\2\u00a0\u00a1\5\4\3\2\u00a1"+
		"\u00a2\7\33\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00a4\7=\2\2\u00a4\31\3\2\2"+
		"\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7\7\60\2\2\u00a7\u00a8\5\6\4\2\u00a8"+
		"\33\3\2\2\2\u00a9\u00aa\t\2\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\t\3\2\2\u00ac"+
		"\u00ad\5&\24\2\u00ad\37\3\2\2\2\u00ae\u00af\7\n\2\2\u00af\u00b0\5\6\4"+
		"\2\u00b0\u00b1\7=\2\2\u00b1!\3\2\2\2\u00b2\u00b3\5\6\4\2\u00b3\u00b4\7"+
		"*\2\2\u00b4\u00b5\5:\36\2\u00b5\u00b6\7=\2\2\u00b6#\3\2\2\2\u00b7\u00bc"+
		"\5&\24\2\u00b8\u00b9\7\35\2\2\u00b9\u00bb\5&\24\2\u00ba\u00b8\3\2\2\2"+
		"\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd%\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c3\58\35\2\u00c0\u00c3\5\6\4\2\u00c1"+
		"\u00c3\5(\25\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2"+
		"\2\2\u00c3\'\3\2\2\2\u00c4\u00c8\5*\26\2\u00c5\u00c8\5,\27\2\u00c6\u00c8"+
		"\5\60\31\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8)\3\2\2\2\u00c9\u00ca\7\30\2\2\u00ca\u00cb\5&\24\2\u00cb+\3\2\2"+
		"\2\u00cc\u00cd\5.\30\2\u00cd\u00cf\5&\24\2\u00ce\u00d0\7\21\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\5&"+
		"\24\2\u00d2-\3\2\2\2\u00d3\u00d4\t\4\2\2\u00d4/\3\2\2\2\u00d5\u00d6\5"+
		"\62\32\2\u00d6\u00d7\5\64\33\2\u00d7\u00d8\7\22\2\2\u00d8\61\3\2\2\2\u00d9"+
		"\u00da\t\5\2\2\u00da\63\3\2\2\2\u00db\u00dd\5&\24\2\u00dc\u00de\5\66\34"+
		"\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\65\3\2\2\2\u00e1\u00e3\7\21\2\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\5&\24\2\u00e5\67\3\2\2"+
		"\2\u00e6\u00e7\t\6\2\2\u00e79\3\2\2\2\u00e8\u00e9\t\7\2\2\u00e9;\3\2\2"+
		"\2\23FLOS`ey\u0085\u0089\u009a\u009d\u00bc\u00c2\u00c7\u00cf\u00df\u00e2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}