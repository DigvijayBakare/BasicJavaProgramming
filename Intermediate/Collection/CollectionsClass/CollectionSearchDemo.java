package Collection.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSearchDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("z");
        l.add("a");
        l.add("m");
        l.add("b");
        l.add("N");
        System.out.println("Original list: "+l);                // [z, a, m, b, N]
        Collections.sort(l);                                    // if we don't sort the list we'll get unpredictable result
        System.out.println("Sorted list: "+l);                  // [N, a, b, m, z]
        System.out.println("Binary search for letter z: "+Collections.binarySearch(l,"z"));     // index of z: 4
        System.out.println("Binary search for letter j: "+Collections.binarySearch(l,"j"));     // insertion point for j: -4

    }
}
