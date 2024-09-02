package Collection.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        System.out.println("Return head element of queue: "+q.peek());              // null
//        System.out.println("Return head element of queue: "+q.element());           // NSEE
        for (int i=0; i<=10; i++) {
            q.offer(i);
        }
        System.out.println("PriorityQueue: "+q);
        System.out.println("Remove and return head element in the queue: "+q.poll());
        System.out.println("PriorityQueue: "+q);
    }
}
