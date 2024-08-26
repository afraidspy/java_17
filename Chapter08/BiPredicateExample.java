import java.util.function.BiPredicate;

/**
 * The BiPredicate<T, U> interface represents a predicate (boolean-valued function) of two arguments. 
 * It is useful for testing conditions involving two values.
 */

public class BiPredicateExample {
    public static void main(String[] args) {
        // Create a BiPredicate that checks if two numbers are both positive
        BiPredicate<Integer, Integer> areBothPositive = (a, b) -> a > 0 && b > 0;

        // Test the BiPredicate with different pairs of numbers
        System.out.println(areBothPositive.test(5, 10));  // Output: true
        System.out.println(areBothPositive.test(-5, 10)); // Output: false
    }
}
