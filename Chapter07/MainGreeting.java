interface Greeting {
    void greet();
}

public class MainGreeting {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, World!");
            }
        };

        greeting.greet(); // Imprime "Hello, World!"
    }
}
