/*
 * Interactive Summation and Average Calculator
 *
 * Reads integer values from the keyboard until a non-integer is entered.
 * Calculates the sum of all entered integers and the rounded average,
 * then prints the result.
 *
 * Example:
 * Input:
 * 1
 * 2
 * 3
 * a
 *
 * Output:
 * SUM = 6 AVG = 2
 */

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    /*
     * Reads integer input from the user until a non-integer is entered.
     * Prints the sum of all entered integers and the rounded average.
     */
    public static void inputThenPrintSumAndAverage() {

        // Variables to store the sum, count of numbers, and average
        int sum = 0, count = 0;
        long average = 0;

        // Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Continue reading integers until a non-integer is entered
        while (sc.hasNextInt()) {

            // Read the next integer
            int num = sc.nextInt();

            // Update sum and count
            sum += num;
            count++;

            // Consume the remaining newline character
            sc.nextLine();
        }

        // Handle the case when no integers were entered
        if (count == 0) {
            System.out.println("SUM = " + sum + " AVG = " + average);
        } else {

            // Calculate the rounded average
            average = Math.round((double) sum / count);

            // Print the sum and average
            System.out.println("SUM = " + sum + " AVG = " + average);
        }
    }
}