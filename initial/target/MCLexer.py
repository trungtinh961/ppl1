# Generated from main/mc/parser/MC.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


from lexererr import *



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64")
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
        buf.write("\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3")
        buf.write("\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n")
        buf.write("\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f")
        buf.write("\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3")
        buf.write("\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21")
        buf.write("\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23")
        buf.write("\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25")
        buf.write("\3\25\5\25\u00d5\n\25\3\25\3\25\3\25\7\25\u00da\n\25\f")
        buf.write("\25\16\25\u00dd\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3")
        buf.write("\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35")
        buf.write("\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3")
        buf.write("\"\3\"\3#\3#\3#\3$\3$\3%\6%\u0104\n%\r%\16%\u0105\3&\6")
        buf.write("&\u0109\n&\r&\16&\u010a\3&\3&\5&\u010f\n&\3&\5&\u0112")
        buf.write("\n&\3&\7&\u0115\n&\f&\16&\u0118\13&\3&\7&\u011b\n&\f&")
        buf.write("\16&\u011e\13&\3&\3&\6&\u0122\n&\r&\16&\u0123\3&\3&\5")
        buf.write("&\u0128\n&\5&\u012a\n&\3\'\3\'\5\'\u012e\n\'\3(\3(\3(")
        buf.write("\3(\7(\u0134\n(\f(\16(\u0137\13(\3(\3(\3(\3)\3)\3*\3*")
        buf.write("\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62")
        buf.write("\3\62\3\62\3\62\7\62\u0152\n\62\f\62\16\62\u0155\13\62")
        buf.write("\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0160")
        buf.write("\n\63\f\63\16\63\u0163\13\63\3\63\3\63\3\64\6\64\u0168")
        buf.write("\n\64\r\64\16\64\u0169\3\64\3\64\3\65\3\65\3\65\3\65\7")
        buf.write("\65\u0172\n\65\f\65\16\65\u0175\13\65\3\65\3\65\3\65\3")
        buf.write("\65\3\65\3\66\3\66\3\66\3\66\7\66\u0180\n\66\f\66\16\66")
        buf.write("\u0183\13\66\3\66\3\66\3\67\3\67\3\u0153\28\3\2\5\2\7")
        buf.write("\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35")
        buf.write("\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65")
        buf.write("\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(")
        buf.write("W)Y*[+],_-a.c/e\60g\61i\62k\63m\64\3\2\n\4\2C\\c|\3\2")
        buf.write("\62;\4\2GGgg\t\2$$^^ddhhppttvv\6\2\f\f\17\17$$^^\4\2\f")
        buf.write("\f\17\17\5\2\13\f\17\17\"\"\3\2^^\2\u019c\2\13\3\2\2\2")
        buf.write("\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2")
        buf.write("\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35")
        buf.write("\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2")
        buf.write("\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2")
        buf.write("\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2")
        buf.write("\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2")
        buf.write("\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2")
        buf.write("\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3")
        buf.write("\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_")
        buf.write("\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2")
        buf.write("i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2")
        buf.write("\7s\3\2\2\2\t|\3\2\2\2\13~\3\2\2\2\r\u0086\3\2\2\2\17")
        buf.write("\u008c\3\2\2\2\21\u0095\3\2\2\2\23\u009a\3\2\2\2\25\u009e")
        buf.write("\3\2\2\2\27\u00a4\3\2\2\2\31\u00a7\3\2\2\2\33\u00ab\3")
        buf.write("\2\2\2\35\u00b2\3\2\2\2\37\u00b7\3\2\2\2!\u00ba\3\2\2")
        buf.write("\2#\u00c0\3\2\2\2%\u00c5\3\2\2\2\'\u00cb\3\2\2\2)\u00d4")
        buf.write("\3\2\2\2+\u00de\3\2\2\2-\u00e0\3\2\2\2/\u00e2\3\2\2\2")
        buf.write("\61\u00e4\3\2\2\2\63\u00e6\3\2\2\2\65\u00e8\3\2\2\2\67")
        buf.write("\u00ea\3\2\2\29\u00ed\3\2\2\2;\u00f0\3\2\2\2=\u00f3\3")
        buf.write("\2\2\2?\u00f6\3\2\2\2A\u00f8\3\2\2\2C\u00fa\3\2\2\2E\u00fd")
        buf.write("\3\2\2\2G\u0100\3\2\2\2I\u0103\3\2\2\2K\u0129\3\2\2\2")
        buf.write("M\u012d\3\2\2\2O\u012f\3\2\2\2Q\u013b\3\2\2\2S\u013d\3")
        buf.write("\2\2\2U\u013f\3\2\2\2W\u0141\3\2\2\2Y\u0143\3\2\2\2[\u0145")
        buf.write("\3\2\2\2]\u0147\3\2\2\2_\u0149\3\2\2\2a\u014b\3\2\2\2")
        buf.write("c\u014d\3\2\2\2e\u015b\3\2\2\2g\u0167\3\2\2\2i\u016d\3")
        buf.write("\2\2\2k\u017b\3\2\2\2m\u0186\3\2\2\2op\t\2\2\2p\4\3\2")
        buf.write("\2\2qr\t\3\2\2r\6\3\2\2\2su\t\4\2\2tv\5-\27\2ut\3\2\2")
        buf.write("\2uv\3\2\2\2vx\3\2\2\2wy\5\5\3\2xw\3\2\2\2yz\3\2\2\2z")
        buf.write("x\3\2\2\2z{\3\2\2\2{\b\3\2\2\2|}\7a\2\2}\n\3\2\2\2~\177")
        buf.write("\7d\2\2\177\u0080\7q\2\2\u0080\u0081\7q\2\2\u0081\u0082")
        buf.write("\7n\2\2\u0082\u0083\7g\2\2\u0083\u0084\7c\2\2\u0084\u0085")
        buf.write("\7p\2\2\u0085\f\3\2\2\2\u0086\u0087\7d\2\2\u0087\u0088")
        buf.write("\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7c\2\2\u008a\u008b")
        buf.write("\7m\2\2\u008b\16\3\2\2\2\u008c\u008d\7e\2\2\u008d\u008e")
        buf.write("\7q\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\u0091")
        buf.write("\7k\2\2\u0091\u0092\7p\2\2\u0092\u0093\7w\2\2\u0093\u0094")
        buf.write("\7g\2\2\u0094\20\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097")
        buf.write("\7n\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\22")
        buf.write("\3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c\7q\2\2\u009c\u009d")
        buf.write("\7t\2\2\u009d\24\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0")
        buf.write("\7n\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3")
        buf.write("\7v\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6")
        buf.write("\7h\2\2\u00a6\30\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9")
        buf.write("\7p\2\2\u00a9\u00aa\7v\2\2\u00aa\32\3\2\2\2\u00ab\u00ac")
        buf.write("\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af")
        buf.write("\7w\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7p\2\2\u00b1\34")
        buf.write("\3\2\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5")
        buf.write("\7k\2\2\u00b5\u00b6\7f\2\2\u00b6\36\3\2\2\2\u00b7\u00b8")
        buf.write("\7f\2\2\u00b8\u00b9\7q\2\2\u00b9 \3\2\2\2\u00ba\u00bb")
        buf.write("\7y\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be")
        buf.write("\7n\2\2\u00be\u00bf\7g\2\2\u00bf\"\3\2\2\2\u00c0\u00c1")
        buf.write("\7v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4")
        buf.write("\7g\2\2\u00c4$\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7")
        buf.write("\7c\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca")
        buf.write("\7g\2\2\u00ca&\3\2\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd")
        buf.write("\7v\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0")
        buf.write("\7p\2\2\u00d0\u00d1\7i\2\2\u00d1(\3\2\2\2\u00d2\u00d5")
        buf.write("\5\t\5\2\u00d3\u00d5\5\3\2\2\u00d4\u00d2\3\2\2\2\u00d4")
        buf.write("\u00d3\3\2\2\2\u00d5\u00db\3\2\2\2\u00d6\u00da\5\t\5\2")
        buf.write("\u00d7\u00da\5\3\2\2\u00d8\u00da\5\5\3\2\u00d9\u00d6\3")
        buf.write("\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd")
        buf.write("\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc")
        buf.write("*\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7-\2\2\u00df")
        buf.write(",\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1.\3\2\2\2\u00e2\u00e3")
        buf.write("\7,\2\2\u00e3\60\3\2\2\2\u00e4\u00e5\7\61\2\2\u00e5\62")
        buf.write("\3\2\2\2\u00e6\u00e7\7#\2\2\u00e7\64\3\2\2\2\u00e8\u00e9")
        buf.write("\7\'\2\2\u00e9\66\3\2\2\2\u00ea\u00eb\7~\2\2\u00eb\u00ec")
        buf.write("\7~\2\2\u00ec8\3\2\2\2\u00ed\u00ee\7(\2\2\u00ee\u00ef")
        buf.write("\7(\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2")
        buf.write("\7?\2\2\u00f2<\3\2\2\2\u00f3\u00f4\7?\2\2\u00f4\u00f5")
        buf.write("\7?\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7@\3\2\2")
        buf.write("\2\u00f8\u00f9\7@\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7>\2")
        buf.write("\2\u00fb\u00fc\7?\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7@\2")
        buf.write("\2\u00fe\u00ff\7?\2\2\u00ffF\3\2\2\2\u0100\u0101\7?\2")
        buf.write("\2\u0101H\3\2\2\2\u0102\u0104\5\5\3\2\u0103\u0102\3\2")
        buf.write("\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106")
        buf.write("\3\2\2\2\u0106J\3\2\2\2\u0107\u0109\5\5\3\2\u0108\u0107")
        buf.write("\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a")
        buf.write("\u010b\3\2\2\2\u010b\u0111\3\2\2\2\u010c\u0112\5]/\2\u010d")
        buf.write("\u010f\5]/\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f")
        buf.write("\u0110\3\2\2\2\u0110\u0112\5\7\4\2\u0111\u010c\3\2\2\2")
        buf.write("\u0111\u010e\3\2\2\2\u0112\u0116\3\2\2\2\u0113\u0115\5")
        buf.write("\5\3\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114")
        buf.write("\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u012a\3\2\2\2\u0118")
        buf.write("\u0116\3\2\2\2\u0119\u011b\5\5\3\2\u011a\u0119\3\2\2\2")
        buf.write("\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3")
        buf.write("\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121")
        buf.write("\5]/\2\u0120\u0122\5\5\3\2\u0121\u0120\3\2\2\2\u0122\u0123")
        buf.write("\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124")
        buf.write("\u0127\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0128\5\7\4\2")
        buf.write("\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u012a\3")
        buf.write("\2\2\2\u0129\u0108\3\2\2\2\u0129\u011c\3\2\2\2\u012aL")
        buf.write("\3\2\2\2\u012b\u012e\5#\22\2\u012c\u012e\5%\23\2\u012d")
        buf.write("\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012eN\3\2\2\2\u012f")
        buf.write("\u0135\7$\2\2\u0130\u0131\7^\2\2\u0131\u0134\t\5\2\2\u0132")
        buf.write("\u0134\n\6\2\2\u0133\u0130\3\2\2\2\u0133\u0132\3\2\2\2")
        buf.write("\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3")
        buf.write("\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139")
        buf.write("\7$\2\2\u0139\u013a\b(\2\2\u013aP\3\2\2\2\u013b\u013c")
        buf.write("\7*\2\2\u013cR\3\2\2\2\u013d\u013e\7+\2\2\u013eT\3\2\2")
        buf.write("\2\u013f\u0140\7}\2\2\u0140V\3\2\2\2\u0141\u0142\7\177")
        buf.write("\2\2\u0142X\3\2\2\2\u0143\u0144\7]\2\2\u0144Z\3\2\2\2")
        buf.write("\u0145\u0146\7_\2\2\u0146\\\3\2\2\2\u0147\u0148\7\60\2")
        buf.write("\2\u0148^\3\2\2\2\u0149\u014a\7=\2\2\u014a`\3\2\2\2\u014b")
        buf.write("\u014c\7.\2\2\u014cb\3\2\2\2\u014d\u014e\7\61\2\2\u014e")
        buf.write("\u014f\7,\2\2\u014f\u0153\3\2\2\2\u0150\u0152\13\2\2\2")
        buf.write("\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0154\3")
        buf.write("\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153")
        buf.write("\3\2\2\2\u0156\u0157\7,\2\2\u0157\u0158\7\61\2\2\u0158")
        buf.write("\u0159\3\2\2\2\u0159\u015a\b\62\3\2\u015ad\3\2\2\2\u015b")
        buf.write("\u015c\7\61\2\2\u015c\u015d\7\61\2\2\u015d\u0161\3\2\2")
        buf.write("\2\u015e\u0160\n\7\2\2\u015f\u015e\3\2\2\2\u0160\u0163")
        buf.write("\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162")
        buf.write("\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\b\63\3")
        buf.write("\2\u0165f\3\2\2\2\u0166\u0168\t\b\2\2\u0167\u0166\3\2")
        buf.write("\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a")
        buf.write("\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b\64\3\2\u016c")
        buf.write("h\3\2\2\2\u016d\u0173\7$\2\2\u016e\u016f\7^\2\2\u016f")
        buf.write("\u0172\t\5\2\2\u0170\u0172\n\t\2\2\u0171\u016e\3\2\2\2")
        buf.write("\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3")
        buf.write("\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173")
        buf.write("\3\2\2\2\u0176\u0177\7^\2\2\u0177\u0178\n\5\2\2\u0178")
        buf.write("\u0179\3\2\2\2\u0179\u017a\b\65\4\2\u017aj\3\2\2\2\u017b")
        buf.write("\u0181\7$\2\2\u017c\u017d\7^\2\2\u017d\u0180\t\5\2\2\u017e")
        buf.write("\u0180\n\6\2\2\u017f\u017c\3\2\2\2\u017f\u017e\3\2\2\2")
        buf.write("\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3")
        buf.write("\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185")
        buf.write("\b\66\5\2\u0185l\3\2\2\2\u0186\u0187\13\2\2\2\u0187n\3")
        buf.write("\2\2\2\33\2uz\u00d4\u00d9\u00db\u0105\u010a\u010e\u0111")
        buf.write("\u0116\u011c\u0123\u0127\u0129\u012d\u0133\u0135\u0153")
        buf.write("\u0161\u0169\u0171\u0173\u017f\u0181\6\3(\2\b\2\2\3\65")
        buf.write("\3\3\66\4")
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
    BLOCK_COMMENT = 45
    LINE_COMMENT = 46
    WS = 47
    ILLEGAL_ESCAPE = 48
    UNCLOSE_STRING = 49
    ERROR_CHAR = 50

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'boolean'", "'break'", "'continue'", "'else'", "'for'", "'float'", 
            "'if'", "'int'", "'return'", "'void'", "'do'", "'while'", "'true'", 
            "'false'", "'string'", "'+'", "'-'", "'*'", "'/'", "'!'", "'%'", 
            "'||'", "'&&'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", 
            "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "';'", 
            "','" ]

    symbolicNames = [ "<INVALID>",
            "BOOLEANTYPE", "BREAK", "CONTINUE", "ELSE", "FOR", "FLOATTYPE", 
            "IF", "INTTYPE", "RETURN", "VOIDTYPE", "DO", "WHILE", "TRUE", 
            "FALSE", "STRINGTYPE", "ID", "ADD", "SUB", "MUL", "DIV", "NOT", 
            "MOD", "OR", "AND", "NEQ", "EQ", "LESS", "GRATER", "LEQ", "GEQ", 
            "ASSIGN", "INTLIT", "FLOATLIT", "BOOLEANLIT", "STRINGLIT", "LP", 
            "RP", "LB", "RB", "LSB", "RSB", "DOT", "SEMI", "CM", "BLOCK_COMMENT", 
            "LINE_COMMENT", "WS", "ILLEGAL_ESCAPE", "UNCLOSE_STRING", "ERROR_CHAR" ]

    ruleNames = [ "Letter", "Digit", "Exponent", "Underscore", "BOOLEANTYPE", 
                  "BREAK", "CONTINUE", "ELSE", "FOR", "FLOATTYPE", "IF", 
                  "INTTYPE", "RETURN", "VOIDTYPE", "DO", "WHILE", "TRUE", 
                  "FALSE", "STRINGTYPE", "ID", "ADD", "SUB", "MUL", "DIV", 
                  "NOT", "MOD", "OR", "AND", "NEQ", "EQ", "LESS", "GRATER", 
                  "LEQ", "GEQ", "ASSIGN", "INTLIT", "FLOATLIT", "BOOLEANLIT", 
                  "STRINGLIT", "LP", "RP", "LB", "RB", "LSB", "RSB", "DOT", 
                  "SEMI", "CM", "BLOCK_COMMENT", "LINE_COMMENT", "WS", "ILLEGAL_ESCAPE", 
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
            actions[38] = self.STRINGLIT_action 
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
     


