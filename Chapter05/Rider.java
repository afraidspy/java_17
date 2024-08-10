class Camel {
    public int getNumberOfHumps() {
    return 1;
    }
 }

class BactrianCamel extends Camel {
    //attempting to assign weaker access privileges; was public
    private int getNumberOfHumps() { // DOES NOT COMPILE
        return 2;
    }
 }

public class Rider {
    public static void main(String[] args) {
    Camel c = new BactrianCamel();
    System.out.print(c.getNumberOfHumps()); // ???
    } 
}