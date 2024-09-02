package TIllMay2024.Interface;

import java.util.Scanner;

interface Add{
    int add(int a, int b);
}
interface Sub{
    int sub(int a, int b);
}
interface Div{
    int div(int a, int b);
}
interface Mult{
    int mult(int a, int b);
}

public class Mathematicscalculatios implements Add,Sub,Div,Mult{
    @Override
    public int add(int a, int b) {
        System.out.println("Addition = "+(a+b));
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("Subtraction = "+(a-b));
        return 0;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("Division = "+(a/b));
        return 0;
    }

    @Override
    public int mult(int a, int b) {
        System.out.println("Multiplication = "+(a*b));
        return 0;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();
         Mathematicscalculatios m = new Mathematicscalculatios();
         m.add(a,b);
         m.sub(6,2);
         m.div(9,3);
         m.mult(8,5);
    }
}
