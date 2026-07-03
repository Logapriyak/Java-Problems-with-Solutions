/*
 * Day of the Week using if-else
 *
 * Demonstrates the use of
 * if-else if statements.
 */

public class IfElseDayOfWeek {

    public static void main(String[] args) {

        int day = 5;

        if (day == 0)
            System.out.println("day = " + day + ", day Of the Week = Sunday");
        else if (day == 1)
            System.out.println("day = " + day + ", day Of the Week = Monday");
        else if (day == 2)
            System.out.println("day = " + day + ", day Of the Week = Tuesday");
        else if (day == 3)
            System.out.println("day = " + day + ", day Of the Week = Wednesday");
        else if (day == 4)
            System.out.println("day = " + day + ", day Of the Week = Thursday");
        else if (day == 5)
            System.out.println("day = " + day + ", day Of the Week = Friday");
        else if (day == 6)
            System.out.println("day = " + day + ", day Of the Week = Saturday");
        else
            System.out.println("day = " + day + ", day Of the Week = Invalid Day");
    }
}
