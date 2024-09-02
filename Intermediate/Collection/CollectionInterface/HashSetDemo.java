package Collection.CollectionInterface;

import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
//        HashSet h = new HashSet();
        LinkedHashSet h = new LinkedHashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));         // false
        System.out.println(h);                  // [null, B, C, D, Z, 10]
    }
}

// In the above program if we replace HashSet with LinkedHashSet then output will be
// [B, C, D, Z, null, 10]   i.e. insertion order is preserved.