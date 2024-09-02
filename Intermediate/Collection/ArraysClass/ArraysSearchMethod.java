package Collection.ArraysClass;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchMethod {
    public static void main(String[] args) {
        // declare an integer array and print it
        int[] arr = {10,5,8,3,6,7,9};
        System.out.println("Original primitive array: "+ Arrays.toString(arr));

        // sort the array and search elements in the sorted array
        Arrays.sort(arr);           // sorted in DNSO
        System.out.println("Searching primitive element 6: "+Arrays.binarySearch(arr,6));           // 2
        System.out.println("Searching primitive element 14: "+Arrays.binarySearch(arr,14));         // -8

        // declare a object array and print it
        String[] str = {"A","M","R","S","D"};
        System.out.println("Original String array: "+Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("Searching object element S: "+Arrays.binarySearch(str,"S"));            // 4
        System.out.println("Searching object element O: "+Arrays.binarySearch(str,"O"));            // -4 => unpredictable result

        // sorted based on customized sorting order
        Arrays.sort(str,new Searching());
        System.out.println("Searching object using comparator S: "+Arrays.binarySearch(str,"S",new Searching()));   // 0
        System.out.println("Searching object using comparator O: "+Arrays.binarySearch(str,"O",new Searching()));   // -3 => unpredictable result
    }
}
class Searching implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}