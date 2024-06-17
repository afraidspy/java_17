public class Camel {
    // Instance initializer block
    {
        int hairs = 3_0000_0; // Using underscore to separate digits for readability (equivalent to 300000)
        System.out.println("Hair: " + hairs);
    }

    public Camel(){
        System.out.println("Constructor star here");
    }

    // Declaring instance variables
    long water; // long variable, initially not assigned
    long air = 2; // long variable, initialized to 2
    boolean twoHumps = true; // boolean variable, initialized to true

    // Method to simulate camel spitting
    public void spit(float distance) {
        var path = ""; // Local variable, type inferred by the compiler (String)

        // Another instance initializer block inside a method
        {
            double teeth = 32 + distance++; // Local variable, adding distance (which is then incremented) to 32
        }

        // while loop that runs as long as 'water' is greater than 0
        while (water > 0) {
            int age = twoHumps ? 1 : 2; // Ternary operator to determine age based on the 'twoHumps' boolean
            short i = 1; // Local variable of type short

            // for loop that runs 10 times
            for (i = 0; i < 10; i++) {
                var Private = 2; // Local variable inside the for loop, type inferred by the compiler (int)
            }
            // SCOPE: The scope of variables declared inside the block ends here
        }
    }
    // SCOPE: The scope of variables declared inside the method ends here

    public static void main (String ... args){

        var camel = new Camel();
        System.out.println(camel);

    }
}