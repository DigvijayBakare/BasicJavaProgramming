package TIllMay2024.Digvijay;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the year..");
        int y = Sc.nextInt();
        if (y%4==0 && y%100!=0 || y%400==0){
            System.out.println("Given Year is Leap Year.");
        }
        else {
            System.out.println("Not a Leap Year.");
        }
    }
}
