/*
 * POJO (Plain Old Java Object) Challenge
 *
 * Problem:
 * Create a Student POJO class to store student information.
 * Use constructors, getters, setters, and the toString() method
 * to create, update, and display student details.
 *
 * Requirements:
 * 1. Create a Student POJO with four instance fields.
 * 2. Initialize all fields using a constructor.
 * 3. Create multiple Student objects.
 * 4. Display each object using toString().
 * 5. Update one student's data using setters.
 * 6. Retrieve data using getters.
 *
 * Concepts Covered:
 * - POJO
 * - Constructors
 * - Getters
 * - Setters
 * - toString()
 * - Object Creation
 */
package POJO;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(
                "S923001",
                "Priya",
                "05-Nov-2004",
                "Java Masterclass");

        Student student2 = new Student(
                "S923002",
                "Moni",
                "18-Aug-2004",
                "Java Masterclass");

        Student student3 = new Student(
                "S923003",
                "Oveya",
                "10-Jan-2005",
                "Java Masterclass");

        System.out.println("----- Student Details -----");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("\n----- Updating Student 2 -----");

        student2.setName("Anu");
        student2.setClassList("Advanced Java");

        System.out.println(student2);

        System.out.println("\n----- Using Getters -----");

        System.out.println("Student ID : " + student1.getId());
        System.out.println("Student Name : " + student1.getName());
        System.out.println("Class : " + student1.getClassList());
    }
}