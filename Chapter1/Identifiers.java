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

}