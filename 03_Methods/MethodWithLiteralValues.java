/*
 * Method with Literal Values
 *
 * Demonstrates passing literal
 * values as method arguments.
 */

public class MethodWithLiteralValues {

    public static void main(String[] args) {

        addNumbers(10, 20);
    }

    public static void addNumbers(int first, int second) {

        System.out.println("Sum = " + (first + second));
    }
}