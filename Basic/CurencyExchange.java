package TIllMay2024.Digvijay;

import java.util.Scanner;

public class CurencyExchange {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the operation to be done.\n 1 - US Dollar to INR, 2 - INR to US Dollar");
        int n = Sc.nextInt();
        if (n==1){
            System.out.println("Enter the amount in dollars.");
            double us=Sc.nextDouble();
            double inr = 83.45*us;
            System.out.println("INR = "+inr);
        } else if (n==2) {
            System.out.println("Enter the amount in inr.");
            double inr=Sc.nextDouble();
            double us = inr/83.45;
            System.out.println("US = "+us);
        }
    }
}
