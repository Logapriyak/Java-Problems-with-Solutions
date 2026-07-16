/*
 * Instance Methods Challenge
 *
 * Problem:
 * Create a Student class with an instance variable to store
 * the student's name and an instance method to display it.
 *
 * Requirements:
 * 1. Create an instance variable named 'name'.
 * 2. Create an instance method named printName().
 * 3. Create multiple Student objects.
 * 4. Assign different names to each object.
 * 5. Call the instance method using each object to display
 *    the corresponding student's name.
 *
 * Concepts Covered:
 * - Instance Variables
 * - Instance Methods
 * - Object Creation
 * - Calling Instance Methods Using Objects
 */

class Student {
    String name;

    public void printName() {
        System.out.println("Student Name: " + name);
    }
}

public class Instance_method {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Priya";
        s1.printName();

        Student s2 = new Student();
        s2.name = "Oveya";
        s2.printName();
    }
}