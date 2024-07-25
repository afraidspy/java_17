public class Pelican {
    public void fly(String s) {
    System.out.print("string*" + s);
    }
    public void fly(Object o) {
    System.out.print("object" + o);
    }
    public static void main(String[] args) {
    var p = new Pelican();
    p.fly("test");
    System.out.print("-");
    p.fly(56);
    }
}