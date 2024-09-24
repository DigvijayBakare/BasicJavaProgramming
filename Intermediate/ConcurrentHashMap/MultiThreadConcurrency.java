package Collection.ConcurrentHashMap;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadConcurrency {
    private static final int threadNum = 5;
    private static final int insertionNum = 100;
//    private static HashMap<String, Integer> map = new HashMap<>();
    private static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(threadNum);
        for (int i = 0; i < threadNum; i++) {
            service.submit(insertRecord());
        }
        service.shutdown();
        if (!service.isTerminated()) {
            Thread.sleep(1000);
        }
        System.out.println("Size of map: " + map.size());
//        System.out.println(System.getProperty("os.name"));
    }

    private static Runnable insertRecord() {
        return () -> {
            for (int i = 0; i < insertionNum; i++) {
                map.put(i + Thread.currentThread().getName(), i);
            }
        };
    }
}
