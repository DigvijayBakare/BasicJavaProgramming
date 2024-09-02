package TIllMay2024.Digvijay;

import java.util.Scanner;

// printing Fibonacci Series
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the terms required in series ");
        int n = Sc.nextInt();
        int n1 = 0, n2 = 1, count = 0, nth;
        if (n == 0){
            System.out.println("Enter positive value");
        } else if (n == 1) {
            System.out.println("Fibonacci Series "+n+":");
        }
        else {
            System.out.println("Fibonacci series : ");
            while (count<n){
                System.out.println(n1);
                nth = n1 + n2;
                n1 = n2;
                n2 = nth;
                count += 1;
            }
        }
    }
}
