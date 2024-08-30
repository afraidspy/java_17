import java.util.Optional;

public class OptionalExample3 {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);

        // Usando orElse
        String result1 = opt.orElse("Valor por defecto");
        System.out.println("Resultado con orElse: " + result1);

        // Usando orElseGet
        String result2 = opt.orElseGet(() -> "Valor calculado");
        System.out.println("Resultado con orElseGet: " + result2);

        // Usando orElseThrow
        try {
            String result3 = opt.orElseThrow(() -> new IllegalArgumentException("No se encontró el valor"));
        } catch (Exception e) {
            System.out.println("Resultado con orElseThrow: " + e.getMessage());
        }
    }
}
