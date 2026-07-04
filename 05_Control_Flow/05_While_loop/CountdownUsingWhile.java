/*
 * Countdown using While Loop
 *
 * Demonstrates the use of a
 * while loop to print a
 * countdown from 10 to 1.
 */

public class CountdownUsingWhile {

    public static void main(String[] args) {

        int count = 10;

        while (count >= 1) {
            System.out.println(count);
            count--;
        }

        System.out.println("Liftoff!");
    }
}