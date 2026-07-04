/*
 * Sum of Five Numbers Challenge
 *
 * Read five valid numbers from the user
 * and calculate their total sum.
 *
 * If an invalid value is entered,
 * prompt the user to enter the number again.
 */

import java.util.Scanner;

public class SumOfFiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        double sum = 0;

        while (count <= 5) {

            System.out.print("Enter number #" + count + ": ");

            String userInput = scanner.nextLine();

            try {

                double number = Double.parseDouble(userInput);

                sum += number;
                count++;

            } catch (NumberFormatException e) {

                System.out.println("Invalid number. Please enter a valid numeric value.");
            }
        }

        System.out.println("Sum of 5 numbers = " + sum);

    }
}