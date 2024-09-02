package Collection.CollectionInterface;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class MyComparatorNew implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = (String) obj1;
        String s2 = obj2.toString();
        return s2.compareTo(s1);
//        return -s1.compareTo(s2);
    }
}
public class TreeSetDemo1 {
    public static void main(String[] args) {
//        TreeSet t = new TreeSet();                // gives result in ascending order of alphabetical order
        TreeSet t = new TreeSet(new MyComparatorNew());   // gives result in descending order of alphabetical order
//        HashSet t = new HashSet((Collection) new MyComparatorNew());          // we can't do this
        t.add("Raja");
        t.add("ShobhaRani");
        t.add("Nil");
        t.add("Arun");
        t.add("Gaurav");
        t.add("Veer");
        System.out.println("TreeSet list: "+t);
    }
}

// same can be done for StringBuffer object