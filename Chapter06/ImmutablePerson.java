
public final class ImmutablePerson {
    private final String name;
    private final int age;

    // Constructor
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters (no setters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        ImmutablePerson inPerson = new ImmutablePerson("Jessica", 28);
        
    }
}
