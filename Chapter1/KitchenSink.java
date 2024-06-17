public class KitchenSink {
    private int numForks; // Private instance variable to store the number of forks

    public static final void main(String[] parameters) {
        int numKnives; // Local variable to store the number of knives
        
        // Print statement to output the number of utensils
        // This will not compile correctly in Java 11 due to the multi-line string using triple quotes
        // and the use of instance variables within a static context.
        // To fix this, you would typically use traditional string concatenation or formatting.
        System.out.print("""
        "# forks = " + numForks + 
         " #knives = " + numKnives + 
         # cups = 0
        """);
        var morning = ""; morning = null;
        var night =  Integer.valueOf(3);
        System.out.println("Night: " + night);
        System.out.println( night instanceof Integer); //true
    }
}