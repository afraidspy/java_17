import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ExcercisesStream1 {

    public static void main(String[] args) {
        iterateAndMapExample();
        predicateExample();
        joiningExample();
        averagingExample();
        filterAndCollectExample();
        toMapExample();
        groupingByExample();
    }

    private static void iterateAndMapExample() {
        var stream = Stream.iterate("", (s) -> s + "1");
        stream.limit(2)
              .map(x -> x + "2")
              .forEach(System.out::println);
    }

    private static void predicateExample() {
        Predicate<String> predicate = s -> s.startsWith("c");

        var stream1 = Stream.generate(() -> "growl!").limit(1);
        var stream2 = Stream.generate(() -> "growl!").limit(1);

        var b1 = stream1.anyMatch(predicate);
        var b2 = stream2.allMatch(predicate);

        System.out.println("b1: " + b1); // Prints: b1: false
        System.out.println("b2: " + b2); // Prints: b2: false
    }

    private static void joiningExample() {
        var names = Stream.of("John", "George", "Luke");
        String result = names.collect(Collectors.joining("-"));
        System.out.println(result); // Prints: John-George-Luke
    }

    private static void averagingExample() {
        var names1 = Stream.of("John", "George", "Luke");
        Double result1Double = names1.collect(Collectors.averagingInt(String::length));
        System.out.println(result1Double); // Prints the average length of the names
    }

    private static void filterAndCollectExample() {
        var names2 = Stream.of("John", "George", "Luke", "Joe");
        TreeSet<String> result1 = names2
            .filter(s -> s.startsWith("J"))
            .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result1); // Prints a TreeSet with names starting with 'J'
    }

    private static void toMapExample() {
        var names3 = Stream.of("John", "George", "Luke");
        Map<String, Integer> result3 = names3
            .collect(Collectors.toMap(s -> s, String::length));
        System.out.println(result3); // Prints a map with names as keys and their lengths as values
    }

    private static void groupingByExample() {
        var names4 = Stream.of("John", "George", "Luke");
        Map<Integer, List<String>> result4 = names4
            .collect(Collectors.groupingBy(String::length));
        System.out.println(result4); // Prints a map grouping names by their lengths

        System.out.println("Long Stream ...");

        double result = LongStream.of(6L, 8L, 10L)
        .mapToInt(x -> (int) x)
        .boxed()
        .collect(Collectors.groupingBy(x -> x))
        .keySet()
        .stream()
        .collect(Collectors.averagingInt(x -> x));
    }
}
