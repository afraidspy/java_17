public class Conditional {
    public static void main(String[] args) {
        Object obj = "Hola mundo..";

        if (obj instanceof String d ) {
            System.out.println("d: " + d);
            // d está disponible como String dentro de este bloque
            d =  "Perro";
        }
    }
}
