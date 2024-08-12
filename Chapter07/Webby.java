package Chapter07;

abstract class Husky { // abstract required in class declaration
    abstract void play(); // abstract required in method declaration
}
interface Poodle { // abstract optional in interface declaration
    void play(); // abstract optional in method declaration, the methos in interfaces are public by default
}

public class Webby extends Husky {
    void play() {} // OK - play() is declared with package access in Husky
}

public class Georgette implements Poodle {
    void play() {} // DOES NOT COMPILE - play() is public in Poodle
}