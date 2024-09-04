import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ExercisesStream2 {

    public static void main(String[] args) {
        System.out.println("Result A: " + optionA());
        System.out.println("Result B: " + optionB());
        System.out.println("Result C: " + optionC());
        System.out.println("Result D: " + optionD());
        System.out.println("Result E: " + optionE());
        System.out.println("Result F: " + optionF());
    }

    public static double optionA() {
        return LongStream.of(6L, 8L, 10L)
            .mapToInt(x -> (int) x)
            .boxed()  // Convert IntStream to Stream<Integer>
            .collect(Collectors.groupingBy(x -> x))
            .keySet()
            .stream()
            .collect(Collectors.averagingInt(x -> x));
    }

    public static double optionB() {
        return LongStream.of(6L, 8L, 10L)
            .mapToInt(x -> (int) x)
            .boxed()  // Convert IntStream to Stream<Integer>
            .collect(Collectors.groupingBy(x -> x))
            .keySet()
            .stream()
            .collect(Collectors.averagingInt(x -> x));
    }

    public static double optionC() {
        return LongStream.of(6L, 8L, 10L)
            .mapToInt(x -> (int) x)
            .boxed()  // Convert IntStream to Stream<Integer>
            .collect(Collectors.groupingBy(x -> x))
            .keySet()
            .stream()
            .collect(Collectors.averagingInt(x -> x));
    }

    public static double optionD() {
        return LongStream.of(6L, 8L, 10L)
            .mapToInt(x -> (int) x)
            .boxed()  // Convert IntStream to Stream<Integer>
            .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
            .keySet()
            .stream()
            .collect(Collectors.averagingInt(x -> x));
    }

    public static double optionE() {
        return LongStream.of(6L, 8L, 10L)
            .mapToInt(x -> (int) x)
            .boxed()  // Convert IntStream to Stream<Integer>
            .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
            .keySet()
            .stream()
            .collect(Collectors.averagingInt(x -> x));
    }

    public static double optionF() {
        return LongStream.of(6L, 8L, 10L)
            .mapToInt(x -> (int) x)
            .boxed()  // Convert IntStream to Stream<Integer>
            .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
            .keySet()
            .stream()
            .collect(Collectors.averagingInt(x -> x));
    }
}
