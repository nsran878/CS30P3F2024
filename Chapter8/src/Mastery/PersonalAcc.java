/*

Program: PersonalAcct.java          Last Date of this Revision: November 20, 2024

Purpose: An application that requires a minimum balance of $100 if the balance falls below then $2 is charged 

Author: Noorinder Sran,
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

public class PersonalAcc extends Account {
    // Constructor to initialize a personal account with a starting balance
    public PersonalAcc(double balance) {
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

        if (balance - amount < 100) {
            balance -= 2; // Penalty for falling below $100
        }

        balance -= amount;
    }

    @Override
    public String toString() {
        return "Personal Account, " + super.toString();
    }
}
