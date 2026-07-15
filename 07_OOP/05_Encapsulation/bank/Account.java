/*
 * Bank Account Class
 *
 * Demonstrates encapsulation using private fields,
 * getter and setter methods, and basic banking operations.
 *
 * Features:
 * 1. Stores account details using private instance variables.
 * 2. Provides controlled access through getters and setters.
 * 3. Allows depositing funds and updates the account balance.
 * 4. Allows withdrawing funds if sufficient balance is available.
 * 5. Displays an insufficient funds message when withdrawal exceeds balance.
 */


package bank;

public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    public void depositFunds(double depositAmount){
        accountBalance += depositAmount;
        System.out.println(" Deposit of Rs."+ depositAmount + " made. New balance is Rs. "+ accountBalance);
    }

    public void withdrawFunds(double withdrawAmount){
        if (accountBalance >= withdrawAmount) {
            accountBalance -= withdrawAmount ;
            System.out.println(" withdraw of Rs."+ withdrawAmount+ " processed, Remaining balance = Rs. "+ accountBalance);
        } else{
            System.out.println("Insufficient Funds! You only have Rs. "+ accountBalance + " in your account");
        }

    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
