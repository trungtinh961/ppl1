# Generated from main/mc/parser/MC.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


from lexererr import *



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63")
        buf.write("\u0188\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36")
        buf.write("\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%")
        buf.write("\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.")
        buf.write("\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64")
        buf.write("\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3")
        buf.write("\4\3\4\5\4v\n\4\3\4\6\4y\n\4\r\4\16\4z\3\5\3\5\3\6\3\6")
        buf.write("\3\7\6\7\u0082\n\7\r\7\16\7\u0083\3\b\6\b\u0087\n\b\r")
        buf.write("\b\16\b\u0088\3\b\3\b\5\b\u008d\n\b\3\b\5\b\u0090\n\b")
        buf.write("\3\b\7\b\u0093\n\b\f\b\16\b\u0096\13\b\3\b\7\b\u0099\n")
        buf.write("\b\f\b\16\b\u009c\13\b\3\b\3\b\6\b\u00a0\n\b\r\b\16\b")
        buf.write("\u00a1\3\b\3\b\5\b\u00a6\n\b\5\b\u00a8\n\b\3\t\3\t\5\t")
        buf.write("\u00ac\n\t\3\n\3\n\3\n\3\n\7\n\u00b2\n\n\f\n\16\n\u00b5")
        buf.write("\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3")
        buf.write("\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3")
        buf.write("\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17")
        buf.write("\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22")
        buf.write("\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24")
        buf.write("\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26")
        buf.write("\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30")
        buf.write("\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32")
        buf.write("\u0110\n\32\3\32\3\32\3\32\7\32\u0115\n\32\f\32\16\32")
        buf.write("\u0118\13\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3")
        buf.write("\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$")
        buf.write("\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3")
        buf.write(",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3")
        buf.write("\62\3\62\7\62\u0152\n\62\f\62\16\62\u0155\13\62\3\62\3")
        buf.write("\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0160\n\63")
        buf.write("\f\63\16\63\u0163\13\63\3\63\3\63\3\64\6\64\u0168\n\64")
        buf.write("\r\64\16\64\u0169\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0172")
        buf.write("\n\65\f\65\16\65\u0175\13\65\3\65\3\65\3\65\3\65\3\65")
        buf.write("\3\66\3\66\3\66\3\66\7\66\u0180\n\66\f\66\16\66\u0183")
        buf.write("\13\66\3\66\3\66\3\67\3\67\3\u0153\28\3\2\5\2\7\2\t\2")
        buf.write("\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37")
        buf.write("\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67")
        buf.write("\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)")
        buf.write("[*]+_,a-c.e/g\60i\61k\62m\63\3\2\n\4\2C\\c|\3\2\62;\4")
        buf.write("\2GGgg\t\2$$^^ddhhppttvv\6\2\f\f\17\17$$^^\4\2\f\f\17")
        buf.write("\17\5\2\13\f\17\17\"\"\4\2$$^^\2\u019b\2\r\3\2\2\2\2\17")
        buf.write("\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3")
        buf.write("\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2")
        buf.write("\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3")
        buf.write("\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2")
        buf.write("\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3")
        buf.write("\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E")
        buf.write("\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2")
        buf.write("O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2")
        buf.write("\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2")
        buf.write("\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2")
        buf.write("\2\2\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\t|\3")
        buf.write("\2\2\2\13~\3\2\2\2\r\u0081\3\2\2\2\17\u00a7\3\2\2\2\21")
        buf.write("\u00ab\3\2\2\2\23\u00ad\3\2\2\2\25\u00b9\3\2\2\2\27\u00c1")
        buf.write("\3\2\2\2\31\u00c7\3\2\2\2\33\u00d0\3\2\2\2\35\u00d5\3")
        buf.write("\2\2\2\37\u00d9\3\2\2\2!\u00df\3\2\2\2#\u00e2\3\2\2\2")
        buf.write("%\u00e6\3\2\2\2\'\u00ed\3\2\2\2)\u00f2\3\2\2\2+\u00f5")
        buf.write("\3\2\2\2-\u00fb\3\2\2\2/\u0100\3\2\2\2\61\u0106\3\2\2")
        buf.write("\2\63\u010f\3\2\2\2\65\u0119\3\2\2\2\67\u011b\3\2\2\2")
        buf.write("9\u011d\3\2\2\2;\u011f\3\2\2\2=\u0121\3\2\2\2?\u0123\3")
        buf.write("\2\2\2A\u0125\3\2\2\2C\u0128\3\2\2\2E\u012b\3\2\2\2G\u012e")
        buf.write("\3\2\2\2I\u0131\3\2\2\2K\u0133\3\2\2\2M\u0135\3\2\2\2")
        buf.write("O\u0138\3\2\2\2Q\u013b\3\2\2\2S\u013d\3\2\2\2U\u013f\3")
        buf.write("\2\2\2W\u0141\3\2\2\2Y\u0143\3\2\2\2[\u0145\3\2\2\2]\u0147")
        buf.write("\3\2\2\2_\u0149\3\2\2\2a\u014b\3\2\2\2c\u014d\3\2\2\2")
        buf.write("e\u015b\3\2\2\2g\u0167\3\2\2\2i\u016d\3\2\2\2k\u017b\3")
        buf.write("\2\2\2m\u0186\3\2\2\2op\t\2\2\2p\4\3\2\2\2qr\t\3\2\2r")
        buf.write("\6\3\2\2\2su\t\4\2\2tv\5\67\34\2ut\3\2\2\2uv\3\2\2\2v")
        buf.write("x\3\2\2\2wy\5\5\3\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3")
        buf.write("\2\2\2{\b\3\2\2\2|}\7a\2\2}\n\3\2\2\2~\177\7\60\2\2\177")
        buf.write("\f\3\2\2\2\u0080\u0082\5\5\3\2\u0081\u0080\3\2\2\2\u0082")
        buf.write("\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2")
        buf.write("\u0084\16\3\2\2\2\u0085\u0087\5\5\3\2\u0086\u0085\3\2")
        buf.write("\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089")
        buf.write("\3\2\2\2\u0089\u008f\3\2\2\2\u008a\u0090\5\13\6\2\u008b")
        buf.write("\u008d\5\13\6\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2")
        buf.write("\2\u008d\u008e\3\2\2\2\u008e\u0090\5\7\4\2\u008f\u008a")
        buf.write("\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0094\3\2\2\2\u0091")
        buf.write("\u0093\5\5\3\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2")
        buf.write("\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00a8\3")
        buf.write("\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\5\5\3\2\u0098\u0097")
        buf.write("\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a")
        buf.write("\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2")
        buf.write("\u009d\u009f\5\13\6\2\u009e\u00a0\5\5\3\2\u009f\u009e")
        buf.write("\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1")
        buf.write("\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a6\3\2\2\2")
        buf.write("\u00a4\u00a6\5\7\4\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3")
        buf.write("\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u0086\3\2\2\2\u00a7\u009a")
        buf.write("\3\2\2\2\u00a8\20\3\2\2\2\u00a9\u00ac\5-\27\2\u00aa\u00ac")
        buf.write("\5/\30\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac")
        buf.write("\22\3\2\2\2\u00ad\u00b3\7$\2\2\u00ae\u00af\7^\2\2\u00af")
        buf.write("\u00b2\t\5\2\2\u00b0\u00b2\n\6\2\2\u00b1\u00ae\3\2\2\2")
        buf.write("\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3")
        buf.write("\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3")
        buf.write("\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7\u00b8\b\n\2\2\u00b8")
        buf.write("\24\3\2\2\2\u00b9\u00ba\7d\2\2\u00ba\u00bb\7q\2\2\u00bb")
        buf.write("\u00bc\7q\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7g\2\2\u00be")
        buf.write("\u00bf\7c\2\2\u00bf\u00c0\7p\2\2\u00c0\26\3\2\2\2\u00c1")
        buf.write("\u00c2\7d\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4")
        buf.write("\u00c5\7c\2\2\u00c5\u00c6\7m\2\2\u00c6\30\3\2\2\2\u00c7")
        buf.write("\u00c8\7e\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7p\2\2\u00ca")
        buf.write("\u00cb\7v\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd")
        buf.write("\u00ce\7w\2\2\u00ce\u00cf\7g\2\2\u00cf\32\3\2\2\2\u00d0")
        buf.write("\u00d1\7g\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3")
        buf.write("\u00d4\7g\2\2\u00d4\34\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6")
        buf.write("\u00d7\7q\2\2\u00d7\u00d8\7t\2\2\u00d8\36\3\2\2\2\u00d9")
        buf.write("\u00da\7h\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7q\2\2\u00dc")
        buf.write("\u00dd\7c\2\2\u00dd\u00de\7v\2\2\u00de \3\2\2\2\u00df")
        buf.write("\u00e0\7k\2\2\u00e0\u00e1\7h\2\2\u00e1\"\3\2\2\2\u00e2")
        buf.write("\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7v\2\2\u00e5")
        buf.write("$\3\2\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8")
        buf.write("\u00e9\7v\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7t\2\2\u00eb")
        buf.write("\u00ec\7p\2\2\u00ec&\3\2\2\2\u00ed\u00ee\7x\2\2\u00ee")
        buf.write("\u00ef\7q\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7f\2\2\u00f1")
        buf.write("(\3\2\2\2\u00f2\u00f3\7f\2\2\u00f3\u00f4\7q\2\2\u00f4")
        buf.write("*\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6\u00f7\7j\2\2\u00f7")
        buf.write("\u00f8\7k\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7g\2\2\u00fa")
        buf.write(",\3\2\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7t\2\2\u00fd")
        buf.write("\u00fe\7w\2\2\u00fe\u00ff\7g\2\2\u00ff.\3\2\2\2\u0100")
        buf.write("\u0101\7h\2\2\u0101\u0102\7c\2\2\u0102\u0103\7n\2\2\u0103")
        buf.write("\u0104\7u\2\2\u0104\u0105\7g\2\2\u0105\60\3\2\2\2\u0106")
        buf.write("\u0107\7u\2\2\u0107\u0108\7v\2\2\u0108\u0109\7t\2\2\u0109")
        buf.write("\u010a\7k\2\2\u010a\u010b\7p\2\2\u010b\u010c\7i\2\2\u010c")
        buf.write("\62\3\2\2\2\u010d\u0110\5\t\5\2\u010e\u0110\5\3\2\2\u010f")
        buf.write("\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0116\3\2\2\2")
        buf.write("\u0111\u0115\5\t\5\2\u0112\u0115\5\3\2\2\u0113\u0115\5")
        buf.write("\5\3\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113")
        buf.write("\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116")
        buf.write("\u0117\3\2\2\2\u0117\64\3\2\2\2\u0118\u0116\3\2\2\2\u0119")
        buf.write("\u011a\7-\2\2\u011a\66\3\2\2\2\u011b\u011c\7/\2\2\u011c")
        buf.write("8\3\2\2\2\u011d\u011e\7,\2\2\u011e:\3\2\2\2\u011f\u0120")
        buf.write("\7\61\2\2\u0120<\3\2\2\2\u0121\u0122\7#\2\2\u0122>\3\2")
        buf.write("\2\2\u0123\u0124\7\'\2\2\u0124@\3\2\2\2\u0125\u0126\7")
        buf.write("~\2\2\u0126\u0127\7~\2\2\u0127B\3\2\2\2\u0128\u0129\7")
        buf.write("(\2\2\u0129\u012a\7(\2\2\u012aD\3\2\2\2\u012b\u012c\7")
        buf.write("#\2\2\u012c\u012d\7?\2\2\u012dF\3\2\2\2\u012e\u012f\7")
        buf.write("?\2\2\u012f\u0130\7?\2\2\u0130H\3\2\2\2\u0131\u0132\7")
        buf.write(">\2\2\u0132J\3\2\2\2\u0133\u0134\7@\2\2\u0134L\3\2\2\2")
        buf.write("\u0135\u0136\7>\2\2\u0136\u0137\7?\2\2\u0137N\3\2\2\2")
        buf.write("\u0138\u0139\7@\2\2\u0139\u013a\7?\2\2\u013aP\3\2\2\2")
        buf.write("\u013b\u013c\7?\2\2\u013cR\3\2\2\2\u013d\u013e\7*\2\2")
        buf.write("\u013eT\3\2\2\2\u013f\u0140\7+\2\2\u0140V\3\2\2\2\u0141")
        buf.write("\u0142\7}\2\2\u0142X\3\2\2\2\u0143\u0144\7\177\2\2\u0144")
        buf.write("Z\3\2\2\2\u0145\u0146\7]\2\2\u0146\\\3\2\2\2\u0147\u0148")
        buf.write("\7_\2\2\u0148^\3\2\2\2\u0149\u014a\7=\2\2\u014a`\3\2\2")
        buf.write("\2\u014b\u014c\7.\2\2\u014cb\3\2\2\2\u014d\u014e\7\61")
        buf.write("\2\2\u014e\u014f\7,\2\2\u014f\u0153\3\2\2\2\u0150\u0152")
        buf.write("\13\2\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153")
        buf.write("\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\3\2\2\2")
        buf.write("\u0155\u0153\3\2\2\2\u0156\u0157\7,\2\2\u0157\u0158\7")
        buf.write("\61\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b\62\3\2\u015a")
        buf.write("d\3\2\2\2\u015b\u015c\7\61\2\2\u015c\u015d\7\61\2\2\u015d")
        buf.write("\u0161\3\2\2\2\u015e\u0160\n\7\2\2\u015f\u015e\3\2\2\2")
        buf.write("\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3")
        buf.write("\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165")
        buf.write("\b\63\3\2\u0165f\3\2\2\2\u0166\u0168\t\b\2\2\u0167\u0166")
        buf.write("\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169")
        buf.write("\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b\64\3")
        buf.write("\2\u016ch\3\2\2\2\u016d\u0173\7$\2\2\u016e\u016f\7^\2")
        buf.write("\2\u016f\u0172\t\5\2\2\u0170\u0172\n\t\2\2\u0171\u016e")
        buf.write("\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173")
        buf.write("\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2")
        buf.write("\u0175\u0173\3\2\2\2\u0176\u0177\7^\2\2\u0177\u0178\n")
        buf.write("\5\2\2\u0178\u0179\3\2\2\2\u0179\u017a\b\65\4\2\u017a")
        buf.write("j\3\2\2\2\u017b\u0181\7$\2\2\u017c\u017d\7^\2\2\u017d")
        buf.write("\u0180\t\5\2\2\u017e\u0180\n\6\2\2\u017f\u017c\3\2\2\2")
        buf.write("\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3")
        buf.write("\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181")
        buf.write("\3\2\2\2\u0184\u0185\b\66\5\2\u0185l\3\2\2\2\u0186\u0187")
        buf.write("\13\2\2\2\u0187n\3\2\2\2\33\2uz\u0083\u0088\u008c\u008f")
        buf.write("\u0094\u009a\u00a1\u00a5\u00a7\u00ab\u00b1\u00b3\u010f")
        buf.write("\u0114\u0116\u0153\u0161\u0169\u0171\u0173\u017f\u0181")
        buf.write("\6\3\n\2\b\2\2\3\65\3\3\66\4")
        return buf.getvalue()


class MCLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    INTLIT = 1
    FLOATLIT = 2
    BOOLEANLIT = 3
    STRINGLIT = 4
    BOOLEANTYPE = 5
    BREAK = 6
    CONTINUE = 7
    ELSE = 8
    FOR = 9
    FLOATTYPE = 10
    IF = 11
    INTTYPE = 12
    RETURN = 13
    VOIDTYPE = 14
    DO = 15
    WHILE = 16
    TRUE = 17
    FALSE = 18
    STRINGTYPE = 19
    ID = 20
    ADD = 21
    SUB = 22
    MUL = 23
    DIV = 24
    NOT = 25
    MOD = 26
    OR = 27
    AND = 28
    NEQ = 29
    EQ = 30
    LESS = 31
    GRATER = 32
    LEQ = 33
    GEQ = 34
    ASSIGN = 35
    LP = 36
    RP = 37
    LB = 38
    RB = 39
    LSB = 40
    RSB = 41
    SEMI = 42
    CM = 43
    BLOCK_COMMENT = 44
    LINE_COMMENT = 45
    WS = 46
    ILLEGAL_ESCAPE = 47
    UNCLOSE_STRING = 48
    ERROR_CHAR = 49

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'boolean'", "'break'", "'continue'", "'else'", "'for'", "'float'", 
            "'if'", "'int'", "'return'", "'void'", "'do'", "'while'", "'true'", 
            "'false'", "'string'", "'+'", "'-'", "'*'", "'/'", "'!'", "'%'", 
            "'||'", "'&&'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", 
            "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','" ]

    symbolicNames = [ "<INVALID>",
            "INTLIT", "FLOATLIT", "BOOLEANLIT", "STRINGLIT", "BOOLEANTYPE", 
            "BREAK", "CONTINUE", "ELSE", "FOR", "FLOATTYPE", "IF", "INTTYPE", 
            "RETURN", "VOIDTYPE", "DO", "WHILE", "TRUE", "FALSE", "STRINGTYPE", 
            "ID", "ADD", "SUB", "MUL", "DIV", "NOT", "MOD", "OR", "AND", 
            "NEQ", "EQ", "LESS", "GRATER", "LEQ", "GEQ", "ASSIGN", "LP", 
            "RP", "LB", "RB", "LSB", "RSB", "SEMI", "CM", "BLOCK_COMMENT", 
            "LINE_COMMENT", "WS", "ILLEGAL_ESCAPE", "UNCLOSE_STRING", "ERROR_CHAR" ]

    ruleNames = [ "Letter", "Digit", "Exponent", "Underscore", "Dot", "INTLIT", 
                  "FLOATLIT", "BOOLEANLIT", "STRINGLIT", "BOOLEANTYPE", 
                  "BREAK", "CONTINUE", "ELSE", "FOR", "FLOATTYPE", "IF", 
                  "INTTYPE", "RETURN", "VOIDTYPE", "DO", "WHILE", "TRUE", 
                  "FALSE", "STRINGTYPE", "ID", "ADD", "SUB", "MUL", "DIV", 
                  "NOT", "MOD", "OR", "AND", "NEQ", "EQ", "LESS", "GRATER", 
                  "LEQ", "GEQ", "ASSIGN", "LP", "RP", "LB", "RB", "LSB", 
                  "RSB", "SEMI", "CM", "BLOCK_COMMENT", "LINE_COMMENT", 
                  "WS", "ILLEGAL_ESCAPE", "UNCLOSE_STRING", "ERROR_CHAR" ]

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
            actions[8] = self.STRINGLIT_action 
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
     


