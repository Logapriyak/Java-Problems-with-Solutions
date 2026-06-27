/*
 * Method Overloading Challenge
 *
 * Convert inches or feet and inches
 * into centimeters using overloaded methods.
 */

public class MethodOverloadingChallenge {

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((feet * 12) + inches);
    }
}
