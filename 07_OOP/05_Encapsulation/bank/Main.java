/*
 * Bank Account Test
 *
 * Tests the functionality of the Account class.
 *
 * Operations Performed:
 * 1. Creates a bank account.
 * 2. Sets account details using setter methods.
 * 3. Retrieves account details using getter methods.
 * 4. Deposits money into the account.
 * 5. Withdraws money successfully.
 * 6. Withdraws the entire balance to make it zero.
 * 7. Deposits and withdraws decimal (double) amounts.
 * 8. Tests insufficient balance during withdrawal.
 * 9. Displays the final account balance.
 */


package bank;

public class Main {

    public static void main(String[] args) {

        Account account = new Account();

        // Set Account Details
        account.setAccountNumber(123456789);
        account.setCustomerName("Priya");
        account.setCustomerEmail("priya@gmail.com");
        account.setCustomerPhoneNumber(987654321);
        account.setAccountBalance(10000);

        // Display Account Details
        System.out.println("===== Account Details =====");
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Customer Name  : " + account.getCustomerName());
        System.out.println("Balance        : Rs. " + account.getAccountBalance());

        // Deposit
        System.out.println("\n===== Deposit Rs.5000 =====");
        account.depositFunds(5000);

        // Withdraw
        System.out.println("\n===== Withdraw Rs.3000 =====");
        account.withdrawFunds(3000);

        // Withdraw remaining balance
        System.out.println("\n===== Withdraw Remaining Balance =====");
        account.withdrawFunds(12000);

        // Check balance
        System.out.println("\nCurrent Balance : Rs. " + account.getAccountBalance());

        // Deposit double value
        System.out.println("\n===== Deposit Rs.2500.75 =====");
        account.depositFunds(2500.75);

        // Withdraw double value
        System.out.println("\n===== Withdraw Rs.500.25 =====");
        account.withdrawFunds(500.25);

        // Insufficient balance
        System.out.println("\n===== Withdraw Rs.5000 =====");
        account.withdrawFunds(5000);

        // Final Details
        System.out.println("\n===== Final Account Details =====");
        System.out.println("Customer Name : " + account.getCustomerName());
        System.out.println("Account No    : " + account.getAccountNumber());
        System.out.println("Final Balance : Rs. " + account.getAccountBalance());
    }
}