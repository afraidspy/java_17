
import java.util.function.Consumer;

public class LambdaExamplesVariables {
    public static void main(String[] args) {
        String greeting = "Hello, "; // Esta variable es efectivamente final
        int repeatCount = 3; // También efectivamente final

        // Definir una lambda que usa estas variables locales
        Consumer<String> greeter = name -> {
            for (int i = 0; i < repeatCount; i++) {
                System.out.println(greeting + name);
            }
        };

        // Usar la lambda
        greeter.accept("Alice");
        // Imprime "Hello, Alice" tres veces
    }
}
