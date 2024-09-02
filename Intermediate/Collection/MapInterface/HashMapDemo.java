package Collection.MapInterface;
import java.util.*;

public class HashMapDemo {
    public static void hashMap() {
        HashMap<String,Integer> m = new HashMap<>();
        m.put("Chiranjeevi",700);
        m.put("Ravi",800);
        m.put("Nil",500);
        m.put("Arun",900);
        m.put("Shree",300);
        System.out.println("Original Map: "+m);             // {Nil=500, Ravi=800, Arun=900, Chiranjeevi=700, Shree=300}

        // replacing value using put() method
        System.out.println(m.put("Chiranjeevi",200));       // 700

        // getting set of key's
        Set s = m.keySet();
        System.out.println("KeySet: "+s);                   // [Nil, Ravi, Arun, Chiranjeevi, Shree]

        // getting collection of values
        Collection c = m.values();
        System.out.println("ValueSet: "+c);                 // [500, 800, 900, 200, 300]

        // getting entry set of hashset
        Set s1 = m.entrySet();
        System.out.println("EntrySet: "+s1);                // [Nil=500, Ravi=800, Arun=900, Chiranjeevi=200, Shree=300]

        // getting and setting key and values from entry interface using iterator
        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println("Key: "+m1.getKey()+" and value: "+m1.getValue());
            // set the different value to a key
            if (m1.getKey().equals("Shree")) {
                m1.setValue(400);
            }
        }
        System.out.println("New map: "+m);
    }
    public static void linkedHashMap() {
        LinkedHashMap<String,Integer> m = new LinkedHashMap<>();
        m.put("Chiranjeevi",700);
        m.put("Ravi",800);
        m.put("Nil",500);
        m.put("Arun",900);
        m.put("Shree",300);
        System.out.println("Original Map: "+m);             // {Chiranjeevi=700, Ravi=800, Nil=500, Arun=900, Shree=300}
        // insertion order is preserved
    }
    public static void identityHashMap() {
        IdentityHashMap<Integer,String> m = new IdentityHashMap<>();
        Integer i1 = new Integer("10");
        Integer i2 = new Integer("10");
        m.put(i1,"Naresh");
        m.put(i2,"Sameer");
        System.out.println("Original Map: "+m);
    }
    public static void weakHashMap() throws InterruptedException {
//        HashMap m = new HashMap();                    // HashMap dominates Garbage Collection
        WeakHashMap m = new WeakHashMap();              // Garbage Collection dominates WeakHashMap
        Temp t = new Temp();
        m.put(t,"Java");
        System.out.println("Before nullifying the object: "+m);         // {temp=Java} => for both HashMap and WeakHashMap
        t = null;           // nullifying the temp object
        System.gc();
        Thread.sleep(5000);
        System.out.println("After nullifying the object: "+m);         // {temp=Java} => for HashMap  // {} => for WeakHashMap
    }
    public static void main(String[] args) throws InterruptedException {
//        hashMap();
//        linkedHashMap();
//        identityHashMap();
        weakHashMap();
    }
}
class Temp {
    @Override
    public String toString() {
        return "temp";
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}