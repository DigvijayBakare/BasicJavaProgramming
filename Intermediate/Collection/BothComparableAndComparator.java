package Collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;

class Employee implements Comparable {
    String employeeName;
    int eid;

    Employee(String employeeName, int eid) {
        this.employeeName = employeeName;
        this.eid = eid;
    }

    @Override
    public String toString() {
        return (employeeName+" "+eid);
    }

    @Override
    public int compareTo(Object o1) {
        int eid = this.eid;
        Employee e = (Employee) o1;
        int eid2 = e.eid;
        if (eid <eid2) {
            return -1;
        } else if (eid > eid2) {
            return +1;
        } else {
            return 0;
        }
    }
}
class ComparatorNew implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        String s1 = e1.employeeName;
        String s2 = e2.employeeName;

        return -s2.compareTo(s1);
    }
}
public class BothComparableAndComparator {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram", 100);
        Employee e2 = new Employee("Sham", 105);
        Employee e3 = new Employee("Suraj", 102);
        Employee e4 = new Employee("Niraj", 103);
        Employee e5 = new Employee("Arun", 109);
        Employee e6 = new Employee("Ram", 100);

        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        t.add(e6);

        System.out.println("TreeSet (DNSO -> Comparable interface): " + t);

        TreeSet t1 = new TreeSet(new ComparatorNew());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        t1.add(e6);
        System.out.println("New TreeSet (Customised sorting order by user): " + t1);

    }
}
