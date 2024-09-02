package Collection.ArraysClass;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortMethods {
    public static void main(String[] args) {
        // declare an array on primitives and print it
        int[] arr = {1,5,7,2,6,4,3,9,8};
        System.out.println("Original primitive array: "+Arrays.toString(arr));        // Arrays.toString(arr) => is used to print array in the form of string

        // sort the array using Arrays class's method and print it
        Arrays.sort(arr);                                                             // sorting in natural order
        System.out.println("Sorted primitive array: "+Arrays.toString(arr));          // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // declare an array of Objects and print it
        String[] obj = {"M","B","A","F","C"};
        System.out.println("Original object array: "+Arrays.toString(obj));           // [M, B, A, F, C]
        Arrays.sort(obj);                                                             // sorting in natural order
        System.out.println("Sorted object array: "+Arrays.toString(obj));             // [A, B, C, F, M]
        Arrays.sort(obj, new NewSorting());                                           // sorting in customized order
        System.out.println("Customized Sorted object array: "+Arrays.toString(obj));  // [M, F, C, B, A]
    }
}
class NewSorting implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}