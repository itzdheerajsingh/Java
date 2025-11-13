import java.util.ArrayList;

class Student {
    String name;
    int rollNo;
    int marks;

    // Constructor
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

public class ArrayListObjects {
    public static void main(String[] args) {

        // Create ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add students
        students.add(new Student("Dheeraj", 1, 89));
        students.add(new Student("Riya", 2, 95));
        students.add(new Student("Aman", 3, 76));

        // Display all students
        System.out.println("Student Details:");
        for (Student s : students) {
            s.display();
        }

        // Example: Find a student with roll no = 2
        int searchRoll = 2;
        System.out.println("\nSearching for Roll No: " + searchRoll);
        for (Student s : students) {
            if (s.rollNo == searchRoll) {
                System.out.println("Found → " + s.name + " scored " + s.marks);
                break;
            }
        }
    }
}