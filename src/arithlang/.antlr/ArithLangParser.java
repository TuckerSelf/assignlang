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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Dot=9, 
		Number=10, Identifier=11, Letter=12, LetterOrDigit=13, AT=14, ELLIPSIS=15, 
		WS=16, Comment=17, Line_Comment=18;
	public static final int
		RULE_program = 0, RULE_asgexp = 1, RULE_exp = 2, RULE_numexp = 3, RULE_addexp = 4, 
		RULE_subexp = 5, RULE_multexp = 6, RULE_divexp = 7, RULE_powexp = 8, RULE_negexp = 9, 
		RULE_varexp = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "asgexp", "exp", "numexp", "addexp", "subexp", "multexp", 
			"divexp", "powexp", "negexp", "varexp"
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
			setState(22);
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
	public static class AsgexpContext extends ParserRuleContext {
		public AsgExp ast;
		public VarexpContext l;
		public AsgexpContext r;
		public ExpContext n;
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public AsgexpContext asgexp() {
			return getRuleContext(AsgexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsgexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asgexp; }
	}

	public final AsgexpContext asgexp() throws RecognitionException {
		AsgexpContext _localctx = new AsgexpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_asgexp);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				((AsgexpContext)_localctx).l = varexp();
				setState(26);
				match(T__0);
				setState(27);
				((AsgexpContext)_localctx).r = asgexp();

											names.add((((AsgexpContext)_localctx).l!=null?_input.getText(((AsgexpContext)_localctx).l.start,((AsgexpContext)_localctx).l.stop):null)); 
											value_exps.add(((AsgexpContext)_localctx).r.ast);
											((AsgexpContext)_localctx).ast =  new AsgExp();
										
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				((AsgexpContext)_localctx).n = exp();
				((AsgexpContext)_localctx).ast =  ((AsgexpContext)_localctx).n.ast;
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
	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public NumexpContext n;
		public AddexpContext a;
		public SubexpContext s;
		public MultexpContext m;
		public DivexpContext d;
		public PowexpContext p;
		public NegexpContext neg;
		public VarexpContext v;
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
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				((ExpContext)_localctx).a = addexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).a.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				((ExpContext)_localctx).s = subexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				((ExpContext)_localctx).m = multexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).m.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				((ExpContext)_localctx).d = divexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).d.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				((ExpContext)_localctx).p = powexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).p.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				((ExpContext)_localctx).neg = negexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).neg.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				((ExpContext)_localctx).v = varexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).v.ast; 
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
		enterRule(_localctx, 6, RULE_numexp);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__1);
				setState(64);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(67);
				match(Dot);
				setState(68);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(T__1);
				setState(71);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(72);
				match(Dot);
				setState(73);
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
		public AddexpContext l;
		public NumexpContext n;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AddexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexp; }
	}

	public final AddexpContext addexp() throws RecognitionException {
		return addexp(0);
	}

	private AddexpContext addexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddexpContext _localctx = new AddexpContext(_ctx, _parentState);
		AddexpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_addexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			((AddexpContext)_localctx).n = numexp();
			((AddexpContext)_localctx).ast =  ((AddexpContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_addexp);
					setState(81);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(82);
					match(T__2);
					setState(83);
					((AddexpContext)_localctx).r = exp();
					 
					                                      ((AddexpContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((AddexpContext)_localctx).l.ast);
					          							_localctx.list.add(((AddexpContext)_localctx).r.ast);
					          							((AddexpContext)_localctx).ast =  new AddExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class SubexpContext extends ParserRuleContext {
		public SubExp ast;
		public ArrayList<Exp> list;
		public SubexpContext l;
		public NumexpContext n;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public SubexpContext subexp() {
			return getRuleContext(SubexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SubexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexp; }
	}

	public final SubexpContext subexp() throws RecognitionException {
		return subexp(0);
	}

	private SubexpContext subexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubexpContext _localctx = new SubexpContext(_ctx, _parentState);
		SubexpContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_subexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(92);
			((SubexpContext)_localctx).n = numexp();
			((SubexpContext)_localctx).ast =  ((SubexpContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_subexp);
					setState(95);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(96);
					match(T__1);
					setState(97);
					((SubexpContext)_localctx).r = exp();
					 
					                                      ((SubexpContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((SubexpContext)_localctx).l.ast);
					          							_localctx.list.add(((SubexpContext)_localctx).r.ast);
					          							((SubexpContext)_localctx).ast =  new SubExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class MultexpContext extends ParserRuleContext {
		public MultExp ast;
		public ArrayList<Exp> list;
		public MultexpContext l;
		public NumexpContext n;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public MultexpContext multexp() {
			return getRuleContext(MultexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MultexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexp; }
	}

	public final MultexpContext multexp() throws RecognitionException {
		return multexp(0);
	}

	private MultexpContext multexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultexpContext _localctx = new MultexpContext(_ctx, _parentState);
		MultexpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_multexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			((MultexpContext)_localctx).n = numexp();
			((MultexpContext)_localctx).ast =  ((MultexpContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multexp);
					setState(109);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(110);
					match(T__3);
					setState(111);
					((MultexpContext)_localctx).r = exp();
					 
					                                      ((MultexpContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((MultexpContext)_localctx).l.ast);
					          							_localctx.list.add(((MultexpContext)_localctx).r.ast);
					          							((MultexpContext)_localctx).ast =  new MultExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class DivexpContext extends ParserRuleContext {
		public DivExp ast;
		public ArrayList<Exp> list;
		public DivexpContext l;
		public NumexpContext n;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public DivexpContext divexp() {
			return getRuleContext(DivexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DivexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divexp; }
	}

	public final DivexpContext divexp() throws RecognitionException {
		return divexp(0);
	}

	private DivexpContext divexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DivexpContext _localctx = new DivexpContext(_ctx, _parentState);
		DivexpContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_divexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			((DivexpContext)_localctx).n = numexp();
			((DivexpContext)_localctx).ast =  ((DivexpContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DivexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_divexp);
					setState(123);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(124);
					match(T__4);
					setState(125);
					((DivexpContext)_localctx).r = exp();
					 
					                                      ((DivexpContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((DivexpContext)_localctx).l.ast);
					          							_localctx.list.add(((DivexpContext)_localctx).r.ast);
					          							((DivexpContext)_localctx).ast =  new DivExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class PowexpContext extends ParserRuleContext {
		public PowExp ast;
		public ArrayList<Exp> list;
		public PowexpContext l;
		public NumexpContext n;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public PowexpContext powexp() {
			return getRuleContext(PowexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PowexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powexp; }
	}

	public final PowexpContext powexp() throws RecognitionException {
		return powexp(0);
	}

	private PowexpContext powexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PowexpContext _localctx = new PowexpContext(_ctx, _parentState);
		PowexpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_powexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(134);
			((PowexpContext)_localctx).n = numexp();
			((PowexpContext)_localctx).ast =  ((PowexpContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_powexp);
					setState(137);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(138);
					match(T__5);
					setState(139);
					((PowexpContext)_localctx).r = exp();
					 
					                                      ((PowexpContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((PowexpContext)_localctx).l.ast);
					          							_localctx.list.add(((PowexpContext)_localctx).r.ast);
					          							((PowexpContext)_localctx).ast =  new PowExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(146);
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
		enterRule(_localctx, 18, RULE_negexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__6);
			setState(148);
			match(T__1);
			setState(149);
			((NegexpContext)_localctx).e = exp();
			setState(150);
			match(T__7);
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
	public static class VarexpContext extends ParserRuleContext {
		public VarExp ast;
		public Token id;
		public TerminalNode Identifier() { return getToken(ArithLangParser.Identifier, 0); }
		public VarexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varexp; }
	}

	public final VarexpContext varexp() throws RecognitionException {
		VarexpContext _localctx = new VarexpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((VarexpContext)_localctx).id = match(Identifier);
			 ((VarexpContext)_localctx).ast =  new VarExp((((VarexpContext)_localctx).id!=null?((VarexpContext)_localctx).id.getText():null)); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return addexp_sempred((AddexpContext)_localctx, predIndex);
		case 5:
			return subexp_sempred((SubexpContext)_localctx, predIndex);
		case 6:
			return multexp_sempred((MultexpContext)_localctx, predIndex);
		case 7:
			return divexp_sempred((DivexpContext)_localctx, predIndex);
		case 8:
			return powexp_sempred((PowexpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addexp_sempred(AddexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean subexp_sempred(SubexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multexp_sempred(MultexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean divexp_sempred(DivexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean powexp_sempred(PowexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012\u009d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"<\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003L\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004W\b\u0004\n\u0004\f\u0004Z\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005e\b\u0005\n\u0005\f\u0005"+
		"h\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006s\b\u0006"+
		"\n\u0006\f\u0006v\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0081\b\u0007\n\u0007\f\u0007\u0084\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u008f\b\b\n\b\f\b\u0092"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0000\u0005\b\n\f\u000e\u0010\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000\u00a1\u0000\u0016\u0001\u0000"+
		"\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000"+
		"\u0006K\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\n[\u0001\u0000"+
		"\u0000\u0000\fi\u0001\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000"+
		"\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u0093\u0001\u0000\u0000\u0000"+
		"\u0014\u0099\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0004\u0002\u0000"+
		"\u0017\u0018\u0006\u0000\uffff\uffff\u0000\u0018\u0001\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0003\u0014\n\u0000\u001a\u001b\u0005\u0001\u0000\u0000"+
		"\u001b\u001c\u0003\u0002\u0001\u0000\u001c\u001d\u0006\u0001\uffff\uffff"+
		"\u0000\u001d\"\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000"+
		"\u001f \u0006\u0001\uffff\uffff\u0000 \"\u0001\u0000\u0000\u0000!\u0019"+
		"\u0001\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000\"\u0003\u0001"+
		"\u0000\u0000\u0000#$\u0003\u0006\u0003\u0000$%\u0006\u0002\uffff\uffff"+
		"\u0000%<\u0001\u0000\u0000\u0000&\'\u0003\b\u0004\u0000\'(\u0006\u0002"+
		"\uffff\uffff\u0000(<\u0001\u0000\u0000\u0000)*\u0003\n\u0005\u0000*+\u0006"+
		"\u0002\uffff\uffff\u0000+<\u0001\u0000\u0000\u0000,-\u0003\f\u0006\u0000"+
		"-.\u0006\u0002\uffff\uffff\u0000.<\u0001\u0000\u0000\u0000/0\u0003\u000e"+
		"\u0007\u000001\u0006\u0002\uffff\uffff\u00001<\u0001\u0000\u0000\u0000"+
		"23\u0003\u0010\b\u000034\u0006\u0002\uffff\uffff\u00004<\u0001\u0000\u0000"+
		"\u000056\u0003\u0012\t\u000067\u0006\u0002\uffff\uffff\u00007<\u0001\u0000"+
		"\u0000\u000089\u0003\u0014\n\u00009:\u0006\u0002\uffff\uffff\u0000:<\u0001"+
		"\u0000\u0000\u0000;#\u0001\u0000\u0000\u0000;&\u0001\u0000\u0000\u0000"+
		";)\u0001\u0000\u0000\u0000;,\u0001\u0000\u0000\u0000;/\u0001\u0000\u0000"+
		"\u0000;2\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000;8\u0001\u0000"+
		"\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005\n\u0000\u0000>L\u0006"+
		"\u0003\uffff\uffff\u0000?@\u0005\u0002\u0000\u0000@A\u0005\n\u0000\u0000"+
		"AL\u0006\u0003\uffff\uffff\u0000BC\u0005\n\u0000\u0000CD\u0005\t\u0000"+
		"\u0000DE\u0005\n\u0000\u0000EL\u0006\u0003\uffff\uffff\u0000FG\u0005\u0002"+
		"\u0000\u0000GH\u0005\n\u0000\u0000HI\u0005\t\u0000\u0000IJ\u0005\n\u0000"+
		"\u0000JL\u0006\u0003\uffff\uffff\u0000K=\u0001\u0000\u0000\u0000K?\u0001"+
		"\u0000\u0000\u0000KB\u0001\u0000\u0000\u0000KF\u0001\u0000\u0000\u0000"+
		"L\u0007\u0001\u0000\u0000\u0000MN\u0006\u0004\uffff\uffff\u0000NO\u0003"+
		"\u0006\u0003\u0000OP\u0006\u0004\uffff\uffff\u0000PX\u0001\u0000\u0000"+
		"\u0000QR\n\u0002\u0000\u0000RS\u0005\u0003\u0000\u0000ST\u0003\u0004\u0002"+
		"\u0000TU\u0006\u0004\uffff\uffff\u0000UW\u0001\u0000\u0000\u0000VQ\u0001"+
		"\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y\t\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[\\\u0006\u0005\uffff\uffff\u0000\\]\u0003\u0006\u0003\u0000]^\u0006"+
		"\u0005\uffff\uffff\u0000^f\u0001\u0000\u0000\u0000_`\n\u0002\u0000\u0000"+
		"`a\u0005\u0002\u0000\u0000ab\u0003\u0004\u0002\u0000bc\u0006\u0005\uffff"+
		"\uffff\u0000ce\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000eh\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"g\u000b\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0006\u0006"+
		"\uffff\uffff\u0000jk\u0003\u0006\u0003\u0000kl\u0006\u0006\uffff\uffff"+
		"\u0000lt\u0001\u0000\u0000\u0000mn\n\u0002\u0000\u0000no\u0005\u0004\u0000"+
		"\u0000op\u0003\u0004\u0002\u0000pq\u0006\u0006\uffff\uffff\u0000qs\u0001"+
		"\u0000\u0000\u0000rm\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\r\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000wx\u0006\u0007\uffff\uffff\u0000xy\u0003"+
		"\u0006\u0003\u0000yz\u0006\u0007\uffff\uffff\u0000z\u0082\u0001\u0000"+
		"\u0000\u0000{|\n\u0002\u0000\u0000|}\u0005\u0005\u0000\u0000}~\u0003\u0004"+
		"\u0002\u0000~\u007f\u0006\u0007\uffff\uffff\u0000\u007f\u0081\u0001\u0000"+
		"\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u000f\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0006\b\uffff\uffff\u0000\u0086\u0087\u0003\u0006\u0003"+
		"\u0000\u0087\u0088\u0006\b\uffff\uffff\u0000\u0088\u0090\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\n\u0002\u0000\u0000\u008a\u008b\u0005\u0006\u0000\u0000"+
		"\u008b\u008c\u0003\u0004\u0002\u0000\u008c\u008d\u0006\b\uffff\uffff\u0000"+
		"\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0089\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0011\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0007\u0000\u0000"+
		"\u0094\u0095\u0005\u0002\u0000\u0000\u0095\u0096\u0003\u0004\u0002\u0000"+
		"\u0096\u0097\u0005\b\u0000\u0000\u0097\u0098\u0006\t\uffff\uffff\u0000"+
		"\u0098\u0013\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u000b\u0000\u0000"+
		"\u009a\u009b\u0006\n\uffff\uffff\u0000\u009b\u0015\u0001\u0000\u0000\u0000"+
		"\b!;KXft\u0082\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}