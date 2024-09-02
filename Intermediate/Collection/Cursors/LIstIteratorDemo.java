package Collection.Cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class LIstIteratorDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
        l.add("Java");
        l.add("C");
        l.add("C++");
        l.add("Python");
        System.out.println("List: "+l);                 // [Java, C, C++, Python]

        ListIterator ltr = l.listIterator();
        while (ltr.hasNext()) {
            String s = (String) ltr.next();
            if (s.equals("Python")) {
                ltr.remove();                           // [Java, C, C++]
            } else if (s.equals("C++")) {
                ltr.add("Ruby");                        // [Java, C, C++, Ruby]
            } else if (s.equals("C")) {
                ltr.set("C#");
            }
        }
        System.out.println("New list: "+l);            // [Java, C#, C++, Ruby]
    }
}
