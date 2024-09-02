package Collection.CollectionInterface;
import java.util.*;

public class ArrayListMethodsAll {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        for (int i=0; i<10; i++) {
            l.add(i);                       // adding elements in a list
        }
        Iterator<Integer> ite = l.iterator();
        while (ite.hasNext()) {
            System.out.print(ite.next()+" ");         // accessing the elements in the list via iterator
        }
        System.out.println();
        l.forEach((e) ->{
            e = e*e;
            System.out.print(e+" ");                // printing square using foreach method
        });
        l.set(2,10);                                // setting values for indexes
        l.set(3,11);
        System.out.println("\nNew list: "+l);       // printing the list

        l.remove(8);                          // removing element from a list
        l.remove(6);

        System.out.println("Size: "+l.size());      // size of the list
        System.out.println(l.contains(5));          // is list contains the value passed
        l.ensureCapacity(8);             // ensure the minimum capacity of list
        System.out.println(l.isEmpty());            // is the list empty
        System.out.println(l.indexOf(6));           // find the index of passed element
        System.out.println("New list: "+l);
        l.sort(Comparator.naturalOrder());          // sorting the list in natural order
        System.out.println("New list: "+l);
        ArrayList nl = (ArrayList) l.clone();       // cloning the elements of list l to list nl
        System.out.println("Copied list in another list: "+nl);
        nl.clear();                                     // clearing the nl list
        System.out.println("Copied list after clearing: "+nl);
        nl.addAll(l);                                   // adding all elements from list l
        System.out.println("Added all elements for list l: "+nl);
        System.out.println(nl.subList(2,6));            // getting sublist from nl list
        System.out.println(Arrays.toString(l.toArray()));                // printing list in array format
        System.out.println(l.toString());                // printing list in string format
        System.out.println("Last index of 2: "+l.lastIndexOf(2));        // getting last index of element
        l.retainAll(nl);                                // retain only common elements in a collection
        System.out.println("New list l: "+l);
        l.removeIf((e)->(e%2 == 0));
        System.out.println("added removeif method: "+l);
        nl.removeAll(l);                                // removing all elements from nl  which are present in l
        System.out.println("After removing all elements: "+l);
    }
}
