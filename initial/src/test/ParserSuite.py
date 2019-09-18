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
    
    def test_function_declaration_7(self):
        """Function declaration"""
        input = """
            void foo (int b){
                int a[-8];
            }
        """
        expect = "Error on line 3 col 22: -"
        self.assertTrue(TestParser.checkParser(input,expect,214))

    def test_function_declaration_8(self):
        """Function declaration"""
        input = """
            int main()
            {
                // printf() displays the string inside quotation
                printf("Hello, World!");
                return 0;
            }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,215))

    def test_function_declaration_9(self):
        """Function declaration"""
        input = """
            void foo (int a, int b){
                ruturn (a + b);
            }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,216))

    def test_function_declaration_10(self):
        """Function declaration"""
        input = """
            void foo (){
                int a[m];
            }
        """
        expect = "Error on line 3 col 22: m"
        self.assertTrue(TestParser.checkParser(input,expect,217))

    def test_function_declaration_11(self):
        """Function declaration"""
        input = """
            void foo (){
                int ;
            }
        """
        expect = "Error on line 3 col 20: ;"
        self.assertTrue(TestParser.checkParser(input,expect,218))

    def test_function_declaration_12(self):
        """Function declaration"""
        input = """int main() {
            boolean boo[2]={true,false};
        }"""
        expect = "Error on line 2 col 26: ="
        self.assertTrue(TestParser.checkParser(input,expect,219))

    def test_function_declaration_13(self):
        """Function declaration"""
        input = """
        int foo (int a , float b[])
        {
            boolean c ;
            int i ;
            i = a + 3 ;
            if (i > 0) {
                int d ;
                d = i + 3 ;
                putInt(d) ;
            }
            return i ;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,220))

    def test_expressions_1(self):
        """ Expressions """
        input = """
        int main() {
            a[];
        }
        """
        expect = "Error on line 3 col 14: ]"
        self.assertTrue(TestParser.checkParser(input,expect,221))
    
    def test_expressions_2(self):
        """ Expressions """
        input = """
        int main() {
            a[1][2];
        }
        """
        expect = "Error on line 3 col 16: ["
        self.assertTrue(TestParser.checkParser(input,expect,222))

    def test_expressions_3(self):
        """ Expressions """
        input = """
        int main() {
            []a;
        }
        """
        expect = "Error on line 3 col 12: ["
        self.assertTrue(TestParser.checkParser(input,expect,223))

    def test_expressions_4(self):
        """ Expressions """
        input = """
        int main() {
            a = !b + -a;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,224))

    def test_expressions_5(self):
        """ Expressions """
        input = """
        int main() {
            a = b / c % d * e;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,225))
    
    def test_expressions_6(self):
        """ Expressions """
        input = """
        int main() {
            a = b + c - -d * e[a];
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,226))

    def test_expressions_7(self):
        """ Expressions """
        input = """
        int main() {
            a = b < c < d;
        }
        """
        expect = "Error on line 3 col 22: <"
        self.assertTrue(TestParser.checkParser(input,expect,227))

    def test_expressions_8(self):
        """ Expressions """
        input = """
        int main() {
            a = b < (c > d);
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,228))

    def test_expressions_9(self):
        """ Expressions """
        input = """
        int main() {
            a = b < c + d;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,229))

    def test_expressions_10(self):
        """ Expressions """
        input = """
        int main() {
            a = b < c == d;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,230))

    def test_expressions_11(self):
        """ Expressions """
        input = """
        int main() {
            a = b != c == d;
        }
        """
        expect = "Error on line 3 col 23: =="
        self.assertTrue(TestParser.checkParser(input,expect,231))

    def test_expressions_12(self):
        """ Expressions """
        input = """
        int main() {
            a = b && c == d;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,232))

    def test_expressions_13(self):
        """ Expressions """
        input = """
        int main() {
            a = b || c && d;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,233))

    def test_expressions_14(self):
        """ Expressions """
        input = """
        int main() {
            a = b+c*d/e-f<g==h;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,234))

    def test_expressions_15(self):
        """ Expressions """
        input = """
        int main() {
            12 = 5 * 9 / 10 + 15 % 8 && 1 < 10;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,235))

    def test_expressions_16(self):
        """ Expressions """
        input = """
        int main() {
            a = b + foo(5) - (foo() % 1);
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,236))

    def test_expressions_17(self):
        """ Expressions """
        input = """
        int main() {
            foo(2)[3+x] = a[b[2]] +3;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,237))
    
    def test_invocation_expressions_1(self):
        """ Expressions """
        input = """
        void f(int a[10]) { }
        """
        expect = "Error on line 2 col 21: 10"
        self.assertTrue(TestParser.checkParser(input,expect,238))

    def test_invocation_expressions_2(self):
        """ Expressions """
        input = """
        void foo (float a[]) {}
        void goo (float x[]) {
            float y[10];
            int z[10];
            foo(x); 
            foo(y); 
            foo(z); 
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,239))

    def test_invocation_expressions_3(self):
        """ Expressions """
        input = """
        void foo ( ) {
            if(a<b) return ; 
            else return 2; 
        }       
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,240))

    def test_invocation_expressions_4(self):
        """ Expressions """
        input = """
        int[] foo (int b[]){
            int a [1];
            if (b>c) return a;
            else return b;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,241))

    def test_statements_1(self):
        """ Statement """
        input = """
            int main() {
            if (a>b) a=1;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,242))

    def test_statements_2(self):  
        """ Statement """
        input = """
        int main() {
            if (a>b) a=1; else a=0;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,243))
    
    def test_statements_3(self):  
        """ Statement """
        input = """
        int main() {
            if (a>b) {
                int c[5];
                c[2] = b + a * 10 % c[d[e[t+m+5]]];
            }
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,244))