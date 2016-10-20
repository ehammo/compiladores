// Generated from gramatica.g4 by ANTLR 4.4
package gramatica;

  import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'new'", "'return'", "'class'", "'while'", 
		"';'", "'void'", "'{'", "'&&'", "'='", "'extends'", "'}'", "'if'", "'int'", 
		"'('", "'False'", "'*'", "'this'", "','", "'.'", "'boolean'", "'System.out.println'", 
		"'['", "'<'", "'String'", "']'", "'public'", "'True'", "'!'", "'static'", 
		"'else'", "')'", "'+'", "'-'", "IntegerLiteral", "ID", "Espacos"
	};
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclarationList = 2, RULE_classDeclaration = 3, 
		RULE_varDeclaration = 4, RULE_varDeclarationList = 5, RULE_methodDeclarationList = 6, 
		RULE_methodDeclaration = 7, RULE_formalList = 8, RULE_formal = 9, RULE_statement = 10, 
		RULE_statementList = 11, RULE_expression = 12, RULE_expressionList = 13, 
		RULE_identifier = 14, RULE_type = 15;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclarationList", "classDeclaration", "varDeclaration", 
		"varDeclarationList", "methodDeclarationList", "methodDeclaration", "formalList", 
		"formal", "statement", "statementList", "expression", "expressionList", 
		"identifier", "type"
	};

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public Program p;
		public MainClassContext mainClass;
		public ClassDeclarationListContext classDeclarationList;
		public TerminalNode EOF() { return getToken(gramaticaParser.EOF, 0); }
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); ((GoalContext)_localctx).mainClass = mainClass();
			setState(33); ((GoalContext)_localctx).classDeclarationList = classDeclarationList();
			setState(34); match(EOF);
			((GoalContext)_localctx).p =  new Program(((GoalContext)_localctx).mainClass.m, ((GoalContext)_localctx).classDeclarationList.cdl );
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

	public static class MainClassContext extends ParserRuleContext {
		public MainClass m;
		public IdentifierContext i1;
		public IdentifierContext i2;
		public StatementContext s;
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(T__30);
			setState(38); ((MainClassContext)_localctx).i1 = identifier();
			setState(39); match(T__26);
			setState(40); match(T__7);
			setState(41); match(T__4);
			setState(42); match(T__27);
			setState(43); match(T__34);
			setState(44); match(T__19);
			setState(45); match(T__9);
			setState(46); match(T__11);
			setState(47); match(T__8);
			setState(48); ((MainClassContext)_localctx).i2 = identifier();
			setState(49); match(T__2);
			setState(50); match(T__26);
			setState(51); ((MainClassContext)_localctx).s = statement();
			setState(52); match(T__22);
			setState(53); match(T__22);
			((MainClassContext)_localctx).m =  new MainClass(((MainClassContext)_localctx).i1.id,((MainClassContext)_localctx).i2.id,((MainClassContext)_localctx).s.s);
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

	public static class ClassDeclarationListContext extends ParserRuleContext {
		public ClassDeclList cdl;
		public ClassDeclarationContext cd;
		public ClassDeclarationListContext c;
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public ClassDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterClassDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitClassDeclarationList(this);
		}
	}

	public final ClassDeclarationListContext classDeclarationList() throws RecognitionException {
		ClassDeclarationListContext _localctx = new ClassDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclarationList);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); ((ClassDeclarationListContext)_localctx).cd = classDeclaration();
				setState(57); ((ClassDeclarationListContext)_localctx).c = classDeclarationList();
				((ClassDeclarationListContext)_localctx).c.cdl.addElement(((ClassDeclarationListContext)_localctx).cd.cd);((ClassDeclarationListContext)_localctx).cdl = ((ClassDeclarationListContext)_localctx).c.cdl;
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				((ClassDeclarationListContext)_localctx).cdl =  new ClassDeclList();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDecl cd;
		public IdentifierContext i1;
		public VarDeclarationListContext v;
		public MethodDeclarationListContext md;
		public IdentifierContext i2;
		public MethodDeclarationListContext methodDeclarationList() {
			return getRuleContext(MethodDeclarationListContext.class,0);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		try {
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(T__30);
				setState(64); ((ClassDeclarationContext)_localctx).i1 = identifier();
				setState(65); match(T__26);
				setState(66); ((ClassDeclarationContext)_localctx).v = varDeclarationList(0);
				setState(67); ((ClassDeclarationContext)_localctx).md = methodDeclarationList();
				setState(68); match(T__22);
				((ClassDeclarationContext)_localctx).cd =  new ClassDeclSimple(((ClassDeclarationContext)_localctx).i1.id,((ClassDeclarationContext)_localctx).v.varl,((ClassDeclarationContext)_localctx).md.mdl);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); match(T__30);
				setState(72); ((ClassDeclarationContext)_localctx).i1 = identifier();
				setState(73); match(T__23);
				setState(74); ((ClassDeclarationContext)_localctx).i2 = identifier();
				setState(75); match(T__26);
				setState(76); ((ClassDeclarationContext)_localctx).v = varDeclarationList(0);
				setState(77); ((ClassDeclarationContext)_localctx).md = methodDeclarationList();
				setState(78); match(T__22);
				((ClassDeclarationContext)_localctx).cd =  new ClassDeclExtends(((ClassDeclarationContext)_localctx).i1.id,((ClassDeclarationContext)_localctx).i2.id,((ClassDeclarationContext)_localctx).v.varl,((ClassDeclarationContext)_localctx).md.mdl);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDecl var;
		public TypeContext t1;
		public IdentifierContext i;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); ((VarDeclarationContext)_localctx).t1 = type();
			setState(84); ((VarDeclarationContext)_localctx).i = identifier();
			setState(85); match(T__28);
			((VarDeclarationContext)_localctx).var =  new VarDecl(((VarDeclarationContext)_localctx).t1.t,((VarDeclarationContext)_localctx).i.id);
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

	public static class VarDeclarationListContext extends ParserRuleContext {
		public VarDeclList varl;
		public VarDeclarationListContext vl;
		public VarDeclarationContext v;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public VarDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarDeclarationList(this);
		}
	}

	public final VarDeclarationListContext varDeclarationList() throws RecognitionException {
		return varDeclarationList(0);
	}

	private VarDeclarationListContext varDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarDeclarationListContext _localctx = new VarDeclarationListContext(_ctx, _parentState);
		VarDeclarationListContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_varDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			((VarDeclarationListContext)_localctx).varl =  new VarDeclList();
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarDeclarationListContext(_parentctx, _parentState);
					_localctx.vl = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_varDeclarationList);
					setState(91);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(92); ((VarDeclarationListContext)_localctx).v = varDeclaration();
					((VarDeclarationListContext)_localctx).vl.varl.addElement(((VarDeclarationListContext)_localctx).v.var);((VarDeclarationListContext)_localctx).varl = ((VarDeclarationListContext)_localctx).vl.varl;
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class MethodDeclarationListContext extends ParserRuleContext {
		public MethodDeclList mdl;
		public MethodDeclarationContext md;
		public MethodDeclarationListContext m;
		public MethodDeclarationListContext methodDeclarationList() {
			return getRuleContext(MethodDeclarationListContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMethodDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMethodDeclarationList(this);
		}
	}

	public final MethodDeclarationListContext methodDeclarationList() throws RecognitionException {
		MethodDeclarationListContext _localctx = new MethodDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclarationList);
		try {
			setState(105);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); ((MethodDeclarationListContext)_localctx).md = methodDeclaration();
				setState(101); ((MethodDeclarationListContext)_localctx).m = methodDeclarationList();
				((MethodDeclarationListContext)_localctx).m.mdl.addElement(((MethodDeclarationListContext)_localctx).md.md);((MethodDeclarationListContext)_localctx).mdl = ((MethodDeclarationListContext)_localctx).m.mdl;
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				((MethodDeclarationListContext)_localctx).mdl =  new MethodDeclList();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDecl md;
		public TypeContext t1;
		public IdentifierContext i;
		public FormalListContext f;
		public VarDeclarationListContext v;
		public StatementListContext s;
		public ExpressionContext e;
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(T__7);
			setState(108); ((MethodDeclarationContext)_localctx).t1 = type();
			setState(109); ((MethodDeclarationContext)_localctx).i = identifier();
			setState(110); match(T__19);
			setState(111); ((MethodDeclarationContext)_localctx).f = formalList();
			setState(112); match(T__2);
			setState(113); match(T__26);
			setState(114); ((MethodDeclarationContext)_localctx).v = varDeclarationList(0);
			setState(115); ((MethodDeclarationContext)_localctx).s = statementList();
			setState(116); match(T__31);
			setState(117); ((MethodDeclarationContext)_localctx).e = expression(0);
			setState(118); match(T__28);
			setState(119); match(T__22);
			((MethodDeclarationContext)_localctx).md =  new MethodDecl(((MethodDeclarationContext)_localctx).t1.t,((MethodDeclarationContext)_localctx).i.id,((MethodDeclarationContext)_localctx).f.fl,((MethodDeclarationContext)_localctx).v.varl,((MethodDeclarationContext)_localctx).s.stm,((MethodDeclarationContext)_localctx).e.expr);
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

	public static class FormalListContext extends ParserRuleContext {
		public FormalList fl;
		public FormalContext f;
		public FormalListContext ft;
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public FormalContext formal() {
			return getRuleContext(FormalContext.class,0);
		}
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormalList(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalList);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); ((FormalListContext)_localctx).f = formal();
				setState(123); match(T__15);
				setState(124); ((FormalListContext)_localctx).ft = formalList();
				((FormalListContext)_localctx).ft.fl.addElement(((FormalListContext)_localctx).f.f); ((FormalListContext)_localctx).fl = ((FormalListContext)_localctx).ft.fl;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); ((FormalListContext)_localctx).f = formal();
				((FormalListContext)_localctx).fl = new FormalList();_localctx.fl.addElement(((FormalListContext)_localctx).f.f);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((FormalListContext)_localctx).fl = new FormalList();
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

	public static class FormalContext extends ParserRuleContext {
		public Formal f;
		public TypeContext t1;
		public IdentifierContext i;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); ((FormalContext)_localctx).t1 = type();
			setState(134); ((FormalContext)_localctx).i = identifier();
			((FormalContext)_localctx).f =  new Formal(((FormalContext)_localctx).t1.t,((FormalContext)_localctx).i.id);
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

	public static class StatementContext extends ParserRuleContext {
		public Statement s;
		public StatementListContext stm;
		public ExpressionContext e;
		public StatementContext st1;
		public StatementContext st2;
		public IdentifierContext i;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(T__26);
				setState(138); ((StatementContext)_localctx).stm = statementList();
				setState(139); match(T__22);
				((StatementContext)_localctx).s =  new Block(((StatementContext)_localctx).stm.stm);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); match(T__21);
				setState(143); match(T__19);
				setState(144); ((StatementContext)_localctx).e = expression(0);
				setState(145); match(T__2);
				setState(146); ((StatementContext)_localctx).st1 = statement();
				setState(147); match(T__3);
				setState(148); ((StatementContext)_localctx).st2 = statement();
				((StatementContext)_localctx).s =  new If(((StatementContext)_localctx).e.expr,((StatementContext)_localctx).st1.s,((StatementContext)_localctx).st2.s);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151); match(T__29);
				setState(152); match(T__19);
				setState(153); ((StatementContext)_localctx).e = expression(0);
				setState(154); match(T__2);
				setState(155); ((StatementContext)_localctx).st1 = statement();
				((StatementContext)_localctx).s =  new While(((StatementContext)_localctx).e.expr,((StatementContext)_localctx).st1.s);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158); match(T__12);
				setState(159); match(T__19);
				setState(160); ((StatementContext)_localctx).e = expression(0);
				setState(161); match(T__2);
				setState(162); match(T__28);
				((StatementContext)_localctx).s =  new Print(((StatementContext)_localctx).e.expr);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165); ((StatementContext)_localctx).i = identifier();
				setState(166); match(T__24);
				setState(167); ((StatementContext)_localctx).e = expression(0);
				setState(168); match(T__28);
				((StatementContext)_localctx).s =  new Assign(((StatementContext)_localctx).i.id,((StatementContext)_localctx).e.expr);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171); ((StatementContext)_localctx).i = identifier();
				setState(172); match(T__11);
				setState(173); ((StatementContext)_localctx).e1 = expression(0);
				setState(174); match(T__8);
				setState(175); match(T__24);
				setState(176); ((StatementContext)_localctx).e2 = expression(0);
				setState(177); match(T__28);
				((StatementContext)_localctx).s =  new ArrayAssign(((StatementContext)_localctx).i.id, ((StatementContext)_localctx).e1.expr, ((StatementContext)_localctx).e2.expr);
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

	public static class StatementListContext extends ParserRuleContext {
		public StatementList stm;
		public StatementContext s;
		public StatementListContext sl;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementList);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case T__29:
			case T__26:
			case T__21:
			case T__12:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); ((StatementListContext)_localctx).s = statement();
				setState(183); ((StatementListContext)_localctx).sl = statementList();
				((StatementListContext)_localctx).sl.stm.addElement(((StatementListContext)_localctx).s.s); ((StatementListContext)_localctx).stm = ((StatementListContext)_localctx).sl.stm;
				}
				break;
			case T__31:
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				((StatementListContext)_localctx).stm =  new StatementList();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Exp expr;
		public ExpressionContext e1;
		public ExpressionContext e;
		public Token i1;
		public IdentifierContext i;
		public ExpressionContext e2;
		public ExpressionListContext el;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(gramaticaParser.IntegerLiteral, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(190); match(T__5);
				setState(191); ((ExpressionContext)_localctx).e = expression(2);
				((ExpressionContext)_localctx).expr =  new Not(((ExpressionContext)_localctx).e.expr);
				}
				break;
			case 2:
				{
				setState(194); ((ExpressionContext)_localctx).i1 = match(IntegerLiteral);
				((ExpressionContext)_localctx).expr =  new IntegerLiteral(Integer.parseInt((((ExpressionContext)_localctx).i1!=null?((ExpressionContext)_localctx).i1.getText():null)));
				}
				break;
			case 3:
				{
				setState(196); match(T__6);
				((ExpressionContext)_localctx).expr =  new True();
				}
				break;
			case 4:
				{
				setState(198); match(T__18);
				((ExpressionContext)_localctx).expr =  new False();
				}
				break;
			case 5:
				{
				setState(200); ((ExpressionContext)_localctx).i = identifier();
				((ExpressionContext)_localctx).expr =  new IdentifierExp(((ExpressionContext)_localctx).i.id.s);
				}
				break;
			case 6:
				{
				setState(203); match(T__16);
				((ExpressionContext)_localctx).expr =  new This();
				}
				break;
			case 7:
				{
				setState(205); match(T__32);
				setState(206); match(T__20);
				setState(207); match(T__11);
				setState(208); ((ExpressionContext)_localctx).e = expression(0);
				setState(209); match(T__8);
				((ExpressionContext)_localctx).expr =  new NewArray(((ExpressionContext)_localctx).e.expr);
				}
				break;
			case 8:
				{
				setState(212); match(T__32);
				setState(213); ((ExpressionContext)_localctx).i = identifier();
				setState(214); match(T__19);
				setState(215); match(T__2);
				((ExpressionContext)_localctx).expr =  new NewObject(((ExpressionContext)_localctx).i.id);
				}
				break;
			case 9:
				{
				setState(218); match(T__19);
				setState(219); ((ExpressionContext)_localctx).e = expression(0);
				setState(220); match(T__2);
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).e.expr;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(268);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(226); match(T__25);
						setState(227); ((ExpressionContext)_localctx).e2 = expression(18);
						((ExpressionContext)_localctx).expr =  new And(((ExpressionContext)_localctx).e1.expr,((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(231); match(T__17);
						setState(232); ((ExpressionContext)_localctx).e2 = expression(17);
						((ExpressionContext)_localctx).expr =  new Times(((ExpressionContext)_localctx).e1.expr,((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(236); match(T__1);
						setState(237); ((ExpressionContext)_localctx).e2 = expression(16);
						((ExpressionContext)_localctx).expr =  new Plus(((ExpressionContext)_localctx).e1.expr,((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(241); match(T__0);
						setState(242); ((ExpressionContext)_localctx).e2 = expression(15);
						((ExpressionContext)_localctx).expr =  new Minus(((ExpressionContext)_localctx).e1.expr,((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(246); match(T__10);
						setState(247); ((ExpressionContext)_localctx).e2 = expression(14);
						((ExpressionContext)_localctx).expr =  new LessThan(((ExpressionContext)_localctx).e1.expr,((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(251); match(T__11);
						setState(252); ((ExpressionContext)_localctx).e2 = expression(0);
						setState(253); match(T__8);
						((ExpressionContext)_localctx).expr =  new ArrayLookup(((ExpressionContext)_localctx).e1.expr,((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(257); match(T__14);
						setState(258); match(T__33);
						((ExpressionContext)_localctx).expr =  new ArrayLength(((ExpressionContext)_localctx).e1.expr);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(261); match(T__14);
						setState(262); ((ExpressionContext)_localctx).i = identifier();
						setState(263); match(T__19);
						setState(264); ((ExpressionContext)_localctx).el = expressionList();
						setState(265); match(T__2);
						((ExpressionContext)_localctx).expr =  new Call(((ExpressionContext)_localctx).e.expr,((ExpressionContext)_localctx).i.id,((ExpressionContext)_localctx).el.el);
						}
						break;
					}
					} 
				}
				setState(272);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpList el;
		public ExpressionContext e;
		public ExpressionListContext expl;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionList);
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); ((ExpressionListContext)_localctx).e = expression(0);
				setState(274); match(T__15);
				setState(275); ((ExpressionListContext)_localctx).expl = expressionList();
				((ExpressionListContext)_localctx).expl.el.addElement(((ExpressionListContext)_localctx).e.expr);((ExpressionListContext)_localctx).el = ((ExpressionListContext)_localctx).expl.el;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); ((ExpressionListContext)_localctx).e = expression(0);
				((ExpressionListContext)_localctx).el =  new ExpList(); _localctx.el.addElement(((ExpressionListContext)_localctx).e.expr);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((ExpressionListContext)_localctx).el =  new ExpList();
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier id;
		public Token ID;
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); ((IdentifierContext)_localctx).ID = match(ID);
			((IdentifierContext)_localctx).id = new Identifier((((IdentifierContext)_localctx).ID!=null?((IdentifierContext)_localctx).ID.getText():null));
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

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public Token ID;
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		try {
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287); match(T__20);
				setState(288); match(T__11);
				setState(289); match(T__8);
				((TypeContext)_localctx).t =  new IntArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291); match(T__13);
				((TypeContext)_localctx).t =  new BooleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293); match(T__20);
				((TypeContext)_localctx).t =  new IntegerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295); ((TypeContext)_localctx).ID = match(ID);
				((TypeContext)_localctx).t =  new IdentifierType((((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return varDeclarationList_sempred((VarDeclarationListContext)_localctx, predIndex);
		case 12: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean varDeclarationList_sempred(VarDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 17);
		case 2: return precpred(_ctx, 16);
		case 3: return precpred(_ctx, 15);
		case 4: return precpred(_ctx, 14);
		case 5: return precpred(_ctx, 13);
		case 6: return precpred(_ctx, 12);
		case 7: return precpred(_ctx, 11);
		case 8: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7b\n\7\f\7\16\7e\13\7\3\b\3\b\3"+
		"\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0086\n\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b7\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00be\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e2\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u010f\n\16\f\16\16\16\u0112\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u011d\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u012c\n\21\3\21\2\4\f\32\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\2\u013e\2\"\3\2\2\2\4\'\3\2\2\2\6?\3\2"+
		"\2\2\bS\3\2\2\2\nU\3\2\2\2\fZ\3\2\2\2\16k\3\2\2\2\20m\3\2\2\2\22\u0085"+
		"\3\2\2\2\24\u0087\3\2\2\2\26\u00b6\3\2\2\2\30\u00bd\3\2\2\2\32\u00e1\3"+
		"\2\2\2\34\u011c\3\2\2\2\36\u011e\3\2\2\2 \u012b\3\2\2\2\"#\5\4\3\2#$\5"+
		"\6\4\2$%\7\2\2\3%&\b\2\1\2&\3\3\2\2\2\'(\7\7\2\2()\5\36\20\2)*\7\13\2"+
		"\2*+\7\36\2\2+,\7!\2\2,-\7\n\2\2-.\7\3\2\2./\7\22\2\2/\60\7\34\2\2\60"+
		"\61\7\32\2\2\61\62\7\35\2\2\62\63\5\36\20\2\63\64\7#\2\2\64\65\7\13\2"+
		"\2\65\66\5\26\f\2\66\67\7\17\2\2\678\7\17\2\289\b\3\1\29\5\3\2\2\2:;\5"+
		"\b\5\2;<\5\6\4\2<=\b\4\1\2=@\3\2\2\2>@\b\4\1\2?:\3\2\2\2?>\3\2\2\2@\7"+
		"\3\2\2\2AB\7\7\2\2BC\5\36\20\2CD\7\13\2\2DE\5\f\7\2EF\5\16\b\2FG\7\17"+
		"\2\2GH\b\5\1\2HT\3\2\2\2IJ\7\7\2\2JK\5\36\20\2KL\7\16\2\2LM\5\36\20\2"+
		"MN\7\13\2\2NO\5\f\7\2OP\5\16\b\2PQ\7\17\2\2QR\b\5\1\2RT\3\2\2\2SA\3\2"+
		"\2\2SI\3\2\2\2T\t\3\2\2\2UV\5 \21\2VW\5\36\20\2WX\7\t\2\2XY\b\6\1\2Y\13"+
		"\3\2\2\2Z[\b\7\1\2[\\\b\7\1\2\\c\3\2\2\2]^\f\4\2\2^_\5\n\6\2_`\b\7\1\2"+
		"`b\3\2\2\2a]\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\r\3\2\2\2ec\3\2\2"+
		"\2fg\5\20\t\2gh\5\16\b\2hi\b\b\1\2il\3\2\2\2jl\b\b\1\2kf\3\2\2\2kj\3\2"+
		"\2\2l\17\3\2\2\2mn\7\36\2\2no\5 \21\2op\5\36\20\2pq\7\22\2\2qr\5\22\n"+
		"\2rs\7#\2\2st\7\13\2\2tu\5\f\7\2uv\5\30\r\2vw\7\6\2\2wx\5\32\16\2xy\7"+
		"\t\2\2yz\7\17\2\2z{\b\t\1\2{\21\3\2\2\2|}\5\24\13\2}~\7\26\2\2~\177\5"+
		"\22\n\2\177\u0080\b\n\1\2\u0080\u0086\3\2\2\2\u0081\u0082\5\24\13\2\u0082"+
		"\u0083\b\n\1\2\u0083\u0086\3\2\2\2\u0084\u0086\b\n\1\2\u0085|\3\2\2\2"+
		"\u0085\u0081\3\2\2\2\u0085\u0084\3\2\2\2\u0086\23\3\2\2\2\u0087\u0088"+
		"\5 \21\2\u0088\u0089\5\36\20\2\u0089\u008a\b\13\1\2\u008a\25\3\2\2\2\u008b"+
		"\u008c\7\13\2\2\u008c\u008d\5\30\r\2\u008d\u008e\7\17\2\2\u008e\u008f"+
		"\b\f\1\2\u008f\u00b7\3\2\2\2\u0090\u0091\7\20\2\2\u0091\u0092\7\22\2\2"+
		"\u0092\u0093\5\32\16\2\u0093\u0094\7#\2\2\u0094\u0095\5\26\f\2\u0095\u0096"+
		"\7\"\2\2\u0096\u0097\5\26\f\2\u0097\u0098\b\f\1\2\u0098\u00b7\3\2\2\2"+
		"\u0099\u009a\7\b\2\2\u009a\u009b\7\22\2\2\u009b\u009c\5\32\16\2\u009c"+
		"\u009d\7#\2\2\u009d\u009e\5\26\f\2\u009e\u009f\b\f\1\2\u009f\u00b7\3\2"+
		"\2\2\u00a0\u00a1\7\31\2\2\u00a1\u00a2\7\22\2\2\u00a2\u00a3\5\32\16\2\u00a3"+
		"\u00a4\7#\2\2\u00a4\u00a5\7\t\2\2\u00a5\u00a6\b\f\1\2\u00a6\u00b7\3\2"+
		"\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00a9\7\r\2\2\u00a9\u00aa\5\32\16\2\u00aa"+
		"\u00ab\7\t\2\2\u00ab\u00ac\b\f\1\2\u00ac\u00b7\3\2\2\2\u00ad\u00ae\5\36"+
		"\20\2\u00ae\u00af\7\32\2\2\u00af\u00b0\5\32\16\2\u00b0\u00b1\7\35\2\2"+
		"\u00b1\u00b2\7\r\2\2\u00b2\u00b3\5\32\16\2\u00b3\u00b4\7\t\2\2\u00b4\u00b5"+
		"\b\f\1\2\u00b5\u00b7\3\2\2\2\u00b6\u008b\3\2\2\2\u00b6\u0090\3\2\2\2\u00b6"+
		"\u0099\3\2\2\2\u00b6\u00a0\3\2\2\2\u00b6\u00a7\3\2\2\2\u00b6\u00ad\3\2"+
		"\2\2\u00b7\27\3\2\2\2\u00b8\u00b9\5\26\f\2\u00b9\u00ba\5\30\r\2\u00ba"+
		"\u00bb\b\r\1\2\u00bb\u00be\3\2\2\2\u00bc\u00be\b\r\1\2\u00bd\u00b8\3\2"+
		"\2\2\u00bd\u00bc\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c0\b\16\1\2\u00c0\u00c1"+
		"\7 \2\2\u00c1\u00c2\5\32\16\4\u00c2\u00c3\b\16\1\2\u00c3\u00e2\3\2\2\2"+
		"\u00c4\u00c5\7&\2\2\u00c5\u00e2\b\16\1\2\u00c6\u00c7\7\37\2\2\u00c7\u00e2"+
		"\b\16\1\2\u00c8\u00c9\7\23\2\2\u00c9\u00e2\b\16\1\2\u00ca\u00cb\5\36\20"+
		"\2\u00cb\u00cc\b\16\1\2\u00cc\u00e2\3\2\2\2\u00cd\u00ce\7\25\2\2\u00ce"+
		"\u00e2\b\16\1\2\u00cf\u00d0\7\5\2\2\u00d0\u00d1\7\21\2\2\u00d1\u00d2\7"+
		"\32\2\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4\7\35\2\2\u00d4\u00d5\b\16\1"+
		"\2\u00d5\u00e2\3\2\2\2\u00d6\u00d7\7\5\2\2\u00d7\u00d8\5\36\20\2\u00d8"+
		"\u00d9\7\22\2\2\u00d9\u00da\7#\2\2\u00da\u00db\b\16\1\2\u00db\u00e2\3"+
		"\2\2\2\u00dc\u00dd\7\22\2\2\u00dd\u00de\5\32\16\2\u00de\u00df\7#\2\2\u00df"+
		"\u00e0\b\16\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00bf\3\2\2\2\u00e1\u00c4\3"+
		"\2\2\2\u00e1\u00c6\3\2\2\2\u00e1\u00c8\3\2\2\2\u00e1\u00ca\3\2\2\2\u00e1"+
		"\u00cd\3\2\2\2\u00e1\u00cf\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1\u00dc\3\2"+
		"\2\2\u00e2\u0110\3\2\2\2\u00e3\u00e4\f\23\2\2\u00e4\u00e5\7\f\2\2\u00e5"+
		"\u00e6\5\32\16\24\u00e6\u00e7\b\16\1\2\u00e7\u010f\3\2\2\2\u00e8\u00e9"+
		"\f\22\2\2\u00e9\u00ea\7\24\2\2\u00ea\u00eb\5\32\16\23\u00eb\u00ec\b\16"+
		"\1\2\u00ec\u010f\3\2\2\2\u00ed\u00ee\f\21\2\2\u00ee\u00ef\7$\2\2\u00ef"+
		"\u00f0\5\32\16\22\u00f0\u00f1\b\16\1\2\u00f1\u010f\3\2\2\2\u00f2\u00f3"+
		"\f\20\2\2\u00f3\u00f4\7%\2\2\u00f4\u00f5\5\32\16\21\u00f5\u00f6\b\16\1"+
		"\2\u00f6\u010f\3\2\2\2\u00f7\u00f8\f\17\2\2\u00f8\u00f9\7\33\2\2\u00f9"+
		"\u00fa\5\32\16\20\u00fa\u00fb\b\16\1\2\u00fb\u010f\3\2\2\2\u00fc\u00fd"+
		"\f\16\2\2\u00fd\u00fe\7\32\2\2\u00fe\u00ff\5\32\16\2\u00ff\u0100\7\35"+
		"\2\2\u0100\u0101\b\16\1\2\u0101\u010f\3\2\2\2\u0102\u0103\f\r\2\2\u0103"+
		"\u0104\7\27\2\2\u0104\u0105\7\4\2\2\u0105\u010f\b\16\1\2\u0106\u0107\f"+
		"\f\2\2\u0107\u0108\7\27\2\2\u0108\u0109\5\36\20\2\u0109\u010a\7\22\2\2"+
		"\u010a\u010b\5\34\17\2\u010b\u010c\7#\2\2\u010c\u010d\b\16\1\2\u010d\u010f"+
		"\3\2\2\2\u010e\u00e3\3\2\2\2\u010e\u00e8\3\2\2\2\u010e\u00ed\3\2\2\2\u010e"+
		"\u00f2\3\2\2\2\u010e\u00f7\3\2\2\2\u010e\u00fc\3\2\2\2\u010e\u0102\3\2"+
		"\2\2\u010e\u0106\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\33\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\5\32\16"+
		"\2\u0114\u0115\7\26\2\2\u0115\u0116\5\34\17\2\u0116\u0117\b\17\1\2\u0117"+
		"\u011d\3\2\2\2\u0118\u0119\5\32\16\2\u0119\u011a\b\17\1\2\u011a\u011d"+
		"\3\2\2\2\u011b\u011d\b\17\1\2\u011c\u0113\3\2\2\2\u011c\u0118\3\2\2\2"+
		"\u011c\u011b\3\2\2\2\u011d\35\3\2\2\2\u011e\u011f\7\'\2\2\u011f\u0120"+
		"\b\20\1\2\u0120\37\3\2\2\2\u0121\u0122\7\21\2\2\u0122\u0123\7\32\2\2\u0123"+
		"\u0124\7\35\2\2\u0124\u012c\b\21\1\2\u0125\u0126\7\30\2\2\u0126\u012c"+
		"\b\21\1\2\u0127\u0128\7\21\2\2\u0128\u012c\b\21\1\2\u0129\u012a\7\'\2"+
		"\2\u012a\u012c\b\21\1\2\u012b\u0121\3\2\2\2\u012b\u0125\3\2\2\2\u012b"+
		"\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012c!\3\2\2\2\16?Sck\u0085\u00b6\u00bd"+
		"\u00e1\u010e\u0110\u011c\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}