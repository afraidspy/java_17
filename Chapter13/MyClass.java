public class MyClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread '" + getName() + "' is being executed.");
    }

    public static void main(String[] args) {
        new MyClass().start();
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is being executed.");
    }
}
