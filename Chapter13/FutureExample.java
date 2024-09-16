import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * This example demonstrates the use of the Future<V> interface in Java.
 * 
 * Future is used to represent the result of an asynchronous task that runs
 * in a separate thread. It allows:
 * - Retrieving the result of a task that hasn't finished yet.
 * - Checking whether the task is completed or has been canceled.
 * - Canceling a running task if needed.
 * 
 * In this example, we use an ExecutorService to run a background task
 * using a Callable, and then use Future to get the result of that task 
 * once it finishes.
 */
public class FutureExample {
    public static void main(String[] args) {
        // Create a thread pool with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit a Callable task that returns a result
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                // Simulate a long-running task
                Thread.sleep(2000);
                return 42;
            }
        });

        // Check if the task is done
        if (!future.isDone()) {
            System.out.println("Task is still in progress...");
        }

        try {
            // Block until the task is completed and retrieve the result
            Integer result = future.get();
            System.out.println("Task result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
