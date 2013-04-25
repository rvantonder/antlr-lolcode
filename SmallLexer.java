// Generated from Small.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmallLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		BOOLEAN=10, ID=11, INTEGER=12, WS=13, COMMENT=14, STRING=15, NEWLINE=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'VISIBLE'", "'I HAS A'", "'HAI'", "'ITZ'", "'ITZ LIEK A'", "'BANG'", 
		"'R'", "','", "'KTHXBYE'", "BOOLEAN", "ID", "INTEGER", "WS", "COMMENT", 
		"STRING", "'\n'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"BOOLEAN", "ID", "LETTER", "INTEGER", "WS", "COMMENT", "QUOTE", "STRING", 
		"NEWLINE"
	};


	public SmallLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Small.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 13: WS_action((RuleContext)_localctx, actionIndex); break;

		case 14: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 16: STRING_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  setText(getText().substring(1, getText().length()-1));  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\22\u0096\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13c\n\13\3\f\3\f\3\f\7\fh\n\f\f\f\16\fk\13\f\3\r\3\r\3\16\6\16p\n\16"+
		"\r\16\16\16q\3\17\6\17u\n\17\r\17\16\17v\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u0080\n\20\f\20\16\20\u0083\13\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\7\22\u008d\n\22\f\22\16\22\u0090\13\22\3\22\3\22\3\22"+
		"\3\23\3\23\4\u0081\u008e\24\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\2\1\33\16\1\35\17\3\37\20\4!\2\1#\21"+
		"\2%\22\1\3\2\6\3\62;\4C\\c|\3\62;\5\13\13\17\17\"\"\u009a\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5/\3\2\2"+
		"\2\7\67\3\2\2\2\t;\3\2\2\2\13?\3\2\2\2\rJ\3\2\2\2\17O\3\2\2\2\21Q\3\2"+
		"\2\2\23S\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31l\3\2\2\2\33o\3\2\2\2\35t\3"+
		"\2\2\2\37z\3\2\2\2!\u0088\3\2\2\2#\u008a\3\2\2\2%\u0094\3\2\2\2\'(\7X"+
		"\2\2()\7K\2\2)*\7U\2\2*+\7K\2\2+,\7D\2\2,-\7N\2\2-.\7G\2\2.\4\3\2\2\2"+
		"/\60\7K\2\2\60\61\7\"\2\2\61\62\7J\2\2\62\63\7C\2\2\63\64\7U\2\2\64\65"+
		"\7\"\2\2\65\66\7C\2\2\66\6\3\2\2\2\678\7J\2\289\7C\2\29:\7K\2\2:\b\3\2"+
		"\2\2;<\7K\2\2<=\7V\2\2=>\7\\\2\2>\n\3\2\2\2?@\7K\2\2@A\7V\2\2AB\7\\\2"+
		"\2BC\7\"\2\2CD\7N\2\2DE\7K\2\2EF\7G\2\2FG\7M\2\2GH\7\"\2\2HI\7C\2\2I\f"+
		"\3\2\2\2JK\7D\2\2KL\7C\2\2LM\7P\2\2MN\7I\2\2N\16\3\2\2\2OP\7T\2\2P\20"+
		"\3\2\2\2QR\7.\2\2R\22\3\2\2\2ST\7M\2\2TU\7V\2\2UV\7J\2\2VW\7Z\2\2WX\7"+
		"D\2\2XY\7[\2\2YZ\7G\2\2Z\24\3\2\2\2[\\\7Y\2\2\\]\7K\2\2]c\7P\2\2^_\7H"+
		"\2\2_`\7C\2\2`a\7K\2\2ac\7N\2\2b[\3\2\2\2b^\3\2\2\2c\26\3\2\2\2di\5\31"+
		"\r\2eh\5\31\r\2fh\t\2\2\2ge\3\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3"+
		"\2\2\2j\30\3\2\2\2ki\3\2\2\2lm\t\3\2\2m\32\3\2\2\2np\t\4\2\2on\3\2\2\2"+
		"pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\34\3\2\2\2su\t\5\2\2ts\3\2\2\2uv\3\2\2"+
		"\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\17\3\2y\36\3\2\2\2z{\7D\2\2{|\7V"+
		"\2\2|}\7Y\2\2}\u0081\3\2\2\2~\u0080\13\2\2\2\177~\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\5%\23\2\u0085\u0086\3\2\2\2\u0086\u0087\b\20"+
		"\4\2\u0087 \3\2\2\2\u0088\u0089\7$\2\2\u0089\"\3\2\2\2\u008a\u008e\5!"+
		"\21\2\u008b\u008d\13\2\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0092\5!\21\2\u0092\u0093\b\22\2\2\u0093$\3\2\2\2\u0094\u0095"+
		"\7\f\2\2\u0095&\3\2\2\2\n\2bgiqv\u0081\u008e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}