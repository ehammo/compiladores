// Generated from gramatica.g4 by ANTLR 4.4
package gramatica;

  import ast.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, IntegerLiteral=36, ID=37, Espacos=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'"
	};
	public static final String[] ruleNames = {
		"T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", 
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "IntegerLiteral", "ID", "Espacos"
	};


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00fe\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\6%\u00ee\n%\r%\16%\u00ef"+
		"\3&\5&\u00f3\n&\3&\7&\u00f6\n&\f&\16&\u00f9\13&\3\'\3\'\3\'\3\'\2\2(\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5T\3\2\2\2\7"+
		"[\3\2\2\2\t_\3\2\2\2\13f\3\2\2\2\rl\3\2\2\2\17r\3\2\2\2\21t\3\2\2\2\23"+
		"y\3\2\2\2\25{\3\2\2\2\27~\3\2\2\2\31\u0080\3\2\2\2\33\u0088\3\2\2\2\35"+
		"\u008a\3\2\2\2\37\u008d\3\2\2\2!\u0091\3\2\2\2#\u0093\3\2\2\2%\u0099\3"+
		"\2\2\2\'\u009b\3\2\2\2)\u00a0\3\2\2\2+\u00a2\3\2\2\2-\u00a4\3\2\2\2/\u00ac"+
		"\3\2\2\2\61\u00bf\3\2\2\2\63\u00c1\3\2\2\2\65\u00c3\3\2\2\2\67\u00ca\3"+
		"\2\2\29\u00cc\3\2\2\2;\u00d3\3\2\2\2=\u00d8\3\2\2\2?\u00da\3\2\2\2A\u00e1"+
		"\3\2\2\2C\u00e6\3\2\2\2E\u00e8\3\2\2\2G\u00ea\3\2\2\2I\u00ed\3\2\2\2K"+
		"\u00f2\3\2\2\2M\u00fa\3\2\2\2OP\7o\2\2PQ\7c\2\2QR\7k\2\2RS\7p\2\2S\4\3"+
		"\2\2\2TU\7n\2\2UV\7g\2\2VW\7p\2\2WX\7i\2\2XY\7v\2\2YZ\7j\2\2Z\6\3\2\2"+
		"\2[\\\7p\2\2\\]\7g\2\2]^\7y\2\2^\b\3\2\2\2_`\7t\2\2`a\7g\2\2ab\7v\2\2"+
		"bc\7w\2\2cd\7t\2\2de\7p\2\2e\n\3\2\2\2fg\7e\2\2gh\7n\2\2hi\7c\2\2ij\7"+
		"u\2\2jk\7u\2\2k\f\3\2\2\2lm\7y\2\2mn\7j\2\2no\7k\2\2op\7n\2\2pq\7g\2\2"+
		"q\16\3\2\2\2rs\7=\2\2s\20\3\2\2\2tu\7x\2\2uv\7q\2\2vw\7k\2\2wx\7f\2\2"+
		"x\22\3\2\2\2yz\7}\2\2z\24\3\2\2\2{|\7(\2\2|}\7(\2\2}\26\3\2\2\2~\177\7"+
		"?\2\2\177\30\3\2\2\2\u0080\u0081\7g\2\2\u0081\u0082\7z\2\2\u0082\u0083"+
		"\7v\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086\7f\2\2\u0086"+
		"\u0087\7u\2\2\u0087\32\3\2\2\2\u0088\u0089\7\177\2\2\u0089\34\3\2\2\2"+
		"\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\36\3\2\2\2\u008d\u008e\7"+
		"k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090 \3\2\2\2\u0091\u0092"+
		"\7*\2\2\u0092\"\3\2\2\2\u0093\u0094\7H\2\2\u0094\u0095\7c\2\2\u0095\u0096"+
		"\7n\2\2\u0096\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098$\3\2\2\2\u0099\u009a"+
		"\7,\2\2\u009a&\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7j\2\2\u009d\u009e"+
		"\7k\2\2\u009e\u009f\7u\2\2\u009f(\3\2\2\2\u00a0\u00a1\7.\2\2\u00a1*\3"+
		"\2\2\2\u00a2\u00a3\7\60\2\2\u00a3,\3\2\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6"+
		"\7q\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ab\7p\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7U\2\2\u00ad"+
		"\u00ae\7{\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1\u00b2\7o\2\2\u00b2\u00b3\7\60\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5"+
		"\7w\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7\60\2\2\u00b7\u00b8\7r\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7v\2\2"+
		"\u00bc\u00bd\7n\2\2\u00bd\u00be\7p\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7"+
		"]\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\64\3\2\2\2\u00c3\u00c4"+
		"\7U\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7p\2\2\u00c8\u00c9\7i\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7_\2\2\u00cb"+
		"8\3\2\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7d\2\2\u00cf"+
		"\u00d0\7n\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7e\2\2\u00d2:\3\2\2\2\u00d3"+
		"\u00d4\7V\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7<\3\2\2\2\u00d8\u00d9\7#\2\2\u00d9>\3\2\2\2\u00da\u00db\7u\2\2\u00db"+
		"\u00dc\7v\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7k\2\2"+
		"\u00df\u00e0\7e\2\2\u00e0@\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7n\2"+
		"\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5B\3\2\2\2\u00e6\u00e7\7"+
		"+\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7-\2\2\u00e9F\3\2\2\2\u00ea\u00eb\7/"+
		"\2\2\u00ebH\3\2\2\2\u00ec\u00ee\t\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0J\3\2\2\2\u00f1"+
		"\u00f3\t\3\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f6\t\4"+
		"\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8L\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\t\5\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b\'\2\2\u00fdN\3\2\2\2\7\2\u00ef\u00f2"+
		"\u00f5\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}