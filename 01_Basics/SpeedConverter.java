/*
 * Speed Converter
 *
 * Write a method toMilesPerHour that converts kilometers per hour
 * to miles per hour and returns the rounded value.
 *
 * If the input is negative, return -1.
 *
 * Write another method printConversion that prints:
 * "XX km/h = YY mi/h"
 * or "Invalid Value" for negative inputs.
 */

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        double milesPerHour = kilometersPerHour / 1.609;
        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(kilometersPerHour + " km/h = "
                + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
