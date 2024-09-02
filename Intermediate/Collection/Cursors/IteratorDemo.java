package Collection.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        for (int i=0; i<=10; i++) {
            l.add(i);
        }
        System.out.println("List: "+l);
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            Integer I = (Integer) itr.next();
            if (I%2 == 0) {
                System.out.print(I+" ");
            } else {
                itr.remove();
            }
        }
        System.out.println("\nNew List: "+l);
    }
}
