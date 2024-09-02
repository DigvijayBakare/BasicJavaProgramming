package TIllMay2024.Digvijay;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int i,n,Nu;
        System.out.println("Enter the number whose table is to be found..");
        n = Sc.nextInt();

        System.out.println("The Multiplication table of given number is as follows.");
        for (i=1;i<=10;i++){
            Nu = n*i;
            System.out.println(n+" x "+i+" = "+Nu);
        }
    }

}
