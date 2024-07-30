public class SortExecutionProgram {

    static int a = 10; // Initialization of static variable

    static {
        System.out.println("Execution First: Entering static block 1"); // Executes first
    }

    {
        System.out.println("Execution Fourth: Entering instance initialization block"); // Executes when creating an instance
    }

    public SortExecutionProgram() {
        System.out.println("Execution Fifth: Entering the constructor"); // Executes when creating an instance
    }

    public static void main(String[] args) {
        System.out.println("Execution Third: Entering main");
        new SortExecutionProgram(); // Creates an instance, which triggers instance initialization block and constructor
    }

    static {
        System.out.println("Execution Second: Entering static block 2"); // Executes after static block 1
    }
    
}
