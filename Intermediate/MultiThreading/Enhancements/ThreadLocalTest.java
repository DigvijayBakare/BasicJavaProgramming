package MultiThreading.Enhancements;

/*public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal();
        System.out.println("Initial value: "+tl.get());         // null
        tl.set("Java");
        System.out.println("After setting a value: "+tl.get());     // Java
        tl.remove();
        System.out.println("After using remove method: "+tl.get());     // null
    }
}*/

public class ThreadLocalTest {
    public static void main(String[] args) {

        ThreadLocal tl = new ThreadLocal(){

            // overriding of initialValue() method to get desired initial value at the first getting state
          public Object initialValue() {
              return "Hello";
          }
        };
        System.out.println("Initial value: "+tl.get());         // Hello
        tl.set("Java");
        System.out.println("After setting a value: "+tl.get());     // Java
        tl.remove();
        System.out.println("After using remove method: "+tl.get());     // Hello
    }
}