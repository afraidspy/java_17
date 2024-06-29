public class LabelCycles {
    public static void main (String [] args) {

    for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= 3; j++) {
            if (i * j > 4) {
                System.out.println("Saliendo del bucle en i=" + i + " y j=" + j);
                break; // Sale del bucle más interno
            }
            System.out.println(i + " * " + j + " = " + (i * j));
        }
    }


    }
}