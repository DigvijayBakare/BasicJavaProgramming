package Collection.MapInterface;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
//        Hashtable h = new Hashtable();                          // {9=F, 8=D, 5=A, 15=B, 3=E, 2=C, 1=G}
        Hashtable h = new Hashtable(20);              // {15=B, 9=F, 8=D, 5=A, 3=E, 2=C, 1=G}
        h.put(new Temporary(5), "A");
        h.put(new Temporary(15), "B");
        h.put(new Temporary(2), "C");
        h.put(new Temporary(8), "D");
        h.put(new Temporary(3), "E");
        h.put(new Temporary(9), "F");
        h.put(new Temporary(1), "G");
//        h.put("Java", null);                    // NPE
        System.out.println("Hashtable: "+h);
    }
}
class Temporary {
    int i;
    Temporary (int i) {
        this.i = i;
    }
    @Override
    public int hashCode() {
        return i;                     // {9=F, 8=D, 5=A, 15=B, 3=E, 2=C, 1=G}
//        return i%9;                     // {8=D, 15=B, 5=A, 3=E, 2=C, 1=G, 9=F}
    }
    @Override
    public String toString() {
        return i+"";
    }
}