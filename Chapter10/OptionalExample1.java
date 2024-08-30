import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        // Creando un Optional vacío
        Optional<String> empty = Optional.empty();
        System.out.println("Optional vacío: " + empty);

        // Creando un Optional con un valor no nulo
        Optional<String> opt = Optional.of("Hello, World!");
        System.out.println("Optional con valor: " + opt.get());

        // Creando un Optional que podría ser nulo
        String name = null;
        Optional<String> nullableOpt = Optional.ofNullable(name);
        System.out.println("Optional de valor nulo: " + nullableOpt);
    }
}
