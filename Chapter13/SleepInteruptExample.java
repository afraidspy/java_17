public class SleepInteruptExample {

    public static void main(String[] args) {

        Thread sleeperThread = new Thread(() -> {
            try {
                System.out.println("Going to sleep for 10 seconds...");
                Thread.sleep(10000);
                System.out.println("Woke up after 10 seconds!");
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted during sleep!");
            }
        });

        sleeperThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        sleeperThread.interrupt();


    }
}
