/*
 * Constructor & Composition Challenge
 *
 * Test the Floor, Carpet, and Calculator classes.
 * Create objects, pass them to the Calculator,
 * and display the total carpeting cost.
 */

package Carpet_Cost_Challenge;

public class Main {

    public static void main(String[] args) {

        // Test Case 1 - Valid values
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("===== Test Case 1 =====");
        System.out.println("Total Cost = " + calculator.getTotalCost());

        // Test Case 2 - Valid values
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);

        System.out.println("\n===== Test Case 2 =====");
        System.out.println("Total Cost = " + calculator.getTotalCost());

        // Test Case 3 - Negative carpet cost
        carpet = new Carpet(-2.0);
        floor = new Floor(5.0, 4.0);
        calculator = new Calculator(floor, carpet);

        System.out.println("\n===== Test Case 3 (Negative Carpet Cost) =====");
        System.out.println("Total Cost = " + calculator.getTotalCost());

        // Test Case 4 - Negative floor width
        carpet = new Carpet(2.5);
        floor = new Floor(-5.0, 4.0);
        calculator = new Calculator(floor, carpet);

        System.out.println("\n===== Test Case 4 (Negative Floor Width) =====");
        System.out.println("Total Cost = " + calculator.getTotalCost());
    }
}

