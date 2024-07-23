public class VarargsExample {

    // Method with varargs and another parameter
    /**
     * Flexibility: Allows methods to handle different numbers of arguments without overloading.
     * Simplicity: Reduces the need for multiple overloaded methods.
     */
    public void printDetails(String label, int... numbers) {
        System.out.println(label);
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        VarargsExample example = new VarargsExample();

        // Calling the method with different numbers of arguments
        example.printDetails("Numbers:", 1, 2, 3);
        example.printDetails("More numbers:", 4, 5);
        example.printDetails("No numbers:");
    }
}