import java.util.function.BiConsumer;

/**
 * The BiConsumer<T, U> interface represents an operation that takes two arguments of types T and U respectively, 
 * and returns no result. It's useful for operations involving pairs of values.
 */

public class BiConsumerExample {
    public static void main(String[] args) {
        // Create a BiConsumer that prints two values
        BiConsumer<String, Integer> printInfo = (name, age) -> 
            System.out.println("Name: " + name + ", Age: " + age);

        // Apply the BiConsumer to a pair of values
        printInfo.accept("Alice", 30);
    }
}
