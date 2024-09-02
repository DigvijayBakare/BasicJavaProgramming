package TIllMay2024.Array;

// Copying one array to another

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};

        // first print the given array
        System.out.print("Array arr: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        // now we'll create new array using new keyword
        int[] arr1 = new int[9];

        // to copy each element in array arr to array arr1 we'll use for loop
        for (int i=0; i<arr1.length; i++){
            arr1[i] = arr[i];
        }

        // to check whether we have got it correct or not lets print array arr1
        System.out.print("\nArray arr1: ");
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
