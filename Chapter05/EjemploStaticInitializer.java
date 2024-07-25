public class EjemploStaticInitializer {
    // Variable estática
    static int variableEstatica;

    // Bloque de inicialización estática
    static {
        variableEstatica = 10;
        System.out.println("El bloque de inicialización estática se ha ejecutado.");
    }

    public static void main(String[] args) {
        System.out.println("Valor de variableEstatica: " + variableEstatica);
    }
}
