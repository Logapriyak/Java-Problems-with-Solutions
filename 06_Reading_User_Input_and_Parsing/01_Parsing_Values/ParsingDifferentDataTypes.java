/*
 * Parsing Different Data Types
 *
 * Demonstrates parsing
 * different primitive
 * data types.
 */

public class ParsingDifferentDataTypes {

    public static void main(String[] args) {

        String age = "21";
        String height = "165.5";
        String isStudent = "true";

        int studentAge = Integer.parseInt(age);
        double studentHeight = Double.parseDouble(height);
        boolean studentStatus = Boolean.parseBoolean(isStudent);

        System.out.println("Student Age =  " +studentAge);
        System.out.println( "Student Height = " + studentHeight);
        System.out.println("Is Student = " + studentStatus);
    }
}