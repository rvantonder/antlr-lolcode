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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, BOOLEAN=15, ID=16, INTEGER=17, 
		WS=18, COMMENT=19, BANG=20, STRING=21, NEWLINE=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'HAI'", "'OIC'", "'ITZ LIEK A'", "'BANG'", "','", "'NO WAI'", "'YA RLY'", 
		"'I HAS A'", "'VISIBLE'", "'ITZ'", "'MEBBE'", "'R'", "'KTHXBYE'", "'O RLY?'", 
		"BOOLEAN", "ID", "INTEGER", "WS", "COMMENT", "'!'", "STRING", "'\n'"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "BOOLEAN", "ID", "LETTER", "INTEGER", 
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
		case 18: WS_action((RuleContext)_localctx, actionIndex); break;

		case 19: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 22: STRING_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\30\u00c3\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008e"+
		"\n\20\3\21\3\21\3\21\7\21\u0093\n\21\f\21\16\21\u0096\13\21\3\22\3\22"+
		"\3\23\6\23\u009b\n\23\r\23\16\23\u009c\3\24\6\24\u00a0\n\24\r\24\16\24"+
		"\u00a1\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u00ab\n\25\f\25\16\25\u00ae"+
		"\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\7\30\u00ba\n"+
		"\30\f\30\16\30\u00bd\13\30\3\30\3\30\3\30\3\31\3\31\4\u00ac\u00bb\32\3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r"+
		"\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\2\1%\23\1\'\24\3)\25\4+\26\1"+
		"-\2\1/\27\2\61\30\1\3\2\6\3\62;\4C\\c|\3\62;\5\13\13\17\17\"\"\u00c7\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2"+
		"\2\2\5\67\3\2\2\2\7;\3\2\2\2\tF\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17T\3\2"+
		"\2\2\21[\3\2\2\2\23c\3\2\2\2\25k\3\2\2\2\27o\3\2\2\2\31u\3\2\2\2\33w\3"+
		"\2\2\2\35\177\3\2\2\2\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u0097\3\2\2\2%"+
		"\u009a\3\2\2\2\'\u009f\3\2\2\2)\u00a5\3\2\2\2+\u00b3\3\2\2\2-\u00b5\3"+
		"\2\2\2/\u00b7\3\2\2\2\61\u00c1\3\2\2\2\63\64\7J\2\2\64\65\7C\2\2\65\66"+
		"\7K\2\2\66\4\3\2\2\2\678\7Q\2\289\7K\2\29:\7E\2\2:\6\3\2\2\2;<\7K\2\2"+
		"<=\7V\2\2=>\7\\\2\2>?\7\"\2\2?@\7N\2\2@A\7K\2\2AB\7G\2\2BC\7M\2\2CD\7"+
		"\"\2\2DE\7C\2\2E\b\3\2\2\2FG\7D\2\2GH\7C\2\2HI\7P\2\2IJ\7I\2\2J\n\3\2"+
		"\2\2KL\7.\2\2L\f\3\2\2\2MN\7P\2\2NO\7Q\2\2OP\7\"\2\2PQ\7Y\2\2QR\7C\2\2"+
		"RS\7K\2\2S\16\3\2\2\2TU\7[\2\2UV\7C\2\2VW\7\"\2\2WX\7T\2\2XY\7N\2\2YZ"+
		"\7[\2\2Z\20\3\2\2\2[\\\7K\2\2\\]\7\"\2\2]^\7J\2\2^_\7C\2\2_`\7U\2\2`a"+
		"\7\"\2\2ab\7C\2\2b\22\3\2\2\2cd\7X\2\2de\7K\2\2ef\7U\2\2fg\7K\2\2gh\7"+
		"D\2\2hi\7N\2\2ij\7G\2\2j\24\3\2\2\2kl\7K\2\2lm\7V\2\2mn\7\\\2\2n\26\3"+
		"\2\2\2op\7O\2\2pq\7G\2\2qr\7D\2\2rs\7D\2\2st\7G\2\2t\30\3\2\2\2uv\7T\2"+
		"\2v\32\3\2\2\2wx\7M\2\2xy\7V\2\2yz\7J\2\2z{\7Z\2\2{|\7D\2\2|}\7[\2\2}"+
		"~\7G\2\2~\34\3\2\2\2\177\u0080\7Q\2\2\u0080\u0081\7\"\2\2\u0081\u0082"+
		"\7T\2\2\u0082\u0083\7N\2\2\u0083\u0084\7[\2\2\u0084\u0085\7A\2\2\u0085"+
		"\36\3\2\2\2\u0086\u0087\7Y\2\2\u0087\u0088\7K\2\2\u0088\u008e\7P\2\2\u0089"+
		"\u008a\7H\2\2\u008a\u008b\7C\2\2\u008b\u008c\7K\2\2\u008c\u008e\7N\2\2"+
		"\u008d\u0086\3\2\2\2\u008d\u0089\3\2\2\2\u008e \3\2\2\2\u008f\u0094\5"+
		"#\22\2\u0090\u0093\5#\22\2\u0091\u0093\t\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\t\3\2\2\u0098$\3"+
		"\2\2\2\u0099\u009b\t\4\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d&\3\2\2\2\u009e\u00a0\t\5\2\2"+
		"\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\24\3\2\u00a4(\3\2\2\2\u00a5"+
		"\u00a6\7D\2\2\u00a6\u00a7\7V\2\2\u00a7\u00a8\7Y\2\2\u00a8\u00ac\3\2\2"+
		"\2\u00a9\u00ab\13\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b0\5\61\31\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\25\4\2\u00b2"+
		"*\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6."+
		"\3\2\2\2\u00b7\u00bb\5-\27\2\u00b8\u00ba\13\2\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\5-\27\2\u00bf\u00c0\b\30\2\2"+
		"\u00c0\60\3\2\2\2\u00c1\u00c2\7\f\2\2\u00c2\62\3\2\2\2\n\2\u008d\u0092"+
		"\u0094\u009c\u00a1\u00ac\u00bb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}