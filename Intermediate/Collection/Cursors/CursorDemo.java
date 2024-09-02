package Collection.Cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorDemo {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        for (int i=0; i<10; i++) {
            v.add(i);
        }
        System.out.println("List: "+v);

        // All cursors in a collection
        Enumeration e = v.elements();
        Iterator i = v.iterator();
        ListIterator ltr = v.listIterator();

        // get class names of these cursors
        System.out.println("Enumeration class name: "+e.getClass().getName());          // java.util.Vector$1   => $1 means anonymous class implementation
        System.out.println("Iterator class name: "+i.getClass().getName());             // java.util.Vector$Itr
        System.out.println("ListIterator class name: "+ltr.getClass().getName());       // java.util.Vector$ListItr
    }
}
