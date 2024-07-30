public class MathClass {
    public static void main(String[] args) {
        int a = -10;
        double b = -3.14;
        double c = 16;
        double d = 2.25;
        double base = 2;
        double exponent = 3;
        int x = 10;
        int y = 20;
        double e = 3.45;
        double f = 3.55;
        /**
         * Math.abs(): Calcula el valor absoluto de un número.
            Math.sqrt(): Calcula la raíz cuadrada de un número.
            Math.pow(): Calcula la potencia de un número.
            Math.max(): Encuentra el valor máximo entre dos números.
            Math.min(): Encuentra el valor mínimo entre dos números.
            Math.random(): Genera un número aleatorio entre 0.0 y 1.0.
            Math.round(): Redondea un número al entero más cercano.
            Math.floor(): Redondea un número hacia abajo al entero más cercano.
            Math.ceil(): Redondea un número hacia arriba al entero más cercano.
         */

        // abs
        System.out.println("Math.abs(a): " + Math.abs(a)); // 10
        System.out.println("Math.abs(b): " + Math.abs(b)); // 3.14

        // sqrt
        System.out.println("Math.sqrt(c): " + Math.sqrt(c)); // 4.0
        System.out.println("Math.sqrt(d): " + Math.sqrt(d)); // 1.5

        // pow
        System.out.println("Math.pow(base, exponent): " + Math.pow(base, exponent)); // 8.0

        // max and min
        System.out.println("Math.max(x, y): " + Math.max(x, y)); // 20
        System.out.println("Math.min(x, y): " + Math.min(x, y)); // 10

        // random
        System.out.println("Math.random(): " + Math.random()); // e.g., 0.123456789

        // round
        System.out.println("Math.round(e): " + Math.round(e)); // 3
        System.out.println("Math.round(f): " + Math.round(f)); // 4

        // floor and ceil
        System.out.println("Math.floor(e): " + Math.floor(e)); // 3.0
        System.out.println("Math.ceil(e): " + Math.ceil(e));   // 4.0
        System.out.println("Math.floor(f): " + Math.floor(f)); // 3.0
        System.out.println("Math.ceil(f): " + Math.ceil(f));   // 4.0
    }
}
