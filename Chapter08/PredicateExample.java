import java.util.function.Predicate;

/**
 * The Predicate<T> interface represents a predicate (boolean-valued function) of one argument.
 *  It is commonly used for testing or filtering elements in a collection.
 */

public class PredicateExample {
    public static void main(String[] args) {
        // Create a Predicate that checks if a number is positive
        Predicate<Integer> isPositive = number -> number > 0;

        // Test the Predicate with different numbers
        System.out.println(isPositive.test(5));  // Output: true
        System.out.println(isPositive.test(-3)); // Output: false
    }
}
 