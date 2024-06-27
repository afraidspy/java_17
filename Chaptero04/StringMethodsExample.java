public class StringMethodsExample {

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
    }
}
