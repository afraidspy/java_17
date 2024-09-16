public class MyClassRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is being executed.");
    }

    public static void main(String[] args) {
        new Thread(new  MyClassRunnable()).start();
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is being executed.");
    }
}
