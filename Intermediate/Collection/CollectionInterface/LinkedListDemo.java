package Collection.CollectionInterface;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Java");
        l.add(30);
        l.add(null);
        l.add("C");
        l.set(1,"Programming");
        l.removeLast();
        l.addFirst("C++");
        System.out.println("List: "+l);
    }
}
