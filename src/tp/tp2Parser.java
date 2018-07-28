// Generated from /home/mauro/Software/TC/TP1/src/tp/tp2.g4 by ANTLR 4.5.3
package tp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tp2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, OBRACE=4, CBRACE=5, OBRACKET=6, CBRACKET=7, SCOLON=8, 
		COMMA=9, ASSIGN=10, SUMOP=11, MULTOP=12, MOD=13, INCREMENT=14, DECREMENT=15, 
		PLASSIGN=16, MINASSIGN=17, MULTASSIGN=18, DIVASSIGN=19, MODASSIGN=20, 
		COMPOP=21, LOGICOP=22, NOT=23, OR=24, AND=25, TYPE=26, T_DOUBLE=27, T_FLOAT=28, 
		T_INT=29, T_CHAR=30, T_VOID=31, IF=32, ELSE=33, DO=34, WHILE=35, FOR=36, 
		BREAK=37, CONTINUE=38, RETURN=39, SWITCH=40, CASE=41, DEFAULT=42, INT=43, 
		FLOAT=44, ID=45, CHAR=46;
	public static final int
		RULE_program = 0, RULE_rec_instruc = 1, RULE_instruc = 2, RULE_sentence = 3, 
		RULE_block = 4, RULE_baseexp = 5, RULE_exp = 6, RULE_assign = 7, RULE_ret = 8, 
		RULE_func_def = 9, RULE_func_def_param = 10, RULE_func_prot = 11, RULE_func_prot_param = 12, 
		RULE_func_call = 13, RULE_func_call_param = 14, RULE_declare = 15, RULE_dec_comma = 16, 
		RULE_cond = 17, RULE_elcond = 18, RULE_forloop = 19, RULE_whileloop = 20;
	public static final String[] ruleNames = {
		"program", "rec_instruc", "instruc", "sentence", "block", "baseexp", "exp", 
		"assign", "ret", "func_def", "func_def_param", "func_prot", "func_prot_param", 
		"func_call", "func_call_param", "declare", "dec_comma", "cond", "elcond", 
		"forloop", "whileloop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", null, "'{'", "'}'", "'['", "']'", "';'", "','", "'='", 
		null, null, "'%'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'%='", 
		null, null, "'!'", "'||'", "'&&'", null, "'double'", "'float'", "'int'", 
		"'char'", "'void'", "'if'", "'else'", "'do'", "'while'", "'for'", "'break'", 
		"'continue'", "'return'", "'switch'", "'case'", "'default'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WS", "OBRACE", "CBRACE", "OBRACKET", "CBRACKET", "SCOLON", 
		"COMMA", "ASSIGN", "SUMOP", "MULTOP", "MOD", "INCREMENT", "DECREMENT", 
		"PLASSIGN", "MINASSIGN", "MULTASSIGN", "DIVASSIGN", "MODASSIGN", "COMPOP", 
		"LOGICOP", "NOT", "OR", "AND", "TYPE", "T_DOUBLE", "T_FLOAT", "T_INT", 
		"T_CHAR", "T_VOID", "IF", "ELSE", "DO", "WHILE", "FOR", "BREAK", "CONTINUE", 
		"RETURN", "SWITCH", "CASE", "DEFAULT", "INT", "FLOAT", "ID", "CHAR"
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
	public String getGrammarFileName() { return "tp2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tp2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends EvaluableParserRuleContext {
		public Rec_instrucContext rec_instruc() {
			return getRuleContext(Rec_instrucContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			rec_instruc();
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

	public static class Rec_instrucContext extends EvaluableParserRuleContext {
		public InstrucContext instruc() {
			return getRuleContext(InstrucContext.class,0);
		}
		public Rec_instrucContext rec_instruc() {
			return getRuleContext(Rec_instrucContext.class,0);
		}
		public Rec_instrucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rec_instruc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterRec_instruc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitRec_instruc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitRec_instruc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rec_instrucContext rec_instruc() throws RecognitionException {
		Rec_instrucContext _localctx = new Rec_instrucContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rec_instruc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			instruc();
			setState(46);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OBRACE) | (1L << SCOLON) | (1L << NOT) | (1L << TYPE) | (1L << T_VOID) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << CHAR))) != 0)) {
				{
				setState(45);
				rec_instruc();
				}
			}

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

	public static class InstrucContext extends EvaluableParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Func_protContext func_prot() {
			return getRuleContext(Func_protContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(tp2Parser.SCOLON, 0); }
		public InstrucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterInstruc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitInstruc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitInstruc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucContext instruc() throws RecognitionException {
		InstrucContext _localctx = new InstrucContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruc);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				forloop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				whileloop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				cond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				func_prot();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				func_def();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				sentence();
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(55);
					match(SCOLON);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				match(SCOLON);
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

	public static class SentenceContext extends EvaluableParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(tp2Parser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(tp2Parser.CONTINUE, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
                
                @Override
                public String eval(ThreeAddressCode code, boolean function){
                    if(BREAK() != null){
                        code.addCode("JMP "+code.getBreakLabel(), null, function);
                        return null;
                    }
                    else if(CONTINUE() != null){
                        code.addCode("JMP "+code.getContinueLabel(), null, function);
                        return null;
                    }
                    else{
                        return super.eval(code, function);
                    }
                }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				declare();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(BREAK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(CONTINUE);
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

	public static class BlockContext extends EvaluableParserRuleContext {
		public TerminalNode OBRACE() { return getToken(tp2Parser.OBRACE, 0); }
		public Rec_instrucContext rec_instruc() {
			return getRuleContext(Rec_instrucContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(tp2Parser.CBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(OBRACE);
			setState(69);
			rec_instruc();
			setState(70);
			match(CBRACE);
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

	public static class BaseexpContext extends EvaluableParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode INT() { return getToken(tp2Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(tp2Parser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(tp2Parser.ID, 0); }
		public TerminalNode CHAR() { return getToken(tp2Parser.CHAR, 0); }
		public BaseexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterBaseexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitBaseexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitBaseexp(this);
			else return visitor.visitChildren(this);
		}
                
                @Override
                public String eval(ThreeAddressCode code, boolean function){
                     if(func_call() != null){
                         return func_call().eval(code, function);
                     }
                     return (ID()!=null?"_":"")+getText();
                }

	}

	public final BaseexpContext baseexp() throws RecognitionException {
		BaseexpContext _localctx = new BaseexpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_baseexp);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				func_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(CHAR);
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

	public static class ExpContext extends EvaluableParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BaseexpContext baseexp() {
			return getRuleContext(BaseexpContext.class,0);
		}
		public TerminalNode NOT() { return getToken(tp2Parser.NOT, 0); }
		public TerminalNode MULTOP() { return getToken(tp2Parser.MULTOP, 0); }
		public TerminalNode SUMOP() { return getToken(tp2Parser.SUMOP, 0); }
		public TerminalNode COMPOP() { return getToken(tp2Parser.COMPOP, 0); }
		public TerminalNode LOGICOP() { return getToken(tp2Parser.LOGICOP, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
                
                @Override
                public String eval (ThreeAddressCode code, boolean function){
                    if(this.baseexp() != null) return this.baseexp().eval(code, function);
                    if(this.exp().size()==1){
                        if(NOT()!= null){
                            return("NOT "+exp(0).eval(code, function));
                        }
                        else{
                            return this.exp(0).eval(code, function);
                        }
                    }
                    else{
                        String result = code.getContext().getNextVarName();
                        String operator;
                        if(MULTOP()!= null) operator = MULTOP().getText();
                        else if(SUMOP()!= null) operator = SUMOP().getText();
                        else if(COMPOP()!= null) operator = COMPOP().getText();
                        else operator = LOGICOP().getText();
                        code.addCode(this.exp(0).eval(code, function)+ operator + this.exp(1).eval(code, function), result, function);
                        return result;
                    }
                }
                      
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(80);
				match(T__0);
				setState(81);
				exp(0);
				setState(82);
				match(T__1);
				}
				break;
			case INT:
			case FLOAT:
			case ID:
			case CHAR:
				{
				setState(84);
				baseexp();
				}
				break;
			case NOT:
				{
				setState(85);
				match(NOT);
				setState(86);
				exp(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90);
						match(MULTOP);
						setState(91);
						exp(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93);
						match(SUMOP);
						setState(94);
						exp(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(95);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(96);
						match(COMPOP);
						setState(97);
						exp(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(98);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(99);
						match(LOGICOP);
						setState(100);
						exp(3);
						}
						break;
					}
					} 
				}
				setState(105);
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

	public static class AssignContext extends EvaluableParserRuleContext {
		public TerminalNode ID() { return getToken(tp2Parser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(tp2Parser.ASSIGN, 0); }
		public TerminalNode PLASSIGN() { return getToken(tp2Parser.PLASSIGN, 0); }
		public TerminalNode MINASSIGN() { return getToken(tp2Parser.MINASSIGN, 0); }
		public TerminalNode MULTASSIGN() { return getToken(tp2Parser.MULTASSIGN, 0); }
		public TerminalNode DIVASSIGN() { return getToken(tp2Parser.DIVASSIGN, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
                @Override
                public String eval(ThreeAddressCode code, boolean function){
                    if(ASSIGN() != null){
                        code.addCode(exp().eval(code, function), "_"+ID().getText(), function);
                    }
                    else if (PLASSIGN() != null){
                        code.addCode("_"+ID().getText()+"+"+exp().eval(code, function), "_"+ID().getText(), function);
                    }
                    else if (MINASSIGN() != null){
                        code.addCode("_"+ID().getText()+"-"+exp().eval(code, function), "_"+ID().getText(), function);
                    }
                    else if (MULTASSIGN() != null){
                        code.addCode("_"+ID().getText()+"*"+exp().eval(code, function), "_"+ID().getText(), function);
                    }
                    else if (DIVASSIGN() != null){
                        code.addCode("_"+ID().getText()+"/"+exp().eval(code, function), "_"+ID().getText(), function);
                    }
                    return null;
                }
                
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << PLASSIGN) | (1L << MINASSIGN) | (1L << MULTASSIGN) | (1L << DIVASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(108);
			exp(0);
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

	public static class RetContext extends EvaluableParserRuleContext {
		public TerminalNode RETURN() { return getToken(tp2Parser.RETURN, 0); }
		public TerminalNode SCOLON() { return getToken(tp2Parser.SCOLON, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(RETURN);
			setState(112);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << CHAR))) != 0)) {
				{
				setState(111);
				exp(0);
				}
			}

			setState(114);
			match(SCOLON);
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

	public static class Func_defContext extends EvaluableParserRuleContext {
		public TerminalNode ID() { return getToken(tp2Parser.ID, 0); }
		public TerminalNode OBRACE() { return getToken(tp2Parser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(tp2Parser.CBRACE, 0); }
		public List<TerminalNode> T_VOID() { return getTokens(tp2Parser.T_VOID); }
		public TerminalNode T_VOID(int i) {
			return getToken(tp2Parser.T_VOID, i);
		}
		public TerminalNode TYPE() { return getToken(tp2Parser.TYPE, 0); }
		public Rec_instrucContext rec_instruc() {
			return getRuleContext(Rec_instrucContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public Func_def_paramContext func_def_param() {
			return getRuleContext(Func_def_paramContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
                
                @Override 
                public String eval(ThreeAddressCode code, boolean function){
                    code.pushContext();
                    code.addCode("LABEL "+ID().getText(), null, true);
                    Func_def_paramContext param = func_def_param();
                    while(param!=null){
                        code.addCode("POP","_"+param.ID(), true);
                        param = param.func_def_param();
                    }
                    rec_instruc().eval(code, true);
                    if (ret()!=null && ret().exp()!=null){
                        code.addCode(ret().exp().eval(code, true), "RET", true);
                    }
                    else{
                       code.addCode("RET", null, true);
                    }
                    code.popContext();
                    return null;
                }
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==T_VOID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(117);
			match(ID);
			setState(118);
			match(T__0);
			setState(123);
			switch (_input.LA(1)) {
			case T_VOID:
				{
				setState(119);
				match(T_VOID);
				}
				break;
			case T__1:
			case TYPE:
				{
				setState(121);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(120);
					func_def_param();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			match(T__1);
			setState(126);
			match(OBRACE);
			setState(128);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OBRACE) | (1L << SCOLON) | (1L << NOT) | (1L << TYPE) | (1L << T_VOID) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << CHAR))) != 0)) {
				{
				setState(127);
				rec_instruc();
				}
			}

			setState(131);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(130);
				ret();
				}
			}

			setState(133);
			match(CBRACE);
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

	public static class Func_def_paramContext extends EvaluableParserRuleContext {
		public TerminalNode TYPE() { return getToken(tp2Parser.TYPE, 0); }
		public TerminalNode ID() { return getToken(tp2Parser.ID, 0); }
		public TerminalNode COMMA() { return getToken(tp2Parser.COMMA, 0); }
		public Func_def_paramContext func_def_param() {
			return getRuleContext(Func_def_paramContext.class,0);
		}
		public Func_def_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterFunc_def_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitFunc_def_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitFunc_def_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_def_paramContext func_def_param() throws RecognitionException {
		Func_def_paramContext _localctx = new Func_def_paramContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_func_def_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(TYPE);
			setState(136);
			match(ID);
			setState(139);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(137);
				match(COMMA);
				setState(138);
				func_def_param();
				}
			}

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

	public static class Func_protContext extends EvaluableParserRuleContext {
		public TerminalNode ID() { return getToken(tp2Parser.ID, 0); }
		public TerminalNode SCOLON() { return getToken(tp2Parser.SCOLON, 0); }
		public TerminalNode T_VOID() { return getToken(tp2Parser.T_VOID, 0); }
		public TerminalNode TYPE() { return getToken(tp2Parser.TYPE, 0); }
		public Func_prot_paramContext func_prot_param() {
			return getRuleContext(Func_prot_paramContext.class,0);
		}
		public Func_protContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_prot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterFunc_prot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitFunc_prot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitFunc_prot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_protContext func_prot() throws RecognitionException {
		Func_protContext _localctx = new Func_protContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_prot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==T_VOID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(142);
			match(ID);
			setState(143);
			match(T__0);
			{
			setState(144);
			func_prot_param();
			}
			setState(145);
			match(T__1);
			setState(146);
			match(SCOLON);
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

	public static class Func_prot_paramContext extends EvaluableParserRuleContext {
		public TerminalNode TYPE() { return getToken(tp2Parser.TYPE, 0); }
		public TerminalNode ID() { return getToken(tp2Parser.ID, 0); }
		public TerminalNode COMMA() { return getToken(tp2Parser.COMMA, 0); }
		public Func_prot_paramContext func_prot_param() {
			return getRuleContext(Func_prot_paramContext.class,0);
		}
		public Func_prot_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_prot_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterFunc_prot_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitFunc_prot_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitFunc_prot_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_prot_paramContext func_prot_param() throws RecognitionException {
		Func_prot_paramContext _localctx = new Func_prot_paramContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_func_prot_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(TYPE);
			setState(150);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(149);
				match(ID);
				}
			}

			setState(154);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(152);
				match(COMMA);
				setState(153);
				func_prot_param();
				}
			}

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

	public static class Func_callContext extends EvaluableParserRuleContext {
		public TerminalNode ID() { return getToken(tp2Parser.ID, 0); }
		public List<Func_call_paramContext> func_call_param() {
			return getRuleContexts(Func_call_paramContext.class);
		}
		public Func_call_paramContext func_call_param(int i) {
			return getRuleContext(Func_call_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tp2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tp2Parser.COMMA, i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
                @Override
                public String eval(ThreeAddressCode code, boolean function){
                    for(int i = func_call_param().size()-1; i>=0; --i){
                        code.addCode("PUSH "+func_call_param(i).eval(code, function), null, function);
                    }
                    String retValue = code.getContext().getNextVarName("R");
                    code.pushContext();
                    code.addCode("CALL "+ID().getText(), retValue, function);
                    code.popContext();
                    return retValue;
                }
                
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(T__0);
			setState(166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << CHAR))) != 0)) {
				{
				setState(158);
				func_call_param();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(159);
					match(COMMA);
					setState(160);
					func_call_param();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(168);
			match(T__1);
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

	public static class Func_call_paramContext extends EvaluableParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Func_call_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterFunc_call_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitFunc_call_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitFunc_call_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_call_paramContext func_call_param() throws RecognitionException {
		Func_call_paramContext _localctx = new Func_call_paramContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_call_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			exp(0);
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

	public static class DeclareContext extends EvaluableParserRuleContext {
		public TerminalNode TYPE() { return getToken(tp2Parser.TYPE, 0); }
		public TerminalNode ID() { return getToken(tp2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(tp2Parser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<Dec_commaContext> dec_comma() {
			return getRuleContexts(Dec_commaContext.class);
		}
		public Dec_commaContext dec_comma(int i) {
			return getRuleContext(Dec_commaContext.class,i);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
		@Override
		public String eval(ThreeAddressCode code, boolean function) {
                        if(exp()!=null){
                            code.addCode(exp().eval(code, function), "_"+ID().getText(), function);
                        }
                        for(Dec_commaContext d: dec_comma()){
                            if(d.exp()!= null){
                                code.addCode(d.exp().eval(code, function), "_"+d.ID().getText(), function);
                            }
                        }
                        return null;
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(TYPE);
			setState(173);
			match(ID);
			setState(176);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(174);
				match(ASSIGN);
				setState(175);
				exp(0);
				}
			}

			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				dec_comma();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Dec_commaContext extends EvaluableParserRuleContext {
		public TerminalNode COMMA() { return getToken(tp2Parser.COMMA, 0); }
		public TerminalNode ID() { return getToken(tp2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(tp2Parser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Dec_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterDec_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitDec_comma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitDec_comma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_commaContext dec_comma() throws RecognitionException {
		Dec_commaContext _localctx = new Dec_commaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dec_comma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(COMMA);
			setState(185);
			match(ID);
			setState(188);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(186);
				match(ASSIGN);
				setState(187);
				exp(0);
				}
			}

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

	public static class CondContext extends EvaluableParserRuleContext {
		public TerminalNode IF() { return getToken(tp2Parser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InstrucContext instruc() {
			return getRuleContext(InstrucContext.class,0);
		}
		public ElcondContext elcond() {
			return getRuleContext(ElcondContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
                @Override
                public String eval (ThreeAddressCode code, boolean function){
                    String endLabel  = code.getContext().getNextVarName("END");
                    String elseLabel = "";    
                    if(elcond()!= null){
                        elseLabel = code.getContext().getNextVarName("ELSE");
                        code.addCode("JMPIFNOT " + exp().eval(code, function) + " "+elseLabel, null, function);
                    }
                    else{
                        code.addCode("JMPIFNOT " + exp().eval(code, function) + " "+endLabel, null, function);
                    }
                    instruc().eval(code, function);
                    if(elcond()!= null){
                        code.addCode("JMP "+endLabel, null, function);
                        code.addCode("LABEL "+elseLabel, null, function);                                          
                        elcond().eval(code, function);
                        code.addCode("JMP "+endLabel, null, function);                  
                    }
                    code.addCode("LABEL "+endLabel, null, function);
                    return null;
                }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IF);
			setState(191);
			match(T__0);
			setState(192);
			exp(0);
			setState(193);
			match(T__1);
			setState(194);
			instruc();
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(195);
				elcond();
				}
				break;
			}
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

	public static class ElcondContext extends EvaluableParserRuleContext {
		public TerminalNode ELSE() { return getToken(tp2Parser.ELSE, 0); }
		public InstrucContext instruc() {
			return getRuleContext(InstrucContext.class,0);
		}
		public ElcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterElcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitElcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitElcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElcondContext elcond() throws RecognitionException {
		ElcondContext _localctx = new ElcondContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ELSE);
			setState(199);
			instruc();
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

	public static class ForloopContext extends EvaluableParserRuleContext {
		public TerminalNode FOR() { return getToken(tp2Parser.FOR, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> SCOLON() { return getTokens(tp2Parser.SCOLON); }
		public TerminalNode SCOLON(int i) {
			return getToken(tp2Parser.SCOLON, i);
		}
		public InstrucContext instruc() {
			return getRuleContext(InstrucContext.class,0);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
                @Override 
                public String eval(ThreeAddressCode code, boolean function){
                    code.pushContext();
                    String endLabel = code.getContext().getNextVarName("BREAK");
                    String beginLabel = code.getContext().getNextVarName("BEGIN");
                    String continueLabel = code.getContext().getNextVarName("CONTINUE");
                    code.pushBranch(continueLabel, endLabel);
                    sentence(0).eval(code, function);
                    code.addCode("LABEL "+beginLabel, null, function);                    
                    code.addCode("JMPIFNOT "+sentence(1).eval(code, function)+" "+endLabel, null, function);
                    instruc().eval(code, function);
                    code.addCode("LABEL "+continueLabel, null, function);
                    sentence(2).eval(code, function);
                    code.addCode("JMP "+beginLabel, null, function);
                    code.addCode("LABEL "+endLabel, null, function);
                    code.popBranch();
                    return null;
                }
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(FOR);
			setState(202);
			match(T__0);
			setState(203);
			sentence();
			setState(204);
			match(SCOLON);
			setState(205);
			sentence();
			setState(206);
			match(SCOLON);
			setState(207);
			sentence();
			setState(208);
			match(T__1);
			setState(209);
			instruc();
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

	public static class WhileloopContext extends EvaluableParserRuleContext {
		public TerminalNode WHILE() { return getToken(tp2Parser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InstrucContext instruc() {
			return getRuleContext(InstrucContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp2Listener ) ((tp2Listener)listener).exitWhileloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp2Visitor ) return ((tp2Visitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
                @Override
                public String eval(ThreeAddressCode code, boolean function){
                    String beginLabel = code.getContext().getNextVarName("CONTINUE");
                    String endLabel = code.getContext().getNextVarName("BREAK");
                    code.pushBranch(beginLabel, endLabel);
                    code.addCode("LABEL "+beginLabel, null, function);
                    code.addCode("JMPIFNOT "+exp().eval(code, function)+" "+endLabel, null, function);
                    instruc().eval(code, function);
                    code.addCode("JMP "+beginLabel, null, function);
                    code.addCode("LABEL "+endLabel, null, function);
                    code.popBranch();
                    return null;
                }
                
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(WHILE);
			setState(212);
			match(T__0);
			setState(213);
			exp(0);
			setState(214);
			match(T__1);
			setState(215);
			instruc();
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
		case 6:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00dc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\5\3\61\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\bZ\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\t\3\t\3\t\3\t\3\n\3\n\5\ns\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\5\13|\n\13\5\13~\n\13\3\13\3\13\3\13\5\13"+
		"\u0083\n\13\3\13\5\13\u0086\n\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008e\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u0099\n\16\3\16\3\16\5\16"+
		"\u009d\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u00a4\n\17\f\17\16\17\u00a7"+
		"\13\17\5\17\u00a9\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00b3"+
		"\n\21\3\21\7\21\u00b6\n\21\f\21\16\21\u00b9\13\21\3\22\3\22\3\22\3\22"+
		"\5\22\u00bf\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c7\n\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\2\3\16\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\4\4\2\f\f\22\25\4\2\34\34!!\u00eb\2,\3\2\2\2\4.\3\2\2\2\6"+
		"=\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\fO\3\2\2\2\16Y\3\2\2\2\20l\3\2\2\2\22"+
		"p\3\2\2\2\24v\3\2\2\2\26\u0089\3\2\2\2\30\u008f\3\2\2\2\32\u0096\3\2\2"+
		"\2\34\u009e\3\2\2\2\36\u00ac\3\2\2\2 \u00ae\3\2\2\2\"\u00ba\3\2\2\2$\u00c0"+
		"\3\2\2\2&\u00c8\3\2\2\2(\u00cb\3\2\2\2*\u00d5\3\2\2\2,-\5\4\3\2-\3\3\2"+
		"\2\2.\60\5\6\4\2/\61\5\4\3\2\60/\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62"+
		">\5\n\6\2\63>\5(\25\2\64>\5*\26\2\65>\5$\23\2\66>\5\30\r\2\67>\5\24\13"+
		"\28:\5\b\5\29;\7\n\2\2:9\3\2\2\2:;\3\2\2\2;>\3\2\2\2<>\7\n\2\2=\62\3\2"+
		"\2\2=\63\3\2\2\2=\64\3\2\2\2=\65\3\2\2\2=\66\3\2\2\2=\67\3\2\2\2=8\3\2"+
		"\2\2=<\3\2\2\2>\7\3\2\2\2?E\5 \21\2@E\5\16\b\2AE\5\20\t\2BE\7\'\2\2CE"+
		"\7(\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\t\3\2\2\2F"+
		"G\7\6\2\2GH\5\4\3\2HI\7\7\2\2I\13\3\2\2\2JP\5\34\17\2KP\7-\2\2LP\7.\2"+
		"\2MP\7/\2\2NP\7\60\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2"+
		"\2P\r\3\2\2\2QR\b\b\1\2RS\7\3\2\2ST\5\16\b\2TU\7\4\2\2UZ\3\2\2\2VZ\5\f"+
		"\7\2WX\7\31\2\2XZ\5\16\b\3YQ\3\2\2\2YV\3\2\2\2YW\3\2\2\2Zi\3\2\2\2[\\"+
		"\f\7\2\2\\]\7\16\2\2]h\5\16\b\b^_\f\6\2\2_`\7\r\2\2`h\5\16\b\7ab\f\5\2"+
		"\2bc\7\27\2\2ch\5\16\b\6de\f\4\2\2ef\7\30\2\2fh\5\16\b\5g[\3\2\2\2g^\3"+
		"\2\2\2ga\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\17\3\2\2\2k"+
		"i\3\2\2\2lm\7/\2\2mn\t\2\2\2no\5\16\b\2o\21\3\2\2\2pr\7)\2\2qs\5\16\b"+
		"\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\n\2\2u\23\3\2\2\2vw\t\3\2\2wx\7/"+
		"\2\2x}\7\3\2\2y~\7!\2\2z|\5\26\f\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}y\3\2"+
		"\2\2}{\3\2\2\2~\177\3\2\2\2\177\u0080\7\4\2\2\u0080\u0082\7\6\2\2\u0081"+
		"\u0083\5\4\3\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0086\5\22\n\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\7\7\2\2\u0088\25\3\2\2\2\u0089\u008a\7\34\2"+
		"\2\u008a\u008d\7/\2\2\u008b\u008c\7\13\2\2\u008c\u008e\5\26\f\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\27\3\2\2\2\u008f\u0090\t\3\2"+
		"\2\u0090\u0091\7/\2\2\u0091\u0092\7\3\2\2\u0092\u0093\5\32\16\2\u0093"+
		"\u0094\7\4\2\2\u0094\u0095\7\n\2\2\u0095\31\3\2\2\2\u0096\u0098\7\34\2"+
		"\2\u0097\u0099\7/\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u009b\7\13\2\2\u009b\u009d\5\32\16\2\u009c\u009a\3\2\2"+
		"\2\u009c\u009d\3\2\2\2\u009d\33\3\2\2\2\u009e\u009f\7/\2\2\u009f\u00a8"+
		"\7\3\2\2\u00a0\u00a5\5\36\20\2\u00a1\u00a2\7\13\2\2\u00a2\u00a4\5\36\20"+
		"\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\4\2\2\u00ab\35\3\2\2"+
		"\2\u00ac\u00ad\5\16\b\2\u00ad\37\3\2\2\2\u00ae\u00af\7\34\2\2\u00af\u00b2"+
		"\7/\2\2\u00b0\u00b1\7\f\2\2\u00b1\u00b3\5\16\b\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b6\5\"\22\2\u00b5\u00b4\3"+
		"\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"!\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\13\2\2\u00bb\u00be\7/\2\2"+
		"\u00bc\u00bd\7\f\2\2\u00bd\u00bf\5\16\b\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf#\3\2\2\2\u00c0\u00c1\7\"\2\2\u00c1\u00c2\7\3\2\2\u00c2"+
		"\u00c3\5\16\b\2\u00c3\u00c4\7\4\2\2\u00c4\u00c6\5\6\4\2\u00c5\u00c7\5"+
		"&\24\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7%\3\2\2\2\u00c8\u00c9"+
		"\7#\2\2\u00c9\u00ca\5\6\4\2\u00ca\'\3\2\2\2\u00cb\u00cc\7&\2\2\u00cc\u00cd"+
		"\7\3\2\2\u00cd\u00ce\5\b\5\2\u00ce\u00cf\7\n\2\2\u00cf\u00d0\5\b\5\2\u00d0"+
		"\u00d1\7\n\2\2\u00d1\u00d2\5\b\5\2\u00d2\u00d3\7\4\2\2\u00d3\u00d4\5\6"+
		"\4\2\u00d4)\3\2\2\2\u00d5\u00d6\7%\2\2\u00d6\u00d7\7\3\2\2\u00d7\u00d8"+
		"\5\16\b\2\u00d8\u00d9\7\4\2\2\u00d9\u00da\5\6\4\2\u00da+\3\2\2\2\30\60"+
		":=DOYgir{}\u0082\u0085\u008d\u0098\u009c\u00a5\u00a8\u00b2\u00b7\u00be"+
		"\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}