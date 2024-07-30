public class Inmutable {
    public static void main(String[] args) {

        // Create a string
        String original = "Hello";
        
        // Attempt to modify the string by concatenating another text
        String modified = original.concat(" world!");

        // Display both strings
        System.out.println("Original: " + original);  // "Hello"
        System.out.println("Modified: " + modified);  // "Hello world!"
        
    }
}