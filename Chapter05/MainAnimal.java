// Abstract class with an abstract method
abstract class Animal {
    // Abstract method (does not have an implementation)
    public void makeSound(){}

    // Concrete method
    public void eat() {
        System.out.println("This animal is eating.");
    }
}

// Concrete subclass that extends the abstract class
class Dog extends Animal {
    // Implementing the abstract method
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

// Main class to test the functionality
public class MainAnimal {
    public static void main(String[] args) {
        // Animal a = new Animal(); // This line would cause a compile-time error

        Animal myDog = new Dog(); // Instantiate concrete subclass
        myDog.makeSound(); // Outputs: Woof Woof
        myDog.eat();       // Outputs: This animal is eating.
    }
}
