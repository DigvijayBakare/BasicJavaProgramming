package TIllMay2024.Basics;

class Arithmetic{
    void arithmetic(){
        double a=5,b=10;
        System.out.println("Add = "+(a+b));
        System.out.println("Sub = "+(a-b));
        System.out.println("Mult = "+(a*b));
        System.out.println("Div = "+(a/b));
        System.out.println("Mod = "+(a%b));
    }
}
class Unary{
    void unary(){
        int num = 1;
        num++;
        System.out.println("Increment ="+num);
        ++num;
        System.out.println(num);
        System.out.println(num--);
        System.out.println(--num);
    }
}
/*class Comparison{
    void comparison(){
        a == b;
        a != b;
        a < b;
        a > b;
        a <= b;
        a >= b;
    }
}*/

public class Operators {
    public static void main(String[] args) {
        int a = 2, b = 15;
        if (a<5 && b<10){
            System.out.println("True");
        }
        else {
            System.out.println("False");}
        ///////
        if (a<10 || b<5){
            System.out.println("A");
        }
        else {
            System.out.println("B");
        }
        ///////
        if (a>5 ^ b>10){
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.arithmetic();
        Unary unary = new Unary();
        unary.unary();
    }
}
