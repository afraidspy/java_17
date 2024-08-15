public class PointMain {
    public static void main(String[] args) {
        try {
            // Creación de un punto con coordenadas válidas
            Point p1 = new Point(10, 20);
            System.out.println("Punto 1: " + p1);

            // Intento de crear un punto con coordenadas negativas
            // Esto lanzará una IllegalArgumentException debido a la validación en el constructor compacto
            Point p2 = new Point(-5, 15);
            System.out.println("Punto 2: " + p2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

record Point(int x, int y) {
    // Constructor compacto
    public Point {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Coordinates must be non-negative");
        }
    }
}
