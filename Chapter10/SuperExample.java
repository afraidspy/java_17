import java.util.ArrayList;
import java.util.List;

public class SuperExample {
    public static void main(String[] args) {
        List<? super Number> numbers = new ArrayList<>();
        
        numbers.add(10);  // OK, Integer es subtipo de Number
        numbers.add(3.14);  // OK, Double es subtipo de Number
        numbers.add(2.5f);

        // Object value = numbers.get(0);  // Solo podemos garantizar que es un Object

        // Casting necesario si queremos un tipo específico
        Number value = (Number) numbers.get(0);
        System.out.println(value);  // Output: 10
    }
}
