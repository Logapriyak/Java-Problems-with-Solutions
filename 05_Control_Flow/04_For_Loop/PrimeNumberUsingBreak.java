/*
 * Prime Number using Break
 *
 * Demonstrates the use of the
 * break statement in a for loop.
 *
 * The loop stops when the number
 * reaches 10.
 */

public class PrimeNumberUsingBreak {

    public static void main(String[] args) {

        for (int number = 1; number <= 1000; number++) {

            if (number == 10) {
                break;
            }

            checkPrime(number);
        }
    }

    public static void checkPrime(int number) {

        if (number < 2) {

            System.out.println(number + " is not a prime number");
            return;
        }

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {

                System.out.println(number + " is not a prime number");
                return;
            }
        }

        System.out.println(number + " is a prime number");
    }
}