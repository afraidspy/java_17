public class SwitchExpresion {

    final int getCookies() {
        return 4;
    }
    void feedAnimals() {
        final int bananas = 1;
        //int apples = 2;
        final int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();

        switch(numberOfAnimals) {
            case bananas:
            case apples:
            //case getCookies(): error: constant expression required
            //case cookies:error: constant expression required
            case 3 * 5:

        }
    }

    public static void main (String [] args){

    }
}