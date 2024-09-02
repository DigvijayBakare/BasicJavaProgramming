package Collection;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {
    public static void main(String[] args) {
        // declare an integer array, vector and Hashtable
        int[] arr = {1,2,3,4,5};
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer, String> h = new Hashtable<>();

        // add elements to vector and hashtable
        v.addElement(6);
        v.addElement(7);
        h.put(3,"Three");
        h.put(4,"Four");

        // Accessing the first element of array, Vector and Hashtable
        System.out.println("First Array Element: "+arr[0]);
        System.out.println("First Vector Element: "+v.elementAt(0));
        System.out.println("First Hashtable Element: "+h.get(3));
    }
}
