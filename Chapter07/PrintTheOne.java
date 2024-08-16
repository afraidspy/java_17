
enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b) {
         System.out.print("constructing,");
    }
}
public class PrintTheOne {
    public static void main(String[] args) {
        System.out.print("begin,");
        OnlyOne firstCall = OnlyOne.ONCE; // Prints constructing,
        OnlyOne secondCall = OnlyOne.ONCE; // Doesn't print anything
        System.out.print("end");
    }
}