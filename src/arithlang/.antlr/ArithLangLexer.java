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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Dot=9, 
		Number=10, Identifier=11, Letter=12, LetterOrDigit=13, AT=14, ELLIPSIS=15, 
		WS=16, Comment=17, Line_Comment=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Dot", 
			"Number", "Identifier", "Letter", "LetterOrDigit", "DIGIT", "AT", "ELLIPSIS", 
			"WS", "Comment", "Line_Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'-'", "'+'", "'*'", "'/'", "'^'", "'('", "')'", "'.'", 
			null, null, null, null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "Dot", "Number", 
			"Identifier", "Letter", "LetterOrDigit", "AT", "ELLIPSIS", "WS", "Comment", 
			"Line_Comment"
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
		case 11:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 12:
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
		"\u0004\u0000\u0012}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0004\t;\b\t\u000b\t\f\t<\u0001\n\u0001\n\u0005\nA"+
		"\b\n\n\n\f\nD\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000bL\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\fT\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010"+
		"_\b\u0010\u000b\u0010\f\u0010`\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011i\b\u0011\n\u0011\f\u0011l\t"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012w\b\u0012\n\u0012"+
		"\f\u0012z\t\u0012\u0001\u0012\u0001\u0012\u0001j\u0000\u0013\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000\u001d\u000e"+
		"\u001f\u000f!\u0010#\u0011%\u0012\u0001\u0000\u0007\u0004\u0000$$AZ__"+
		"az\u0002\u0000\u0000\u00ff\u8000\ud800\u8000\udbff\u0001\u0000\u8000\ud800"+
		"\u8000\udbff\u0001\u0000\u8000\udc00\u8000\udfff\u0005\u0000$$09AZ__a"+
		"z\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\r\u0084\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001"+
		"\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000"+
		"\u0000\t/\u0001\u0000\u0000\u0000\u000b1\u0001\u0000\u0000\u0000\r3\u0001"+
		"\u0000\u0000\u0000\u000f5\u0001\u0000\u0000\u0000\u00117\u0001\u0000\u0000"+
		"\u0000\u0013:\u0001\u0000\u0000\u0000\u0015>\u0001\u0000\u0000\u0000\u0017"+
		"K\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001bU\u0001"+
		"\u0000\u0000\u0000\u001dW\u0001\u0000\u0000\u0000\u001fY\u0001\u0000\u0000"+
		"\u0000!^\u0001\u0000\u0000\u0000#d\u0001\u0000\u0000\u0000%r\u0001\u0000"+
		"\u0000\u0000\'(\u0005=\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005"+
		"-\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005+\u0000\u0000,\u0006"+
		"\u0001\u0000\u0000\u0000-.\u0005*\u0000\u0000.\b\u0001\u0000\u0000\u0000"+
		"/0\u0005/\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005^\u0000\u0000"+
		"2\f\u0001\u0000\u0000\u000034\u0005(\u0000\u00004\u000e\u0001\u0000\u0000"+
		"\u000056\u0005)\u0000\u00006\u0010\u0001\u0000\u0000\u000078\u0005.\u0000"+
		"\u00008\u0012\u0001\u0000\u0000\u00009;\u0003\u001b\r\u0000:9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=\u0014\u0001\u0000\u0000\u0000>B\u0003\u0017\u000b"+
		"\u0000?A\u0003\u0019\f\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0016\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EL\u0007\u0000\u0000\u0000"+
		"FG\b\u0001\u0000\u0000GL\u0004\u000b\u0000\u0000HI\u0007\u0002\u0000\u0000"+
		"IJ\u0007\u0003\u0000\u0000JL\u0004\u000b\u0001\u0000KE\u0001\u0000\u0000"+
		"\u0000KF\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000L\u0018\u0001"+
		"\u0000\u0000\u0000MT\u0007\u0004\u0000\u0000NO\b\u0001\u0000\u0000OT\u0004"+
		"\f\u0002\u0000PQ\u0007\u0002\u0000\u0000QR\u0007\u0003\u0000\u0000RT\u0004"+
		"\f\u0003\u0000SM\u0001\u0000\u0000\u0000SN\u0001\u0000\u0000\u0000SP\u0001"+
		"\u0000\u0000\u0000T\u001a\u0001\u0000\u0000\u0000UV\u000209\u0000V\u001c"+
		"\u0001\u0000\u0000\u0000WX\u0005@\u0000\u0000X\u001e\u0001\u0000\u0000"+
		"\u0000YZ\u0005.\u0000\u0000Z[\u0005.\u0000\u0000[\\\u0005.\u0000\u0000"+
		"\\ \u0001\u0000\u0000\u0000]_\u0007\u0005\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0006\u0010\u0000\u0000c\"\u0001"+
		"\u0000\u0000\u0000de\u0005/\u0000\u0000ef\u0005*\u0000\u0000fj\u0001\u0000"+
		"\u0000\u0000gi\t\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000km\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005*\u0000\u0000no\u0005"+
		"/\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0006\u0011\u0000\u0000q$\u0001"+
		"\u0000\u0000\u0000rs\u0005/\u0000\u0000st\u0005/\u0000\u0000tx\u0001\u0000"+
		"\u0000\u0000uw\b\u0006\u0000\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0006\u0012\u0000\u0000"+
		"|&\u0001\u0000\u0000\u0000\b\u0000<BKS`jx\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}