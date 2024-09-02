package MultiThreading.Enhancements;

class ParentThread extends Thread {
    // in this program if we replace InheritableThreadLocal with ThreadLocal and if we are not overriding
    // childValue() method then we'll not get any value at the child thread (i.e. we'll get null as output)

//    public static InheritableThreadLocal tl = new InheritableThreadLocal();
    // by using this inheritable class the ThreadLocal value of parent will be inherited by child thread as it is

    public static InheritableThreadLocal tl = new InheritableThreadLocal(){
        @Override
        public Object childValue(Object p) {
            return "cc";
        }
    };
    // and by overriding childValue() method of InheritableThreadLocal class we'll be able to provide different
    // value for child thread

    @Override
    public void run() {
        tl.set("pp");
        System.out.println("Parent Thread value: "+tl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }
}
class ChildThread extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread value: "+ParentThread.tl.get());
    }
}
public class InheritanceThreadLocal {
    public static void main(String[] args) {
        ParentThread pt = new ParentThread();
        pt.start();
    }
}
