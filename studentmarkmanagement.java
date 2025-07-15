import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentMarksManagement {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Marks Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Calculate Average Marks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    calculateAverage();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }

    static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        students.add(new Student(name, marks));
        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        System.out.println("\n--- Student List ---");
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
        } else {
            for (Student s : students) {
                System.out.println("Name: " + s.name + ", Marks: " + s.marks);
            }
        }
    }

    static void calculateAverage() {
        if (students.isEmpty()) {
            System.out.println("No students to calculate average.");
            return;
        }
        int total = 0;
        for (Student s : students) {
            total += s.marks;
        }
        double average = (double) total / students.size();
        System.out.println("Average Marks: " + average);
    }
}
