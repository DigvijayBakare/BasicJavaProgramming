package Collection.QueueInterface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
//        PriorityQueue q = new PriorityQueue();                                          // [A, B, L, Z]
        PriorityQueue<String> q = new PriorityQueue<String>(15,new NewPComparator());                 //
        q.offer("A");
        q.offer("L");
        q.offer("B");
        q.offer("Z");
        System.out.println("PriorityQueue: "+q);
    }
}
class NewPComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}