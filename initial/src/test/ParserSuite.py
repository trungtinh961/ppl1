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

    def test_simple_declaration_1(self):
        """Variable declaration"""
        input = """int i,j,k[5];"""
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,204))
    
    def test_simple_declaration_2(self):
        """Variable declaration"""
        input = """float f = 1.0;"""
        expect = "Error on line 1 col 8: ="
        self.assertTrue(TestParser.checkParser(input,expect,205))

    def test_simple_declaration_3(self):
        """Variable declaration"""
        input = """int a[];"""
        expect = "Error on line 1 col 6: ]"
        self.assertTrue(TestParser.checkParser(input,expect,206))

    def test_simple_declaration_3(self):
        """Variable declaration"""
        input = """int a[1]"""
        expect = "Error on line 1 col 8: <EOF>"
        self.assertTrue(TestParser.checkParser(input,expect,207))
    
