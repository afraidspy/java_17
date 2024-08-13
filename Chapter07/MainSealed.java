

// Clase sellada
sealed abstract class Shape permits Circle, Rectangle {
    // Código común para todas las formas
    public abstract double area();
}

// Clase que extiende la clase sellada
final class Circle extends Shape {
    private final double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}

// Otra clase que extiende la clase sellada
final class Rectangle extends Shape {
    private final double width;
    private final double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width + " and height " + height;
    }
}

// Clase principal para ejecutar el ejemplo
public class MainSealed {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        System.out.println(circle); // Output: Circle with radius 5.0
        System.out.println("Area of circle: " + circle.area()); // Output: Area of circle: 78.53981633974483
        
        System.out.println(rectangle); // Output: Rectangle with width 4.0 and height 6.0
        System.out.println("Area of rectangle: " + rectangle.area()); // Output: Area of rectangle: 24.0
    }
}
