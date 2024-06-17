/**
 *  Identifier Rules in Java:
 *
 *   Starting Character: Identifiers must start with a letter (a-z, A-Z), currency character ($), or an underscore (_).
 *   Subsequent Characters: After the first character, identifiers can have any combination of characters,
 *    currency characters, underscores, and digits (0-9).
 *   Keywords: Identifiers cannot be a keyword (e.g., class, int, public).
 *   Reserved Names: Some names are reserved and cannot be used as identifiers (e.g., var, _).
 */

public class Identifiers {
    //Invalid: only can start with $, _
    //private String @34cats;
    private String _34cats;
    //Invalid: they can´t stsrt with numbers
    //private String 34dogs;
    private String $34$dogs;

    //private int _;
    private int _count;

    private Integer _Q2_;

    public static void main (String ... params) {
        /*
        Underscore Placement: Underscores can be placed anywhere between digits in a numeric literal
        to improve readability, except at the beginning or end, adjacent to a decimal point,
        or in invalid contexts.
        */
        var magic = 3_1;
        var magic2 = 2.0_0;
        int million = 1_000_000; // 1 million
        long creditCardNumber = 1234_5678_9012_3456L; // Credit card number

        int bitmask = 0b0010_1010_1111_0000; // Binary literal
        int color = 0xFF_AA_BB_CC; // Hexadecimal literal

        double pi = 3.1415_9265; // Pi with underscore for readability
        float minFloat = 1.234_567e-10f; // Scientific notation with underscore

        // Incorrect usage
        //int _invalid = 1_000_; // Underscore at the end
        //float invalidFloat = 123._456f; // Underscore next to the decimal point
        //long badHex = 0x_1F; // Underscore at the beginning of a hexadecimal literal

        int badNumber = 1___000; // Multiple consecutive underscores

        float counter = 50.0f;
        counter++;

        System.out.println(counter);


    }
}