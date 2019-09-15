// Generated from main/mc/parser/MC.g4 by ANTLR 4.7.2

from lexererr import *

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MCLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Letter", "Digit", "Exponent", "BOOLEANTYPE", "BREAK", "CONTINUE", 
			"ELSE", "FOR", "FLOATTYPE", "IF", "INTTYPE", "RETURN", "VOIDTYPE", "DO", 
			"WHILE", "TRUE", "FALSE", "STRINGTYPE", "ID", "ADD", "SUB", "MUL", "DIV", 
			"NOT", "MOD", "OR", "AND", "NEQ", "EQ", "LESS", "GRATER", "LEQ", "GEQ", 
			"ASSIGN", "INTLIT", "FLOATLIT", "BOOLEANLIT", "STRINGLIT", "LP", "RP", 
			"LB", "RB", "LSB", "RSB", "DOT", "SEMI", "CM", "UNDERSCORE", "BLOCK_COMMENT", 
			"LINE_COMMENT", "WS", "ILLEGAL_ESCAPE", "UNCLOSE_STRING", "ERROR_CHAR"
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


	def emit(self):
	    tk = self.type

	    if tk == self.UNCLOSE_STRING:       
	        result = super().emit();
	        raise UncloseString(result.text);
	    elif tk == self.ILLEGAL_ESCAPE:
	        result = super().emit();
	        raise IllegalEscape(result.text);
	    elif tk == self.ERROR_CHAR:
	        result = super().emit();
	        raise ErrorToken(result.text); 
	    else:
	        return super().emit();


	public MCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MC.g4"; }

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
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 38:
			STRINGLIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			ILLEGAL_ESCAPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			UNCLOSE_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRINGLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 self.text = self.text.lstrip('"').rstrip('"') 
			break;
		}
	}
	private void ILLEGAL_ESCAPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			self.text =  self.text.lstrip('"')
			break;
		}
	}
	private void UNCLOSE_STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 self.text = self.text.lstrip('"') 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0192\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\5\5}\n\5\3\5\6\5\u0080\n\5\r\5\16\5\u0081\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\5\25\u00da\n\25\3\25\3\25\3\25\7\25\u00df"+
		"\n\25\f\25\16\25\u00e2\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\5%\u0109\n%\3%\6%\u010c"+
		"\n%\r%\16%\u010d\3&\6&\u0111\n&\r&\16&\u0112\3&\3&\5&\u0117\n&\3&\5&\u011a"+
		"\n&\3&\7&\u011d\n&\f&\16&\u0120\13&\3&\7&\u0123\n&\f&\16&\u0126\13&\3"+
		"&\3&\6&\u012a\n&\r&\16&\u012b\3&\3&\5&\u0130\n&\5&\u0132\n&\3\'\3\'\5"+
		"\'\u0136\n\'\3(\3(\3(\3(\7(\u013c\n(\f(\16(\u013f\13(\3(\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\7\63\u015c\n\63\f\63\16\63\u015f\13\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u016a\n\64\f\64\16\64\u016d\13\64"+
		"\3\64\3\64\3\65\6\65\u0172\n\65\r\65\16\65\u0173\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\7\66\u017c\n\66\f\66\16\66\u017f\13\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\7\67\u018a\n\67\f\67\16\67\u018d\13\67\3\67\3"+
		"\67\38\38\3\u015d\29\3\3\5\2\7\2\t\2\13\4\r\5\17\6\21\7\23\b\25\t\27\n"+
		"\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65"+
		"\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61"+
		"g\62i\63k\64m\65o\66\3\2\13\4\2C\\c|\3\2\62;\4\2GGgg\4\2--//\t\2$$^^d"+
		"dhhppttvv\6\2\n\f\16\17$$^^\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2^^\2\u01a8"+
		"\2\3\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5v\3\2\2\2\7"+
		"x\3\2\2\2\tz\3\2\2\2\13\u0083\3\2\2\2\r\u008b\3\2\2\2\17\u0091\3\2\2\2"+
		"\21\u009a\3\2\2\2\23\u009f\3\2\2\2\25\u00a3\3\2\2\2\27\u00a9\3\2\2\2\31"+
		"\u00ac\3\2\2\2\33\u00b0\3\2\2\2\35\u00b7\3\2\2\2\37\u00bc\3\2\2\2!\u00bf"+
		"\3\2\2\2#\u00c5\3\2\2\2%\u00ca\3\2\2\2\'\u00d0\3\2\2\2)\u00d9\3\2\2\2"+
		"+\u00e3\3\2\2\2-\u00e5\3\2\2\2/\u00e7\3\2\2\2\61\u00e9\3\2\2\2\63\u00eb"+
		"\3\2\2\2\65\u00ed\3\2\2\2\67\u00ef\3\2\2\29\u00f2\3\2\2\2;\u00f5\3\2\2"+
		"\2=\u00f8\3\2\2\2?\u00fb\3\2\2\2A\u00fd\3\2\2\2C\u00ff\3\2\2\2E\u0102"+
		"\3\2\2\2G\u0105\3\2\2\2I\u0108\3\2\2\2K\u0131\3\2\2\2M\u0135\3\2\2\2O"+
		"\u0137\3\2\2\2Q\u0143\3\2\2\2S\u0145\3\2\2\2U\u0147\3\2\2\2W\u0149\3\2"+
		"\2\2Y\u014b\3\2\2\2[\u014d\3\2\2\2]\u014f\3\2\2\2_\u0151\3\2\2\2a\u0153"+
		"\3\2\2\2c\u0155\3\2\2\2e\u0157\3\2\2\2g\u0165\3\2\2\2i\u0171\3\2\2\2k"+
		"\u0177\3\2\2\2m\u0185\3\2\2\2o\u0190\3\2\2\2qr\7o\2\2rs\7c\2\2st\7k\2"+
		"\2tu\7p\2\2u\4\3\2\2\2vw\t\2\2\2w\6\3\2\2\2xy\t\3\2\2y\b\3\2\2\2z|\t\4"+
		"\2\2{}\5-\27\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\5\7\4\2\177~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\n\3\2\2\2\u0083\u0084\7d\2\2\u0084\u0085\7q\2\2\u0085\u0086\7q\2\2\u0086"+
		"\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\u0089\7c\2\2\u0089\u008a\7p\2\2"+
		"\u008a\f\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d\7t\2\2\u008d\u008e\7g"+
		"\2\2\u008e\u008f\7c\2\2\u008f\u0090\7m\2\2\u0090\16\3\2\2\2\u0091\u0092"+
		"\7e\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7w\2\2\u0098\u0099\7g\2\2"+
		"\u0099\20\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c\7n\2\2\u009c\u009d\7"+
		"u\2\2\u009d\u009e\7g\2\2\u009e\22\3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1"+
		"\7q\2\2\u00a1\u00a2\7t\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5"+
		"\7n\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\26\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7h\2\2\u00ab\30\3\2\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af\32\3\2\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7w\2\2"+
		"\u00b4\u00b5\7t\2\2\u00b5\u00b6\7p\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7"+
		"x\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7f\2\2\u00bb\36"+
		"\3\2\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be\7q\2\2\u00be \3\2\2\2\u00bf\u00c0"+
		"\7y\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\u00c8\7w\2\2\u00c8\u00c9\7g\2\2\u00c9$\3\2\2\2\u00ca\u00cb\7h\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2"+
		"\u00cf&\3\2\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7t\2"+
		"\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7i\2\2\u00d6(\3\2"+
		"\2\2\u00d7\u00da\5c\62\2\u00d8\u00da\5\5\3\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00e0\3\2\2\2\u00db\u00df\5c\62\2\u00dc\u00df\5\5"+
		"\3\2\u00dd\u00df\5\7\4\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1*\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4,\3\2"+
		"\2\2\u00e5\u00e6\7/\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8\60\3\2"+
		"\2\2\u00e9\u00ea\7\61\2\2\u00ea\62\3\2\2\2\u00eb\u00ec\7#\2\2\u00ec\64"+
		"\3\2\2\2\u00ed\u00ee\7\'\2\2\u00ee\66\3\2\2\2\u00ef\u00f0\7~\2\2\u00f0"+
		"\u00f1\7~\2\2\u00f18\3\2\2\2\u00f2\u00f3\7(\2\2\u00f3\u00f4\7(\2\2\u00f4"+
		":\3\2\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7\7?\2\2\u00f7<\3\2\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9\u00fa\7?\2\2\u00fa>\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc@\3"+
		"\2\2\2\u00fd\u00fe\7@\2\2\u00feB\3\2\2\2\u00ff\u0100\7>\2\2\u0100\u0101"+
		"\7?\2\2\u0101D\3\2\2\2\u0102\u0103\7@\2\2\u0103\u0104\7?\2\2\u0104F\3"+
		"\2\2\2\u0105\u0106\7?\2\2\u0106H\3\2\2\2\u0107\u0109\t\5\2\2\u0108\u0107"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u010c\5\7\4\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010eJ\3\2\2\2\u010f\u0111\5\7\4\2\u0110\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0119\3\2\2\2\u0114"+
		"\u011a\5]/\2\u0115\u0117\5]/\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u011a\5\t\5\2\u0119\u0114\3\2\2\2\u0119\u0116"+
		"\3\2\2\2\u011a\u011e\3\2\2\2\u011b\u011d\5\7\4\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0132\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0123\5\7\4\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0127\u0129\5]/\2\u0128\u012a\5\7\4\2\u0129\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u0130\5\t\5\2\u012f\u012d\3\2"+
		"\2\2\u012f\u012e\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0110\3\2\2\2\u0131"+
		"\u0124\3\2\2\2\u0132L\3\2\2\2\u0133\u0136\5#\22\2\u0134\u0136\5%\23\2"+
		"\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136N\3\2\2\2\u0137\u013d\7"+
		"$\2\2\u0138\u0139\7^\2\2\u0139\u013c\t\6\2\2\u013a\u013c\n\7\2\2\u013b"+
		"\u0138\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140"+
		"\u0141\7$\2\2\u0141\u0142\b(\2\2\u0142P\3\2\2\2\u0143\u0144\7*\2\2\u0144"+
		"R\3\2\2\2\u0145\u0146\7+\2\2\u0146T\3\2\2\2\u0147\u0148\7}\2\2\u0148V"+
		"\3\2\2\2\u0149\u014a\7\177\2\2\u014aX\3\2\2\2\u014b\u014c\7]\2\2\u014c"+
		"Z\3\2\2\2\u014d\u014e\7_\2\2\u014e\\\3\2\2\2\u014f\u0150\7\60\2\2\u0150"+
		"^\3\2\2\2\u0151\u0152\7=\2\2\u0152`\3\2\2\2\u0153\u0154\7.\2\2\u0154b"+
		"\3\2\2\2\u0155\u0156\7a\2\2\u0156d\3\2\2\2\u0157\u0158\7\61\2\2\u0158"+
		"\u0159\7,\2\2\u0159\u015d\3\2\2\2\u015a\u015c\13\2\2\2\u015b\u015a\3\2"+
		"\2\2\u015c\u015f\3\2\2\2\u015d\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7,\2\2\u0161\u0162\7\61"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b\63\3\2\u0164f\3\2\2\2\u0165\u0166"+
		"\7\61\2\2\u0166\u0167\7\61\2\2\u0167\u016b\3\2\2\2\u0168\u016a\n\b\2\2"+
		"\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\b\64\3\2"+
		"\u016fh\3\2\2\2\u0170\u0172\t\t\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3"+
		"\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\b\65\3\2\u0176j\3\2\2\2\u0177\u017d\7$\2\2\u0178\u0179\7^\2\2\u0179"+
		"\u017c\t\6\2\2\u017a\u017c\n\n\2\2\u017b\u0178\3\2\2\2\u017b\u017a\3\2"+
		"\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7^\2\2\u0181\u0182\n\6"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0184\b\66\4\2\u0184l\3\2\2\2\u0185\u018b"+
		"\7$\2\2\u0186\u0187\7^\2\2\u0187\u018a\t\6\2\2\u0188\u018a\n\7\2\2\u0189"+
		"\u0186\3\2\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u018f\b\67\5\2\u018fn\3\2\2\2\u0190\u0191\13\2\2\2\u0191p\3\2\2\2\34"+
		"\2|\u0081\u00d9\u00de\u00e0\u0108\u010d\u0112\u0116\u0119\u011e\u0124"+
		"\u012b\u012f\u0131\u0135\u013b\u013d\u015d\u016b\u0173\u017b\u017d\u0189"+
		"\u018b\6\3(\2\b\2\2\3\66\3\3\67\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}