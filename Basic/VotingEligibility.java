package TIllMay2024.Loops;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of candidate: ");
        int age = sc.nextInt();

        /*if (age<18){
            System.out.println("Not eligible for voting");
        } else if (age>18) {
            System.out.print("Do you have voting card: ");
            boolean flag = sc.nextBoolean();
            if (flag){
                System.out.println("Eligible for voting");
            }else System.out.println("Not eligible for voting");
        }*/
        
        if (age>18){
            System.out.print("Do you have voting card: ");
            boolean flag = sc.nextBoolean();
            if (flag){
                System.out.println("Eligible for voting");
            }else System.out.println("Not eligible for voting");
        }else System.out.println("Not eligible for voting");
    }
}
