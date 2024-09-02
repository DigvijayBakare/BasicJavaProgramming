package TIllMay2024.Array;
import java.util.Arrays;

// Printing given array in reverse order

public class ArrayReverse {
    public static void main(String[] args) {
        // declare an array and print it
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Original array: "+ Arrays.toString(arr));

        // use for loop to reverse the array elements
        System.out.print("After reversing array: [ ");
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
}
