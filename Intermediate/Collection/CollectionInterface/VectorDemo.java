package Collection.CollectionInterface;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
//        Vector v = new Vector();
//        Vector v = new Vector(50);
        Vector v = new Vector(10,5);
        System.out.println("Initial Vector capacity: "+v.capacity());
        for (int i=1; i<=10; i++) {
            v.addElement(i);
        }
        System.out.println("Vector: "+v);
        System.out.println("New-1 Capacity: "+v.capacity());
        v.addElement("A");
        System.out.println("New-2 Capacity: "+v.capacity());
        System.out.println("Vector: "+v);
    }
}
