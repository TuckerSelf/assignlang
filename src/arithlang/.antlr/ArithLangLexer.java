// Generated from c:/Users/Overlord/Documents/Repositories/assignlang/src/arithlang/ArithLang.g by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArithLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Dot=8, Number=9, 
		Identifier=10, Letter=11, LetterOrDigit=12, AT=13, ELLIPSIS=14, WS=15, 
		Comment=16, Line_Comment=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "Dot", "Number", 
			"Identifier", "Letter", "LetterOrDigit", "DIGIT", "AT", "ELLIPSIS", "WS", 
			"Comment", "Line_Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'('", "'+'", "')'", "'*'", "'/'", "'^'", "'.'", null, null, 
			null, null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "Dot", "Number", "Identifier", 
			"Letter", "LetterOrDigit", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
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


	public ArithLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArithLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 11:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0011y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004\b7\b\b\u000b"+
		"\b\f\b8\u0001\t\u0001\t\u0005\t=\b\t\n\t\f\t@\t\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\nH\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bP\b\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0004\u000f[\b\u000f\u000b\u000f\f\u000f\\\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010e\b"+
		"\u0010\n\u0010\f\u0010h\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011s\b\u0011\n\u0011\f\u0011v\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"f\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\u0000\u001b\r\u001d\u000e\u001f\u000f!\u0010#\u0011\u0001\u0000\u0007"+
		"\u0004\u0000$$AZ__az\u0002\u0000\u0000\u00ff\u8000\ud800\u8000\udbff\u0001"+
		"\u0000\u8000\ud800\u8000\udbff\u0001\u0000\u8000\udc00\u8000\udfff\u0005"+
		"\u0000$$09AZ__az\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\r\u0080\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000"+
		"\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t"+
		"-\u0001\u0000\u0000\u0000\u000b/\u0001\u0000\u0000\u0000\r1\u0001\u0000"+
		"\u0000\u0000\u000f3\u0001\u0000\u0000\u0000\u00116\u0001\u0000\u0000\u0000"+
		"\u0013:\u0001\u0000\u0000\u0000\u0015G\u0001\u0000\u0000\u0000\u0017O"+
		"\u0001\u0000\u0000\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bS\u0001\u0000"+
		"\u0000\u0000\u001dU\u0001\u0000\u0000\u0000\u001fZ\u0001\u0000\u0000\u0000"+
		"!`\u0001\u0000\u0000\u0000#n\u0001\u0000\u0000\u0000%&\u0005-\u0000\u0000"+
		"&\u0002\u0001\u0000\u0000\u0000\'(\u0005(\u0000\u0000(\u0004\u0001\u0000"+
		"\u0000\u0000)*\u0005+\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005"+
		")\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005*\u0000\u0000.\n\u0001"+
		"\u0000\u0000\u0000/0\u0005/\u0000\u00000\f\u0001\u0000\u0000\u000012\u0005"+
		"^\u0000\u00002\u000e\u0001\u0000\u0000\u000034\u0005.\u0000\u00004\u0010"+
		"\u0001\u0000\u0000\u000057\u0003\u0019\f\u000065\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009\u0012\u0001\u0000\u0000\u0000:>\u0003\u0015\n\u0000;=\u0003\u0017"+
		"\u000b\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0014\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000AH\u0007\u0000\u0000\u0000BC\b\u0001\u0000"+
		"\u0000CH\u0004\n\u0000\u0000DE\u0007\u0002\u0000\u0000EF\u0007\u0003\u0000"+
		"\u0000FH\u0004\n\u0001\u0000GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000"+
		"\u0000GD\u0001\u0000\u0000\u0000H\u0016\u0001\u0000\u0000\u0000IP\u0007"+
		"\u0004\u0000\u0000JK\b\u0001\u0000\u0000KP\u0004\u000b\u0002\u0000LM\u0007"+
		"\u0002\u0000\u0000MN\u0007\u0003\u0000\u0000NP\u0004\u000b\u0003\u0000"+
		"OI\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000"+
		"\u0000P\u0018\u0001\u0000\u0000\u0000QR\u000209\u0000R\u001a\u0001\u0000"+
		"\u0000\u0000ST\u0005@\u0000\u0000T\u001c\u0001\u0000\u0000\u0000UV\u0005"+
		".\u0000\u0000VW\u0005.\u0000\u0000WX\u0005.\u0000\u0000X\u001e\u0001\u0000"+
		"\u0000\u0000Y[\u0007\u0005\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^_\u0006\u000f\u0000\u0000_ \u0001\u0000\u0000"+
		"\u0000`a\u0005/\u0000\u0000ab\u0005*\u0000\u0000bf\u0001\u0000\u0000\u0000"+
		"ce\t\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000ij\u0005*\u0000\u0000jk\u0005/\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u0006\u0010\u0000\u0000m\"\u0001\u0000\u0000"+
		"\u0000no\u0005/\u0000\u0000op\u0005/\u0000\u0000pt\u0001\u0000\u0000\u0000"+
		"qs\b\u0006\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000wx\u0006\u0011\u0000\u0000x$\u0001\u0000"+
		"\u0000\u0000\b\u00008>GO\\ft\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}