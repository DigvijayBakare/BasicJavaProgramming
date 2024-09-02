package Collection.Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        for (int i=0; i<=10; i++) {
            v.addElement(i);
        }
        System.out.println("Vector: "+v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            Integer i = (Integer) e.nextElement();
            if (i%2 == 0) {
                System.out.print(i+" ");
            } /*else {
                System.out.println(i+" will be removed");
                v.remove(i);
                System.out.println(v);
            }*/
        }
        System.out.println("\nNew Vector: "+v);
    }
}
