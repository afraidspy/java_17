import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceExample {

    public static void main(String[] args) {

        // 1. Reference to a static method
        // We define a sum operation using a reference to a static method.
        Operation sum = Calculator::add;
        System.out.println("Sum: " + sum.execute(5, 3)); // Prints: Sum: 8

        // 2. Reference to an instance method of a particular object
        // We create an instance of Printer and use it to print a message.
        Printer printer = new Printer();
        Runnable task = () -> printer.print("Hello World");
        task.run(); // Prints: Hello World

        // 3. Reference to an instance method of an arbitrary object of a particular type
        // We sort a list of names ignoring case.
        List<String> names = Arrays.asList("Ana", "juan", "Pedro", "Marta");
        names.sort(String::compareToIgnoreCase);
        System.out.println("Sorted names: " + names); // Prints: [Ana, Juan, Marta, Pedro]

        // 4. Reference to a constructor
        // We create an instance of Person using a reference to the constructor.
        Function<String, Person> personCreator = Person::new;
        Person person = personCreator.apply("Juan");
        System.out.println("Created person: " + person.getName()); // Prints: Created person: Juan

        // 5. Reference to a static method to print elements
        // We use a reference to the static println method to print each name in the list.
        names.forEach(System.out::println); // Prints each name on a new line.
    }
}

// Functional interface used in the static method reference example.
@FunctionalInterface
interface Operation {
    int execute(int a, int b);
}

// Class with a static add method.
class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
}

// Class with an instance method to print messages.
class Printer {
    public void print(String message) {
        System.out.println(message);
    }
}

// Class with a constructor that takes a name as an argument.
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
