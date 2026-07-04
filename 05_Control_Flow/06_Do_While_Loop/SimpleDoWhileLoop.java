/*
 * Simple Do-While Loop
 *
 * Demonstrates the use of a
 * do-while loop to print
 * numbers from 1 to 5.
 */

public class SimpleDoWhileLoop {

    public static void main(String[] args) {

        int count = 1;

        do {

            System.out.println("Count = " + count);
            count++;

        } while (count <= 5);
    }
}