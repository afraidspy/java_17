import java.util.ArrayList;
import java.util.List;

public class StudentListExample {
    public static void main(String[] args) {
        // Creating a list of students
        List<String> students = new ArrayList<>();

        // Adding students to the list
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");

        // Displaying the list of students
        System.out.println("List of students: " + students);

        // Removing a student from the list
        students.remove("Charlie");

        // Displaying the list after removal
        System.out.println("List after removal: " + students);

        // Checking if a student is in the list
        if (students.contains("Alice")) {
            System.out.println("Alice is in the list.");
        }

        // Iterating over the list of students
        System.out.println("Iterating over students:");
        for (String student : students) {
            System.out.println(student);
        }

        // Getting the number of students in the list
        int numberOfStudents = students.size();
        System.out.println("Number of students: " + numberOfStudents);

        // Clearing the list of students
        students.clear();

        // Checking if the list is empty
        if (students.isEmpty()) {
            System.out.println("The list is now empty.");
        }
    }
}
