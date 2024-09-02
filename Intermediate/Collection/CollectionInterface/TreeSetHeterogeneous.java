package Collection.CollectionInterface;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparatorBuffer implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        if (s1.length()<s2.length()) return -1;
        else if (s1.length()>s2.length()) return +1;
        else return s1.compareTo(s2);
    }
}
public class TreeSetHeterogeneous {
    public static void main(String[] args) {
//        TreeSet t = new TreeSet();
        // string can not be compared with StringBuffer because there is no relation between them
        TreeSet t = new TreeSet(new MyComparatorBuffer());

        // adding string objects to the TreeSet
        t.add("Raja");
        t.add("ShobhaRani");
        t.add("Nil");
        t.add("Arun");
        t.add("Gaurav");
        t.add("Veer");

        // adding StringBuffer objects also
        t.add(new StringBuffer("Arjun"));
        t.add(new StringBuffer("Lialla"));
        t.add(new StringBuffer("Braho"));
        t.add(new StringBuffer("Zenin"));

        System.out.println("TreeSet: "+t);
        // [Nil, Arun, Raja, Veer, Arjun, Braho, Zenin, Gaurav, Lialla, ShobhaRani]
    }
}
