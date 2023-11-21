/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */


package DataStructures;
public class BankAccount {
   private String accountNumber;
   private double balance;

   public BankAccount(String accountNumber, double initialBalance) {
       if (!verifyAccountNumber(accountNumber)) {
           throw new BankException("Invalid account number");
       }

       if (initialBalance < 0) {
           throw new IllegalArgumentException("Initial balance cannot be negative");
       }

       this.accountNumber = accountNumber;
       this.balance = initialBalance;
   }

   public void deposit(double amount) {
       if (amount < 0) {
           throw new BankException("Deposit amount cannot be negative");
       }

       balance += amount;
   }

   public void withdraw(double amount) {
       if (amount < 0 || amount > balance) {
           throw new BankException("Invalid withdrawal amount or insufficient funds");
       }

       balance -= amount;
   }

   public double balance() {
       return balance;
   }

   private boolean verifyAccountNumber(String accountNumber) {
       if (accountNumber.length() != 8) {
           return false;
       }

       accountNumber = accountNumber.substring(4) + accountNumber.substring(0, 4);
       long sum = 0;

       for (int i = 0; i < 8; i++) {
           char c = accountNumber.charAt(i);
           int digit;
           if (c >= 'A' && c <= 'Z') {
               digit = c - 'A' + 10;
           } else if (c >= '0' && c <= '9') {
               digit = c - '0';
           } else {
               return false; 
           }
           sum = sum * 10 + digit;
       }

       return sum % 11 == 1;
   }

   @Override
   public String toString() {
       return "BankAccount[accountNumber=" + accountNumber + ", balance=$" + balance + "]";
   }

   public static void main(String[] args) {
       try {
           BankAccount validAccount = new BankAccount("GB821234", 1023.25);
           System.out.println(validAccount);

           BankAccount invalidAccount = new BankAccount("CA123456", 500.0); 
       } catch (BankException e) {
           System.err.println("Error: " + e.getMessage());
       }
   }
}


