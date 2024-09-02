package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;

        // various possible implementations for compare() method

        /*// first possible implementation for compare() method => gives set in descending order
        if (I1 < I2) {
            return +1;
        } else if (I1 > I2) {
            return -1;
        } else {
            return 0;
        }*/

        // second possible implementation for compare() method => gives set in descending order
//        return I1.compareTo(I2);

        // third possible implementation for compare() method => gives set in descending order
        return -I1.compareTo(I2);
//        return I2.compareTo(I1);

//        return -I2.compareTo(I1);               // => gives set in ascending order
//        return +1;               // => gives set in insertion order
//        return -1;               // => gives set in reverse of insertion order
//        return 0;
        // => gives set of only first element added and all remaining elements are considered as duplicates
    }
}
public class ComparatorEx1 {
    public static void main(String[] args) {
//        TreeSet t = new TreeSet();
        // call to default natural sorting order => ascending order output we'll get

        TreeSet t = new TreeSet(new MyComparator());
        // call to customised sorting order => descending order output we'll get

        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);

        // print the TreeSet for added element
        System.out.println("TreeSet: "+t);
    }
}
