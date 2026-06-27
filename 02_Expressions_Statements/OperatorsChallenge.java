/*
 * Operators Challenge
 *
 * Practice arithmetic operators
 * and the remainder operator.
 */

public class OperatorsChallenge {

    public static void main(String[] args) {

        double firstNumber = 20.00;
        double secondNumber = 80.00;

        double total = (firstNumber + secondNumber) * 100.00;
        double remainder = total % 40.00;

        boolean isNoRemainder = (remainder == 0);

        System.out.println("Remainder is zero: " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got Some Remainder");
        }
    }
}
