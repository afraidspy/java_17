class AnimalsOutForAWalk extends RuntimeException {

}
class ExhibitClosed extends RuntimeException {

}
class ExhibitClosedForLunch extends ExhibitClosed {

}

class ExampleException{

    public void seeAnimal() throws RuntimeException{

        System.out.println("See animal ...");

    }

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) { // first catch block
        System.out.print("try back later");
        } catch (ExhibitClosed e) { // second catch block
        System.out.print("not today");
        }
    }
}


public class MainException1 {

    public static void main(String[] args) {
        
    }
    
}
