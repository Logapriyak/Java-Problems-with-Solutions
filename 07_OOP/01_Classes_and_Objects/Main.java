/*
 * Classes and Objects
 *
 * Demonstrates how to create
 * objects from a class and
 * access their fields and methods.
 */

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2024;

        car1.displayDetails();

        System.out.println();

        Car car2 = new Car();

        car2.brand = "Honda";
        car2.model = "City";
        car2.year = 2023;

        car2.displayDetails();
    }
}