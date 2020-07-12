import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long start = System.currentTimeMillis();
        Callable ca = () -> {
            System.out.println("Child thread is calculating");
            long count;
            while ((count = System.currentTimeMillis() - start) <= 2000) {
                System.out.println(count);
            }
            return count;
        };

        ExecutorService exe = Executors.newCachedThreadPool();
        Future<Integer> fu = exe.submit(ca);
        exe.shutdown();

        System.out.println("Main thread is executing");

        System.out.println(fu.get());
        
        System.out.println("All thread are completed");

    }
}
