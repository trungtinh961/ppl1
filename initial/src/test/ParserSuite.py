import unittest
from TestUtils import TestParser

class ParserSuite(unittest.TestCase):

    def test_simple_program(self):
        """Simple program: int main() {} """
        input = """int main() {
            
        }"""
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,201))

    def test_more_complex_program(self):
        """More complex program"""
        input = """int main () {
            putIntLn(4);
        }"""
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,202))
    
    def test_wrong_miss_close(self):
        """Miss ) int main( {}"""
        input = """int main( {}"""
        expect = "Error on line 1 col 10: {"
        self.assertTrue(TestParser.checkParser(input,expect,203))

    def test_variable_declaration_1(self):
        """Variable declaration"""
        input = """int i,j,k[5];"""
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,204))
    
    def test_variable_declaration_2(self):
        """Variable declaration"""
        input = """float f = 1.0;"""
        expect = "Error on line 1 col 8: ="
        self.assertTrue(TestParser.checkParser(input,expect,205))

    def test_variable_declaration_3(self):
        """Variable declaration"""
        input = """int a[];"""
        expect = "Error on line 1 col 6: ]"
        self.assertTrue(TestParser.checkParser(input,expect,206))

    def test_variable_declaration_4(self):
        """Variable declaration"""
        input = """int a[1]"""
        expect = "Error on line 1 col 8: <EOF>"
        self.assertTrue(TestParser.checkParser(input,expect,207))

    def test_function_declaration_1(self):
        """Function declaration"""
        input = """
        void foo ( int i );
        """
        expect = "Error on line 2 col 26: ;"
        self.assertTrue(TestParser.checkParser(input,expect,208))

    def test_function_declaration_2(self):
        """Function declaration"""
        input = """
        void foo ( int i ){}
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,209))
    
    def test_function_declaration_3(self):
        """Function declaration"""
        input = """
        void foo ( int i ){
            int child_of_foo ( float f ) {} 
        }
        """
        expect = "Error on line 3 col 29: ("
        self.assertTrue(TestParser.checkParser(input,expect,210))

    def test_function_declaration_4(self):
        """Function declaration"""
        input = """
        int[] foo(int a, float b[]) {
            int c[3];
            if (a>0) foo(a-1,b);
            return c; 
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,211))

    def test_function_declaration_5(self):
        """Function declaration"""
        input = """
            void foo ( int i ){
                int boolean a;
            }
        """
        expect = "Error on line 3 col 20: boolean"
        self.assertTrue(TestParser.checkParser(input,expect,212))
    
    def test_function_declaration_6(self):
        """Function declaration"""
        input = """
            void foo (int a, b, c){
                int boolean a;
            }
        """
        expect = "Error on line 2 col 29: b"
        self.assertTrue(TestParser.checkParser(input,expect,213))
    
    
