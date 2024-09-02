package June2024.Practice.Basic_II;

import java.util.Scanner;

public class Basic151to {
    public static void expressionValue(){
        int a;
        double b;
        boolean c, d, e, f;
        a = (101+0)/3;
        b = 3.0e-6 * 10000000.1;
        c = true && true;
        d = false && true;
        e = (false && false) || (true && true);
        f = (false || false) && (true && true);
        System.out.println("a) "+a+"\nb) "+b+"\nc) "+c+"\nd) "+d+"\ne) "+e+"\nf) "+f);
    }
    public static void equalNos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number = ");
        int a = sc.nextInt();
        System.out.print("Input second number = ");
        int b = sc.nextInt();
        System.out.print("Input third number = ");
        int c = sc.nextInt();
        System.out.print("Input fourth number = ");
        int d = sc.nextInt();
        if (a == b && b == c && c == d){
            System.out.println("Numbers are equal");
        }else System.out.println("Numbers are not equal");
    }
    public static void doubleValue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number = ");
        double a = sc.nextDouble();
        System.out.print("Input second number = ");
        double b = sc.nextDouble();
        if (a>0 && a<1 && b>0 && b<1){
            System.out.println(true);
        }else System.out.println(false);
    }
    public static void booleanArray(){
        boolean[][] arr = {{true,false,true},{false,true,false}};
        int rowlen = arr.length;
        int collen = arr[0].length;
        for (int i=0; i<rowlen; i++){
            for (int j=0; j<collen; j++){
                if (arr[i][j]){
                    System.out.print("t");
                }else System.out.print("f");
            }
            System.out.println();
        }
    }
    public static void transposeArray(){
        int[][] arr = {{10,20,30},{40,50,60}};
        System.out.print("Original array: \n");
        printArray(arr);
        System.out.println("After changing the rows and column of array: ");
        transpose(arr);
    }
    private static void transpose(int[][] arr){
        int[][] newArray = new int[arr[0].length][arr.length];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                newArray[j][i] = arr[i][j];
            }
        }
        printArray(newArray);
    }
    private static void printArray(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        expressionValue();
//        equalNos();
//        doubleValue();
//        booleanArray();
        transposeArray();
    }
}
