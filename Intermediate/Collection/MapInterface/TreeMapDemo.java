package Collection.MapInterface;

import java.util.Comparator;
import java.util.TreeMap;

class NewComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}
public class TreeMapDemo {
    public static void defaultSorting() {
        TreeMap t = new TreeMap();
//        t.put(null,"zzz");                      // NPE
        t.put(100,"zzz");
        t.put(103,"yyy");
        t.put(101,"xxx");
        t.put(104,106);
//        t.put("As0",102);                       // CCE
        System.out.println("TreeMap: "+t);
    }
    public static void customizedSorting() {
        TreeMap t = new TreeMap(new NewComparator());
        t.put("zzz", 100);
        t.put("yyy", 103);
        t.put("xxx", 101);
        t.put("ccc",106);
        t.put("aaa",102);
        System.out.println("TreeMap: "+t);
    }
    public static void main(String[] args) {
//        defaultSorting();
        customizedSorting();
    }
}
