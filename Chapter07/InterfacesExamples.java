interface X {
    default void display() {
        System.out.println("Interface X");
    }
}

interface Y {
    default void display() {
        System.out.println("Interface Y");
    }
}

public class InterfacesExamples implements X, Y {
    // Overriding the display method to resolve conflict
    @Override
    public void display() {
        // Calling a specific method from an interface
        X.super.display(); // Calls the display() method from interface X
        Y.super.display(); // Calls the display() method from interface Y
    }

    public static void main(String[] args) {
        InterfacesExamples obj = new InterfacesExamples();
        obj.display();
    }
}
