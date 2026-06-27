/*
 * Enhanced Switch
 *
 * Demonstrates the Java enhanced switch syntax.
 */

public class EnhancedSwitch {

    public static void main(String[] args) {

        int day = 3;

        switch (day) {

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid Day");
        }
    }
}
