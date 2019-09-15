// Generated from main/mc/parser/MC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOLEANTYPE=2, BREAK=3, CONTINUE=4, ELSE=5, FOR=6, FLOATTYPE=7, 
		IF=8, INTTYPE=9, RETURN=10, VOIDTYPE=11, DO=12, WHILE=13, TRUE=14, FALSE=15, 
		STRINGTYPE=16, ID=17, ADD=18, SUB=19, MUL=20, DIV=21, NOT=22, MOD=23, 
		OR=24, AND=25, NEQ=26, EQ=27, LESS=28, GRATER=29, LEQ=30, GEQ=31, ASSIGN=32, 
		INTLIT=33, FLOATLIT=34, BOOLEANLIT=35, STRINGLIT=36, LP=37, RP=38, LB=39, 
		RB=40, LSB=41, RSB=42, DOT=43, SEMI=44, CM=45, UNDERSCORE=46, BLOCK_COMMENT=47, 
		LINE_COMMENT=48, WS=49, ILLEGAL_ESCAPE=50, UNCLOSE_STRING=51, ERROR_CHAR=52;
	public static final int
		RULE_program = 0, RULE_manydecls = 1, RULE_decl = 2, RULE_variable_decl = 3, 
		RULE_primitive_type = 4, RULE_many_variables = 5, RULE_variable = 6, RULE_function_decl = 7, 
		RULE_func_type = 8, RULE_parameter_list = 9, RULE_parameter_tail = 10, 
		RULE_parameter_decl = 11, RULE_var_stmt_list = 12, RULE_var_stmt_tail = 13, 
		RULE_var_stmt = 14, RULE_array = 15, RULE_array_pointer_type = 16, RULE_input_para = 17, 
		RULE_output_para = 18, RULE_expr = 19, RULE_expr1 = 20, RULE_expr2 = 21, 
		RULE_expr3 = 22, RULE_expr4 = 23, RULE_expr5 = 24, RULE_expr6 = 25, RULE_expr7 = 26, 
		RULE_expr8 = 27, RULE_expr9 = 28, RULE_operands = 29, RULE_literal = 30, 
		RULE_array_element = 31, RULE_func_call = 32, RULE_exprlist = 33, RULE_exprtail = 34, 
		RULE_statement = 35, RULE_if_stmt = 36, RULE_if_else = 37, RULE_if_no_else = 38, 
		RULE_dowhile_stmt = 39, RULE_for_stmt = 40, RULE_break_stmt = 41, RULE_continue_stmt = 42, 
		RULE_return_stmt = 43, RULE_expr_stmt = 44, RULE_block_statement = 45, 
		RULE_main_function = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "manydecls", "decl", "variable_decl", "primitive_type", "many_variables", 
			"variable", "function_decl", "func_type", "parameter_list", "parameter_tail", 
			"parameter_decl", "var_stmt_list", "var_stmt_tail", "var_stmt", "array", 
			"array_pointer_type", "input_para", "output_para", "expr", "expr1", "expr2", 
			"expr3", "expr4", "expr5", "expr6", "expr7", "expr8", "expr9", "operands", 
			"literal", "array_element", "func_call", "exprlist", "exprtail", "statement", 
			"if_stmt", "if_else", "if_no_else", "dowhile_stmt", "for_stmt", "break_stmt", 
			"continue_stmt", "return_stmt", "expr_stmt", "block_statement", "main_function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'boolean'", "'break'", "'continue'", "'else'", "'for'", 
			"'float'", "'if'", "'int'", "'return'", "'void'", "'do'", "'while'", 
			"'true'", "'false'", "'string'", null, "'+'", "'-'", "'*'", "'/'", "'!'", 
			"'%'", "'||'", "'&&'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", 
			"'='", null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'.'", "';'", "','", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOLEANTYPE", "BREAK", "CONTINUE", "ELSE", "FOR", "FLOATTYPE", 
			"IF", "INTTYPE", "RETURN", "VOIDTYPE", "DO", "WHILE", "TRUE", "FALSE", 
			"STRINGTYPE", "ID", "ADD", "SUB", "MUL", "DIV", "NOT", "MOD", "OR", "AND", 
			"NEQ", "EQ", "LESS", "GRATER", "LEQ", "GEQ", "ASSIGN", "INTLIT", "FLOATLIT", 
			"BOOLEANLIT", "STRINGLIT", "LP", "RP", "LB", "RB", "LSB", "RSB", "DOT", 
			"SEMI", "CM", "UNDERSCORE", "BLOCK_COMMENT", "LINE_COMMENT", "WS", "ILLEGAL_ESCAPE", 
			"UNCLOSE_STRING", "ERROR_CHAR"
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
	public String getGrammarFileName() { return "MC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ManydeclsContext manydecls() {
			return getRuleContext(ManydeclsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			manydecls();
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

	public static class ManydeclsContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ManydeclsContext manydecls() {
			return getRuleContext(ManydeclsContext.class,0);
		}
		public ManydeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manydecls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitManydecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManydeclsContext manydecls() throws RecognitionException {
		ManydeclsContext _localctx = new ManydeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_manydecls);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				decl();
				setState(97);
				manydecls();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				decl();
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

	public static class DeclContext extends ParserRuleContext {
		public Variable_declContext variable_decl() {
			return getRuleContext(Variable_declContext.class,0);
		}
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				variable_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				function_decl();
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

	public static class Variable_declContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Many_variablesContext many_variables() {
			return getRuleContext(Many_variablesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MCParser.SEMI, 0); }
		public Variable_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitVariable_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declContext variable_decl() throws RecognitionException {
		Variable_declContext _localctx = new Variable_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			primitive_type();
			setState(107);
			many_variables();
			setState(108);
			match(SEMI);
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

	public static class Primitive_typeContext extends ParserRuleContext {
		public TerminalNode INTTYPE() { return getToken(MCParser.INTTYPE, 0); }
		public TerminalNode FLOATTYPE() { return getToken(MCParser.FLOATTYPE, 0); }
		public TerminalNode BOOLEANTYPE() { return getToken(MCParser.BOOLEANTYPE, 0); }
		public TerminalNode STRINGTYPE() { return getToken(MCParser.STRINGTYPE, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitPrimitive_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANTYPE) | (1L << FLOATTYPE) | (1L << INTTYPE) | (1L << STRINGTYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Many_variablesContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode CM() { return getToken(MCParser.CM, 0); }
		public Many_variablesContext many_variables() {
			return getRuleContext(Many_variablesContext.class,0);
		}
		public Many_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_many_variables; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitMany_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Many_variablesContext many_variables() throws RecognitionException {
		Many_variablesContext _localctx = new Many_variablesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_many_variables);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				variable();
				setState(113);
				match(CM);
				setState(114);
				many_variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				variable();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public TerminalNode LSB() { return getToken(MCParser.LSB, 0); }
		public TerminalNode INTLIT() { return getToken(MCParser.INTLIT, 0); }
		public TerminalNode RSB() { return getToken(MCParser.RSB, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(120);
				match(LSB);
				setState(121);
				match(INTLIT);
				setState(122);
				match(RSB);
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

	public static class Function_declContext extends ParserRuleContext {
		public Func_typeContext func_type() {
			return getRuleContext(Func_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public TerminalNode LP() { return getToken(MCParser.LP, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RP() { return getToken(MCParser.RP, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitFunction_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			func_type();
			setState(126);
			match(ID);
			setState(127);
			match(LP);
			setState(128);
			parameter_list();
			setState(129);
			match(RP);
			setState(130);
			block_statement();
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

	public static class Func_typeContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode VOIDTYPE() { return getToken(MCParser.VOIDTYPE, 0); }
		public Array_pointer_typeContext array_pointer_type() {
			return getRuleContext(Array_pointer_typeContext.class,0);
		}
		public Func_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitFunc_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_typeContext func_type() throws RecognitionException {
		Func_typeContext _localctx = new Func_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_type);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				primitive_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(VOIDTYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				array_pointer_type();
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

	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_declContext parameter_decl() {
			return getRuleContext(Parameter_declContext.class,0);
		}
		public Parameter_tailContext parameter_tail() {
			return getRuleContext(Parameter_tailContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANTYPE) | (1L << FLOATTYPE) | (1L << INTTYPE) | (1L << STRINGTYPE))) != 0)) {
				{
				setState(137);
				parameter_decl();
				setState(138);
				parameter_tail();
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

	public static class Parameter_tailContext extends ParserRuleContext {
		public TerminalNode CM() { return getToken(MCParser.CM, 0); }
		public Parameter_declContext parameter_decl() {
			return getRuleContext(Parameter_declContext.class,0);
		}
		public Parameter_tailContext parameter_tail() {
			return getRuleContext(Parameter_tailContext.class,0);
		}
		public Parameter_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_tail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitParameter_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_tailContext parameter_tail() throws RecognitionException {
		Parameter_tailContext _localctx = new Parameter_tailContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CM) {
				{
				setState(142);
				match(CM);
				setState(143);
				parameter_decl();
				setState(144);
				parameter_tail();
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

	public static class Parameter_declContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public TerminalNode LSB() { return getToken(MCParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(MCParser.RSB, 0); }
		public Parameter_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitParameter_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declContext parameter_decl() throws RecognitionException {
		Parameter_declContext _localctx = new Parameter_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			primitive_type();
			setState(149);
			match(ID);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(150);
				match(LSB);
				setState(151);
				match(RSB);
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

	public static class Var_stmt_listContext extends ParserRuleContext {
		public Var_stmtContext var_stmt() {
			return getRuleContext(Var_stmtContext.class,0);
		}
		public Var_stmt_tailContext var_stmt_tail() {
			return getRuleContext(Var_stmt_tailContext.class,0);
		}
		public Var_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_stmt_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitVar_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_stmt_listContext var_stmt_list() throws RecognitionException {
		Var_stmt_listContext _localctx = new Var_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANTYPE) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << FLOATTYPE) | (1L << IF) | (1L << INTTYPE) | (1L << RETURN) | (1L << DO) | (1L << STRINGTYPE) | (1L << ID) | (1L << SUB) | (1L << NOT) | (1L << INTLIT) | (1L << FLOATLIT) | (1L << BOOLEANLIT) | (1L << STRINGLIT) | (1L << LP) | (1L << LB))) != 0)) {
				{
				setState(154);
				var_stmt();
				setState(155);
				var_stmt_tail();
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

	public static class Var_stmt_tailContext extends ParserRuleContext {
		public Var_stmtContext var_stmt() {
			return getRuleContext(Var_stmtContext.class,0);
		}
		public Var_stmt_tailContext var_stmt_tail() {
			return getRuleContext(Var_stmt_tailContext.class,0);
		}
		public Var_stmt_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_stmt_tail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitVar_stmt_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_stmt_tailContext var_stmt_tail() throws RecognitionException {
		Var_stmt_tailContext _localctx = new Var_stmt_tailContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_stmt_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANTYPE) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << FLOATTYPE) | (1L << IF) | (1L << INTTYPE) | (1L << RETURN) | (1L << DO) | (1L << STRINGTYPE) | (1L << ID) | (1L << SUB) | (1L << NOT) | (1L << INTLIT) | (1L << FLOATLIT) | (1L << BOOLEANLIT) | (1L << STRINGLIT) | (1L << LP) | (1L << LB))) != 0)) {
				{
				setState(159);
				var_stmt();
				setState(160);
				var_stmt_tail();
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

	public static class Var_stmtContext extends ParserRuleContext {
		public Variable_declContext variable_decl() {
			return getRuleContext(Variable_declContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Var_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitVar_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_stmtContext var_stmt() throws RecognitionException {
		Var_stmtContext _localctx = new Var_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_stmt);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANTYPE:
			case FLOATTYPE:
			case INTTYPE:
			case STRINGTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				variable_decl();
				}
				break;
			case BREAK:
			case CONTINUE:
			case FOR:
			case IF:
			case RETURN:
			case DO:
			case ID:
			case SUB:
			case NOT:
			case INTLIT:
			case FLOATLIT:
			case BOOLEANLIT:
			case STRINGLIT:
			case LP:
			case LB:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				statement();
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

	public static class ArrayContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode LSB() { return getToken(MCParser.LSB, 0); }
		public TerminalNode INTLIT() { return getToken(MCParser.INTLIT, 0); }
		public TerminalNode RSB() { return getToken(MCParser.RSB, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			primitive_type();
			setState(169);
			match(LSB);
			setState(170);
			match(INTLIT);
			setState(171);
			match(RSB);
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

	public static class Array_pointer_typeContext extends ParserRuleContext {
		public Input_paraContext input_para() {
			return getRuleContext(Input_paraContext.class,0);
		}
		public Output_paraContext output_para() {
			return getRuleContext(Output_paraContext.class,0);
		}
		public Array_pointer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_pointer_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitArray_pointer_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_pointer_typeContext array_pointer_type() throws RecognitionException {
		Array_pointer_typeContext _localctx = new Array_pointer_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_pointer_type);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				input_para();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				output_para();
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

	public static class Input_paraContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public TerminalNode LSB() { return getToken(MCParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(MCParser.RSB, 0); }
		public Input_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_para; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitInput_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_paraContext input_para() throws RecognitionException {
		Input_paraContext _localctx = new Input_paraContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_input_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			primitive_type();
			setState(178);
			match(ID);
			setState(179);
			match(LSB);
			setState(180);
			match(RSB);
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

	public static class Output_paraContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode LSB() { return getToken(MCParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(MCParser.RSB, 0); }
		public Output_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_para; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitOutput_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_paraContext output_para() throws RecognitionException {
		Output_paraContext _localctx = new Output_paraContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_output_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			primitive_type();
			setState(183);
			match(LSB);
			setState(184);
			match(RSB);
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

	public static class ExprContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MCParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				expr1(0);
				setState(187);
				match(ASSIGN);
				setState(188);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				expr1(0);
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

	public static class Expr1Context extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode OR() { return getToken(MCParser.OR, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		return expr1(0);
	}

	private Expr1Context expr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr1Context _localctx = new Expr1Context(_ctx, _parentState);
		Expr1Context _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			expr2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr1);
					setState(196);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(197);
					match(OR);
					setState(198);
					expr2(0);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode AND() { return getToken(MCParser.AND, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		return expr2(0);
	}

	private Expr2Context expr2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr2Context _localctx = new Expr2Context(_ctx, _parentState);
		Expr2Context _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(205);
			expr3();
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr2);
					setState(207);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(208);
					match(AND);
					setState(209);
					expr3();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Expr3Context extends ParserRuleContext {
		public List<Expr4Context> expr4() {
			return getRuleContexts(Expr4Context.class);
		}
		public Expr4Context expr4(int i) {
			return getRuleContext(Expr4Context.class,i);
		}
		public TerminalNode EQ() { return getToken(MCParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MCParser.NEQ, 0); }
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr3);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				expr4();
				setState(216);
				_la = _input.LA(1);
				if ( !(_la==NEQ || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(217);
				expr4();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				expr4();
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

	public static class Expr4Context extends ParserRuleContext {
		public List<Expr5Context> expr5() {
			return getRuleContexts(Expr5Context.class);
		}
		public Expr5Context expr5(int i) {
			return getRuleContext(Expr5Context.class,i);
		}
		public TerminalNode LESS() { return getToken(MCParser.LESS, 0); }
		public TerminalNode LEQ() { return getToken(MCParser.LEQ, 0); }
		public TerminalNode GRATER() { return getToken(MCParser.GRATER, 0); }
		public TerminalNode GEQ() { return getToken(MCParser.GEQ, 0); }
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpr4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr4);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				expr5(0);
				setState(223);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GRATER) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(224);
				expr5(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				expr5(0);
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

	public static class Expr5Context extends ParserRuleContext {
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public TerminalNode ADD() { return getToken(MCParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MCParser.SUB, 0); }
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpr5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr5Context expr5() throws RecognitionException {
		return expr5(0);
	}

	private Expr5Context expr5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr5Context _localctx = new Expr5Context(_ctx, _parentState);
		Expr5Context _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr5, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(230);
			expr6(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr5Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr5);
					setState(232);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(233);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(234);
					expr6(0);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Expr6Context extends ParserRuleContext {
		public Expr7Context expr7() {
			return getRuleContext(Expr7Context.class,0);
		}
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public TerminalNode DIV() { return getToken(MCParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(MCParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(MCParser.MOD, 0); }
		public Expr6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr6; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpr6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr6Context expr6() throws RecognitionException {
		return expr6(0);
	}

	private Expr6Context expr6(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr6Context _localctx = new Expr6Context(_ctx, _parentState);
		Expr6Context _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr6, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(241);
			expr7();
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr6Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr6);
					setState(243);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(244);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(245);
					expr7();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Expr7Context extends ParserRuleContext {
		public Expr7Context expr7() {
			return getRuleContext(Expr7Context.class,0);
		}
		public TerminalNode SUB() { return getToken(MCParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(MCParser.NOT, 0); }
		public Expr8Context expr8() {
			return getRuleContext(Expr8Context.class,0);
		}
		public Expr7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr7; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpr7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr7Context expr7() throws RecognitionException {
		Expr7Context _localctx = new Expr7Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr7);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(252);
				expr7();
				}
				break;
			case ID:
			case INTLIT:
			case FLOATLIT:
			case BOOLEANLIT:
			case STRINGLIT:
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				expr8();
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

	public static class Expr8Context extends ParserRuleContext {
		public Expr9Context expr9() {
			return getRuleContext(Expr9Context.class,0);
		}
		public TerminalNode LSB() { return getToken(MCParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(MCParser.RSB, 0); }
		public Expr8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr8; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpr8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr8Context expr8() throws RecognitionException {
		Expr8Context _localctx = new Expr8Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr8);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				expr9();
				setState(257);
				match(LSB);
				setState(258);
				match(RSB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				expr9();
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

	public static class Expr9Context extends ParserRuleContext {
		public TerminalNode LP() { return getToken(MCParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(MCParser.RP, 0); }
		public OperandsContext operands() {
			return getRuleContext(OperandsContext.class,0);
		}
		public Expr9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr9; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpr9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr9Context expr9() throws RecognitionException {
		Expr9Context _localctx = new Expr9Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr9);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(LP);
				setState(264);
				expr();
				setState(265);
				match(RP);
				}
				break;
			case ID:
			case INTLIT:
			case FLOATLIT:
			case BOOLEANLIT:
			case STRINGLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				operands();
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

	public static class OperandsContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public Array_elementContext array_element() {
			return getRuleContext(Array_elementContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public OperandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operands; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitOperands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandsContext operands() throws RecognitionException {
		OperandsContext _localctx = new OperandsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operands);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				array_element();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				func_call();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTLIT() { return getToken(MCParser.INTLIT, 0); }
		public TerminalNode FLOATLIT() { return getToken(MCParser.FLOATLIT, 0); }
		public TerminalNode BOOLEANLIT() { return getToken(MCParser.BOOLEANLIT, 0); }
		public TerminalNode STRINGLIT() { return getToken(MCParser.STRINGLIT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLIT) | (1L << FLOATLIT) | (1L << BOOLEANLIT) | (1L << STRINGLIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Array_elementContext extends ParserRuleContext {
		public TerminalNode LSB() { return getToken(MCParser.LSB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSB() { return getToken(MCParser.RSB, 0); }
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public TerminalNode LP() { return getToken(MCParser.LP, 0); }
		public TerminalNode INTLIT() { return getToken(MCParser.INTLIT, 0); }
		public TerminalNode RP() { return getToken(MCParser.RP, 0); }
		public Array_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitArray_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_elementContext array_element() throws RecognitionException {
		Array_elementContext _localctx = new Array_elementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(278);
			match(ID);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(279);
				match(LP);
				setState(280);
				match(INTLIT);
				setState(281);
				match(RP);
				}
			}

			}
			setState(284);
			match(LSB);
			setState(285);
			expr();
			setState(286);
			match(RSB);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public TerminalNode LP() { return getToken(MCParser.LP, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode RP() { return getToken(MCParser.RP, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(ID);
			setState(289);
			match(LP);
			setState(290);
			exprlist();
			setState(291);
			match(RP);
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

	public static class ExprlistContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprtailContext exprtail() {
			return getRuleContext(ExprtailContext.class,0);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << SUB) | (1L << NOT) | (1L << INTLIT) | (1L << FLOATLIT) | (1L << BOOLEANLIT) | (1L << STRINGLIT) | (1L << LP))) != 0)) {
				{
				setState(293);
				expr();
				setState(294);
				exprtail();
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

	public static class ExprtailContext extends ParserRuleContext {
		public TerminalNode CM() { return getToken(MCParser.CM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprtailContext exprtail() {
			return getRuleContext(ExprtailContext.class,0);
		}
		public ExprtailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprtail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExprtail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprtailContext exprtail() throws RecognitionException {
		ExprtailContext _localctx = new ExprtailContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_exprtail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CM) {
				{
				setState(298);
				match(CM);
				setState(299);
				expr();
				setState(300);
				exprtail();
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

	public static class StatementContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Dowhile_stmtContext dowhile_stmt() {
			return getRuleContext(Dowhile_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statement);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				if_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				for_stmt();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				dowhile_stmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				continue_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				return_stmt();
				}
				break;
			case ID:
			case SUB:
			case NOT:
			case INTLIT:
			case FLOATLIT:
			case BOOLEANLIT:
			case STRINGLIT:
			case LP:
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				expr_stmt();
				}
				break;
			case LB:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				block_statement();
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

	public static class If_stmtContext extends ParserRuleContext {
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public If_no_elseContext if_no_else() {
			return getRuleContext(If_no_elseContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_if_stmt);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				if_else();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				if_no_else();
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

	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MCParser.IF, 0); }
		public TerminalNode LP() { return getToken(MCParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(MCParser.RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MCParser.ELSE, 0); }
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(IF);
			setState(319);
			match(LP);
			setState(320);
			expr();
			setState(321);
			match(RP);
			setState(322);
			statement();
			setState(323);
			match(ELSE);
			setState(324);
			statement();
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

	public static class If_no_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MCParser.IF, 0); }
		public TerminalNode LP() { return getToken(MCParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(MCParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_no_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_no_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitIf_no_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_no_elseContext if_no_else() throws RecognitionException {
		If_no_elseContext _localctx = new If_no_elseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_if_no_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(IF);
			setState(327);
			match(LP);
			setState(328);
			expr();
			setState(329);
			match(RP);
			setState(330);
			statement();
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

	public static class Dowhile_stmtContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(MCParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(MCParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Dowhile_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitDowhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dowhile_stmtContext dowhile_stmt() throws RecognitionException {
		Dowhile_stmtContext _localctx = new Dowhile_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dowhile_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(DO);
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				statement();
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << DO) | (1L << ID) | (1L << SUB) | (1L << NOT) | (1L << INTLIT) | (1L << FLOATLIT) | (1L << BOOLEANLIT) | (1L << STRINGLIT) | (1L << LP) | (1L << LB))) != 0) );
			setState(338);
			match(WHILE);
			setState(339);
			expr();
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MCParser.FOR, 0); }
		public TerminalNode LP() { return getToken(MCParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MCParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MCParser.SEMI, i);
		}
		public TerminalNode RP() { return getToken(MCParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(FOR);
			setState(342);
			match(LP);
			setState(343);
			expr();
			setState(344);
			match(SEMI);
			setState(345);
			expr();
			setState(346);
			match(SEMI);
			setState(347);
			expr();
			setState(348);
			match(RP);
			setState(349);
			statement();
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

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(MCParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(MCParser.SEMI, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(BREAK);
			setState(352);
			match(SEMI);
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

	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(MCParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(MCParser.SEMI, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(CONTINUE);
			setState(355);
			match(SEMI);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MCParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(RETURN);
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(358);
				expr();
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MCParser.SEMI, 0); }
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			expr();
			setState(362);
			match(SEMI);
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

	public static class Block_statementContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(MCParser.LB, 0); }
		public Var_stmt_listContext var_stmt_list() {
			return getRuleContext(Var_stmt_listContext.class,0);
		}
		public TerminalNode RB() { return getToken(MCParser.RB, 0); }
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_block_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(LB);
			setState(365);
			var_stmt_list();
			setState(366);
			match(RB);
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

	public static class Main_functionContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode LP() { return getToken(MCParser.LP, 0); }
		public TerminalNode RP() { return getToken(MCParser.RP, 0); }
		public TerminalNode EOF() { return getToken(MCParser.EOF, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitMain_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_main_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			primitive_type();
			setState(369);
			match(T__0);
			setState(370);
			match(LP);
			setState(371);
			match(RP);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				setState(372);
				block_statement();
				}
			}

			setState(375);
			match(EOF);
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
		case 20:
			return expr1_sempred((Expr1Context)_localctx, predIndex);
		case 21:
			return expr2_sempred((Expr2Context)_localctx, predIndex);
		case 24:
			return expr5_sempred((Expr5Context)_localctx, predIndex);
		case 25:
			return expr6_sempred((Expr6Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr1_sempred(Expr1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr2_sempred(Expr2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr5_sempred(Expr5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr6_sempred(Expr6Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u017c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\3\5\3g\n\3\3\4"+
		"\3\4\5\4k\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7x\n\7\3\b"+
		"\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u008a"+
		"\n\n\3\13\3\13\3\13\5\13\u008f\n\13\3\f\3\f\3\f\3\f\5\f\u0095\n\f\3\r"+
		"\3\r\3\r\3\r\5\r\u009b\n\r\3\16\3\16\3\16\5\16\u00a0\n\16\3\17\3\17\3"+
		"\17\5\17\u00a5\n\17\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\5\22\u00b2\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00c2\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u00ca\n\26\f\26\16\26\u00cd\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u00d5\n\27\f\27\16\27\u00d8\13\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00df\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u00e6\n\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\7\32\u00ee\n\32\f\32\16\32\u00f1\13\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\7\33\u00f9\n\33\f\33\16\33\u00fc\13\33\3\34\3\34\3\34\5"+
		"\34\u0101\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0108\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u010f\n\36\3\37\3\37\3\37\3\37\5\37\u0115\n\37\3 \3 \3"+
		"!\3!\3!\3!\5!\u011d\n!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u012b"+
		"\n#\3$\3$\3$\3$\5$\u0131\n$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u013b\n%\3&\3&"+
		"\5&\u013f\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\6"+
		")\u0151\n)\r)\16)\u0152\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\5-\u016a\n-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u0178\n\60\3\60\3\60\3\60\2\6*,\62\64\61\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\t\6"+
		"\2\4\4\t\t\13\13\22\22\3\2\34\35\3\2\36!\3\2\24\25\4\2\26\27\31\31\4\2"+
		"\25\25\30\30\3\2#&\2\u0174\2`\3\2\2\2\4f\3\2\2\2\6j\3\2\2\2\bl\3\2\2\2"+
		"\np\3\2\2\2\fw\3\2\2\2\16y\3\2\2\2\20\177\3\2\2\2\22\u0089\3\2\2\2\24"+
		"\u008e\3\2\2\2\26\u0094\3\2\2\2\30\u0096\3\2\2\2\32\u009f\3\2\2\2\34\u00a4"+
		"\3\2\2\2\36\u00a8\3\2\2\2 \u00aa\3\2\2\2\"\u00b1\3\2\2\2$\u00b3\3\2\2"+
		"\2&\u00b8\3\2\2\2(\u00c1\3\2\2\2*\u00c3\3\2\2\2,\u00ce\3\2\2\2.\u00de"+
		"\3\2\2\2\60\u00e5\3\2\2\2\62\u00e7\3\2\2\2\64\u00f2\3\2\2\2\66\u0100\3"+
		"\2\2\28\u0107\3\2\2\2:\u010e\3\2\2\2<\u0114\3\2\2\2>\u0116\3\2\2\2@\u0118"+
		"\3\2\2\2B\u0122\3\2\2\2D\u012a\3\2\2\2F\u0130\3\2\2\2H\u013a\3\2\2\2J"+
		"\u013e\3\2\2\2L\u0140\3\2\2\2N\u0148\3\2\2\2P\u014e\3\2\2\2R\u0157\3\2"+
		"\2\2T\u0161\3\2\2\2V\u0164\3\2\2\2X\u0167\3\2\2\2Z\u016b\3\2\2\2\\\u016e"+
		"\3\2\2\2^\u0172\3\2\2\2`a\5\4\3\2a\3\3\2\2\2bc\5\6\4\2cd\5\4\3\2dg\3\2"+
		"\2\2eg\5\6\4\2fb\3\2\2\2fe\3\2\2\2g\5\3\2\2\2hk\5\b\5\2ik\5\20\t\2jh\3"+
		"\2\2\2ji\3\2\2\2k\7\3\2\2\2lm\5\n\6\2mn\5\f\7\2no\7.\2\2o\t\3\2\2\2pq"+
		"\t\2\2\2q\13\3\2\2\2rs\5\16\b\2st\7/\2\2tu\5\f\7\2ux\3\2\2\2vx\5\16\b"+
		"\2wr\3\2\2\2wv\3\2\2\2x\r\3\2\2\2y}\7\23\2\2z{\7+\2\2{|\7#\2\2|~\7,\2"+
		"\2}z\3\2\2\2}~\3\2\2\2~\17\3\2\2\2\177\u0080\5\22\n\2\u0080\u0081\7\23"+
		"\2\2\u0081\u0082\7\'\2\2\u0082\u0083\5\24\13\2\u0083\u0084\7(\2\2\u0084"+
		"\u0085\5\\/\2\u0085\21\3\2\2\2\u0086\u008a\5\n\6\2\u0087\u008a\7\r\2\2"+
		"\u0088\u008a\5\"\22\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\23\3\2\2\2\u008b\u008c\5\30\r\2\u008c\u008d\5\26\f\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008f\3\2\2\2\u008f\25\3\2\2"+
		"\2\u0090\u0091\7/\2\2\u0091\u0092\5\30\r\2\u0092\u0093\5\26\f\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0095\3\2\2\2\u0095\27\3\2\2"+
		"\2\u0096\u0097\5\n\6\2\u0097\u009a\7\23\2\2\u0098\u0099\7+\2\2\u0099\u009b"+
		"\7,\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\31\3\2\2\2\u009c"+
		"\u009d\5\36\20\2\u009d\u009e\5\34\17\2\u009e\u00a0\3\2\2\2\u009f\u009c"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\5\36\20\2\u00a2"+
		"\u00a3\5\34\17\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a5\3"+
		"\2\2\2\u00a5\35\3\2\2\2\u00a6\u00a9\5\b\5\2\u00a7\u00a9\5H%\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\37\3\2\2\2\u00aa\u00ab\5\n\6\2\u00ab"+
		"\u00ac\7+\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\7,\2\2\u00ae!\3\2\2\2\u00af"+
		"\u00b2\5$\23\2\u00b0\u00b2\5&\24\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b2#\3\2\2\2\u00b3\u00b4\5\n\6\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6"+
		"\7+\2\2\u00b6\u00b7\7,\2\2\u00b7%\3\2\2\2\u00b8\u00b9\5\n\6\2\u00b9\u00ba"+
		"\7+\2\2\u00ba\u00bb\7,\2\2\u00bb\'\3\2\2\2\u00bc\u00bd\5*\26\2\u00bd\u00be"+
		"\7\"\2\2\u00be\u00bf\5(\25\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\5*\26\2\u00c1"+
		"\u00bc\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2)\3\2\2\2\u00c3\u00c4\b\26\1\2"+
		"\u00c4\u00c5\5,\27\2\u00c5\u00cb\3\2\2\2\u00c6\u00c7\f\4\2\2\u00c7\u00c8"+
		"\7\32\2\2\u00c8\u00ca\5,\27\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc+\3\2\2\2\u00cd\u00cb\3"+
		"\2\2\2\u00ce\u00cf\b\27\1\2\u00cf\u00d0\5.\30\2\u00d0\u00d6\3\2\2\2\u00d1"+
		"\u00d2\f\4\2\2\u00d2\u00d3\7\33\2\2\u00d3\u00d5\5.\30\2\u00d4\u00d1\3"+
		"\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"-\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\5\60\31\2\u00da\u00db\t\3\2"+
		"\2\u00db\u00dc\5\60\31\2\u00dc\u00df\3\2\2\2\u00dd\u00df\5\60\31\2\u00de"+
		"\u00d9\3\2\2\2\u00de\u00dd\3\2\2\2\u00df/\3\2\2\2\u00e0\u00e1\5\62\32"+
		"\2\u00e1\u00e2\t\4\2\2\u00e2\u00e3\5\62\32\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e6\5\62\32\2\u00e5\u00e0\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\61\3\2"+
		"\2\2\u00e7\u00e8\b\32\1\2\u00e8\u00e9\5\64\33\2\u00e9\u00ef\3\2\2\2\u00ea"+
		"\u00eb\f\4\2\2\u00eb\u00ec\t\5\2\2\u00ec\u00ee\5\64\33\2\u00ed\u00ea\3"+
		"\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\63\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\b\33\1\2\u00f3\u00f4\5\66"+
		"\34\2\u00f4\u00fa\3\2\2\2\u00f5\u00f6\f\4\2\2\u00f6\u00f7\t\6\2\2\u00f7"+
		"\u00f9\5\66\34\2\u00f8\u00f5\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\65\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\t\7\2\2\u00fe\u0101\5\66\34\2\u00ff\u0101\58\35\2\u0100\u00fd\3"+
		"\2\2\2\u0100\u00ff\3\2\2\2\u0101\67\3\2\2\2\u0102\u0103\5:\36\2\u0103"+
		"\u0104\7+\2\2\u0104\u0105\7,\2\2\u0105\u0108\3\2\2\2\u0106\u0108\5:\36"+
		"\2\u0107\u0102\3\2\2\2\u0107\u0106\3\2\2\2\u01089\3\2\2\2\u0109\u010a"+
		"\7\'\2\2\u010a\u010b\5(\25\2\u010b\u010c\7(\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010f\5<\37\2\u010e\u0109\3\2\2\2\u010e\u010d\3\2\2\2\u010f;\3\2\2\2"+
		"\u0110\u0115\5> \2\u0111\u0115\7\23\2\2\u0112\u0115\5@!\2\u0113\u0115"+
		"\5B\"\2\u0114\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0113\3\2\2\2\u0115=\3\2\2\2\u0116\u0117\t\b\2\2\u0117?\3\2\2\2\u0118"+
		"\u011c\7\23\2\2\u0119\u011a\7\'\2\2\u011a\u011b\7#\2\2\u011b\u011d\7("+
		"\2\2\u011c\u0119\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\7+\2\2\u011f\u0120\5(\25\2\u0120\u0121\7,\2\2\u0121A\3\2\2\2\u0122"+
		"\u0123\7\23\2\2\u0123\u0124\7\'\2\2\u0124\u0125\5D#\2\u0125\u0126\7(\2"+
		"\2\u0126C\3\2\2\2\u0127\u0128\5(\25\2\u0128\u0129\5F$\2\u0129\u012b\3"+
		"\2\2\2\u012a\u0127\3\2\2\2\u012a\u012b\3\2\2\2\u012bE\3\2\2\2\u012c\u012d"+
		"\7/\2\2\u012d\u012e\5(\25\2\u012e\u012f\5F$\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012c\3\2\2\2\u0130\u0131\3\2\2\2\u0131G\3\2\2\2\u0132\u013b\5J&\2\u0133"+
		"\u013b\5R*\2\u0134\u013b\5P)\2\u0135\u013b\5T+\2\u0136\u013b\5V,\2\u0137"+
		"\u013b\5X-\2\u0138\u013b\5Z.\2\u0139\u013b\5\\/\2\u013a\u0132\3\2\2\2"+
		"\u013a\u0133\3\2\2\2\u013a\u0134\3\2\2\2\u013a\u0135\3\2\2\2\u013a\u0136"+
		"\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b"+
		"I\3\2\2\2\u013c\u013f\5L\'\2\u013d\u013f\5N(\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013d\3\2\2\2\u013fK\3\2\2\2\u0140\u0141\7\n\2\2\u0141\u0142\7\'\2\2"+
		"\u0142\u0143\5(\25\2\u0143\u0144\7(\2\2\u0144\u0145\5H%\2\u0145\u0146"+
		"\7\7\2\2\u0146\u0147\5H%\2\u0147M\3\2\2\2\u0148\u0149\7\n\2\2\u0149\u014a"+
		"\7\'\2\2\u014a\u014b\5(\25\2\u014b\u014c\7(\2\2\u014c\u014d\5H%\2\u014d"+
		"O\3\2\2\2\u014e\u0150\7\16\2\2\u014f\u0151\5H%\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\7\17\2\2\u0155\u0156\5(\25\2\u0156Q\3\2\2\2\u0157\u0158"+
		"\7\b\2\2\u0158\u0159\7\'\2\2\u0159\u015a\5(\25\2\u015a\u015b\7.\2\2\u015b"+
		"\u015c\5(\25\2\u015c\u015d\7.\2\2\u015d\u015e\5(\25\2\u015e\u015f\7(\2"+
		"\2\u015f\u0160\5H%\2\u0160S\3\2\2\2\u0161\u0162\7\5\2\2\u0162\u0163\7"+
		".\2\2\u0163U\3\2\2\2\u0164\u0165\7\6\2\2\u0165\u0166\7.\2\2\u0166W\3\2"+
		"\2\2\u0167\u0169\7\f\2\2\u0168\u016a\5(\25\2\u0169\u0168\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016aY\3\2\2\2\u016b\u016c\5(\25\2\u016c\u016d\7.\2\2\u016d"+
		"[\3\2\2\2\u016e\u016f\7)\2\2\u016f\u0170\5\32\16\2\u0170\u0171\7*\2\2"+
		"\u0171]\3\2\2\2\u0172\u0173\5\n\6\2\u0173\u0174\7\3\2\2\u0174\u0175\7"+
		"\'\2\2\u0175\u0177\7(\2\2\u0176\u0178\5\\/\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\2\2\3\u017a_\3\2\2\2"+
		"!fjw}\u0089\u008e\u0094\u009a\u009f\u00a4\u00a8\u00b1\u00c1\u00cb\u00d6"+
		"\u00de\u00e5\u00ef\u00fa\u0100\u0107\u010e\u0114\u011c\u012a\u0130\u013a"+
		"\u013e\u0152\u0169\u0177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}