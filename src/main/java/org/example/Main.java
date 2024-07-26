package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Below is output for Bank Account" );
        BankAccount account = new BankAccount(500, "John Doe");
        account.deposit(100);
        account.printAccountDetails();

        BankAccount larryAccount = new BankAccount(5000, "Larry");
        BankAccount maryAccount = new BankAccount(300, "Mary");

        larryAccount.withdrawal(100);
        maryAccount.deposit(100);

        System.out.println();
        System.out.println("Below is output for Bank Transfer" );
        System.out.println("Larry's account balance: " + larryAccount.getBalance());
        System.out.println("Mary's account balance: " + maryAccount.getBalance());
    }
}

