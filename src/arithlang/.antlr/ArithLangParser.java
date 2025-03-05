// Generated from c:/Users/Overlord/Documents/Repositories/assignlang/src/arithlang/ArithLang.g by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArithLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Dot=8, Number=9, 
		Identifier=10, Letter=11, LetterOrDigit=12, AT=13, ELLIPSIS=14, WS=15, 
		Comment=16, Line_Comment=17;
	public static final int
		RULE_program = 0, RULE_exp = 1, RULE_numexp = 2, RULE_addexp = 3, RULE_subexp = 4, 
		RULE_multexp = 5, RULE_divexp = 6, RULE_powexp = 7, RULE_negexp = 8, RULE_infixadd = 9, 
		RULE_infixsub = 10, RULE_infixmult = 11, RULE_infixdiv = 12, RULE_infixpow = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "exp", "numexp", "addexp", "subexp", "multexp", "divexp", 
			"powexp", "negexp", "infixadd", "infixsub", "infixmult", "infixdiv", 
			"infixpow"
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

	@Override
	public String getGrammarFileName() { return "ArithLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((ProgramContext)_localctx).e = exp();
			 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).e.ast); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public NumexpContext n;
		public AddexpContext a;
		public SubexpContext s;
		public MultexpContext m;
		public DivexpContext d;
		public PowexpContext p;
		public NegexpContext neg;
		public InfixaddContext in;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public SubexpContext subexp() {
			return getRuleContext(SubexpContext.class,0);
		}
		public MultexpContext multexp() {
			return getRuleContext(MultexpContext.class,0);
		}
		public DivexpContext divexp() {
			return getRuleContext(DivexpContext.class,0);
		}
		public PowexpContext powexp() {
			return getRuleContext(PowexpContext.class,0);
		}
		public NegexpContext negexp() {
			return getRuleContext(NegexpContext.class,0);
		}
		public InfixaddContext infixadd() {
			return getRuleContext(InfixaddContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				((ExpContext)_localctx).a = addexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).a.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				((ExpContext)_localctx).s = subexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				((ExpContext)_localctx).m = multexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).m.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				((ExpContext)_localctx).d = divexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).d.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				((ExpContext)_localctx).p = powexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).p.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				((ExpContext)_localctx).neg = negexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).neg.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(52);
				((ExpContext)_localctx).in = infixadd(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).in.ast;
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumexpContext extends ParserRuleContext {
		public NumExp ast;
		public Token n0;
		public Token n1;
		public List<TerminalNode> Number() { return getTokens(ArithLangParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(ArithLangParser.Number, i);
		}
		public TerminalNode Dot() { return getToken(ArithLangParser.Dot, 0); }
		public NumexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexp; }
	}

	public final NumexpContext numexp() throws RecognitionException {
		NumexpContext _localctx = new NumexpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numexp);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(T__0);
				setState(60);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(63);
				match(Dot);
				setState(64);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(T__0);
				setState(67);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(68);
				match(Dot);
				setState(69);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble("-" + (((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddexpContext extends ParserRuleContext {
		public AddExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AddexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexp; }
	}

	public final AddexpContext addexp() throws RecognitionException {
		AddexpContext _localctx = new AddexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addexp);
		 ((AddexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__1);
			setState(74);
			match(T__2);
			setState(75);
			((AddexpContext)_localctx).e = exp();
			 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				((AddexpContext)_localctx).e = exp();
				 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 518L) != 0) );
			setState(84);
			match(T__3);
			 ((AddexpContext)_localctx).ast =  new AddExp(_localctx.list); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubexpContext extends ParserRuleContext {
		public SubExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SubexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexp; }
	}

	public final SubexpContext subexp() throws RecognitionException {
		SubexpContext _localctx = new SubexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subexp);
		 ((SubexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__1);
			setState(88);
			match(T__0);
			setState(89);
			((SubexpContext)_localctx).e = exp();
			 _localctx.list.add(((SubexpContext)_localctx).e.ast); 
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				((SubexpContext)_localctx).e = exp();
				 _localctx.list.add(((SubexpContext)_localctx).e.ast); 
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 518L) != 0) );
			setState(98);
			match(T__3);
			 ((SubexpContext)_localctx).ast =  new SubExp(_localctx.list); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultexpContext extends ParserRuleContext {
		public MultExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MultexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexp; }
	}

	public final MultexpContext multexp() throws RecognitionException {
		MultexpContext _localctx = new MultexpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multexp);
		 ((MultexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__1);
			setState(102);
			match(T__4);
			setState(103);
			((MultexpContext)_localctx).e = exp();
			 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				((MultexpContext)_localctx).e = exp();
				 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 518L) != 0) );
			setState(112);
			match(T__3);
			 ((MultexpContext)_localctx).ast =  new MultExp(_localctx.list); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DivexpContext extends ParserRuleContext {
		public DivExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public DivexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divexp; }
	}

	public final DivexpContext divexp() throws RecognitionException {
		DivexpContext _localctx = new DivexpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_divexp);
		 ((DivexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__1);
			setState(116);
			match(T__5);
			setState(117);
			((DivexpContext)_localctx).e = exp();
			 _localctx.list.add(((DivexpContext)_localctx).e.ast); 
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				((DivexpContext)_localctx).e = exp();
				 _localctx.list.add(((DivexpContext)_localctx).e.ast); 
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 518L) != 0) );
			setState(126);
			match(T__3);
			 ((DivexpContext)_localctx).ast =  new DivExp(_localctx.list); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class PowexpContext extends ParserRuleContext {
		public PowExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PowexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powexp; }
	}

	public final PowexpContext powexp() throws RecognitionException {
		PowexpContext _localctx = new PowexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_powexp);
		 ((PowexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__1);
			setState(130);
			match(T__6);
			setState(131);
			((PowexpContext)_localctx).e = exp();
			 _localctx.list.add(((PowexpContext)_localctx).e.ast);
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133);
				((PowexpContext)_localctx).e = exp();
				 _localctx.list.add(((PowexpContext)_localctx).e.ast);
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 518L) != 0) );
			setState(140);
			match(T__3);
			 ((PowexpContext)_localctx).ast =  new PowExp(_localctx.list); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class NegexpContext extends ParserRuleContext {
		public NegExp ast;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negexp; }
	}

	public final NegexpContext negexp() throws RecognitionException {
		NegexpContext _localctx = new NegexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_negexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__1);
			setState(144);
			match(T__0);
			setState(145);
			((NegexpContext)_localctx).e = exp();
			setState(146);
			match(T__3);
			 ((NegexpContext)_localctx).ast = new NegExp(((NegexpContext)_localctx).e.ast); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class InfixaddContext extends ParserRuleContext {
		public Exp ast;
		public ArrayList<Exp> list;
		public InfixaddContext l;
		public NumexpContext n;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public InfixaddContext infixadd() {
			return getRuleContext(InfixaddContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InfixaddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixadd; }
	}

	public final InfixaddContext infixadd() throws RecognitionException {
		return infixadd(0);
	}

	private InfixaddContext infixadd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixaddContext _localctx = new InfixaddContext(_ctx, _parentState);
		InfixaddContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_infixadd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(150);
			((InfixaddContext)_localctx).n = numexp();
			((InfixaddContext)_localctx).ast =  ((InfixaddContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixaddContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_infixadd);
					setState(153);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(154);
					match(T__2);
					setState(155);
					((InfixaddContext)_localctx).r = exp();
					 
					                                      ((InfixaddContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((InfixaddContext)_localctx).l.ast);
					          							_localctx.list.add(((InfixaddContext)_localctx).r.ast);
					          							((InfixaddContext)_localctx).ast =  new AddExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixsubContext extends ParserRuleContext {
		public Exp ast;
		public ArrayList<Exp> list;
		public InfixsubContext l;
		public NumexpContext n;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public InfixsubContext infixsub() {
			return getRuleContext(InfixsubContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InfixsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixsub; }
	}

	public final InfixsubContext infixsub() throws RecognitionException {
		return infixsub(0);
	}

	private InfixsubContext infixsub(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixsubContext _localctx = new InfixsubContext(_ctx, _parentState);
		InfixsubContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_infixsub, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(164);
			((InfixsubContext)_localctx).n = numexp();
			((InfixsubContext)_localctx).ast =  ((InfixsubContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixsubContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_infixsub);
					setState(167);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(168);
					match(T__0);
					setState(169);
					((InfixsubContext)_localctx).r = exp();
					 
					                                      ((InfixsubContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((InfixsubContext)_localctx).l.ast);
					          							_localctx.list.add(((InfixsubContext)_localctx).r.ast);
					          							((InfixsubContext)_localctx).ast =  new SubExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixmultContext extends ParserRuleContext {
		public Exp ast;
		public ArrayList<Exp> list;
		public InfixmultContext l;
		public NumexpContext n;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public InfixmultContext infixmult() {
			return getRuleContext(InfixmultContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InfixmultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixmult; }
	}

	public final InfixmultContext infixmult() throws RecognitionException {
		return infixmult(0);
	}

	private InfixmultContext infixmult(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixmultContext _localctx = new InfixmultContext(_ctx, _parentState);
		InfixmultContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_infixmult, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(178);
			((InfixmultContext)_localctx).n = numexp();
			((InfixmultContext)_localctx).ast =  ((InfixmultContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixmultContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_infixmult);
					setState(181);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(182);
					match(T__4);
					setState(183);
					((InfixmultContext)_localctx).r = exp();
					 
					                                      ((InfixmultContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((InfixmultContext)_localctx).l.ast);
					          							_localctx.list.add(((InfixmultContext)_localctx).r.ast);
					          							((InfixmultContext)_localctx).ast =  new MultExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixdivContext extends ParserRuleContext {
		public Exp ast;
		public ArrayList<Exp> list;
		public InfixdivContext l;
		public NumexpContext n;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public InfixdivContext infixdiv() {
			return getRuleContext(InfixdivContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InfixdivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixdiv; }
	}

	public final InfixdivContext infixdiv() throws RecognitionException {
		return infixdiv(0);
	}

	private InfixdivContext infixdiv(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixdivContext _localctx = new InfixdivContext(_ctx, _parentState);
		InfixdivContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_infixdiv, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(192);
			((InfixdivContext)_localctx).n = numexp();
			((InfixdivContext)_localctx).ast =  ((InfixdivContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixdivContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_infixdiv);
					setState(195);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(196);
					match(T__5);
					setState(197);
					((InfixdivContext)_localctx).r = exp();
					 
					                                      ((InfixdivContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((InfixdivContext)_localctx).l.ast);
					          							_localctx.list.add(((InfixdivContext)_localctx).r.ast);
					          							((InfixdivContext)_localctx).ast =  new DivExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixpowContext extends ParserRuleContext {
		public Exp ast;
		public ArrayList<Exp> list;
		public InfixpowContext l;
		public NumexpContext n;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public InfixpowContext infixpow() {
			return getRuleContext(InfixpowContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InfixpowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixpow; }
	}

	public final InfixpowContext infixpow() throws RecognitionException {
		return infixpow(0);
	}

	private InfixpowContext infixpow(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixpowContext _localctx = new InfixpowContext(_ctx, _parentState);
		InfixpowContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_infixpow, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(206);
			((InfixpowContext)_localctx).n = numexp();
			((InfixpowContext)_localctx).ast =  ((InfixpowContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixpowContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_infixpow);
					setState(209);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(210);
					match(T__6);
					setState(211);
					((InfixpowContext)_localctx).r = exp();
					 
					                                      ((InfixpowContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((InfixpowContext)_localctx).l.ast);
					          							_localctx.list.add(((InfixpowContext)_localctx).r.ast);
					          							((InfixpowContext)_localctx).ast =  new PowExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return infixadd_sempred((InfixaddContext)_localctx, predIndex);
		case 10:
			return infixsub_sempred((InfixsubContext)_localctx, predIndex);
		case 11:
			return infixmult_sempred((InfixmultContext)_localctx, predIndex);
		case 12:
			return infixdiv_sempred((InfixdivContext)_localctx, predIndex);
		case 13:
			return infixpow_sempred((InfixpowContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean infixadd_sempred(InfixaddContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean infixsub_sempred(InfixsubContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean infixmult_sempred(InfixmultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean infixdiv_sempred(InfixdivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean infixpow_sempred(InfixpowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011\u00dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003Q\b\u0003\u000b\u0003\f\u0003R\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004_\b\u0004\u000b\u0004\f\u0004`\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005m\b\u0005\u000b"+
		"\u0005\f\u0005n\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006{\b\u0006\u000b\u0006\f\u0006|\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u0089\b\u0007\u000b\u0007\f\u0007\u008a\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u009f\b\t\n\t\f\t\u00a2\t\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ad\b\n\n\n"+
		"\f\n\u00b0\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00bb\b\u000b"+
		"\n\u000b\f\u000b\u00be\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00c9\b\f\n\f\f\f\u00cc\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00d7\b\r\n\r\f\r\u00da\t\r\u0001\r\u0000\u0005\u0012\u0014\u0016\u0018"+
		"\u001a\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u0000\u0000\u00e1\u0000\u001c\u0001\u0000\u0000\u0000\u0002"+
		"7\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006I\u0001"+
		"\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000\u0000"+
		"\fs\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000\u0000\u0010"+
		"\u008f\u0001\u0000\u0000\u0000\u0012\u0095\u0001\u0000\u0000\u0000\u0014"+
		"\u00a3\u0001\u0000\u0000\u0000\u0016\u00b1\u0001\u0000\u0000\u0000\u0018"+
		"\u00bf\u0001\u0000\u0000\u0000\u001a\u00cd\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0006\u0000\uffff\uffff\u0000"+
		"\u001e\u0001\u0001\u0000\u0000\u0000\u001f \u0003\u0004\u0002\u0000 !"+
		"\u0006\u0001\uffff\uffff\u0000!8\u0001\u0000\u0000\u0000\"#\u0003\u0006"+
		"\u0003\u0000#$\u0006\u0001\uffff\uffff\u0000$8\u0001\u0000\u0000\u0000"+
		"%&\u0003\b\u0004\u0000&\'\u0006\u0001\uffff\uffff\u0000\'8\u0001\u0000"+
		"\u0000\u0000()\u0003\n\u0005\u0000)*\u0006\u0001\uffff\uffff\u0000*8\u0001"+
		"\u0000\u0000\u0000+,\u0003\f\u0006\u0000,-\u0006\u0001\uffff\uffff\u0000"+
		"-8\u0001\u0000\u0000\u0000./\u0003\u000e\u0007\u0000/0\u0006\u0001\uffff"+
		"\uffff\u000008\u0001\u0000\u0000\u000012\u0003\u0010\b\u000023\u0006\u0001"+
		"\uffff\uffff\u000038\u0001\u0000\u0000\u000045\u0003\u0012\t\u000056\u0006"+
		"\u0001\uffff\uffff\u000068\u0001\u0000\u0000\u00007\u001f\u0001\u0000"+
		"\u0000\u00007\"\u0001\u0000\u0000\u00007%\u0001\u0000\u0000\u00007(\u0001"+
		"\u0000\u0000\u00007+\u0001\u0000\u0000\u00007.\u0001\u0000\u0000\u0000"+
		"71\u0001\u0000\u0000\u000074\u0001\u0000\u0000\u00008\u0003\u0001\u0000"+
		"\u0000\u00009:\u0005\t\u0000\u0000:H\u0006\u0002\uffff\uffff\u0000;<\u0005"+
		"\u0001\u0000\u0000<=\u0005\t\u0000\u0000=H\u0006\u0002\uffff\uffff\u0000"+
		">?\u0005\t\u0000\u0000?@\u0005\b\u0000\u0000@A\u0005\t\u0000\u0000AH\u0006"+
		"\u0002\uffff\uffff\u0000BC\u0005\u0001\u0000\u0000CD\u0005\t\u0000\u0000"+
		"DE\u0005\b\u0000\u0000EF\u0005\t\u0000\u0000FH\u0006\u0002\uffff\uffff"+
		"\u0000G9\u0001\u0000\u0000\u0000G;\u0001\u0000\u0000\u0000G>\u0001\u0000"+
		"\u0000\u0000GB\u0001\u0000\u0000\u0000H\u0005\u0001\u0000\u0000\u0000"+
		"IJ\u0005\u0002\u0000\u0000JK\u0005\u0003\u0000\u0000KL\u0003\u0002\u0001"+
		"\u0000LP\u0006\u0003\uffff\uffff\u0000MN\u0003\u0002\u0001\u0000NO\u0006"+
		"\u0003\uffff\uffff\u0000OQ\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005\u0004\u0000\u0000UV\u0006"+
		"\u0003\uffff\uffff\u0000V\u0007\u0001\u0000\u0000\u0000WX\u0005\u0002"+
		"\u0000\u0000XY\u0005\u0001\u0000\u0000YZ\u0003\u0002\u0001\u0000Z^\u0006"+
		"\u0004\uffff\uffff\u0000[\\\u0003\u0002\u0001\u0000\\]\u0006\u0004\uffff"+
		"\uffff\u0000]_\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bc\u0005\u0004\u0000\u0000cd\u0006\u0004\uffff"+
		"\uffff\u0000d\t\u0001\u0000\u0000\u0000ef\u0005\u0002\u0000\u0000fg\u0005"+
		"\u0005\u0000\u0000gh\u0003\u0002\u0001\u0000hl\u0006\u0005\uffff\uffff"+
		"\u0000ij\u0003\u0002\u0001\u0000jk\u0006\u0005\uffff\uffff\u0000km\u0001"+
		"\u0000\u0000\u0000li\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0005\u0004\u0000\u0000qr\u0006\u0005\uffff\uffff\u0000r\u000b"+
		"\u0001\u0000\u0000\u0000st\u0005\u0002\u0000\u0000tu\u0005\u0006\u0000"+
		"\u0000uv\u0003\u0002\u0001\u0000vz\u0006\u0006\uffff\uffff\u0000wx\u0003"+
		"\u0002\u0001\u0000xy\u0006\u0006\uffff\uffff\u0000y{\u0001\u0000\u0000"+
		"\u0000zw\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u0004\u0000\u0000\u007f\u0080\u0006\u0006\uffff\uffff\u0000\u0080"+
		"\r\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0002\u0000\u0000\u0082\u0083"+
		"\u0005\u0007\u0000\u0000\u0083\u0084\u0003\u0002\u0001\u0000\u0084\u0088"+
		"\u0006\u0007\uffff\uffff\u0000\u0085\u0086\u0003\u0002\u0001\u0000\u0086"+
		"\u0087\u0006\u0007\uffff\uffff\u0000\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088\u0085\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0004\u0000\u0000"+
		"\u008d\u008e\u0006\u0007\uffff\uffff\u0000\u008e\u000f\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\u0002\u0000\u0000\u0090\u0091\u0005\u0001\u0000"+
		"\u0000\u0091\u0092\u0003\u0002\u0001\u0000\u0092\u0093\u0005\u0004\u0000"+
		"\u0000\u0093\u0094\u0006\b\uffff\uffff\u0000\u0094\u0011\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0006\t\uffff\uffff\u0000\u0096\u0097\u0003\u0004\u0002"+
		"\u0000\u0097\u0098\u0006\t\uffff\uffff\u0000\u0098\u00a0\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\n\u0002\u0000\u0000\u009a\u009b\u0005\u0003\u0000\u0000"+
		"\u009b\u009c\u0003\u0002\u0001\u0000\u009c\u009d\u0006\t\uffff\uffff\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u0099\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u0013\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\n\uffff\uffff\u0000"+
		"\u00a4\u00a5\u0003\u0004\u0002\u0000\u00a5\u00a6\u0006\n\uffff\uffff\u0000"+
		"\u00a6\u00ae\u0001\u0000\u0000\u0000\u00a7\u00a8\n\u0002\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0001\u0000\u0000\u00a9\u00aa\u0003\u0002\u0001\u0000\u00aa"+
		"\u00ab\u0006\n\uffff\uffff\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac"+
		"\u00a7\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u0015\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0006\u000b\uffff\uffff\u0000\u00b2\u00b3\u0003\u0004\u0002\u0000"+
		"\u00b3\u00b4\u0006\u000b\uffff\uffff\u0000\u00b4\u00bc\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\n\u0002\u0000\u0000\u00b6\u00b7\u0005\u0005\u0000\u0000"+
		"\u00b7\u00b8\u0003\u0002\u0001\u0000\u00b8\u00b9\u0006\u000b\uffff\uffff"+
		"\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b5\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u0017\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0006\f\uffff\uffff"+
		"\u0000\u00c0\u00c1\u0003\u0004\u0002\u0000\u00c1\u00c2\u0006\f\uffff\uffff"+
		"\u0000\u00c2\u00ca\u0001\u0000\u0000\u0000\u00c3\u00c4\n\u0002\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0006\u0000\u0000\u00c5\u00c6\u0003\u0002\u0001\u0000"+
		"\u00c6\u00c7\u0006\f\uffff\uffff\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u0019\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0006\r\uffff\uffff\u0000\u00ce\u00cf\u0003\u0004\u0002\u0000"+
		"\u00cf\u00d0\u0006\r\uffff\uffff\u0000\u00d0\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\n\u0002\u0000\u0000\u00d2\u00d3\u0005\u0007\u0000\u0000\u00d3"+
		"\u00d4\u0003\u0002\u0001\u0000\u00d4\u00d5\u0006\r\uffff\uffff\u0000\u00d5"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d1\u0001\u0000\u0000\u0000\u00d7"+
		"\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d9\u001b\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\f7GR`n|\u008a\u00a0\u00ae\u00bc\u00ca\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}