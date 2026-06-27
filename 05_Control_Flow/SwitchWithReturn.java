/*
 * Switch with Return
 *
 * Demonstrates returning values
 * using a switch statement.
 */

public class SwitchWithReturn {

    public static void main(String[] args) {

        System.out.println(getDayOfWeek(2));
    }

    public static String getDayOfWeek(int day) {

        switch (day) {

            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            default:
                return "Invalid Day";
        }
    }
}
