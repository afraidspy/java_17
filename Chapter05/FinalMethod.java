class Parent {
    
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public void nonFinalMethod() {
        System.out.println("This is a non-final method.");
    }
}

class Child extends Parent {
    // This will cause a compile-time error
    // @Override
    // public void finalMethod() {
    //     System.out.println("Trying to override a final method.");
    // }

    @Override
    public void nonFinalMethod() {
        System.out.println("Overriding a non-final method.");
    }
}

public class  FinalMethod {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println("Parent class method calls:");
        parent.finalMethod();
        parent.nonFinalMethod();

        System.out.println("\nChild class method calls:");
        child.finalMethod(); // Calls the final method from FinalMethod class
        child.nonFinalMethod(); // Calls the overridden method in Child class
    }
}
