/**
 * The Executor framework in Java provides a higher-level API to manage threads, allowing you to run tasks
 *  asynchronously without manually handling thread creation. 
 * The ExecutorService is a widely used interface in this framework.
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Thread pool with 3 threads

        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                System.out.println("Task is running on thread: " + Thread.currentThread().getName());
            });
        }

        executor.shutdown(); // Gracefully shut down the executor service
    }
}
