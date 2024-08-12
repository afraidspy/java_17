interface Utility {
    // Método static que utiliza un método private static
    static void performOperation() {
        System.out.println("Performing operation:");
        helperOperation(); // Llama al método private static
    }
    
    // Método private static
    private static void helperOperation() {
        System.out.println("This is a private static operation.");
    }
    
    // Método default que también usa un método private static
    default void execute() {
        System.out.println("Executing operation:");
        helperOperation(); // Llama al método private static
    }
}

public class MainClass implements Utility {
    public static void main(String[] args) {
        Utility.performOperation(); // Muestra el uso del método private static dentro de un método static
        
        MainClass obj = new MainClass();
        obj.execute(); // Muestra el uso del método private static dentro de un método default
    }
}
