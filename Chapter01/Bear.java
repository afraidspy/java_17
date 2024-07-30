
public class Bear {
    private Bear pandaBear; // Instance variable to hold a Bear object
    private void roar(Bear b) {// Private method roar that takes a Bear object as a parameter
        System.out.println("Roar!!"); // Print "Roar!!" to the console
        pandaBear = b; // Assign the passed Bear object to the pandaBear instance variable
    }
    public static void main(String [] args) { // Main method to run the program
        Bear brownBear = new Bear(); // Create a new Bear object and assign it to brownBear
        Bear polarBear = new Bear(); // Create another new Bear object and assign it to polarBear
        brownBear.roar(polarBear); // Call the roar method on brownBear, passing polarBear as the argument
        polarBear = null; // Set the reference of polarBear to null
        brownBear = null; // Set the reference of brownBear to null
        System.gc(); // Suggest the JVM to run the garbage collector
    }
}
