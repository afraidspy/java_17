public class StringMethodsExampleJava17 {

    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. length()
        int length = str.length();
        System.out.println("Length: " + length);  // Output: Length: 13

        // 2. charAt(int index)
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);  // Output: Character at index 7: W

        // 3. substring(int beginIndex, int endIndex)
        String sub = str.substring(7, 12);
        System.out.println("Substring: " + sub);  // Output: Substring: World

        // 4. replace(char oldChar, char newChar)
        String replacedStr = str.replace('o', '0');
        System.out.println("Replaced String: " + replacedStr);  // Output: Replaced String: Hell0, W0rld!

        // 5. toUpperCase()
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);  // Output: Uppercase String: HELLO, WORLD!

        // 6. Using Text Blocks (introduced in Java 13 and standardized in Java 15)
        String textBlock = """
                           This is a
                           multi-line
                           string.
                           """;
        System.out.println("Text Block: " + textBlock);

        // 7. Using strip() method (introduced in Java 11)
        String strWithWhitespaces = "  Hello, World!  ";
        String strippedStr = strWithWhitespaces.strip();
        System.out.println("Stripped String: " + strippedStr);  // Output: Stripped String: Hello, World!

        // 8. Using indent() method (introduced in Java 12)
        String indentedStr = str.indent(4);
        System.out.println("Indented String: \n" + indentedStr);

        // 9. Using repeat() method (introduced in Java 11)
        String repeatedStr = str.repeat(3);
        System.out.println("Repeated String: " + repeatedStr);  // Output: Repeated String: Hello, World!Hello, World!Hello, World!

        // 10. Using lines() method (introduced in Java 11)
        String multiLineStr = "Hello\nWorld\nJava";
        multiLineStr.lines().forEach(System.out::println);
        // Output:
        // Hello
        // World
        // Java
    }
}
