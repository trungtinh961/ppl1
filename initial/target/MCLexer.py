# Generated from main/mc/parser/MC.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


from lexererr import *



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65")
        buf.write("\u018b\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36")
        buf.write("\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%")
        buf.write("\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.")
        buf.write("\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64")
        buf.write("\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3")
        buf.write("\4\3\4\5\4v\n\4\3\4\6\4y\n\4\r\4\16\4z\3\5\3\5\3\5\3\5")
        buf.write("\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3")
        buf.write("\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t")
        buf.write("\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3")
        buf.write("\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16")
        buf.write("\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21")
        buf.write("\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23")
        buf.write("\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00d3\n")
        buf.write("\24\3\24\3\24\3\24\7\24\u00d8\n\24\f\24\16\24\u00db\13")
        buf.write("\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31")
        buf.write("\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35")
        buf.write("\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3")
        buf.write("#\3#\3$\5$\u0102\n$\3$\6$\u0105\n$\r$\16$\u0106\3%\6%")
        buf.write("\u010a\n%\r%\16%\u010b\3%\3%\5%\u0110\n%\3%\5%\u0113\n")
        buf.write("%\3%\7%\u0116\n%\f%\16%\u0119\13%\3%\7%\u011c\n%\f%\16")
        buf.write("%\u011f\13%\3%\3%\6%\u0123\n%\r%\16%\u0124\3%\3%\5%\u0129")
        buf.write("\n%\5%\u012b\n%\3&\3&\5&\u012f\n&\3\'\3\'\3\'\3\'\7\'")
        buf.write("\u0135\n\'\f\'\16\'\u0138\13\'\3\'\3\'\3\'\3(\3(\3)\3")
        buf.write(")\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3")
        buf.write("\61\3\62\3\62\3\62\3\62\7\62\u0155\n\62\f\62\16\62\u0158")
        buf.write("\13\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\7")
        buf.write("\63\u0163\n\63\f\63\16\63\u0166\13\63\3\63\3\63\3\64\6")
        buf.write("\64\u016b\n\64\r\64\16\64\u016c\3\64\3\64\3\65\3\65\3")
        buf.write("\65\3\65\7\65\u0175\n\65\f\65\16\65\u0178\13\65\3\65\3")
        buf.write("\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u0183\n\66")
        buf.write("\f\66\16\66\u0186\13\66\3\66\3\66\3\67\3\67\3\u0156\2")
        buf.write("8\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31")
        buf.write("\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61")
        buf.write("\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M")
        buf.write("%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65\3\2\13")
        buf.write("\4\2C\\c|\3\2\62;\4\2GGgg\4\2--//\t\2$$^^ddhhppttvv\6")
        buf.write("\2\n\f\16\17$$^^\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2")
        buf.write("^^\2\u01a1\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3")
        buf.write("\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2")
        buf.write("\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2")
        buf.write("\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2")
        buf.write("\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63")
        buf.write("\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2")
        buf.write("\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2")
        buf.write("\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3")
        buf.write("\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y")
        buf.write("\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2")
        buf.write("c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2")
        buf.write("\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\t|\3\2\2")
        buf.write("\2\13\u0084\3\2\2\2\r\u008a\3\2\2\2\17\u0093\3\2\2\2\21")
        buf.write("\u0098\3\2\2\2\23\u009c\3\2\2\2\25\u00a2\3\2\2\2\27\u00a5")
        buf.write("\3\2\2\2\31\u00a9\3\2\2\2\33\u00b0\3\2\2\2\35\u00b5\3")
        buf.write("\2\2\2\37\u00b8\3\2\2\2!\u00be\3\2\2\2#\u00c3\3\2\2\2")
        buf.write("%\u00c9\3\2\2\2\'\u00d2\3\2\2\2)\u00dc\3\2\2\2+\u00de")
        buf.write("\3\2\2\2-\u00e0\3\2\2\2/\u00e2\3\2\2\2\61\u00e4\3\2\2")
        buf.write("\2\63\u00e6\3\2\2\2\65\u00e8\3\2\2\2\67\u00eb\3\2\2\2")
        buf.write("9\u00ee\3\2\2\2;\u00f1\3\2\2\2=\u00f4\3\2\2\2?\u00f6\3")
        buf.write("\2\2\2A\u00f8\3\2\2\2C\u00fb\3\2\2\2E\u00fe\3\2\2\2G\u0101")
        buf.write("\3\2\2\2I\u012a\3\2\2\2K\u012e\3\2\2\2M\u0130\3\2\2\2")
        buf.write("O\u013c\3\2\2\2Q\u013e\3\2\2\2S\u0140\3\2\2\2U\u0142\3")
        buf.write("\2\2\2W\u0144\3\2\2\2Y\u0146\3\2\2\2[\u0148\3\2\2\2]\u014a")
        buf.write("\3\2\2\2_\u014c\3\2\2\2a\u014e\3\2\2\2c\u0150\3\2\2\2")
        buf.write("e\u015e\3\2\2\2g\u016a\3\2\2\2i\u0170\3\2\2\2k\u017e\3")
        buf.write("\2\2\2m\u0189\3\2\2\2op\t\2\2\2p\4\3\2\2\2qr\t\3\2\2r")
        buf.write("\6\3\2\2\2su\t\4\2\2tv\5+\26\2ut\3\2\2\2uv\3\2\2\2vx\3")
        buf.write("\2\2\2wy\5\5\3\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2")
        buf.write("\2{\b\3\2\2\2|}\7d\2\2}~\7q\2\2~\177\7q\2\2\177\u0080")
        buf.write("\7n\2\2\u0080\u0081\7g\2\2\u0081\u0082\7c\2\2\u0082\u0083")
        buf.write("\7p\2\2\u0083\n\3\2\2\2\u0084\u0085\7d\2\2\u0085\u0086")
        buf.write("\7t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7c\2\2\u0088\u0089")
        buf.write("\7m\2\2\u0089\f\3\2\2\2\u008a\u008b\7e\2\2\u008b\u008c")
        buf.write("\7q\2\2\u008c\u008d\7p\2\2\u008d\u008e\7v\2\2\u008e\u008f")
        buf.write("\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091\7w\2\2\u0091\u0092")
        buf.write("\7g\2\2\u0092\16\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095")
        buf.write("\7n\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\20")
        buf.write("\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a\7q\2\2\u009a\u009b")
        buf.write("\7t\2\2\u009b\22\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e")
        buf.write("\7n\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1")
        buf.write("\7v\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4")
        buf.write("\7h\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7")
        buf.write("\7p\2\2\u00a7\u00a8\7v\2\2\u00a8\30\3\2\2\2\u00a9\u00aa")
        buf.write("\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad")
        buf.write("\7w\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7p\2\2\u00af\32")
        buf.write("\3\2\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3")
        buf.write("\7k\2\2\u00b3\u00b4\7f\2\2\u00b4\34\3\2\2\2\u00b5\u00b6")
        buf.write("\7f\2\2\u00b6\u00b7\7q\2\2\u00b7\36\3\2\2\2\u00b8\u00b9")
        buf.write("\7y\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc")
        buf.write("\7n\2\2\u00bc\u00bd\7g\2\2\u00bd \3\2\2\2\u00be\u00bf")
        buf.write("\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2")
        buf.write("\7g\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5")
        buf.write("\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8")
        buf.write("\7g\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb")
        buf.write("\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce")
        buf.write("\7p\2\2\u00ce\u00cf\7i\2\2\u00cf&\3\2\2\2\u00d0\u00d3")
        buf.write("\5a\61\2\u00d1\u00d3\5\3\2\2\u00d2\u00d0\3\2\2\2\u00d2")
        buf.write("\u00d1\3\2\2\2\u00d3\u00d9\3\2\2\2\u00d4\u00d8\5a\61\2")
        buf.write("\u00d5\u00d8\5\3\2\2\u00d6\u00d8\5\5\3\2\u00d7\u00d4\3")
        buf.write("\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db")
        buf.write("\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da")
        buf.write("(\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd")
        buf.write("*\3\2\2\2\u00de\u00df\7/\2\2\u00df,\3\2\2\2\u00e0\u00e1")
        buf.write("\7,\2\2\u00e1.\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3\60\3")
        buf.write("\2\2\2\u00e4\u00e5\7#\2\2\u00e5\62\3\2\2\2\u00e6\u00e7")
        buf.write("\7\'\2\2\u00e7\64\3\2\2\2\u00e8\u00e9\7~\2\2\u00e9\u00ea")
        buf.write("\7~\2\2\u00ea\66\3\2\2\2\u00eb\u00ec\7(\2\2\u00ec\u00ed")
        buf.write("\7(\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f0")
        buf.write("\7?\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f3")
        buf.write("\7?\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5>\3\2\2")
        buf.write("\2\u00f6\u00f7\7@\2\2\u00f7@\3\2\2\2\u00f8\u00f9\7>\2")
        buf.write("\2\u00f9\u00fa\7?\2\2\u00faB\3\2\2\2\u00fb\u00fc\7@\2")
        buf.write("\2\u00fc\u00fd\7?\2\2\u00fdD\3\2\2\2\u00fe\u00ff\7?\2")
        buf.write("\2\u00ffF\3\2\2\2\u0100\u0102\t\5\2\2\u0101\u0100\3\2")
        buf.write("\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0105")
        buf.write("\5\5\3\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106")
        buf.write("\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107H\3\2\2\2\u0108")
        buf.write("\u010a\5\5\3\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2")
        buf.write("\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0112\3")
        buf.write("\2\2\2\u010d\u0113\5[.\2\u010e\u0110\5[.\2\u010f\u010e")
        buf.write("\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111")
        buf.write("\u0113\5\7\4\2\u0112\u010d\3\2\2\2\u0112\u010f\3\2\2\2")
        buf.write("\u0113\u0117\3\2\2\2\u0114\u0116\5\5\3\2\u0115\u0114\3")
        buf.write("\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118")
        buf.write("\3\2\2\2\u0118\u012b\3\2\2\2\u0119\u0117\3\2\2\2\u011a")
        buf.write("\u011c\5\5\3\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2")
        buf.write("\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3")
        buf.write("\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\5[.\2\u0121\u0123")
        buf.write("\5\5\3\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124")
        buf.write("\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2\2\2")
        buf.write("\u0126\u0129\3\2\2\2\u0127\u0129\5\7\4\2\u0128\u0126\3")
        buf.write("\2\2\2\u0128\u0127\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0109")
        buf.write("\3\2\2\2\u012a\u011d\3\2\2\2\u012bJ\3\2\2\2\u012c\u012f")
        buf.write("\5!\21\2\u012d\u012f\5#\22\2\u012e\u012c\3\2\2\2\u012e")
        buf.write("\u012d\3\2\2\2\u012fL\3\2\2\2\u0130\u0136\7$\2\2\u0131")
        buf.write("\u0132\7^\2\2\u0132\u0135\t\6\2\2\u0133\u0135\n\7\2\2")
        buf.write("\u0134\u0131\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3")
        buf.write("\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139")
        buf.write("\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7$\2\2\u013a")
        buf.write("\u013b\b\'\2\2\u013bN\3\2\2\2\u013c\u013d\7*\2\2\u013d")
        buf.write("P\3\2\2\2\u013e\u013f\7+\2\2\u013fR\3\2\2\2\u0140\u0141")
        buf.write("\7}\2\2\u0141T\3\2\2\2\u0142\u0143\7\177\2\2\u0143V\3")
        buf.write("\2\2\2\u0144\u0145\7]\2\2\u0145X\3\2\2\2\u0146\u0147\7")
        buf.write("_\2\2\u0147Z\3\2\2\2\u0148\u0149\7\60\2\2\u0149\\\3\2")
        buf.write("\2\2\u014a\u014b\7=\2\2\u014b^\3\2\2\2\u014c\u014d\7.")
        buf.write("\2\2\u014d`\3\2\2\2\u014e\u014f\7a\2\2\u014fb\3\2\2\2")
        buf.write("\u0150\u0151\7\61\2\2\u0151\u0152\7,\2\2\u0152\u0156\3")
        buf.write("\2\2\2\u0153\u0155\13\2\2\2\u0154\u0153\3\2\2\2\u0155")
        buf.write("\u0158\3\2\2\2\u0156\u0157\3\2\2\2\u0156\u0154\3\2\2\2")
        buf.write("\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7")
        buf.write(",\2\2\u015a\u015b\7\61\2\2\u015b\u015c\3\2\2\2\u015c\u015d")
        buf.write("\b\62\3\2\u015dd\3\2\2\2\u015e\u015f\7\61\2\2\u015f\u0160")
        buf.write("\7\61\2\2\u0160\u0164\3\2\2\2\u0161\u0163\n\b\2\2\u0162")
        buf.write("\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2")
        buf.write("\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3")
        buf.write("\2\2\2\u0167\u0168\b\63\3\2\u0168f\3\2\2\2\u0169\u016b")
        buf.write("\t\t\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c")
        buf.write("\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2")
        buf.write("\u016e\u016f\b\64\3\2\u016fh\3\2\2\2\u0170\u0176\7$\2")
        buf.write("\2\u0171\u0172\7^\2\2\u0172\u0175\t\6\2\2\u0173\u0175")
        buf.write("\n\n\2\2\u0174\u0171\3\2\2\2\u0174\u0173\3\2\2\2\u0175")
        buf.write("\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2")
        buf.write("\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7")
        buf.write("^\2\2\u017a\u017b\n\6\2\2\u017b\u017c\3\2\2\2\u017c\u017d")
        buf.write("\b\65\4\2\u017dj\3\2\2\2\u017e\u0184\7$\2\2\u017f\u0180")
        buf.write("\7^\2\2\u0180\u0183\t\6\2\2\u0181\u0183\n\7\2\2\u0182")
        buf.write("\u017f\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2")
        buf.write("\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3")
        buf.write("\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\b\66\5\2\u0188")
        buf.write("l\3\2\2\2\u0189\u018a\13\2\2\2\u018an\3\2\2\2\34\2uz\u00d2")
        buf.write("\u00d7\u00d9\u0101\u0106\u010b\u010f\u0112\u0117\u011d")
        buf.write("\u0124\u0128\u012a\u012e\u0134\u0136\u0156\u0164\u016c")
        buf.write("\u0174\u0176\u0182\u0184\6\3\'\2\b\2\2\3\65\3\3\66\4")
        return buf.getvalue()


class MCLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    BOOLEANTYPE = 1
    BREAK = 2
    CONTINUE = 3
    ELSE = 4
    FOR = 5
    FLOATTYPE = 6
    IF = 7
    INTTYPE = 8
    RETURN = 9
    VOIDTYPE = 10
    DO = 11
    WHILE = 12
    TRUE = 13
    FALSE = 14
    STRINGTYPE = 15
    ID = 16
    ADD = 17
    SUB = 18
    MUL = 19
    DIV = 20
    NOT = 21
    MOD = 22
    OR = 23
    AND = 24
    NEQ = 25
    EQ = 26
    LESS = 27
    GRATER = 28
    LEQ = 29
    GEQ = 30
    ASSIGN = 31
    INTLIT = 32
    FLOATLIT = 33
    BOOLEANLIT = 34
    STRINGLIT = 35
    LP = 36
    RP = 37
    LB = 38
    RB = 39
    LSB = 40
    RSB = 41
    DOT = 42
    SEMI = 43
    CM = 44
    UNDERSCORE = 45
    BLOCK_COMMENT = 46
    LINE_COMMENT = 47
    WS = 48
    ILLEGAL_ESCAPE = 49
    UNCLOSE_STRING = 50
    ERROR_CHAR = 51

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'boolean'", "'break'", "'continue'", "'else'", "'for'", "'float'", 
            "'if'", "'int'", "'return'", "'void'", "'do'", "'while'", "'true'", 
            "'false'", "'string'", "'+'", "'-'", "'*'", "'/'", "'!'", "'%'", 
            "'||'", "'&&'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", 
            "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "';'", 
            "','", "'_'" ]

    symbolicNames = [ "<INVALID>",
            "BOOLEANTYPE", "BREAK", "CONTINUE", "ELSE", "FOR", "FLOATTYPE", 
            "IF", "INTTYPE", "RETURN", "VOIDTYPE", "DO", "WHILE", "TRUE", 
            "FALSE", "STRINGTYPE", "ID", "ADD", "SUB", "MUL", "DIV", "NOT", 
            "MOD", "OR", "AND", "NEQ", "EQ", "LESS", "GRATER", "LEQ", "GEQ", 
            "ASSIGN", "INTLIT", "FLOATLIT", "BOOLEANLIT", "STRINGLIT", "LP", 
            "RP", "LB", "RB", "LSB", "RSB", "DOT", "SEMI", "CM", "UNDERSCORE", 
            "BLOCK_COMMENT", "LINE_COMMENT", "WS", "ILLEGAL_ESCAPE", "UNCLOSE_STRING", 
            "ERROR_CHAR" ]

    ruleNames = [ "Letter", "Digit", "Exponent", "BOOLEANTYPE", "BREAK", 
                  "CONTINUE", "ELSE", "FOR", "FLOATTYPE", "IF", "INTTYPE", 
                  "RETURN", "VOIDTYPE", "DO", "WHILE", "TRUE", "FALSE", 
                  "STRINGTYPE", "ID", "ADD", "SUB", "MUL", "DIV", "NOT", 
                  "MOD", "OR", "AND", "NEQ", "EQ", "LESS", "GRATER", "LEQ", 
                  "GEQ", "ASSIGN", "INTLIT", "FLOATLIT", "BOOLEANLIT", "STRINGLIT", 
                  "LP", "RP", "LB", "RB", "LSB", "RSB", "DOT", "SEMI", "CM", 
                  "UNDERSCORE", "BLOCK_COMMENT", "LINE_COMMENT", "WS", "ILLEGAL_ESCAPE", 
                  "UNCLOSE_STRING", "ERROR_CHAR" ]

    grammarFileName = "MC.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


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


    def action(self, localctx:RuleContext, ruleIndex:int, actionIndex:int):
        if self._actions is None:
            actions = dict()
            actions[37] = self.STRINGLIT_action 
            actions[51] = self.ILLEGAL_ESCAPE_action 
            actions[52] = self.UNCLOSE_STRING_action 
            self._actions = actions
        action = self._actions.get(ruleIndex, None)
        if action is not None:
            action(localctx, actionIndex)
        else:
            raise Exception("No registered action for:" + str(ruleIndex))


    def STRINGLIT_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 0:
             self.text = self.text.lstrip('"').rstrip('"') 
     

    def ILLEGAL_ESCAPE_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 1:
            self.text =  self.text.lstrip('"')
     

    def UNCLOSE_STRING_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 2:
             self.text = self.text.lstrip('"') 
     


