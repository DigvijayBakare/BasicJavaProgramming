package Collection.CollectionInterface;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // declare an arrayList
        ArrayList l = new ArrayList();

        // add data to the list
        l.add(10);
        l.add("Java");
        l.add(20);
        l.add(null);

        // print the list and them remove one element and print again
        System.out.println("List: "+l);
        l.remove(3);
        System.out.println("List: "+l);

        // add element using index and print the list
        l.add(3,"C");
        System.out.println("List: "+l);
        l.add(3,null);
        System.out.println("List: "+l);
        l.clear();
        System.out.println("List: "+l);
        for (int i=0; i<100; i++) {
            l.add(i);
        }
        System.out.println("List: "+l);
    }
}
