/*
 * Method with Variables
 *
 * Demonstrates passing variables
 * as method arguments.
 */

public class MethodWithVariables {

    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 25;

        addNumbers(num1, num2);
    }

    public static void addNumbers(int first, int second) {

        System.out.println("Sum = " + (first + second));
    }
}