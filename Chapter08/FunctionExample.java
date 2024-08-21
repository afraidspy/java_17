import java.util.function.Function;

/**
 * The Function<T, R> interface represents a function that takes an argument of type T and produces
 *  a result of type R. It’s useful for applying transformations to data.
 */

public class FunctionExample {
    public static void main(String[] args) {
        // Create a Function that converts a string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();

        // Apply the Function to a string
        String result = toUpperCase.apply("hello world");
        System.out.println(result); // Output: HELLO WORLD
    }
}
