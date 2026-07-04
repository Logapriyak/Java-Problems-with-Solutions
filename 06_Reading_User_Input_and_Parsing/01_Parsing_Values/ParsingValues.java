/*
 * Parsing Values
 *
 * Demonstrates converting
 * String values into
 * primitive data types.
 */

public class ParsingValues {

    public static void main(String[] args) {

        String birthYear = "2004";

        int year = Integer.parseInt(birthYear);

        System.out.println("Birth Year = " + year);
        System.out.println("Next Year = " + (year + 1));
    }
}