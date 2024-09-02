package Collection.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);
        System.out.println("Original list: "+l);            // [15, 0, 20, 10, 5]
        Collections.sort(l);
        System.out.println("Sorted list: "+l);              // [0, 5, 10, 15, 20]
        Collections.reverse(l);                             // will reverse the list
        System.out.println("Reversed list: "+l);            // [5, 10, 20, 0, 15]
//        Collections.sort(l, Collections.reverseOrder());    // will reverse the compare method order
//        System.out.println("Reversed list: "+l);            // [5, 10, 20, 0, 15]
    }
}