public class TranslateEscapesExample {
    public static void main(String[] args) {
        String strWithEscapes = "Hello\\nWorld\\tJava";
        String translated = strWithEscapes.translateEscapes();
        System.out.println("Original: " + strWithEscapes);
        System.out.println("Translated: " + translated);
    }
}
