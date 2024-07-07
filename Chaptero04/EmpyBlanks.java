public class EmpyBlanks {
    public static void main (String [] args) {
        // Retunr 0 if the lenght of the string is 0
        System.out.println("".isEmpty()); //true => length = 0
        System.out.println("     ".isEmpty()); //false
        //checks if a string is empty or contains only whitespace characters.
        System.out.println("".isBlank()); //true
        System.out.println("     ".isBlank()); //true 

    }
}
