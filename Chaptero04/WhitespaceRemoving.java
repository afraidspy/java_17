public class WhitespaceRemoving {
    public static void main (String args []){

        String example = "            *I'm writing a book about reverse psychology. Please don’t buy it*     ";
        System.out.println(example);

        System.out.println("Using trim method");
        /** Method removes whitespace from both the beginning and the end of a string. */
        String trimmedString =  example.trim();
        System.out.println(trimmedString);
        System.out.println("Using strip method");
        /**  The strip() method, introduced in Java 11, also removes leading and trailing whitespace. 
         * It handles Unicode whitespace characters better than trim(). */
        String stripString = example.strip();
        System.out.println(stripString);
        /**Removes whitespace from the beginning of the string, */
        System.out.println("Using stripLeading method");
        String stripLeadString = example.stripLeading();
        System.out.println(stripLeadString);
        /*Removes whitespace from the end of the string. */
        System.out.println("Using stripTrailing method");
        String stripTrailingString = example.stripTrailing();
        System.out.println(stripTrailingString);

    }
}