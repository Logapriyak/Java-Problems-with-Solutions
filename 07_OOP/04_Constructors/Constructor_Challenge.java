/*
 * Constructor Challenge
 *
 * Problem:
 * Create a Customer class with three constructors:
 * 1. A constructor that accepts name, credit limit, and email.
 * 2. A constructor that accepts name and email, and assigns a default credit limit.
 * 3. A no-argument constructor that assigns default values.
 *
 * Test all three constructors by creating Customer objects
 * and display the customer details using getter methods.
 *
 * Concepts Covered:
 * - Constructors
 * - Constructor Overloading
 * - Constructor Chaining using this()
 * - Encapsulation
 * - Getter Methods
 */

public class Constructor_Challenge {
    public static void main(String[] args) {
        Customer customer = new Customer("Moni",20000,"moni@23");
        Customer secondCustomer = new Customer();
        Customer thirdCustomer = new Customer("Abi", "abi@11");
        System.out.println("\n1st Customer name: "+ customer.getName());
        System.out.println("1st Customer credit Limit: "+ customer.getCreditLimit());
        System.out.println("1st Customer email: "+ customer.getEmail());
        System.out.println("\n2nd Customer name: "+ secondCustomer.getName());
        System.out.println("2nd Customer credit Limit: "+ secondCustomer.getCreditLimit());
        System.out.println("2nd Customer email: "+ secondCustomer.getEmail());
        System.out.println("\n3rd Customer name: "+ thirdCustomer.getName());
        System.out.println("3rd Customer credit Limit: "+ thirdCustomer.getCreditLimit());
        System.out.println("3rd Customer email: "+ thirdCustomer.getEmail());

    }


}
