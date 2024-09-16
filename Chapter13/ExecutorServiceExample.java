import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Crea un pool de hilos con 3 hilos
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Enviar tareas al ExecutorService
        for (int i = 0; i < 5; i++) {
            service.execute(new Task(i));
        }

        // Cerrar el ExecutorService
        service.shutdown();
    }
}

class Task implements Runnable {
    private int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
    }
}
