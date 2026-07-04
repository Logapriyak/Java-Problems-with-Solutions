/*
 * Reading User Input Challenge
 *
 * Read the user's name and birth year,
 * validate the input, and calculate
 * the user's age.
 */

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        int currentYear = 2026;

        System.out.println(calculateAge(currentYear));
    }

    public static String calculateAge(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello, what's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", what year were you born?");

        boolean validDOB = false;
        int age = 0;

        do {

            System.out.print("Enter a year between " +
                    (currentYear - 125) + " and " +
                    currentYear + ": ");

            try {

                age = checkData(currentYear, scanner.nextLine());

                validDOB = age >= 0;

                if (!validDOB) {
                    System.out.println("Invalid year. Please try again.");
                }

            } catch (NumberFormatException e) {

                System.out.println("Invalid input! Please enter numbers only.");
            }

        } while (!validDOB);

        scanner.close();

        return "Your age is " + age + ".";
    }

    public static int checkData(int currentYear, String enteredYear) {

        int birthYear = Integer.parseInt(enteredYear);

        int minimumYear = currentYear - 125;

        if (birthYear < minimumYear || birthYear > currentYear) {
            return -1;
        }

        return currentYear - birthYear;
    }
}