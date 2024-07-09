public class StringPoolExample {
    public static void main(String[] args) {
        String s1 = "Hello";  // Se almacena en el String Pool
        String s2 = "Hello";  // Reutiliza la instancia en el String Pool
        String s3 = new String("Hello l");  // Crea una nueva instancia fuera del String Pool

        // Comparación de referencias
        System.out.println(s1 == s2);  // true, porque ambas referencias apuntan a la misma instancia en el String Pool
        System.out.println(s1 == s3);  // false, porque s3 es una nueva instancia en el Heap, no en el String Pool

        // Uso del método intern()
        String s4 = s3.intern();  // Devuelve la referencia al String Pool
        System.out.println("Val: " + s4);
        System.out.println(s1 == s4);  // true, porque s4 ahora apunta a la instancia en el String Pool
    }

}
