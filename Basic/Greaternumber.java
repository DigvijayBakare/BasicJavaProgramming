package TIllMay2024.Digvijay;
// Find greater number among three given numbers..
import java.util.Scanner;

public class Greaternumber {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three numbers.");
        Scanner Sc = new Scanner(System.in);
        a = Sc.nextInt();
        b = Sc.nextInt();
        c = Sc.nextInt();
        if (a>b){
            if (a>c){
                System.out.println("A is greater.");}
            else {
                System.out.println("C is greater.");
        }}
        else {if (b>c){
            System.out.println("B is greater.");}
            else {
            System.out.println("C is greater.");
        }
    }}}
