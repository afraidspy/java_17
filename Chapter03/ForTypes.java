public class ForTypes {

    public static void basicFor(){
        //Control in the index of the iteration
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración #" + (i + 1));
        }

    }

    public static void enhancedFor() {

        String[] names = {"Alice", "Bob", "Charlie", "David"};
        //For each, iterate in a collection 
        for (String name : names) {
            System.out.println(name);

        }
    }

    public static void main (String [] args ) {

        basicFor();
        enhancedFor();

    }

}