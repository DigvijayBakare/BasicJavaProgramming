package Collection.CollectionInterface;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void stringBufferMethod() {
        TreeSet t = new TreeSet();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("Z"));
        System.out.println("TreeSet: "+t);      //  [A, B, L, Z]
    }
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
//        t.add(null);                     // NPE
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");
//        t.add(new Integer(10));         // CCE
//        t.add(null);                          // NPE
        System.out.println("TreeSet: "+t);      // [A, B, L, Z, a]
    }
}
