// Generated from C:/Users/Dom/Desktop/WAT/JFK/AssemblerInterpreter/src\AssemblerGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		REGISTER=10, NUMBERSYMBOL=11, PLUSORMINUSSYMBOL=12, MULTIPLICATIONSYMBOL=13, 
		LEFTBRACKET=14, RIGHTBRACKET=15;
	public static final int
		RULE_instruction = 0, RULE_mov_expression = 1, RULE_push_expression = 2, 
		RULE_int0x80_expression = 3, RULE_xor_expression = 4, RULE_math_operation = 5, 
		RULE_term = 6, RULE_factor = 7, RULE_operand = 8, RULE_source_register = 9, 
		RULE_target_register = 10, RULE_number = 11, RULE_plus_or_minus = 12, 
		RULE_multiplication = 13, RULE_left_bracket = 14, RULE_right_bracket = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"instruction", "mov_expression", "push_expression", "int0x80_expression", 
			"xor_expression", "math_operation", "term", "factor", "operand", "source_register", 
			"target_register", "number", "plus_or_minus", "multiplication", "left_bracket", 
			"right_bracket"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mov'", "' '", "'push'", "'xor'", "'\t'", "'\n'", "','", "'int'", 
			"'0x80'", null, null, null, "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "REGISTER", 
			"NUMBERSYMBOL", "PLUSORMINUSSYMBOL", "MULTIPLICATIONSYMBOL", "LEFTBRACKET", 
			"RIGHTBRACKET"
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
	public String getGrammarFileName() { return "AssemblerGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssemblerGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InstructionContext extends ParserRuleContext {
		public Mov_expressionContext mov_expression() {
			return getRuleContext(Mov_expressionContext.class,0);
		}
		public Push_expressionContext push_expression() {
			return getRuleContext(Push_expressionContext.class,0);
		}
		public Int0x80_expressionContext int0x80_expression() {
			return getRuleContext(Int0x80_expressionContext.class,0);
		}
		public Xor_expressionContext xor_expression() {
			return getRuleContext(Xor_expressionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(32);
				match(T__0);
				setState(33);
				match(T__1);
				setState(34);
				mov_expression();
				}
				break;
			case T__2:
				{
				setState(35);
				match(T__2);
				setState(36);
				match(T__1);
				setState(37);
				push_expression();
				}
				break;
			case T__1:
			case T__7:
				{
				setState(38);
				int0x80_expression();
				}
				break;
			case T__3:
				{
				setState(39);
				match(T__3);
				setState(40);
				match(T__1);
				setState(41);
				xor_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__4) {
				{
				{
				setState(44);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(T__5);
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

	public static class Mov_expressionContext extends ParserRuleContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public Target_registerContext target_register() {
			return getRuleContext(Target_registerContext.class,0);
		}
		public Mov_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterMov_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitMov_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitMov_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mov_expressionContext mov_expression() throws RecognitionException {
		Mov_expressionContext _localctx = new Mov_expressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mov_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			math_operation(0);
			setState(53);
			match(T__6);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(54);
				match(T__1);
				}
			}

			setState(57);
			target_register();
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

	public static class Push_expressionContext extends ParserRuleContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public Push_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterPush_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitPush_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitPush_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Push_expressionContext push_expression() throws RecognitionException {
		Push_expressionContext _localctx = new Push_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_push_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			math_operation(0);
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

	public static class Int0x80_expressionContext extends ParserRuleContext {
		public Int0x80_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int0x80_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterInt0x80_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitInt0x80_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitInt0x80_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int0x80_expressionContext int0x80_expression() throws RecognitionException {
		Int0x80_expressionContext _localctx = new Int0x80_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_int0x80_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(61);
				match(T__1);
				}
			}

			setState(64);
			match(T__7);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(65);
				match(T__1);
				}
			}

			setState(68);
			match(T__8);
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

	public static class Xor_expressionContext extends ParserRuleContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public Target_registerContext target_register() {
			return getRuleContext(Target_registerContext.class,0);
		}
		public Xor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterXor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitXor_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitXor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_expressionContext xor_expression() throws RecognitionException {
		Xor_expressionContext _localctx = new Xor_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_xor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			math_operation(0);
			setState(71);
			match(T__6);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(72);
				match(T__1);
				}
			}

			setState(75);
			target_register();
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

	public static class Math_operationContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public Plus_or_minusContext plus_or_minus() {
			return getRuleContext(Plus_or_minusContext.class,0);
		}
		public Math_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterMath_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitMath_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitMath_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_operationContext math_operation() throws RecognitionException {
		return math_operation(0);
	}

	private Math_operationContext math_operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_operationContext _localctx = new Math_operationContext(_ctx, _parentState);
		Math_operationContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_math_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Math_operationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
					setState(80);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(81);
					plus_or_minus();
					setState(82);
					term(0);
					}
					} 
				}
				setState(88);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(90);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(92);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(93);
					multiplication();
					setState(94);
					factor();
					}
					} 
				}
				setState(100);
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

	public static class FactorContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Left_bracketContext left_bracket() {
			return getRuleContext(Left_bracketContext.class,0);
		}
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public Right_bracketContext right_bracket() {
			return getRuleContext(Right_bracketContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case REGISTER:
			case NUMBERSYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				operand();
				}
				break;
			case LEFTBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				left_bracket();
				setState(103);
				math_operation(0);
				setState(104);
				right_bracket();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OperandContext extends ParserRuleContext {
		public Source_registerContext source_register() {
			return getRuleContext(Source_registerContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operand);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(108);
					match(T__1);
					}
				}

				setState(111);
				source_register();
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(112);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(115);
					match(T__1);
					}
				}

				setState(118);
				number();
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(119);
					match(T__1);
					}
					break;
				}
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

	public static class Source_registerContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(AssemblerGrammarParser.REGISTER, 0); }
		public Source_registerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterSource_register(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitSource_register(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitSource_register(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_registerContext source_register() throws RecognitionException {
		Source_registerContext _localctx = new Source_registerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_source_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(REGISTER);
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

	public static class Target_registerContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(AssemblerGrammarParser.REGISTER, 0); }
		public Target_registerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterTarget_register(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitTarget_register(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitTarget_register(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_registerContext target_register() throws RecognitionException {
		Target_registerContext _localctx = new Target_registerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_target_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(REGISTER);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBERSYMBOL() { return getToken(AssemblerGrammarParser.NUMBERSYMBOL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(NUMBERSYMBOL);
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

	public static class Plus_or_minusContext extends ParserRuleContext {
		public TerminalNode PLUSORMINUSSYMBOL() { return getToken(AssemblerGrammarParser.PLUSORMINUSSYMBOL, 0); }
		public Plus_or_minusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus_or_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterPlus_or_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitPlus_or_minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitPlus_or_minus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plus_or_minusContext plus_or_minus() throws RecognitionException {
		Plus_or_minusContext _localctx = new Plus_or_minusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_plus_or_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(PLUSORMINUSSYMBOL);
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

	public static class MultiplicationContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATIONSYMBOL() { return getToken(AssemblerGrammarParser.MULTIPLICATIONSYMBOL, 0); }
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(MULTIPLICATIONSYMBOL);
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

	public static class Left_bracketContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(AssemblerGrammarParser.LEFTBRACKET, 0); }
		public Left_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterLeft_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitLeft_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitLeft_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_bracketContext left_bracket() throws RecognitionException {
		Left_bracketContext _localctx = new Left_bracketContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_left_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LEFTBRACKET);
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

	public static class Right_bracketContext extends ParserRuleContext {
		public TerminalNode RIGHTBRACKET() { return getToken(AssemblerGrammarParser.RIGHTBRACKET, 0); }
		public Right_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterRight_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitRight_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGrammarVisitor ) return ((AssemblerGrammarVisitor<? extends T>)visitor).visitRight_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_bracketContext right_bracket() throws RecognitionException {
		Right_bracketContext _localctx = new Right_bracketContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_right_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(RIGHTBRACKET);
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
		case 5:
			return math_operation_sempred((Math_operationContext)_localctx, predIndex);
		case 6:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_operation_sempred(Math_operationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u008d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\2\7\2\60\n\2\f\2\16\2\63\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\4\3\4\3\5\5\5A\n\5\3\5\3\5\5"+
		"\5E\n\5\3\5\3\5\3\6\3\6\3\6\5\6L\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7W\n\7\f\7\16\7Z\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bc\n\b\f\b\16"+
		"\bf\13\b\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\5\np\n\n\3\n\3\n\5\nt\n\n\3"+
		"\n\5\nw\n\n\3\n\3\n\5\n{\n\n\5\n}\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\2\4\f\16\22\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \2\3\4\2\4\4\7\7\2\u008c\2,\3\2\2\2\4\66\3\2\2\2\6"+
		"=\3\2\2\2\b@\3\2\2\2\nH\3\2\2\2\fO\3\2\2\2\16[\3\2\2\2\20l\3\2\2\2\22"+
		"|\3\2\2\2\24~\3\2\2\2\26\u0080\3\2\2\2\30\u0082\3\2\2\2\32\u0084\3\2\2"+
		"\2\34\u0086\3\2\2\2\36\u0088\3\2\2\2 \u008a\3\2\2\2\"#\7\3\2\2#$\7\4\2"+
		"\2$-\5\4\3\2%&\7\5\2\2&\'\7\4\2\2\'-\5\6\4\2(-\5\b\5\2)*\7\6\2\2*+\7\4"+
		"\2\2+-\5\n\6\2,\"\3\2\2\2,%\3\2\2\2,(\3\2\2\2,)\3\2\2\2-\61\3\2\2\2.\60"+
		"\t\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2"+
		"\2\63\61\3\2\2\2\64\65\7\b\2\2\65\3\3\2\2\2\66\67\5\f\7\2\679\7\t\2\2"+
		"8:\7\4\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\5\26\f\2<\5\3\2\2\2=>\5\f\7"+
		"\2>\7\3\2\2\2?A\7\4\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BD\7\n\2\2CE\7\4"+
		"\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\13\2\2G\t\3\2\2\2HI\5\f\7\2IK\7"+
		"\t\2\2JL\7\4\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\5\26\f\2N\13\3\2\2\2"+
		"OP\b\7\1\2PQ\5\16\b\2QX\3\2\2\2RS\f\3\2\2ST\5\32\16\2TU\5\16\b\2UW\3\2"+
		"\2\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2ZX\3\2\2\2[\\\b"+
		"\b\1\2\\]\5\20\t\2]d\3\2\2\2^_\f\3\2\2_`\5\34\17\2`a\5\20\t\2ac\3\2\2"+
		"\2b^\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\17\3\2\2\2fd\3\2\2\2gm\5\22"+
		"\n\2hi\5\36\20\2ij\5\f\7\2jk\5 \21\2km\3\2\2\2lg\3\2\2\2lh\3\2\2\2m\21"+
		"\3\2\2\2np\7\4\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\5\24\13\2rt\7\4\2\2"+
		"sr\3\2\2\2st\3\2\2\2t}\3\2\2\2uw\7\4\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2"+
		"xz\5\30\r\2y{\7\4\2\2zy\3\2\2\2z{\3\2\2\2{}\3\2\2\2|o\3\2\2\2|v\3\2\2"+
		"\2}\23\3\2\2\2~\177\7\f\2\2\177\25\3\2\2\2\u0080\u0081\7\f\2\2\u0081\27"+
		"\3\2\2\2\u0082\u0083\7\r\2\2\u0083\31\3\2\2\2\u0084\u0085\7\16\2\2\u0085"+
		"\33\3\2\2\2\u0086\u0087\7\17\2\2\u0087\35\3\2\2\2\u0088\u0089\7\20\2\2"+
		"\u0089\37\3\2\2\2\u008a\u008b\7\21\2\2\u008b!\3\2\2\2\20,\619@DKXdlos"+
		"vz|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}