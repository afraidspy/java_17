record Person(String name, int age) {
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    public String greeting() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
}

public class MainRecord {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person.greeting()); // Output: Hello, my name is Alice and I am 30 years old.
    }
}
