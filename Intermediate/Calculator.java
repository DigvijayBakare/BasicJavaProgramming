package June2024.ExceptionHandling.CustomisedException;

import java.util.Scanner;

class Divisor extends RuntimeException {
    Divisor(String s) {
        super(s);
    }
}

public class Calculator {
    public static void add(int a, int b) {
        if (b==0){
            throw new Divisor("Divisor can not be zero");
        } else {
            int c = a / b;
            System.out.println("Result: "+c);
        }
    }
    public static void mult(int a, int b) {
        if (b<1){
            throw new MultiplyZero("Multiplier can not be zero, because it will always result in zero");
        } else {
            int c = a * b;
            System.out.println("Result: "+c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b:");
        int a = sc.nextInt(), b=sc.nextInt();
//        add(a,b);
        mult(a,b);
        System.out.println("Hello");
    }
}
