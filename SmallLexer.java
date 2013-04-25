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
		WS=25, COMMENT=26, BANG=27, STRING=28, NEWLINE=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'HAI'", "'OIC'", "'IM OUTTA YR'", "'ITZ LIEK A'", "'BANG'", "','", "'NO WAI'", 
		"'YA RLY'", "'TIL'", "'UPPIN'", "'WILE'", "'I HAS A'", "'VISIBLE'", "'ITZ'", 
		"'MEBBE'", "'R'", "'YR'", "'KTHXBYE'", "'IM IN YR'", "'NERFIN'", "'O RLY?'", 
		"BOOLEAN", "ID", "INTEGER", "WS", "COMMENT", "'!'", "STRING", "'\n'"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "BOOLEAN", "ID", "LETTER", "INTEGER", 
		"WS", "COMMENT", "BANG", "QUOTE", "STRING", "NEWLINE"
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

		case 29: STRING_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\37\u00ff\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u00ca\n\27\3\30\3\30\3\30\7\30\u00cf\n\30\f\30\16\30\u00d2\13"+
		"\30\3\31\3\31\3\32\6\32\u00d7\n\32\r\32\16\32\u00d8\3\33\6\33\u00dc\n"+
		"\33\r\33\16\33\u00dd\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u00e7\n\34"+
		"\f\34\16\34\u00ea\13\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\7\37\u00f6\n\37\f\37\16\37\u00f9\13\37\3\37\3\37\3\37\3 \3 \4\u00e8"+
		"\u00f7!\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\26\1+\27\1-\30\1/\31\1\61\2\1\63\32\1\65\33\3\67\34\49\35\1;\2\1=\36"+
		"\2?\37\1\3\2\6\3\62;\4C\\c|\3\62;\5\13\13\17\17\"\"\u0103\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2"+
		"\2\5E\3\2\2\2\7I\3\2\2\2\tU\3\2\2\2\13`\3\2\2\2\re\3\2\2\2\17g\3\2\2\2"+
		"\21n\3\2\2\2\23u\3\2\2\2\25y\3\2\2\2\27\177\3\2\2\2\31\u0084\3\2\2\2\33"+
		"\u008c\3\2\2\2\35\u0094\3\2\2\2\37\u0098\3\2\2\2!\u009e\3\2\2\2#\u00a0"+
		"\3\2\2\2%\u00a3\3\2\2\2\'\u00ab\3\2\2\2)\u00b4\3\2\2\2+\u00bb\3\2\2\2"+
		"-\u00c9\3\2\2\2/\u00cb\3\2\2\2\61\u00d3\3\2\2\2\63\u00d6\3\2\2\2\65\u00db"+
		"\3\2\2\2\67\u00e1\3\2\2\29\u00ef\3\2\2\2;\u00f1\3\2\2\2=\u00f3\3\2\2\2"+
		"?\u00fd\3\2\2\2AB\7J\2\2BC\7C\2\2CD\7K\2\2D\4\3\2\2\2EF\7Q\2\2FG\7K\2"+
		"\2GH\7E\2\2H\6\3\2\2\2IJ\7K\2\2JK\7O\2\2KL\7\"\2\2LM\7Q\2\2MN\7W\2\2N"+
		"O\7V\2\2OP\7V\2\2PQ\7C\2\2QR\7\"\2\2RS\7[\2\2ST\7T\2\2T\b\3\2\2\2UV\7"+
		"K\2\2VW\7V\2\2WX\7\\\2\2XY\7\"\2\2YZ\7N\2\2Z[\7K\2\2[\\\7G\2\2\\]\7M\2"+
		"\2]^\7\"\2\2^_\7C\2\2_\n\3\2\2\2`a\7D\2\2ab\7C\2\2bc\7P\2\2cd\7I\2\2d"+
		"\f\3\2\2\2ef\7.\2\2f\16\3\2\2\2gh\7P\2\2hi\7Q\2\2ij\7\"\2\2jk\7Y\2\2k"+
		"l\7C\2\2lm\7K\2\2m\20\3\2\2\2no\7[\2\2op\7C\2\2pq\7\"\2\2qr\7T\2\2rs\7"+
		"N\2\2st\7[\2\2t\22\3\2\2\2uv\7V\2\2vw\7K\2\2wx\7N\2\2x\24\3\2\2\2yz\7"+
		"W\2\2z{\7R\2\2{|\7R\2\2|}\7K\2\2}~\7P\2\2~\26\3\2\2\2\177\u0080\7Y\2\2"+
		"\u0080\u0081\7K\2\2\u0081\u0082\7N\2\2\u0082\u0083\7G\2\2\u0083\30\3\2"+
		"\2\2\u0084\u0085\7K\2\2\u0085\u0086\7\"\2\2\u0086\u0087\7J\2\2\u0087\u0088"+
		"\7C\2\2\u0088\u0089\7U\2\2\u0089\u008a\7\"\2\2\u008a\u008b\7C\2\2\u008b"+
		"\32\3\2\2\2\u008c\u008d\7X\2\2\u008d\u008e\7K\2\2\u008e\u008f\7U\2\2\u008f"+
		"\u0090\7K\2\2\u0090\u0091\7D\2\2\u0091\u0092\7N\2\2\u0092\u0093\7G\2\2"+
		"\u0093\34\3\2\2\2\u0094\u0095\7K\2\2\u0095\u0096\7V\2\2\u0096\u0097\7"+
		"\\\2\2\u0097\36\3\2\2\2\u0098\u0099\7O\2\2\u0099\u009a\7G\2\2\u009a\u009b"+
		"\7D\2\2\u009b\u009c\7D\2\2\u009c\u009d\7G\2\2\u009d \3\2\2\2\u009e\u009f"+
		"\7T\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7[\2\2\u00a1\u00a2\7T\2\2\u00a2$\3"+
		"\2\2\2\u00a3\u00a4\7M\2\2\u00a4\u00a5\7V\2\2\u00a5\u00a6\7J\2\2\u00a6"+
		"\u00a7\7Z\2\2\u00a7\u00a8\7D\2\2\u00a8\u00a9\7[\2\2\u00a9\u00aa\7G\2\2"+
		"\u00aa&\3\2\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7O\2\2\u00ad\u00ae\7\""+
		"\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7P\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2"+
		"\7[\2\2\u00b2\u00b3\7T\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7P\2\2\u00b5\u00b6"+
		"\7G\2\2\u00b6\u00b7\7T\2\2\u00b7\u00b8\7H\2\2\u00b8\u00b9\7K\2\2\u00b9"+
		"\u00ba\7P\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7Q\2\2\u00bc\u00bd\7\"\2\2\u00bd"+
		"\u00be\7T\2\2\u00be\u00bf\7N\2\2\u00bf\u00c0\7[\2\2\u00c0\u00c1\7A\2\2"+
		"\u00c1,\3\2\2\2\u00c2\u00c3\7Y\2\2\u00c3\u00c4\7K\2\2\u00c4\u00ca\7P\2"+
		"\2\u00c5\u00c6\7H\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7K\2\2\u00c8\u00ca"+
		"\7N\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca.\3\2\2\2\u00cb\u00d0"+
		"\5\61\31\2\u00cc\u00cf\5\61\31\2\u00cd\u00cf\t\2\2\2\u00ce\u00cc\3\2\2"+
		"\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\60\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\t\3\2\2\u00d4"+
		"\62\3\2\2\2\u00d5\u00d7\t\4\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\64\3\2\2\2\u00da\u00dc"+
		"\t\5\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\33\3\2\u00e0\66\3\2\2"+
		"\2\u00e1\u00e2\7D\2\2\u00e2\u00e3\7V\2\2\u00e3\u00e4\7Y\2\2\u00e4\u00e8"+
		"\3\2\2\2\u00e5\u00e7\13\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ec\5? \2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\34\4\2\u00ee"+
		"8\3\2\2\2\u00ef\u00f0\7#\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7$\2\2\u00f2<"+
		"\3\2\2\2\u00f3\u00f7\5;\36\2\u00f4\u00f6\13\2\2\2\u00f5\u00f4\3\2\2\2"+
		"\u00f6\u00f9\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\5;\36\2\u00fb\u00fc\b\37\2\2"+
		"\u00fc>\3\2\2\2\u00fd\u00fe\7\f\2\2\u00fe@\3\2\2\2\n\2\u00c9\u00ce\u00d0"+
		"\u00d8\u00dd\u00e8\u00f7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}