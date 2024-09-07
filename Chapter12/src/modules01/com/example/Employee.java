package Chapter12.src.modules01.com.example;

public class Employee {
    private String name;
    private String department;
    private double baseSalary;

    public Employee(String name, String department, double baseSalary) {
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}