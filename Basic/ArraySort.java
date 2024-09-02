package TIllMay2024.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void isSortedArray() {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int[] num = new int[size];
        for (int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }*/
//        int[] num = {1,2,3,4,5,6,7,8,9};
        int[] num = {9,8,7,6,5,4,4,3,2,1};
//        int[] num = {9,18,7,6,5,14,3,2,1};
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i=0; i<num.length-1; i++){
            if (num[i]> num[i+1]) {
                isAscending = false;
            } else if (num[i] < num[i+1]) {
                isDescending = false;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else if (isDescending) {
            System.out.println("The array is sorted in descending order");
        } else{
            System.out.println("The given array is shambled order");
        }
    }

    public static void sortingInAscending() {
        // declare integer array with elements and print it
        int[] arr = {8,2,6,5,3,7};
        System.out.println("Original array: "+ Arrays.toString(arr));

        // logic for sorting the given array
        for (int i=0; i< arr.length; i++){              // outer loop for primary number
            for (int j=i+1; j< arr.length; j++){        // inner loop for internal number checking
                if (arr[i] > arr[j]){                   // if conditional statement for checking numbers are small or large
                    // if true swap those numbers, because we want numbers in ascending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        /*System.out.print("Sorted array: ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }*/
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
    public static void sortingInDescending() {
        // declare integer array with elements and print it
        int[] arr = {8,2,6,5,3,7};
        System.out.println("Original array: "+ Arrays.toString(arr));

        // logic for sorting the given array
        for (int i=0; i< arr.length; i++){              // outer loop for primary number
            for (int j=i+1; j< arr.length; j++){        // inner loop for internal number checking
                if (arr[i] < arr[j]){                   // if conditional statement for checking numbers are small or large
                    // if true swap those numbers, because we want numbers in ascending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        isSortedArray();
//        sortingInAscending();
//        sortingInDescending();
    }
}
