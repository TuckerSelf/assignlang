// Generated from ArithLang.g by ANTLR 4.5
package arithlang.parser; import static arithlang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Dot=9, 
		Number=10, Identifier=11, Letter=12, LetterOrDigit=13, AT=14, ELLIPSIS=15, 
		WS=16, Comment=17, Line_Comment=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Dot", 
		"Number", "Identifier", "Letter", "LetterOrDigit", "DIGIT", "AT", "ELLIPSIS", 
		"WS", "Comment", "Line_Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'-'", "'+'", "'*'", "'/'", "'^'", "'('", "')'", "'.'", null, 
		null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Dot", "Number", 
		"Identifier", "Letter", "LetterOrDigit", "AT", "ELLIPSIS", "WS", "Comment", 
		"Line_Comment"
	};
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13=\n\13\r\13\16\13>\3\f\3\f\7\fC\n\f\f"+
		"\f\16\fF\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rN\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16V\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\6\22a\n"+
		"\22\r\22\16\22b\3\22\3\22\3\23\3\23\3\23\3\23\7\23k\n\23\f\23\16\23n\13"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24y\n\24\f\24\16\24"+
		"|\13\24\3\24\3\24\3l\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\2\37\20!\21#\22%\23\'\24\3\2\t\6\2&&C\\aac|\4\2"+
		"\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|"+
		"\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3"+
		"\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2"+
		"\21\67\3\2\2\2\239\3\2\2\2\25<\3\2\2\2\27@\3\2\2\2\31M\3\2\2\2\33U\3\2"+
		"\2\2\35W\3\2\2\2\37Y\3\2\2\2![\3\2\2\2#`\3\2\2\2%f\3\2\2\2\'t\3\2\2\2"+
		")*\7?\2\2*\4\3\2\2\2+,\7/\2\2,\6\3\2\2\2-.\7-\2\2.\b\3\2\2\2/\60\7,\2"+
		"\2\60\n\3\2\2\2\61\62\7\61\2\2\62\f\3\2\2\2\63\64\7`\2\2\64\16\3\2\2\2"+
		"\65\66\7*\2\2\66\20\3\2\2\2\678\7+\2\28\22\3\2\2\29:\7\60\2\2:\24\3\2"+
		"\2\2;=\5\35\17\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\26\3\2\2\2@"+
		"D\5\31\r\2AC\5\33\16\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\30\3\2"+
		"\2\2FD\3\2\2\2GN\t\2\2\2HI\n\3\2\2IN\6\r\2\2JK\t\4\2\2KL\t\5\2\2LN\6\r"+
		"\3\2MG\3\2\2\2MH\3\2\2\2MJ\3\2\2\2N\32\3\2\2\2OV\t\6\2\2PQ\n\3\2\2QV\6"+
		"\16\4\2RS\t\4\2\2ST\t\5\2\2TV\6\16\5\2UO\3\2\2\2UP\3\2\2\2UR\3\2\2\2V"+
		"\34\3\2\2\2WX\4\62;\2X\36\3\2\2\2YZ\7B\2\2Z \3\2\2\2[\\\7\60\2\2\\]\7"+
		"\60\2\2]^\7\60\2\2^\"\3\2\2\2_a\t\7\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2"+
		"bc\3\2\2\2cd\3\2\2\2de\b\22\2\2e$\3\2\2\2fg\7\61\2\2gh\7,\2\2hl\3\2\2"+
		"\2ik\13\2\2\2ji\3\2\2\2kn\3\2\2\2lm\3\2\2\2lj\3\2\2\2mo\3\2\2\2nl\3\2"+
		"\2\2op\7,\2\2pq\7\61\2\2qr\3\2\2\2rs\b\23\2\2s&\3\2\2\2tu\7\61\2\2uv\7"+
		"\61\2\2vz\3\2\2\2wy\n\b\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}"+
		"\3\2\2\2|z\3\2\2\2}~\b\24\2\2~(\3\2\2\2\n\2>DMUblz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}