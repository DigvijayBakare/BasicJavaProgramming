package Collection.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class HashMapConcurrency {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("Y", 5);
        map.put("B", 3);
        map.put("L", 2);
        map.put("P", 6);
        map.put("M", 4);

        System.out.println("Map size: " + map.size());

        int getA = map.get("A");
        System.out.println("Value of A: " + getA);

        map.remove("B");
        System.out.println("New map size: " + map.size());
    }
}
