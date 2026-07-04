/*
 * Switch Expression with Return
 *
 * Demonstrates returning a value
 * using an enhanced switch expression.
 */

public class EnhancedSwitchWithReturn {

    public static void main(String[] args) {

        int day = 1;

        String dayOfTheWeek = getDayOfWeek(day);

        System.out.println("day = " + day +
                ", day Of the Week = " + dayOfTheWeek);
    }

    public static String getDayOfWeek(int day) {

        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
    }
}
