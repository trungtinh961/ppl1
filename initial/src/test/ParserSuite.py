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

    def test_statements_4(self):  
        """ Statement """
        input = """
        void main(){ 
            if (a) if (b) if (c) a; else a; else 
        }
        """
        expect = "Error on line 4 col 8: }"
        self.assertTrue(TestParser.checkParser(input,expect,245))

    def test_statements_5(self):  
        """ Statement """
        input = """
        int main(){
            do {
                int a[2];
            }
            {
                a+b;
            }
            while (a<5);
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,246))

    def test_statements_6(self):  
        """ Statement """
        input = """
        int main(){
            do {
                int a[2];
            }
            {
                a+b;
            }
            while a<5==9%7;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,247))

    def test_statements_7(self):  
        """ Statement """
        input = """
        int main(){
            do {
                int foo() {};
            }
            {
                a+b;
            }
            while (a<5);
        }
        """
        expect = "Error on line 4 col 23: ("
        self.assertTrue(TestParser.checkParser(input,expect,248))

    def test_statements_8(self):  
        """ Statement """
        input = """
        int main(){
            do {
                foo(5);
            }
            while (a<5);
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,249))

    def test_statements_9(self):  
        """ Statement """
        input = """
        int main(){
            do {
                foo(5);
            }
            int a = 5;
        }
        """
        expect = "Error on line 6 col 12: int"
        self.assertTrue(TestParser.checkParser(input,expect,250))

    def test_statements_10(self):  
        """ Statement """
        input = """
        int a[0.5];
        int main(){
            value = func()[0.5];
        }
        """
        expect = "Error on line 2 col 14: 0.5"
        self.assertTrue(TestParser.checkParser(input,expect,251))

    def test_statements_11(self):  
        """ Statement """
        input = """        
        int main(){
            for(i = 0; i < 10; i=i+1) {
                putIntLn("Hello world!\\n");
            }
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,252))
        
    def test_statements_12(self):  
        """ Statement """
        input = """        
        int main(){
            for(int i = 0; i < 10; i = i + 1) {
                putIntLn("Hello world!\\n");
            }
        }
        """
        expect = "Error on line 3 col 16: int"
        self.assertTrue(TestParser.checkParser(input,expect,253))
    
    def test_statements_13(self):  
        """ Statement """
        input = """        
        int main(){
            for {i = 0; i < 10; i = i + 1} {
                putIntLn("Hello world!\\n");
            }
        }
        """
        expect = "Error on line 3 col 16: {"
        self.assertTrue(TestParser.checkParser(input,expect,254))

    def test_statements_14(self):  
        """ Statement """
        input = """        
        int main(){
            for(i = 0; i < foo(2)[foo(4)[a+b+c]]; i = i + 1) {
                putIntLn("Hello world!\\n");
            }
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,255))

    def test_statements_15(self):  
        """ Statement """
        input = """        
        int main(){
            for (i = 0; i < 10) {
                putIntLn("Hello world!\\n");
            }
        }
        """
        expect = "Error on line 3 col 30: )"
        self.assertTrue(TestParser.checkParser(input,expect,256))

    def test_statements_16(self):  
        """ Statement """
        input = """        
        int main(){
            for (i = 0; i < 10; i = i + 1) {
                printf("Hello world!\\n");
            }
            {

            }
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,257))
    
    def test_statements_17(self):  
        """ Statement """
        input = """        
        int main(){
            for (i = 0; i < 10; i = i + 1) {
                for (j = 10; j >= 0; j = j - 1) {
                    if (i == j) putIntLn("i");
                }
            }
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,258))

    def test_statements_18(self):  
        """ Statement """
        input = """        
        int main(){
            for (i = 0; i < 10; i = i + 1) {
                for (j = 10; j >= 0; j = j - 1) {
                    if (i == j) return 0;
                    else return 1;
                }
            }
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,259))
    
    def test_statements_19(self):  
        """ Statement """
        input = """        
        int main(){
            for (i = 0; i < 10; i = i + 1)
        }
        """
        expect = "Error on line 4 col 8: }"
        self.assertTrue(TestParser.checkParser(input,expect,260))

    def test_statements_20(self):  
        """ Statement """
        input = """        
        int main(){
            for (i = 0; i < 10; i = i + 1){
                if (i == a % foo(2)[i]) break;
                else continue;
            }
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,261))

    def test_statements_21(self):  
        """ Statement """
        input = """        
        int i;
        int f() {
            return 200;
        }
        void main () {
            int main ;
            main = f();
            putIntLn (main);
            {
                int i;
                int main;
                int f;
                main = f = i = 100;
                putIntLn(i);
                putIntLn(main);
                putIntLn(f);
            }
                putIntLn(main);
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,262))

    def test_all_1(self):  
        """ All """
        input = """        
        int[] foo(boolean a, float b){}
        int main() {
            putIntLn(foo(a>=b,00.E2019)[10]);
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,263))

    def test_all_2(self):  
        """ All """
        input = """
        /* this is a comment */ 
        void foo() {if (a==0) {b = a+c;}}
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,264))

    def test_all_3(self):  
        """ All """
        input = """
        /* empty program */ 
        
        """
        expect = "Error on line 4 col 8: <EOF>"
        self.assertTrue(TestParser.checkParser(input,expect,265))

    def test_all_4(self):  
        """ All """
        input = """
        int a[2,1];
        """
        expect = "Error on line 2 col 15: ,"
        self.assertTrue(TestParser.checkParser(input,expect,266))

    def test_all_5(self):  
        """ All """
        input = """
        int main() {;}
        """
        expect = "Error on line 2 col 20: ;"
        self.assertTrue(TestParser.checkParser(input,expect,267))

    def test_all_6(self):  
        """ All """
        input = """
        int main() {
            int #a,b,c;
        }
        """
        expect = "#"
        self.assertTrue(TestParser.checkParser(input,expect,268))

    def test_all_7(self):  
        """ All """
        input = """        
        int main() {
            foo(2)[3+x] = a[b[2]] +3;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,269))

    def test_all_8(self):  
        """ All """
        input = """
        int main() {
            int a,b[10];
            a = b[1] = foo()[3] = x = 1 ;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,270))

    def test_all_9(self):  
        """ All """
        input = """
        int main() {}
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,271))

    def test_all_10(self):  
        """ All """
        input = """
        int main() {
            foo({})
        }
        """
        expect = "Error on line 3 col 16: {"
        self.assertTrue(TestParser.checkParser(input,expect,272))

    def test_all_11(self):  
        """ All """
        input = """
        int main() {
            a[(123)];
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,273))

    def test_all_12(self):  
        """ All """
        input = """
        int main() {
            (-12.25e-12);
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,274))

    def test_all_13(self):  
        """ All """
        input = """
        int main() {
            do {
                if (b) a; 
                continue;
            } while a;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,275))

    def test_all_14(self):  
        """ All """
        input = """
        int main() {
            if (a) 
                do
                    continue;
                while b;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,276))

    def test_all_15(self):  
        """ All """
        input = """
        int main()
        {        
            foo(a)(b);
        }
        """
        expect = "Error on line 4 col 18: ("
        self.assertTrue(TestParser.checkParser(input,expect,277))

    def test_all_16(self):  
        """ All """
        input = """
        int main() {
            return;
            break;
            continue;
            {}
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,278))

    def test_all_17(self):  
        """ All """
        input = """
        int main() {
            while(a<0);
        }
        """
        expect = "Error on line 3 col 12: while"
        self.assertTrue(TestParser.checkParser(input,expect,279))

    def test_all_18(self):  
        """ All """
        input = """
        int main() {
            if (a > 0) do break;
        }
        """
        expect = "Error on line 4 col 8: }"
        self.assertTrue(TestParser.checkParser(input,expect,280))

    def test_all_19(self):  
        """ All """
        input = """
        int function _();
        """
        expect = "Error on line 2 col 21: _"
        self.assertTrue(TestParser.checkParser(input,expect,281))

    def test_all_20(self):  
        """ All """
        input = """
        int main() {
            if (a == b) {} else if (a > b) {} else {}
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,282))

    def test_all_21(self):  
        """ All """
        input = """
        int main() {
             if (a) if (b) b; else c;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,283))

    def test_all_22(self):  
        """ All """
        input = """
        int main() {
            if (a) else;
        }
        """
        expect = "Error on line 3 col 19: else"
        self.assertTrue(TestParser.checkParser(input,expect,284))

    def test_all_23(self):  
        """ All """
        input = """
        int main() {
            do
            while(a < 0);
        }
        """
        expect = "Error on line 4 col 12: while"
        self.assertTrue(TestParser.checkParser(input,expect,285))

    def test_all_24(self):  
        """ All """
        input = """
        int main() {
            do {}
            while();
        }
        """
        expect = "Error on line 4 col 18: )"
        self.assertTrue(TestParser.checkParser(input,expect,286))

    def test_all_25(self):  
        """ All """
        input = """
        int main() {
            do 
                do
                {}
                while (a);
            while(b);
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,287))

    def test_all_26(self):  
        """ All """
        input = """
        int main() {{{{{{{{{}}}}}}}}}
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,288))

    def test_all_27(self):  
        """ All """
        input = """
        boolean IsPrime(int number)
        {
            for (i = 2; i < number; i = i + 1)
            {
                if (number % i == 0 && i != number)
                    return false;
            }
            return true;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,289))

    def test_all_28(self):  
        """ All """
        input = """
        int main() {
            if (a == f[0]) print(a);
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,290))

    def test_all_29(self):  
        """ All """
        input = """
        int main() {
            for(a;a;a) return;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,291))

    def test_all_30(self):  
        """ All """
        input = """
        int main() {
            for(a;b;c) ;
        }
        """
        expect = "Error on line 3 col 23: ;"
        self.assertTrue(TestParser.checkParser(input,expect,292))

    def test_all_31(self):  
        """ All """
        input = """
        int foo[5] {a=b+c;}
        """
        expect = "Error on line 2 col 19: {"
        self.assertTrue(TestParser.checkParser(input,expect,293))

    def test_all_32(self):  
        """ All """
        input = """
        int main() {
            int foo[]() {a=b+c;}
        }
        """
        expect = "Error on line 3 col 20: ]"
        self.assertTrue(TestParser.checkParser(input,expect,294))

    def test_all_33(self):  
        """ All """
        input = """
        int a,b,c,d[5][15];
        """
        expect = "Error on line 2 col 22: ["
        self.assertTrue(TestParser.checkParser(input,expect,295))

    def test_all_34(self):  
        """ All """
        input = """
        int main()(a = b + c;)
        """
        expect = "Error on line 2 col 18: ("
        self.assertTrue(TestParser.checkParser(input,expect,296))

    def test_all_35(self):  
        """ All """
        input = """
        int main() {
            int a, b ,c;
            int foo() {a = b + c;}
        }
        """
        expect = "Error on line 4 col 19: ("
        self.assertTrue(TestParser.checkParser(input,expect,297))

    def test_all_36(self):  
        """ All """
        input = """
        int main() {
            printf("Illigal Escape: \\a");
        }
        """
        expect = "Illigal Escape: \\a"
        self.assertTrue(TestParser.checkParser(input,expect,298))

    def test_all_37(self):  
        """ All """
        input = """
        int main() {
            printf("Error char: ~`$^.@");
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,299))

    def test_all_38(self):  
        """ All """
        input = """
        int main() {
            // final /*...........\\n...........\\r...*/ \\n int a = 5;
        }
        """
        expect = "successful"
        self.assertTrue(TestParser.checkParser(input,expect,300))