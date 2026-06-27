/*
 * If-Else Example
 *
 * Demonstrates the use of
 * if, else if, and else statements.
 */

public class IfElseExample {

    public static void main(String[] args) {

        int score = 85;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 75) {
            System.out.println("Grade B");
        } else if (score >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
