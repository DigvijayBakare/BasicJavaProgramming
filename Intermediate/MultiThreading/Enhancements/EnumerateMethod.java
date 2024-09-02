package MultiThreading.Enhancements;

public class EnumerateMethod {
    public static void main(String[] args) {
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
        Thread[] t = new Thread[system.activeCount()];
        system.enumerate(t);

        // display name's of active threads in system threadGroup and it's child threadGroup
        for (Thread t1 : t) {
            System.out.println(t1.getName()+" is daemon: "+t1.isDaemon());
        }
    }
}

// we have total 8 threads in the simple program => 1 main thread and 7 support thread