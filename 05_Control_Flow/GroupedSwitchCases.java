/*
 * Grouped Switch Cases
 *
 * Demonstrates multiple case labels.
 */

public class GroupedSwitchCases {

    public static void main(String[] args) {

        int day = 4;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Midweek");
                break;

            default:
                System.out.println("Weekend or Invalid");
        }
    }
}
