package Collection.MapInterface;

import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> t = new TreeMap<String, String>();
        t.put("a","Apple");
        t.put("e","Ear");
        t.put("d","Dog");
        t.put("c","Cat");
        t.put("b","Ball");
        t.put("f","Fun");
        System.out.println("TreeMap: "+t);                              // {a=Apple, b=Ball, c=Cat, d=Dog, e=Ear, f=Fun}
        System.out.println("Ceiling key of c: "+t.ceilingKey("c"));     // c
        System.out.println("Higher key of e: "+t.higherKey("e"));       // f
        System.out.println("Floor key of e: "+t.floorKey("e"));         // e
        System.out.println("Lower key of e: "+t.lowerKey("e"));         // d
        System.out.println("PollFirst key: "+t.pollFirstEntry());       // a=Apple
        System.out.println("PollLast key: "+t.pollLastEntry());         // f=Fun
        System.out.println("TreeSet in descending order: "+t.descendingMap());      // {e=Ear, d=Dog, c=Cat, b=Ball}
        System.out.println("TreeSet: "+t);                              // {b=Ball, c=Cat, d=Dog, e=Ear}
    }
}
