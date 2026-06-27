/*
 * Basic Switch Statement
 *
 * Demonstrates simple switch cases.
 */

public class SwitchStatement {

    public static void main(String[] args) {

        int day = 2;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
