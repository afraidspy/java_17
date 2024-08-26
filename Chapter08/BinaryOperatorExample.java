import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Crear un BinaryOperator que suma dos números
        BinaryOperator<Integer> add = (a, b) -> a + b;

        // Aplicar el BinaryOperator a dos números
        Integer result = add.apply(5, 3);
        System.out.println(result); // Output: 8
    }
}
