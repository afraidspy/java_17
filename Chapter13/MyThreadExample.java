
/**
 * A thread is the smallest unit of execution in a Java program. In Java, you can create and manage threads using the Thread class or the Runnable interface.
 */
public class MyThreadExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThreadExample());
        thread.start(); // Starts the thread
    }
}
