import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        // Crear un UnaryOperator que incrementa un número en 1
        UnaryOperator<Integer> increment = number -> number + 1;

        // Aplicar el UnaryOperator a un número
        Integer result = increment.apply(5);
        System.out.println(result); // Output: 6
    }
}
