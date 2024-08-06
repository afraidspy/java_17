
abstract class Mammal {
    abstract void showHorn();
    abstract void eatLeaf();
   }

abstract class Rhino extends Mammal {
    void showHorn() {} // Inherited from Mammal

}

class BlackRhino extends Rhino {
    void eatLeaf() {
        System.out.println("Enter to eat leaf");
    } // Inherited from Mammal
   }

public class ExampleAbstractClass {

    public static void main(String[] args) {

        BlackRhino blackRhino = new BlackRhino();

        blackRhino.eatLeaf();
        
    }
    
}
