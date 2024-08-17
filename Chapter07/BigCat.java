public interface BigCat {
    abstract String getName();

    static int hunt() {
        return 5; // Eliminar llamada a getName() porque es de instancia
    }

    default void climb() {
        rest();
    }

    private void roar() {
        getName();
        climb();
        hunt();
    }

    private static boolean sneak() {
        return true; // Eliminar llamada a roar() porque es de instancia
    }

    private int rest() {
        return 2;
    }
}
