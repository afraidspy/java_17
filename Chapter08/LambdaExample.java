@FunctionalInterface
interface Calculator {
    int calculate(int x, int y);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Usando una lambda para la implementación
        Calculator addition = (x, y) -> x + y;
        Calculator subtraction = (x, y) -> x - y;

        System.out.println("Addition: " + addition.calculate(10, 5));      // Imprime: Addition: 15
        System.out.println("Subtraction: " + subtraction.calculate(10, 5)); // Imprime: Subtraction: 5
    }
}

