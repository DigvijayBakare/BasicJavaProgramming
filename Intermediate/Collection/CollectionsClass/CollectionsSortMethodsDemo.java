package Collection.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortMethodsDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("z");
        l.add("a");
        l.add("g");
        l.add("b");
//        l.add(new Integer(10));                                   // CCE
//        l.add(null);                                              // NPE
        System.out.println("Before sorting: "+l);                   // [z, a, g, b]
//        Collections.sort(l);                                      // DNSO
        Collections.sort(l,new ArraySortComp());                    // Customized sorting
        System.out.println("After sorting: "+l);                    // [a, b, g, z]
    }
}
class ArraySortComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}