class Arachnid {
    static StringBuilder sb = new StringBuilder();
    { sb.append("c"); }
    static {
        sb.append("u");
    }
    { sb.append("r"); }
}

public class Scorpion extends Arachnid {
    static {
        sb.append("q");
    }
    { sb.append("m"); }

    public static void main(String[] args) {
        System.out.print(Scorpion.sb + " "); // Imprime "urcrq"
        System.out.print(Scorpion.sb + " "); // Imprime "urcrq"
        new Arachnid(); // Ejecuta bloques de inicialización de instancia en Arachnid
        new Scorpion(); // Ejecuta bloques de inicialización de instancia en Scorpion
        System.out.print(Scorpion.sb); // Imprime "urcrqmr"
    }
}
