/*
 * Guess Number using Do-While Loop
 *
 * Demonstrates the use of a
 * do-while loop to repeat
 * until the target number
 * is reached.
 */

public class GuessNumberUsingDoWhile {

    public static void main(String[] args) {

        int number = 1;

        do {

            System.out.println("Current Number = " + number);
            number++;

        } while (number <= 10);

        System.out.println("Target reached!");
    }
}