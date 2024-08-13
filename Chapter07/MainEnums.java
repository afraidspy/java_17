

public class MainEnums {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf("Planet %s has a surface gravity of %.2f m/s²%n",
                              planet.name(), planet.surfaceGravity());
        }
        
        Planet earth = Planet.EARTH;
        System.out.printf("Earth's mass: %.2e kg%n", earth.getMass());
    }
}

