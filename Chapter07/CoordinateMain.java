public class CoordinateMain {
    public static void main(String[] args) {
        // Usando el método estático para crear un objeto Coordinates
        Coordinates c1 = Coordinates.of(10, 20);
        System.out.println("Coordinates 1: " + c1);

        // Usando el método estático con valor predeterminado para `y`
        Coordinates c2 = Coordinates.withDefaultY(5);
        System.out.println("Coordinates 2: " + c2);

        // Usando el método estático para crear un objeto en el origen
        Coordinates c3 = Coordinates.origin();
        System.out.println("Coordinates 3: " + c3);
    }
}

record Coordinates(int x, int y) {
    // Constructor compacto para validación
    public Coordinates {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Coordinates must be non-negative");
        }
    }

    // Métodos estáticos para crear instancias con diferentes parámetros
    public static Coordinates of(int x, int y) {
        return new Coordinates(x, y);
    }

    public static Coordinates withDefaultY(int x) {
        return new Coordinates(x, 0); // Llama al constructor compacto
    }

    public static Coordinates origin() {
        return new Coordinates(0, 0); // Llama al constructor compacto
    }
}
