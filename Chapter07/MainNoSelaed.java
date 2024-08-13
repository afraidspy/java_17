// Clase sellada
sealed abstract class Shape permits Circle, Rectangle, ColoredShape {
    public abstract double area();
}

// Clase final que extiende la clase sellada
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

// Clase final que extiende la clase sellada
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

// Clase non-sealed que extiende la clase sellada
non-sealed class ColoredShape extends Shape {
    private final String color;

    public ColoredShape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColoredShape with color " + color;
    }

    @Override
    public double area() {
        // Implementar el cálculo del área según el tipo de ColoredShape
        return 0.0; // Placeholder
    }
}

// Clase final que extiende la clase non-sealed
final class ColoredCircle extends ColoredShape {
    private final double radius;
    
    public ColoredCircle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "ColoredCircle with radius " + radius + " and color " + getColor();
    }
}

// Clase principal para ejecutar el ejemplo
public class MainNoSelaed {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape coloredCircle = new ColoredCircle(7, "Red");

        System.out.println(circle); // Output: Circle with radius 5.0
        System.out.println("Area of circle: " + circle.area()); // Output: Area of circle: 78.53981633974483
        
        System.out.println(rectangle); // Output: Rectangle with width 4.0 and height 6.0
        System.out.println("Area of rectangle: " + rectangle.area()); // Output: Area of rectangle: 24.0
        
        System.out.println(coloredCircle); // Output: ColoredCircle with radius 7.0 and color Red
        System.out.println("Area of colored circle: " + coloredCircle.area()); // Output: Area of colored circle: 153.93804002589985
    }
}
