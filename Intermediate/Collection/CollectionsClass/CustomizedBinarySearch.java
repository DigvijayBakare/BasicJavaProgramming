package Collection.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomizedBinarySearch {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);
        System.out.println("Original list: "+l);        // [15, 0, 20, 10, 5]
        Collections.sort(l,new SearchSort());
        System.out.println("Sorted list: "+l);          // [20, 15, 10, 5, 0]
        System.out.println("Index of element 10: "+Collections.binarySearch(l,10,new SearchSort()));    // 2
        System.out.println("Index of element 13: "+Collections.binarySearch(l,13,new SearchSort()));    // -3
        System.out.println("Index of element 17: "+Collections.binarySearch(l,17));                     // -6 => unpredictable result
        System.out.println("Index of element 17: "+Collections.binarySearch(l,17,new SearchSort()));    // -2
    }
}
class SearchSort implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        return i2.compareTo(i1);
    }
}