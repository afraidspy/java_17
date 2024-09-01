import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStream {

    public static void main(String[] args) {
        System.out.println("Numbers start from one");
        printLimitedNumbers();
        
        System.out.println("Numbers without 1, 2, 3");
        printSkippedNumbers();

        System.out.println("Names Lengths: ");
        printNameLengths();

        System.out.println("Mapped Names: ");
        flatMapNames();

        System.out.println("Flattened List of Lists: ");
        printFlattenedList();

        System.out.println("Sorted Names: ");
        printSortedNames();

        System.out.println("Sorted Names with Comparator: ");
        printSortedNamesWithComparator();

        System.out.println("Peek Example: ");
        printPeekExample();

        System.out.println("Count Example with Peek: ");
        printCountWithPeek();
    }

    public static void printLimitedNumbers() {
        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1);
        numbers.limit(4)
               .forEach(System.out::println);
    }

    public static void printSkippedNumbers() {
        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1);
        numbers.skip(3)
               .limit(4)
               .forEach(System.out::println);
    }

    public static void printNameLengths() {
        Stream<String> names = Stream.of("John", "George", "Ben");
        names.map(s -> s.length())
             .forEach(System.out::println);
    }

    public static void flatMapNames() {
        List<String> zero = List.of();
        List<String> one = List.of("John");
        List<String> two = List.of("George", "Ben");
        Stream<List<String>> names = Stream.of(zero, one, two);
        names.flatMap(m -> m.stream())
             .forEach(System.out::println);
    }

    public static void printFlattenedList() {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8)
        );

        List<Integer> flatList = listOfLists.stream()
                                            .flatMap(List::stream)
                                            .collect(Collectors.toList());

        System.out.println(flatList);  // Output: [1, 2, 3, 4, 5, 6, 7, 8]
    }

    public static void printSortedNames() {
        Stream<String> names = Stream.of("John", "George", "Benedict");
        names.sorted()
             .forEach(System.out::print);
        System.out.println();
    }

    public static void printSortedNamesWithComparator() {
        Stream<String> names = Stream.of("John", "George", "Benedict");
        names.sorted(Comparator.comparingInt(String::length))
             .forEach(System.out::print);
        System.out.println();
    }

    public static void printPeekExample() {
        Stream<String> names = Stream.of("John", "George", "Ben");
        long count = names.filter(s -> s.startsWith("G"))
                          .count();
        System.out.println(count);
    }

    public static void printCountWithPeek() {
        Stream<String> names = Stream.of("John", "George", "Ben");
        long count = names.filter(p -> p.startsWith("G"))
                          .peek(System.out::println)
                          .count();
        System.out.println(count);
    }
}
