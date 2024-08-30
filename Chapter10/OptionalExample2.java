import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Hello");

        // Ejecutar si el valor está presente
        opt.ifPresent(value -> System.out.println("El valor es: " + value));
    }
}
