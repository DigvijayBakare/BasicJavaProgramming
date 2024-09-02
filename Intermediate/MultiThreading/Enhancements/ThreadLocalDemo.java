package MultiThreading.Enhancements;

class CustomerThread extends Thread {
    static Integer custID = 0;
    private static ThreadLocal tl = new ThreadLocal(){
        protected Integer initialValue () {
            return ++custID;
        }
    };
    CustomerThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" executing with customer id: "+tl.get());
    }
}
public class ThreadLocalDemo {
    public static void main(String[] args) {
        CustomerThread c1 = new CustomerThread("Customer Thread-1");
        CustomerThread c2 = new CustomerThread("Customer Thread-2");
        CustomerThread c3 = new CustomerThread("Customer Thread-3");
        CustomerThread c4 = new CustomerThread("Customer Thread-4");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}

// In the above program for every customer thread a separate customer id will be maintained by ThreadLocal object