package TIllMay2024.Digvijay;
// To find What day it is using if-else ladder..
import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int a = Sc.nextInt();
        if (a == 1) {
            System.out.println("It's Monday.");
        } else if (a == 2) {
            System.out.println("It's Tuesday.");
        } else if (a == 3) {
            System.out.println("It's Wednesday.");
        } else if (a == 4) {
            System.out.println("It's Thursday.");
        } else if (a == 5) {
            System.out.println("It's Friday.");
        } else if (a == 6) {
            System.out.println("It's Saturday.");
        } else if (a == 7) {
            System.out.println("It's Sunday.");
        } else {
            System.out.println("Invalid Input");
        }
    }}
