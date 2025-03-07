// Generated from ArithLang.g by ANTLR 4.5
package arithlang.parser; import static arithlang.AST.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

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
	public static final String[] ruleNames = {
		"program", "asgexp", "exp", "numexp", "addexp", "subexp", "multexp", "divexp", 
		"powexp", "negexp", "varexp"
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
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public ArrayList<AsgExp> asgs;
		public Exp expr;
		public AsgexpContext a;
		public ExpContext e;
		public List<AsgexpContext> asgexp() {
			return getRuleContexts(AsgexpContext.class);
		}
		public AsgexpContext asgexp(int i) {
			return getRuleContext(AsgexpContext.class,i);
		}
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
		 ((ProgramContext)_localctx).asgs =  new ArrayList<AsgExp>(); ((ProgramContext)_localctx).expr =  new UnitExp(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(22);
					((ProgramContext)_localctx).a = asgexp();
					 _localctx.asgs.add(((ProgramContext)_localctx).a.ast); 
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(33);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				setState(30);
				((ProgramContext)_localctx).e = exp();
				 ((ProgramContext)_localctx).expr =  ((ProgramContext)_localctx).e.ast; 
				}
			}

			 ((ProgramContext)_localctx).ast =  new Program(_localctx.asgs, _localctx.expr); 
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

	public static class AsgexpContext extends ParserRuleContext {
		public AsgExp ast;
		public VarexpContext l;
		public AsgexpContext r;
		public ExpContext e;
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
			setState(45);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((AsgexpContext)_localctx).l = varexp();
				setState(38);
				match(T__0);
				setState(39);
				((AsgexpContext)_localctx).r = asgexp();

											((AsgexpContext)_localctx).ast =  new AsgExp((((AsgexpContext)_localctx).l!=null?_input.getText(((AsgexpContext)_localctx).l.start,((AsgexpContext)_localctx).l.stop):null), ((AsgexpContext)_localctx).r.ast);
										
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				((AsgexpContext)_localctx).e = exp();
				((AsgexpContext)_localctx).ast =  ((AsgexpContext)_localctx).e.ast;
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
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((ExpContext)_localctx).a = addexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).a.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				((ExpContext)_localctx).s = subexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				((ExpContext)_localctx).m = multexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).m.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				((ExpContext)_localctx).d = divexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).d.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				((ExpContext)_localctx).p = powexp(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).p.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				((ExpContext)_localctx).neg = negexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).neg.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
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
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__1);
				setState(76);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(79);
				match(Dot);
				setState(80);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(T__1);
				setState(83);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(84);
				match(Dot);
				setState(85);
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
			setState(90);
			((AddexpContext)_localctx).n = numexp();
			((AddexpContext)_localctx).ast =  ((AddexpContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_addexp);
					setState(93);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(94);
					match(T__2);
					setState(95);
					((AddexpContext)_localctx).r = exp();
					 
					                                      ((AddexpContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((AddexpContext)_localctx).l.ast);
					          							_localctx.list.add(((AddexpContext)_localctx).r.ast);
					          							((AddexpContext)_localctx).ast =  new AddExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(102);
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
			setState(104);
			((SubexpContext)_localctx).n = numexp();
			((SubexpContext)_localctx).ast =  ((SubexpContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_subexp);
					setState(107);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(108);
					match(T__1);
					setState(109);
					((SubexpContext)_localctx).r = exp();
					 
					                                      ((SubexpContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((SubexpContext)_localctx).l.ast);
					          							_localctx.list.add(((SubexpContext)_localctx).r.ast);
					          							((SubexpContext)_localctx).ast =  new SubExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(116);
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
			setState(118);
			((MultexpContext)_localctx).n = numexp();
			((MultexpContext)_localctx).ast =  ((MultexpContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multexp);
					setState(121);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(122);
					match(T__3);
					setState(123);
					((MultexpContext)_localctx).r = exp();
					 
					                                      ((MultexpContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((MultexpContext)_localctx).l.ast);
					          							_localctx.list.add(((MultexpContext)_localctx).r.ast);
					          							((MultexpContext)_localctx).ast =  new MultExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(130);
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
			setState(132);
			((DivexpContext)_localctx).n = numexp();
			((DivexpContext)_localctx).ast =  ((DivexpContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DivexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_divexp);
					setState(135);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(136);
					match(T__4);
					setState(137);
					((DivexpContext)_localctx).r = exp();
					 
					                                      ((DivexpContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((DivexpContext)_localctx).l.ast);
					          							_localctx.list.add(((DivexpContext)_localctx).r.ast);
					          							((DivexpContext)_localctx).ast =  new DivExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(144);
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
			setState(146);
			((PowexpContext)_localctx).n = numexp();
			((PowexpContext)_localctx).ast =  ((PowexpContext)_localctx).n.ast;
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowexpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_powexp);
					setState(149);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(150);
					match(T__5);
					setState(151);
					((PowexpContext)_localctx).r = exp();
					 
					                                      ((PowexpContext)_localctx).list =  new ArrayList<Exp>();
					          							_localctx.list.add(((PowexpContext)_localctx).l.ast);
					          							_localctx.list.add(((PowexpContext)_localctx).r.ast);
					          							((PowexpContext)_localctx).ast =  new PowExp(_localctx.list);		 
					          	                     
					}
					} 
				}
				setState(158);
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
			setState(159);
			match(T__6);
			setState(160);
			match(T__1);
			setState(161);
			((NegexpContext)_localctx).e = exp();
			setState(162);
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
			setState(165);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\2\5\2"+
		"$\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6e\n\6\f\6\16"+
		"\6h\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7s\n\7\f\7\16\7v\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0081\n\b\f\b\16\b\u0084\13\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008f\n\t\f\t\16\t\u0092\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009d\n\n\f\n\16\n\u00a0\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\2\7\n\f\16\20\22\r\2\4\6"+
		"\b\n\f\16\20\22\24\26\2\2\u00b1\2\35\3\2\2\2\4/\3\2\2\2\6I\3\2\2\2\bY"+
		"\3\2\2\2\n[\3\2\2\2\fi\3\2\2\2\16w\3\2\2\2\20\u0085\3\2\2\2\22\u0093\3"+
		"\2\2\2\24\u00a1\3\2\2\2\26\u00a7\3\2\2\2\30\31\5\4\3\2\31\32\b\2\1\2\32"+
		"\34\3\2\2\2\33\30\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		"#\3\2\2\2\37\35\3\2\2\2 !\5\6\4\2!\"\b\2\1\2\"$\3\2\2\2# \3\2\2\2#$\3"+
		"\2\2\2$%\3\2\2\2%&\b\2\1\2&\3\3\2\2\2\'(\5\26\f\2()\7\3\2\2)*\5\4\3\2"+
		"*+\b\3\1\2+\60\3\2\2\2,-\5\6\4\2-.\b\3\1\2.\60\3\2\2\2/\'\3\2\2\2/,\3"+
		"\2\2\2\60\5\3\2\2\2\61\62\5\b\5\2\62\63\b\4\1\2\63J\3\2\2\2\64\65\5\n"+
		"\6\2\65\66\b\4\1\2\66J\3\2\2\2\678\5\f\7\289\b\4\1\29J\3\2\2\2:;\5\16"+
		"\b\2;<\b\4\1\2<J\3\2\2\2=>\5\20\t\2>?\b\4\1\2?J\3\2\2\2@A\5\22\n\2AB\b"+
		"\4\1\2BJ\3\2\2\2CD\5\24\13\2DE\b\4\1\2EJ\3\2\2\2FG\5\26\f\2GH\b\4\1\2"+
		"HJ\3\2\2\2I\61\3\2\2\2I\64\3\2\2\2I\67\3\2\2\2I:\3\2\2\2I=\3\2\2\2I@\3"+
		"\2\2\2IC\3\2\2\2IF\3\2\2\2J\7\3\2\2\2KL\7\f\2\2LZ\b\5\1\2MN\7\4\2\2NO"+
		"\7\f\2\2OZ\b\5\1\2PQ\7\f\2\2QR\7\13\2\2RS\7\f\2\2SZ\b\5\1\2TU\7\4\2\2"+
		"UV\7\f\2\2VW\7\13\2\2WX\7\f\2\2XZ\b\5\1\2YK\3\2\2\2YM\3\2\2\2YP\3\2\2"+
		"\2YT\3\2\2\2Z\t\3\2\2\2[\\\b\6\1\2\\]\5\b\5\2]^\b\6\1\2^f\3\2\2\2_`\f"+
		"\4\2\2`a\7\5\2\2ab\5\6\4\2bc\b\6\1\2ce\3\2\2\2d_\3\2\2\2eh\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2g\13\3\2\2\2hf\3\2\2\2ij\b\7\1\2jk\5\b\5\2kl\b\7\1\2l"+
		"t\3\2\2\2mn\f\4\2\2no\7\4\2\2op\5\6\4\2pq\b\7\1\2qs\3\2\2\2rm\3\2\2\2"+
		"sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\r\3\2\2\2vt\3\2\2\2wx\b\b\1\2xy\5\b\5"+
		"\2yz\b\b\1\2z\u0082\3\2\2\2{|\f\4\2\2|}\7\6\2\2}~\5\6\4\2~\177\b\b\1\2"+
		"\177\u0081\3\2\2\2\u0080{\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\17\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086"+
		"\b\t\1\2\u0086\u0087\5\b\5\2\u0087\u0088\b\t\1\2\u0088\u0090\3\2\2\2\u0089"+
		"\u008a\f\4\2\2\u008a\u008b\7\7\2\2\u008b\u008c\5\6\4\2\u008c\u008d\b\t"+
		"\1\2\u008d\u008f\3\2\2\2\u008e\u0089\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\21\3\2\2\2\u0092\u0090\3\2\2"+
		"\2\u0093\u0094\b\n\1\2\u0094\u0095\5\b\5\2\u0095\u0096\b\n\1\2\u0096\u009e"+
		"\3\2\2\2\u0097\u0098\f\4\2\2\u0098\u0099\7\b\2\2\u0099\u009a\5\6\4\2\u009a"+
		"\u009b\b\n\1\2\u009b\u009d\3\2\2\2\u009c\u0097\3\2\2\2\u009d\u00a0\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\23\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\5\6\4\2\u00a4"+
		"\u00a5\7\n\2\2\u00a5\u00a6\b\13\1\2\u00a6\25\3\2\2\2\u00a7\u00a8\7\r\2"+
		"\2\u00a8\u00a9\b\f\1\2\u00a9\27\3\2\2\2\f\35#/IYft\u0082\u0090\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}