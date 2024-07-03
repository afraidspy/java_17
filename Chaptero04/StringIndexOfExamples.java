public class StringIndexOfExamples {

    public static void main(String[] args) {
        String str = "Hello, world!";

        // indexOf(int ch)
        int index1 = str.indexOf('o'); // Devuelve 4
        System.out.println("Index of 'o': " + index1);

        // indexOf(int ch, int fromIndex)
        int index2 = str.indexOf('o', 5); // Devuelve 8 (busca a partir del índice 5)
        System.out.println("Index of 'o' starting from index 5: " + index2);

        // indexOf(String str)
        int index3 = str.indexOf("world"); // Devuelve 7
        System.out.println("Index of \"world\": " + index3);

        // indexOf(String str, int fromIndex)
        int index4 = str.indexOf("o", 5); // Devuelve 7 (busca 'o' a partir del índice 5)
        System.out.println("Index of \"o\" starting from index 5: " + index4);


    }
}
