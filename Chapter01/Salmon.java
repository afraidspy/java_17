public class Salmon {
    int count; // Instance variable to hold the count

    {
        System.out.print(count + "-"); // This block runs before any constructor
    }

    {
        count++; // This block increments count (executes after the first block)
    }

    // Constructor of Salmon class
    public Salmon() {
        count = 4; // Initialize count to 4
        System.out.print(2 + "-"); // Print 2 followed by a dash
    }

    // Main method, entry point of the program
    public static void main(String args[]) {
        System.out.print(7 + "-"); // Print 7 followed by a dash

        var s = new Salmon(); // Create a new instance of Salmon
        System.out.print(s.count + "-"); // Print the value of s.count followed by a dash

        // Output should be: 7-0-2-4-
    }
}