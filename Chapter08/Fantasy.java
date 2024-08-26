import java.util.function.Function;
import java.util.function.Predicate;

public class Fantasy {
    public static void scary(String animal) {
        Predicate<String> dino = s -> "dino".equals(s);
        Predicate<String> dragon = s -> "dragon".equals(s);
        Predicate<String> combined = dino.or(dragon);
        System.out.println(combined.test(animal));
    }

    public static void functionEx(){

        Function<Integer, Integer> s = a -> a + 4;
        Function<Integer, Integer> t = a -> a * 3;
        Function<Integer, Integer> c = s.compose(t);
        System.out.print(c.apply(1));
    }

    public static void main(String[] args) {
        scary("dino");      // Output: true
        scary("dragon");    // Output: true
        scary("unicorn");   // Output: false

        functionEx();
    }
}
