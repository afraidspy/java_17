import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionMapExample {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        // Create a BiFunction that increases the age by a given value
        BiFunction<String, Integer, Integer> increaseAge = (name, increment) -> {
            Integer currentAge = ageMap.get(name);
            if (currentAge != null) {
                return currentAge + increment;
            }
            return null;
        };

        // Apply the BiFunction to increase Bob's age by 5 years
        Integer newAge = increaseAge.apply("Bob", 5);
        System.out.println("Bob's new age: " + newAge); // Output: Bob's new age: 30
    }
}
