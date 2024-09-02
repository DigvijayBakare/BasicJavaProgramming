package Collection.CollectionInterface;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println("Stack: "+s);                               // [A, B, C]
        System.out.println("Is 'A' present: "+s.search("A"));       // true
        System.out.println("Is 'Z' present: "+s.search("Z"));       // false
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.empty());
    }
}
