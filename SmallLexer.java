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
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, BOOLEAN=18, ID=19, INTEGER=20, WS=21, COMMENT=22, STRING=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'KTHXBYE\n'", "'SRS'", "'ITZ LIEK A'", "'\n'", "'BANG'", "','", "'NUMBAR'", 
		"'VISIBLE'", "'I HAS A'", "'ITZ'", "'TROOF'", "'BUKKIT'", "'R'", "'NUMBR'", 
		"'HAI\n'", "'NOOB'", "'YARN'", "BOOLEAN", "ID", "INTEGER", "WS", "COMMENT", 
		"STRING"
	};
	public static final String[] ruleNames = {
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"BOOLEAN", "ID", "LETTER", "INTEGER", "WS", "COMMENT", "QUOTE", "STRING"
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
		case 21: WS_action((RuleContext)_localctx, actionIndex); break;

		case 22: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 24: STRING_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\31\u00ce\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u009d"+
		"\n\23\3\24\3\24\3\24\7\24\u00a2\n\24\f\24\16\24\u00a5\13\24\3\25\3\25"+
		"\3\26\6\26\u00aa\n\26\r\26\16\26\u00ab\3\27\6\27\u00af\n\27\r\27\16\27"+
		"\u00b0\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u00ba\n\30\f\30\16\30\u00bd"+
		"\13\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\7\32\u00c7\n\32\f\32\16"+
		"\32\u00ca\13\32\3\32\3\32\3\32\4\u00bb\u00c8\33\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\2\1+\26\1-\27\3/\30\4\61\2\1\63"+
		"\31\2\3\2\6\3\62;\4C\\c|\3\62;\5\13\f\17\17\"\"\u00d2\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2"+
		"\5>\3\2\2\2\7B\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rT\3\2\2\2\17V\3\2\2\2\21"+
		"]\3\2\2\2\23e\3\2\2\2\25m\3\2\2\2\27q\3\2\2\2\31w\3\2\2\2\33~\3\2\2\2"+
		"\35\u0080\3\2\2\2\37\u0086\3\2\2\2!\u008b\3\2\2\2#\u0090\3\2\2\2%\u009c"+
		"\3\2\2\2\'\u009e\3\2\2\2)\u00a6\3\2\2\2+\u00a9\3\2\2\2-\u00ae\3\2\2\2"+
		"/\u00b4\3\2\2\2\61\u00c2\3\2\2\2\63\u00c4\3\2\2\2\65\66\7M\2\2\66\67\7"+
		"V\2\2\678\7J\2\289\7Z\2\29:\7D\2\2:;\7[\2\2;<\7G\2\2<=\7\f\2\2=\4\3\2"+
		"\2\2>?\7U\2\2?@\7T\2\2@A\7U\2\2A\6\3\2\2\2BC\7K\2\2CD\7V\2\2DE\7\\\2\2"+
		"EF\7\"\2\2FG\7N\2\2GH\7K\2\2HI\7G\2\2IJ\7M\2\2JK\7\"\2\2KL\7C\2\2L\b\3"+
		"\2\2\2MN\7\f\2\2N\n\3\2\2\2OP\7D\2\2PQ\7C\2\2QR\7P\2\2RS\7I\2\2S\f\3\2"+
		"\2\2TU\7.\2\2U\16\3\2\2\2VW\7P\2\2WX\7W\2\2XY\7O\2\2YZ\7D\2\2Z[\7C\2\2"+
		"[\\\7T\2\2\\\20\3\2\2\2]^\7X\2\2^_\7K\2\2_`\7U\2\2`a\7K\2\2ab\7D\2\2b"+
		"c\7N\2\2cd\7G\2\2d\22\3\2\2\2ef\7K\2\2fg\7\"\2\2gh\7J\2\2hi\7C\2\2ij\7"+
		"U\2\2jk\7\"\2\2kl\7C\2\2l\24\3\2\2\2mn\7K\2\2no\7V\2\2op\7\\\2\2p\26\3"+
		"\2\2\2qr\7V\2\2rs\7T\2\2st\7Q\2\2tu\7Q\2\2uv\7H\2\2v\30\3\2\2\2wx\7D\2"+
		"\2xy\7W\2\2yz\7M\2\2z{\7M\2\2{|\7K\2\2|}\7V\2\2}\32\3\2\2\2~\177\7T\2"+
		"\2\177\34\3\2\2\2\u0080\u0081\7P\2\2\u0081\u0082\7W\2\2\u0082\u0083\7"+
		"O\2\2\u0083\u0084\7D\2\2\u0084\u0085\7T\2\2\u0085\36\3\2\2\2\u0086\u0087"+
		"\7J\2\2\u0087\u0088\7C\2\2\u0088\u0089\7K\2\2\u0089\u008a\7\f\2\2\u008a"+
		" \3\2\2\2\u008b\u008c\7P\2\2\u008c\u008d\7Q\2\2\u008d\u008e\7Q\2\2\u008e"+
		"\u008f\7D\2\2\u008f\"\3\2\2\2\u0090\u0091\7[\2\2\u0091\u0092\7C\2\2\u0092"+
		"\u0093\7T\2\2\u0093\u0094\7P\2\2\u0094$\3\2\2\2\u0095\u0096\7Y\2\2\u0096"+
		"\u0097\7K\2\2\u0097\u009d\7P\2\2\u0098\u0099\7H\2\2\u0099\u009a\7C\2\2"+
		"\u009a\u009b\7K\2\2\u009b\u009d\7N\2\2\u009c\u0095\3\2\2\2\u009c\u0098"+
		"\3\2\2\2\u009d&\3\2\2\2\u009e\u00a3\5)\25\2\u009f\u00a2\5)\25\2\u00a0"+
		"\u00a2\t\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4(\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\u00a7\t\3\2\2\u00a7*\3\2\2\2\u00a8\u00aa\t\4\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac,\3\2\2\2\u00ad\u00af\t\5\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\b\27\3\2\u00b3.\3\2\2\2\u00b4\u00b5\7D\2\2\u00b5\u00b6\7V\2\2\u00b6"+
		"\u00b7\7Y\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00ba\13\2\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\f\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\b\30\4\2\u00c1\60\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3\62"+
		"\3\2\2\2\u00c4\u00c8\5\61\31\2\u00c5\u00c7\13\2\2\2\u00c6\u00c5\3\2\2"+
		"\2\u00c7\u00ca\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\61\31\2\u00cc\u00cd\b\32\2"+
		"\2\u00cd\64\3\2\2\2\n\2\u009c\u00a1\u00a3\u00ab\u00b0\u00bb\u00c8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}