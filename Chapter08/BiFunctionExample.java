import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        // Create a BiFunction that concatenates two strings
        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;

        // Apply the BiFunction to two strings
        String result = concatenate.apply("Hello, ", "World!");
        System.out.println(result); // Output: Hello, World!
    }
}
