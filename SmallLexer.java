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
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, BOOLEAN=22, ID=23, INTEGER=24, 
		WS=25, COMMENT=26, MULTICOMMENT=27, BANG=28, STRING=29, NEWLINE=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'HAI'", "'OIC'", "'IM OUTTA YR'", "'ITZ LIEK A'", "'BANG'", "','", "'NO WAI'", 
		"'YA RLY'", "'TIL'", "'UPPIN'", "'WILE'", "'I HAS A'", "'VISIBLE'", "'ITZ'", 
		"'MEBBE'", "'R'", "'YR'", "'KTHXBYE'", "'IM IN YR'", "'NERFIN'", "'O RLY?'", 
		"BOOLEAN", "ID", "INTEGER", "WS", "COMMENT", "MULTICOMMENT", "'!'", "STRING", 
		"NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "BOOLEAN", "ID", "LETTER", "INTEGER", 
		"WS", "COMMENT", "MULTICOMMENT", "BANG", "QUOTE", "STRING", "NEWLINE"
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
		case 25: WS_action((RuleContext)_localctx, actionIndex); break;

		case 26: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 27: MULTICOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 30: STRING_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void MULTICOMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
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
		"\2\4 \u0119\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00cc\n\27\3\30\3\30\3\30\7\30\u00d1\n\30\f\30\16\30\u00d4"+
		"\13\30\3\31\3\31\3\32\6\32\u00d9\n\32\r\32\16\32\u00da\3\33\6\33\u00de"+
		"\n\33\r\33\16\33\u00df\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u00e9\n"+
		"\34\f\34\16\34\u00ec\13\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u00f9\n\35\f\35\16\35\u00fc\13\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \7 \u010d\n \f \16"+
		" \u0110\13 \3 \3 \3 \3!\3!\3!\5!\u0118\n!\5\u00ea\u00fa\u010e\"\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31"+
		"\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30"+
		"\1/\31\1\61\2\1\63\32\1\65\33\3\67\34\49\35\5;\36\1=\2\1?\37\2A \1\3\2"+
		"\6\3\62;\4C\\c|\3\62;\5\13\13\17\17\"\"\u011f\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2"+
		"\2\5G\3\2\2\2\7K\3\2\2\2\tW\3\2\2\2\13b\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2"+
		"\21p\3\2\2\2\23w\3\2\2\2\25{\3\2\2\2\27\u0081\3\2\2\2\31\u0086\3\2\2\2"+
		"\33\u008e\3\2\2\2\35\u0096\3\2\2\2\37\u009a\3\2\2\2!\u00a0\3\2\2\2#\u00a2"+
		"\3\2\2\2%\u00a5\3\2\2\2\'\u00ad\3\2\2\2)\u00b6\3\2\2\2+\u00bd\3\2\2\2"+
		"-\u00cb\3\2\2\2/\u00cd\3\2\2\2\61\u00d5\3\2\2\2\63\u00d8\3\2\2\2\65\u00dd"+
		"\3\2\2\2\67\u00e3\3\2\2\29\u00f1\3\2\2\2;\u0106\3\2\2\2=\u0108\3\2\2\2"+
		"?\u010a\3\2\2\2A\u0117\3\2\2\2CD\7J\2\2DE\7C\2\2EF\7K\2\2F\4\3\2\2\2G"+
		"H\7Q\2\2HI\7K\2\2IJ\7E\2\2J\6\3\2\2\2KL\7K\2\2LM\7O\2\2MN\7\"\2\2NO\7"+
		"Q\2\2OP\7W\2\2PQ\7V\2\2QR\7V\2\2RS\7C\2\2ST\7\"\2\2TU\7[\2\2UV\7T\2\2"+
		"V\b\3\2\2\2WX\7K\2\2XY\7V\2\2YZ\7\\\2\2Z[\7\"\2\2[\\\7N\2\2\\]\7K\2\2"+
		"]^\7G\2\2^_\7M\2\2_`\7\"\2\2`a\7C\2\2a\n\3\2\2\2bc\7D\2\2cd\7C\2\2de\7"+
		"P\2\2ef\7I\2\2f\f\3\2\2\2gh\7.\2\2h\16\3\2\2\2ij\7P\2\2jk\7Q\2\2kl\7\""+
		"\2\2lm\7Y\2\2mn\7C\2\2no\7K\2\2o\20\3\2\2\2pq\7[\2\2qr\7C\2\2rs\7\"\2"+
		"\2st\7T\2\2tu\7N\2\2uv\7[\2\2v\22\3\2\2\2wx\7V\2\2xy\7K\2\2yz\7N\2\2z"+
		"\24\3\2\2\2{|\7W\2\2|}\7R\2\2}~\7R\2\2~\177\7K\2\2\177\u0080\7P\2\2\u0080"+
		"\26\3\2\2\2\u0081\u0082\7Y\2\2\u0082\u0083\7K\2\2\u0083\u0084\7N\2\2\u0084"+
		"\u0085\7G\2\2\u0085\30\3\2\2\2\u0086\u0087\7K\2\2\u0087\u0088\7\"\2\2"+
		"\u0088\u0089\7J\2\2\u0089\u008a\7C\2\2\u008a\u008b\7U\2\2\u008b\u008c"+
		"\7\"\2\2\u008c\u008d\7C\2\2\u008d\32\3\2\2\2\u008e\u008f\7X\2\2\u008f"+
		"\u0090\7K\2\2\u0090\u0091\7U\2\2\u0091\u0092\7K\2\2\u0092\u0093\7D\2\2"+
		"\u0093\u0094\7N\2\2\u0094\u0095\7G\2\2\u0095\34\3\2\2\2\u0096\u0097\7"+
		"K\2\2\u0097\u0098\7V\2\2\u0098\u0099\7\\\2\2\u0099\36\3\2\2\2\u009a\u009b"+
		"\7O\2\2\u009b\u009c\7G\2\2\u009c\u009d\7D\2\2\u009d\u009e\7D\2\2\u009e"+
		"\u009f\7G\2\2\u009f \3\2\2\2\u00a0\u00a1\7T\2\2\u00a1\"\3\2\2\2\u00a2"+
		"\u00a3\7[\2\2\u00a3\u00a4\7T\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7M\2\2\u00a6"+
		"\u00a7\7V\2\2\u00a7\u00a8\7J\2\2\u00a8\u00a9\7Z\2\2\u00a9\u00aa\7D\2\2"+
		"\u00aa\u00ab\7[\2\2\u00ab\u00ac\7G\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7K\2"+
		"\2\u00ae\u00af\7O\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\7K\2\2\u00b1\u00b2"+
		"\7P\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7[\2\2\u00b4\u00b5\7T\2\2\u00b5"+
		"(\3\2\2\2\u00b6\u00b7\7P\2\2\u00b7\u00b8\7G\2\2\u00b8\u00b9\7T\2\2\u00b9"+
		"\u00ba\7H\2\2\u00ba\u00bb\7K\2\2\u00bb\u00bc\7P\2\2\u00bc*\3\2\2\2\u00bd"+
		"\u00be\7Q\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\7T\2\2\u00c0\u00c1\7N\2"+
		"\2\u00c1\u00c2\7[\2\2\u00c2\u00c3\7A\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7"+
		"Y\2\2\u00c5\u00c6\7K\2\2\u00c6\u00cc\7P\2\2\u00c7\u00c8\7H\2\2\u00c8\u00c9"+
		"\7C\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cc\7N\2\2\u00cb\u00c4\3\2\2\2\u00cb"+
		"\u00c7\3\2\2\2\u00cc.\3\2\2\2\u00cd\u00d2\5\61\31\2\u00ce\u00d1\5\61\31"+
		"\2\u00cf\u00d1\t\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\60\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\t\3\2\2\u00d6\62\3\2\2\2\u00d7\u00d9\t\4\2"+
		"\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\64\3\2\2\2\u00dc\u00de\t\5\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\b\33\3\2\u00e2\66\3\2\2\2\u00e3\u00e4\7D\2\2\u00e4\u00e5"+
		"\7V\2\2\u00e5\u00e6\7Y\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00e9\13\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\5A!\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f0\b\34\4\2\u00f08\3\2\2\2\u00f1\u00f2\7Q\2\2\u00f2"+
		"\u00f3\7D\2\2\u00f3\u00f4\7V\2\2\u00f4\u00f5\7Y\2\2\u00f5\u00f6\3\2\2"+
		"\2\u00f6\u00fa\5A!\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u00fe\7V\2\2\u00fe\u00ff\7N\2\2\u00ff\u0100\7F\2"+
		"\2\u0100\u0101\7T\2\2\u0101\u0102\3\2\2\2\u0102\u0103\5A!\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\b\35\5\2\u0105:\3\2\2\2\u0106\u0107\7#\2\2\u0107"+
		"<\3\2\2\2\u0108\u0109\7$\2\2\u0109>\3\2\2\2\u010a\u010e\5=\37\2\u010b"+
		"\u010d\13\2\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010f\3"+
		"\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0112\5=\37\2\u0112\u0113\b \2\2\u0113@\3\2\2\2\u0114\u0118\7\f\2\2\u0115"+
		"\u0116\7.\2\2\u0116\u0118\7\"\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118B\3\2\2\2\f\2\u00cb\u00d0\u00d2\u00da\u00df\u00ea\u00fa\u010e"+
		"\u0117";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}