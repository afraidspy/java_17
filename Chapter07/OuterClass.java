public class OuterClass {
    private String outerField = "Outer field";

    // Clase interna no estática
    class InnerClass {
        void display() {
            // Accede a los miembros de la clase externa
            System.out.println("Accessing from InnerClass: " + outerField);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
