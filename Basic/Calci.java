package TIllMay2024.Digvijay;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        int a,b,sum,div,sub,mult,cube,sqr,min,max;
        double sqrt,curt,fact1,Power,absu,cosine,sine,tane,log,Decr,Nthroot;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        a = Sc.nextInt();
        System.out.println("Enter the operation type." +
                "\nFor Addition - 1, Subtraction - 2, Division - 3, Multiplication - 4, b'th Power of a - 5, " +
                "b'th root of a - 6, Square Root - 7, Cube - 8, Square - 9, Cube Root - 10, Absolute value - 11, " +
                "\nCosine value - 12, Tan value -13, Factorial - 14, Area of circle - 15, Log of number - 16, Sine of number - 17" +
                "Decrement of number - 18");
        int c = Sc.nextInt();
        if (c<=8){
        System.out.println("Enter second number.");
        b = Sc.nextInt();
        switch (c) {
            case 1:
                sum = Math.addExact(a, b);
                System.out.println("Addition of given numbers = " + sum);
                break;
            case 2:
                sub = Math.subtractExact(a, b);
                System.out.println("Subtraction of given numbers = " + sub);
                break;
            case 3:
                div = Math.floorDiv(a, b);
                System.out.println("Division of given numbers = " + div);
                break;
            case 4:
                mult = Math.multiplyExact(a, b);
                System.out.println("Multiplication of given numbers = " + mult);
                break;
            case 5:
                Power = Math.pow(a,b);
                System.out.println("Power of "+b+" on "+a+" = "+Power);
                break;
            case 6:
                Nthroot = Math.pow(a, (double) 1 /b);
                System.out.println(b+"'th root of "+a+" = "+Nthroot);
                break;
            case 7:
                System.out.println("Minimum value = "+Math.min(a,b));
                break;
            case 8:
                System.out.println("Maximum value = "+ Math.max(a,b));
                break;
        }}else switch (c) {
            case 9:
                sqrt = Math.sqrt(a);
                System.out.println("Square Root of given number = " + sqrt);
                break;
            case 10:
                cube = a * a * a;
                System.out.println("Cube of given number = " + cube);
                break;
            case 11:
                sqr = Math.multiplyExact(a, a);
                System.out.println("Square of given number = " + sqr);
                break;
            case 12:
                curt = Math.cbrt(a);
                System.out.println("Cube root of given number = " + curt);
                break;
            case 13:
                absu = Math.abs(a);
                System.out.println("The absolute value of given number = "+absu);
                break;
            case 14:
                cosine = Math.cos(a);
                System.out.println("Cosine of given value = "+cosine);
                break;
            case 15:
                tane = Math.toRadians(a);
                System.out.println("Tangent of given value = "+Math.tan(tane));
                break;


        }if (c>15) { switch (c){
            case 16:
                Factorial ca = new Factorial();
                fact1 = ca.fact123();
                System.out.println("Factorial of given number = "+fact1);
                break;
            case 17:
                CirclesArea AC = new CirclesArea();
                AC.circle();
                break;
            case 18:
                log = Math.log(a);
                System.out.println("Log of given number = "+log);
            case 19:
                sine = Math.sin(a);
                System.out.println("Sine of given number = "+sine);
            break;
            case 20:
                Decr = Math.decrementExact(a);
                System.out.println("Decrement of given number = "+Decr);
                break;
        }}
    }
}
