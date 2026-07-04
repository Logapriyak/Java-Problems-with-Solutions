/*
 * Prime Numbers
 *
 * Write a method to determine whether
 * a number is prime.
 *
 * Use a for loop to print the first
 * 8 prime numbers between 1 and 20.
 */

public class PrimeNumbers {

    public static void main(String[] args) {

        int count = 0;

        System.out.println("The first 8 prime numbers between 1 and 20 are:");

        for (int number = 1; count < 8 && number <= 20; number++) {

            if (isPrime(number)) {

                System.out.println(number + " is a prime number");
                count++;
            }
        }
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}