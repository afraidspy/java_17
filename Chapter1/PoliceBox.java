public class PoliceBox {
    String color; // Color of the PoliceBox = null
    long age; // Age of the PoliceBox in years = 0

    // Constructor method for PoliceBox
    public void PoliceBox() {
        color = "blue"; // Initialize color to blue
        age = 1200; // Initialize age to 1200
    }

    // Main method to demonstrate PoliceBox behavior
    public static void main(String[] time) {
        var p = new PoliceBox(); // Create a new PoliceBox instance p
        var q = new PoliceBox(); // Create another PoliceBox instance q

        p.color = "green"; // Change color of PoliceBox p to green
        p.age = 1400; // Update age of PoliceBox p to 1400

        p = q; // Assign q to p, making p refer to the same object as q

        // Output statements to display color and age of PoliceBoxes q and p
        System.out.println("Q1= " + q.color); // Output Q1 color = null
        System.out.println("Q2= " + q.age); // Output Q1 age = 0
        System.out.println("P1= " + p.color); // Output P1 color (same as Q1) = null
        System.out.println("P2= " + p.age); // Output P1 age (same as Q1) = 0
    }
}
