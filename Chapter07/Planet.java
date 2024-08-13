

public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.378e6),
    MARS(6.421e+23, 3.397e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.681e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    protected final double mass; // in kilograms
    private final double radius; // in meters

    // Constructor
    private Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // Method to calculate surface gravity
    public double surfaceGravity() {
        final double G = 6.67300E-11; // gravitational constant
        return G * mass / (radius * radius);
    }

    // Method to get the mass
    public double getMass() {
        return mass;
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }
}
