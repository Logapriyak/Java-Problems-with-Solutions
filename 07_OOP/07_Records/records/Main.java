/*
 * Java Records Challenge
 *
 * Problem:
 * Create a Student record to store student details such as ID, name, and class name.
 * Use a loop and a switch expression to create multiple Student records with different names.
 * Print each record, create additional Student records, and access their data
 * using record accessor methods.
 *
 * Requirements:
 * 1. Create a Student record with three components.
 * 2. Use a for loop to create multiple Student records.
 * 3. Use a switch expression to assign different names.
 * 4. Print each Student record.
 * 5. Create additional Student records manually.
 * 6. Access record values using accessor methods.
 *
 * Concepts Covered:
 * - Java Records
 * - Record Header
 * - Record Components
 * - Constructor (generated automatically)
 * - Accessor Methods
 * - Switch Expression
 * - For Loop
 * - toString() (generated automatically)
 * - Immutable Objects
 */

package records;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== STUDENT RECORDS ==========\n");

        for (int i = 1; i <=5 ; i++) {
            Student student = new Student("20260"+i,
                    switch(i){
                case 1 -> "Priya";
                case 2 -> "Moni";
                case 3 -> "Oveya";
                case 4 -> "Abi";
                case 5 -> "Afi";
                default -> "unknown";
                    }, "Java Masterclass");
            System.out.println(student);

        }
        System.out.println("\n========== INDIVIDUAL RECORDS ==========\n");

        Student s2 = new Student("202606","Rooban","Java Masterclass");
        System.out.println(s2);
        Student s3 = new Student("20261","Ram","DSA");
        System.out.println(s3);

        System.out.println("\n========== ACCESSOR METHODS ==========\n");

        System.out.println(s2.name()+ " is taking "+s2.className());
        System.out.println(s3.name()+ " is taking "+s3.className());



    }
}
