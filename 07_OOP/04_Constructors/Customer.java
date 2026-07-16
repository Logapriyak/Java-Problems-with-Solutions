/*
 * Customer Class
 *
 * Represents customer information using encapsulation.
 *
 * Features:
 * - Stores customer name, credit limit, and email.
 * - Uses private fields.
 * - Provides getter methods.
 * - Demonstrates constructor overloading.
 * - Demonstrates constructor chaining using this().
 */

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName(){
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


    public Customer(String name , double creditLimit , String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Name: "+ name + " Credit Limit: " + creditLimit+ " Email: " + email);
    }
    public Customer(String name, String  email){
        this(name,2000,email);
    }

    public Customer(){
        this("priya","priya@05");
    }


}
