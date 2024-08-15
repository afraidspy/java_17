public class PrintNumbers {
    private int length = 5; // Campo de instancia

    public void calculate() {
        final int width = 20; // Variable local final

        class Calculator {
            public void multiply() {
                // Imprime el resultado de la multiplicación
                System.out.print(length * width); // Accede al campo de instancia y a la variable local final
            }
        }

        var calculator = new Calculator();
        calculator.multiply(); // Llama al método multiply
    }

    public void processData() {
        int length = 5; // Variable local final
        int width = 10; // Variable local
        int height = 2; // Variable local

        class VolumeCalculator {
            public int multiply() {
                // Intento de uso de variables locales dentro de la clase interna
                return length * height; // Problema de compilación
            }
        }
        //length = 2;
        //width = 2; // Modificación de la variable local
        //height = 2;
    }

    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate(); // Imprime 100
        // printer.processData(); // Llamada a processData
    }
}
