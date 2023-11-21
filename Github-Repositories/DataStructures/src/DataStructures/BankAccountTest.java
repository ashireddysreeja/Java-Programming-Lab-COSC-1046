/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */

package DataStructures;
public class BankAccountTest {
    public static void main(String[] args) {
        testValidAccountCreation();
        testInvalidAccountCreation();
        testTransactions();
    }

    private static void testValidAccountCreation() {
        try {
            BankAccount validAccount = new BankAccount("GB821234", 1023.25);
            System.out.println(validAccount);
        } catch (BankException e) {
            System.err.println("Error creating a valid account: " + e.getMessage());
            System.err.flush();
        }
    }

    private static void testInvalidAccountCreation() {
        try {
            BankAccount invalidAccount = new BankAccount("CA123456", 500.0); 
        } catch (BankException e) {
            System.err.println("Error creating an invalid account: " + e.getMessage());
            System.err.flush();
        }
    }

    private static void testTransactions() {
        try {
            BankAccount account = new BankAccount("GB821234", 1023.25);
            System.out.println(account);

            account.deposit(500.0);
            System.out.println(account);

            account.withdraw(300.0);
            System.out.println(account);

          
            account.withdraw(2000.0);
        } catch (BankException e) {
            System.err.println("Error: " + e.getMessage());
            System.err.flush();
        }
    }
}
