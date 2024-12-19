/*

Program: Account.java          Last Date of this Revision: November 20, 2024

Purpose: An application that checks the balances and amount

Author: Noorinder Sran,
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

// Abstract base class for accounts
public abstract class Account {
    // Shared balance field
    protected double balance;

    // Constructor to initialize balance
    public Account(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Abstract method for withdrawal
    public abstract void withdraw(double amount);

    // Get the current balance
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Balance: $%.2f", balance);
    }
}
