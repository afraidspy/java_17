class Marsupial {
    protected int age = 2;
    public static boolean isBiped() {
        return false;
    }
}

public class Kangaroo extends Marsupial {
    protected int age = 6;
    public static boolean isBiped() {
        return true;
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        Marsupial moey = joey;
        System.out.println(joey.isBiped()); // Línea A -Z true
        System.out.println(moey.isBiped()); // Línea B - false
        System.out.println(joey.age); // Línea C - 6
        System.out.println(moey.age); // Línea D -2*/
    }
}
