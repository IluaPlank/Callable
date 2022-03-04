import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException , ExecutionException {
        final ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        Callable<Integer> myCallable = new MyCallable();
        Callable<Integer> myCallable1 = new MyCallable();
        Callable<Integer> myCallable2 = new MyCallable();
        Callable<Integer> myCallable3 = new MyCallable();
        List<Callable<Integer>> myCall= new ArrayList<>();

        myCall.add(myCallable);
        myCall.add(myCallable1);
        myCall.add(myCallable2);
        myCall.add(myCallable3);

        System.out.println(threadPool.invokeAny(myCall));

        threadPool.shutdown();
    }
}
