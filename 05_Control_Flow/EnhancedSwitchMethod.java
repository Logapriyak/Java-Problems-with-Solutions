/*
 * Switch Expression in a Method
 *
 * Demonstrates using an enhanced switch
 * expression inside a void method.
 */

public class SwitchExpressionMethod {

    public static void main(String[] args) {

        int day = 1;

        getDayOfWeek(day);
    }

    public static void getDayOfWeek(int day) {

        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println("day = " + day +
                ", day Of the Week = " + dayOfTheWeek);
    }
}
