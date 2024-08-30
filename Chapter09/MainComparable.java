import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Compara por edad
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class MainComparable {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        Collections.sort(people); // Ordena usando compareTo
        System.out.println(people); // Output: [Bob (25), Alice (30), Charlie (35)]
    }
}
