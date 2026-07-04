/*
 * Static and Instance Fields
 *
 * Demonstrates the difference between
 * static fields (shared by all objects)
 * and instance fields (unique to each object).
 */

public class StaticAndInstanceFields {

    static class Student {

        // Static field (shared by all students)
        static String collegeName = "KCG College of Technology";

        // Instance fields (unique for each student)
        String studentName;
        int rollNumber;

        Student(String studentName, int rollNumber) {
            this.studentName = studentName;
            this.rollNumber = rollNumber;
        }

        void displayDetails() {
            System.out.println("College : " + collegeName);
            System.out.println("Student : " + studentName);
            System.out.println("Roll No : " + rollNumber);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student("Priya", 101);
        Student student2 = new Student("Anu", 102);

        student1.displayDetails();
        student2.displayDetails();

        // Changing the static field
        Student.collegeName = "KCG Tech";

        System.out.println("After changing the college name:\n");

        student1.displayDetails();
        student2.displayDetails();
    }
}