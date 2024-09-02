package Collection;

public class ComparableDemo {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z"));          // -ve value
        System.out.println("Z".compareTo("K"));          // +ve value
        System.out.println("A".compareTo("A"));          // 0
        System.out.println("A".compareTo(null));         // NPE
    }
}
