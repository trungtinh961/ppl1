import unittest
from TestUtils import TestLexer

class LexerSuite(unittest.TestCase):
      
    def test_lower_identifier_1(self):
        """test identifiers"""
        self.assertTrue(TestLexer.checkLexeme(""" abc___ ""","abc___,<EOF>",101))    
    def test_identifier_2(self):
        """test identifiers"""
        self.assertTrue(TestLexer.checkLexeme("""abc""","abc,<EOF>",102))
    def test_identifier_3(self):
        """test identifiers"""
        self.assertTrue(TestLexer.checkLexeme("""abc 234abc _234abc""","abc,234,abc,_234abc,<EOF>",103))
    def test_identifier_4(self):
        """test identifiers"""
        self.assertTrue(TestLexer.checkLexeme("""abc _abc_123 123_/* abc */ ""","abc,_abc_123,123,_,<EOF>",104))

    def test_lower_upper_id_1(self):
        self.assertTrue(TestLexer.checkLexeme("""aCBbdc""","aCBbdc,<EOF>",105))
    def test_lower_upper_id_2(self):
        self.assertTrue(TestLexer.checkLexeme("""qwert qWeRt123 ""","qwert,qWeRt123,<EOF>",106))
    def test_wrong_token_1(self):
        self.assertTrue(TestLexer.checkLexeme("""aA?sVN""","aA,Error Token ?",107))
    def test_wrong_token_2(self):
        self.assertTrue(TestLexer.checkLexeme("""cbutw@qpd nguyen#a""","cbutw,Error Token @",108))
    def test_wrong_token_3(self):
        self.assertTrue(TestLexer.checkLexeme("""nguyen#a""","nguyen,Error Token #",109))
    def test_wrong_token_4(self):
        self.assertTrue(TestLexer.checkLexeme("""nguyen$a""","nguyen,Error Token $",110))

    def test_keywork_1(self):
        """test keywork"""
        self.assertTrue(TestLexer.checkLexeme("""boolean if main int float return string""","boolean,if,main,int,float,return,string,<EOF>",111))
    def test_keywork_2(self):
        """test keywork"""
        self.assertTrue(TestLexer.checkLexeme("""Boolean iF mAin iNt fLoat retuRn string""","Boolean,iF,mAin,iNt,fLoat,retuRn,string,<EOF>",112))
    def test_keywork_3(self):
        """test keywork"""
        self.assertTrue(TestLexer.checkLexeme("""BreaK bREAK BrEAk bReAK break""","BreaK,bREAK,BrEAk,bReAK,break,<EOF>",113))
    def test_keywork_4(self):
        """test keywork"""
        self.assertTrue(TestLexer.checkLexeme("""coNTinue coNTinue coNTINuE cONtiNUe continue""","coNTinue,coNTinue,coNTINuE,cONtiNUe,continue,<EOF>",114))
    def test_keywork_5(self):
        """test keywork"""
        self.assertTrue(TestLexer.checkLexeme(""" intEgeR Float StrIng BoOleaN ""","intEgeR,Float,StrIng,BoOleaN,<EOF>",115))
    def test_keywork_6(self):
        """test keywork"""
        self.assertTrue(TestLexer.checkLexeme(""" boolean break continue else for float if int return void do while true false string ""","boolean,break,continue,else,for,float,if,int,return,void,do,while,true,false,string,<EOF>",116))

    def test_integer_1(self):
        """test integers"""
        self.assertTrue(TestLexer.checkLexeme(""" 123a123 ""","123,a123,<EOF>",117))
    def test_integer_2(self):
        """test integers"""
        self.assertTrue(TestLexer.checkLexeme(""" 13 -9 0 100 055 12222222 9999999999999 123aaaa abc123 ""","13 -9 0 100 055 12222222 9999999999999 123aaaa abc123,<EOF>",117))





    def test_block_comment1(self):
        """test block comment"""
        self.assertTrue(TestLexer.checkLexeme("/* aa\naaaaaa */","<EOF>",105))
    def test_block_comment2(self):
        """test block comment"""
        self.assertTrue(TestLexer.checkLexeme("/* //aaaaaaaa */","<EOF>",106))
    def test_block_comment3(self):
        """test block comment"""
        self.assertTrue(TestLexer.checkLexeme("/* /*aaaaaaaa 45678 abcdef */","<EOF>",107))

    def test_line_comment1(self):
        """test line comment"""
        self.assertTrue(TestLexer.checkLexeme("//abcdef ","<EOF>",108))
    def test_line_comment2(self):
        """test line comment"""
        self.assertTrue(TestLexer.checkLexeme("//abcdef  /* asadasdas */","<EOF>",109))
    def test_line_comment3(self):
        """test line comment"""
        self.assertTrue(TestLexer.checkLexeme("//abcdef //////*****/ 123456","<EOF>",110))
    def test_line_comment4(self):
        """test line comment"""
        self.assertTrue(TestLexer.checkLexeme("123abc//abcdef 123456 /* asadasdas */","123,abc,<EOF>",111))


    def test_floatlit1(self):
        """test floatlit"""
        self.assertTrue(TestLexer.checkLexeme("1.2 1. .1 1e2 1.2E-2 1.2e-2 .1E2 9.0 12e8 0.33E-3 128e-42","1.2,1.,.1,1e2,1.2E-2,1.2e-2,.1E2,9.0,12e8,0.33E-3,128e-42,<EOF>",117))
    def test_floatlit2(self):
        """test floatlit"""
        self.assertTrue(TestLexer.checkLexeme("143e e-12 .e2 e.2 15 1.564e-9abc","143,e,e,-,12,.,e2,e,.2,15,1.564e-9,abc,<EOF>",118))
    def test_floatlit3(self):
        """test floatlit"""
        self.assertTrue(TestLexer.checkLexeme("12.e12","12.e12,<EOF>",119))

    def test_string(self):
        """test string"""
        self.assertTrue(TestLexer.checkLexeme(""" "123a\\n123" ""","""123a\\n123,<EOF>""",120))

    def test_unclose_string(self):
        """test unclose string"""
        self.assertTrue(TestLexer.checkLexeme(""" "123a\\n123 ""","""Unclosed String: 123a\\n123 """,121))

    def test_illegal_escape(self):
        """test illegal escape"""
        self.assertTrue(TestLexer.checkLexeme(""" 123 "12\\t3\\am123" ""","""123,Illegal Escape In String: 12\\t3\\a""",123))

    def test_double_slash(self):
        """test double slash"""
        self.assertTrue(TestLexer.checkLexeme(""" "abc\\\nabc" ""","""Illegal Escape In String: abc\\\n""",124))
