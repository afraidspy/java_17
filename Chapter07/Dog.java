
interface Animal {
    // Método default que utiliza un método private
    default void makeSound() {
        System.out.println("Animal sound:");
        internalSound(); // Llama al método private
    }
    
    // Método private
    private void internalSound() {
        System.out.println("This is a private sound.");
    }
    
    // Otro método default que también usa el método private
    default void makeAnotherSound() {
        System.out.println("Another animal sound:");
        internalSound(); // Llama al método private
    }
}

public class Dog implements Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Muestra el uso del método private dentro de un método default
        dog.makeAnotherSound(); // Muestra el uso del método private en otro método default
    }
}
