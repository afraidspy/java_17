class Arachnid {
    static StringBuilder sb = new StringBuilder();
    { 
        sb.append("c");
        //System.out.print(Scorpion.sb);
     
    }
    static {
        //System.out.println("1");
        sb.append("u");
    }
    { 
        sb.append("r"); 
        //System.out.print(Scorpion.sb);
    }
}

public class Scorpion extends Arachnid {
    static {
        //System.out.println("2");
        sb.append("q");
    }
    { 

        sb.append("m"); 
    }

    public static void main(String[] args) {
        //System.out.print(Scorpion.sb + " "); // Imprime "uq"
        //System.out.print(Scorpion.sb + " "); // Imprime "uq"
        //new Arachnid(); // Ejecuta bloques de inicialización de instancia en Arachnid
        new Scorpion(); // Ejecuta bloques de inicialización de instancia en Scorpion
        System.out.print(Scorpion.sb); // Imprime "urcrqmr"
    }
}
