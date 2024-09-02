package MultiThreading.Enhancements;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable {
    int num;
    MyCallable(int num) {
        this.num = num;
    }
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" is responsible to find sum of first "+num+" numbers");
        int sum = 0;
        for (int i=1; i<=num; i++) {
            sum += i;
        }
        return sum;
    }
}
public class CallableFuture {
    public static void main(String[] args) throws Exception {
        MyCallable[] job = {
          new MyCallable(10),new MyCallable(20), new MyCallable(30), new MyCallable(40),
                new MyCallable(50), new MyCallable(60)
        };
        ExecutorService service = Executors.newFixedThreadPool(1);
        //

//        ExecutorService service = Executors.newFixedThreadPool(6);
        //

        for (MyCallable m : job) {
            Future f = service.submit(m);
            System.out.println(f.get());
        }
        service.shutdown();
    }
}
