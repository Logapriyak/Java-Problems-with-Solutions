/*
 * Positive, Negative, Or Zero Assessment
 *
 * Write a method called checkNumber with an int parameter named number.
 *
 * The method should print:
 * - "positive" if number > 0
 * - "negative" if number < 0
 * - "zero" if number == 0
 */

public class PositiveNegativeZero {

    public static void checkNumber(int number) {

        String result = (number > 0)
                ? "positive"
                : (number < 0)
                    ? "negative"
                    : "zero";

        System.out.println(result);
    }
}
