package MultiThreading.Enhancements;

public class ThreadGroupTest {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());                // main
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());    // system
        ThreadGroup g1 = new ThreadGroup("First Group");
        System.out.println(g1.getParent().getName());                   // main
        ThreadGroup g2 = new ThreadGroup(g1,"Second Group");
        System.out.println(g2.getParent().getName());                   // First Group

        // Important methods of ThreadGroup class
        ThreadGroup g3 = new ThreadGroup(g1,"Third Group");
        ThreadGroup g4 = new ThreadGroup(g1,"Fourth Group");

        // get max priority of a thread group:
        System.out.println("main: "+Thread.currentThread().getPriority());
        System.out.println("g1: "+g1.getMaxPriority()+"\ng2: "+g2.getMaxPriority());
        System.out.println("g3: "+g3.getMaxPriority()+"\ng4: "+g4.getMaxPriority());

        // set max priority of a thread group
        Thread.currentThread().setPriority(10);
        g1.setMaxPriority(5);
        System.out.println("\nAfter setting priorities: ");
        System.out.println("main: "+Thread.currentThread().getPriority());
        System.out.println("g1: "+g1.getMaxPriority()+"\ng2: "+g2.getMaxPriority());
        System.out.println("g3: "+g3.getMaxPriority()+"\ng4: "+g4.getMaxPriority());
    }
}
