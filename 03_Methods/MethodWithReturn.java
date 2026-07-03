/*
 * Method with Return Value
 *
 * Demonstrates a method
 * that returns a value.
 */

public class MethodWithReturn {

    public static void main(String[] args) {

        int result = addNumbers(12, 18);

        System.out.println("Sum = " + result);
    }

    public static int addNumbers(int first, int second) {

        return first + second;
    }
}