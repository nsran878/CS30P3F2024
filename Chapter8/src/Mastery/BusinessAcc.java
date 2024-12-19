/*

Program: BusinessAcct.java          Last Date of this Revision: November 19, 2024

Purpose: An application that requires a minimum balance of $500 if the balance falls below then $10 is charged 

Author: Sahil Doad
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

public class BusinessAcc extends Account {
    // Constructor to initialize a business account with a starting balance
    public BusinessAcc(double balance) {
        super(balance); // Call the constructor of the Account superclass
    }

    // Implementation of withdrawal with a penalty for low balance
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }

        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal.");
        }

        if (balance - amount < 500) {
            balance -= 10; // Penalty for falling below $500
        }

        balance -= amount;
    }

    @Override
    public String toString() {
        return "Business Account, " + super.toString();
    }
}
