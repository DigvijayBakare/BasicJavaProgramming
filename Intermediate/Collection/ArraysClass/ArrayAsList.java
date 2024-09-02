package Collection.ArraysClass;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        // declare and print string array
        String[] s = {"A","Z","B"};
        System.out.println("Original array: "+ Arrays.toString(s));                 // [A, Z, B]
        List l = Arrays.asList(s);
        System.out.println("Original list: "+l);                                    // [A, Z, B]
        s[0] = "K";
        System.out.println("New array: "+Arrays.toString(s));                       // [K, Z, B]
        System.out.println("Changed list because of array: "+l);                    // [K, Z, B]
        l.set(1,"M");
        System.out.println("New list: "+l);                                         // [K, M, B]
        System.out.println("Changed array because of list: "+Arrays.toString(s));   // [K, M, B]

//        l.add("H");                                                                 // UnsupportedOperationException
//        l.remove(2);                                                          // UnsupportedOperationException
        l.set(2,new Integer(10));                                             // ArrayStoreException

    }
}
