public class FormattingValues {
    public static void main( String [] args) {

        String name = "Alice";
        int age = 30;
        double salary = 50000.75;

        String formattedString = String.format("Name: %s, Age: %d, Salary: $%.3f", name, age, salary);
        System.out.println(formattedString);

        String textBlock = """
            Name: %s
            Age: %d
            Price: %.2f
            """.formatted("Alice", 30, 1234.567);
        System.out.println(textBlock);
        // Output:
        // Name: Alice
        // Age: 30
        // Price: 1234.57
    }
}
