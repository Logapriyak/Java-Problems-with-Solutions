/*
 * Interest Calculator
 *
 * Write a method that calculates simple interest.
 *
 * Create a for loop to display the interest earned
 * on an amount of 10000 for interest rates
 * from 7.5% to 10%, increasing by 0.25% each time.
 */

public class InterestCalculator {

    public static void main(String[] args) {

        for (double rate = 7.5; rate <= 10; rate += 0.25) {

            double interest = calculateInterest(10000, rate);

            System.out.println("10000 at " + rate +
                    "% interest = " + interest);
        }
    }

    public static double calculateInterest(double amount, double rate) {

        return amount * (rate / 100);
    }
}
