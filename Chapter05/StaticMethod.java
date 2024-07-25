
public class StaticMethod {
    private static int count = 0;
    
    public static void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main (String [] args){
        
        StaticMethod obj1 = new StaticMethod();
        obj1.increment();

        StaticMethod obj2 = new StaticMethod();
        obj2.increment();

        System.out.println("Count value is: " + count);
    }
}
