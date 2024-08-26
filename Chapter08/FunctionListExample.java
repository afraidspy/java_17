import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionListExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Create a Function that converts a string to its length
        Function<String, Integer> getLength = str -> str.length();

        // Apply the Function to each name in the list
        List<Integer> lengths = names.stream()
                                     .map(getLength)
                                     .collect(Collectors.toList());

        System.out.println(lengths); // Output: [5, 3, 7]
    }
}
