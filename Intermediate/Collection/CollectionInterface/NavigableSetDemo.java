package Collection.CollectionInterface;

import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(1000);
        t.add(2000);
        t.add(3000);
        t.add(4000);
        t.add(5000);
        t.add(6000);

        System.out.println("TreeSet: "+t);                              // [1000, 2000, 3000, 4000, 5000, 6000]
        System.out.println("Ceiling of 2000: "+t.ceiling(2000));     // 2000
        System.out.println("Higher of 2000: "+t.higher(2000));       // 3000
        System.out.println("Floor of 3000: "+t.floor(3000));         // 3000
        System.out.println("Lower of 3000: "+t.lower(3000));         // 2000
        System.out.println("PollFirst: "+t.pollFirst());                // 1000
        System.out.println("PollLast: "+t.pollLast());                  // 6000
        System.out.println("TreeSet in descending order: "+t.descendingSet());      // [5000, 4000, 3000, 2000]
        System.out.println("TreeSet: "+t);                              // [2000, 3000, 4000, 5000]
    }
}
