/*

Program: Bank.java          Last Date of this Revision: November 20, 2024

Purpose: An application that checks the personal and business Acct to withdrawal deposit or check account balance 

Author: Noorinder Sran,
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Create instances of Personal and Business accounts
        PersonalAcc personalAcct = new PersonalAcc(150);
        BusinessAcc businessAcct = new BusinessAcc(600);

        Scanner input = new Scanner(System.in);
        String action;

        do {
            // Display menu for user action
            System.out.println("\n(A)ccount Details | (D)eposit | (W)ithdraw | (Q)uit");
            System.out.print("Enter choice: ");
            action = input.next();

            if (!action.equalsIgnoreCase("Q")) {
                // Ask for the account type
                System.out.print("Enter Account type (1 for Personal, 2 for Business): ");
                int acctType = input.nextInt();

                Account account = null; // Initialize account variable

                // Assign the selected account
                switch (acctType) {
                    case 1:
                        account = personalAcct;
                        break;
                    case 2:
                        account = businessAcct;
                        break;
                    default:
                        System.out.println("Invalid Account type! Please try again.");
                        continue; // Skip to the next iteration
                }

                // Perform actions based on user input
                switch (action.toUpperCase()) {
                    case "A":
                        System.out.println(account);
                        break;
                    case "D":
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = input.nextDouble();
                        try {
                            account.deposit(depositAmount);
                            System.out.println("Deposit successful.");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "W":
                        System.out.print("Enter withdraw amount: ");
                        double withdrawAmount = input.nextDouble();
                        try {
                            account.withdraw(withdrawAmount);
                            System.out.println("Withdrawal successful.");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Invalid action! Please try again.");
                        break;
                }
            }
        } while (!action.equalsIgnoreCase("Q"));

        System.out.println("Exiting program.");
        input.close();
    }
}

/* Screen Dump



(A)ccount Details | (D)eposit | (W)ithdraw | (Q)uit
Enter choice: A
Enter Account type (1 for Personal, 2 for Business): 1
Personal Account, Balance: $150.00

(A)ccount Details | (D)eposit | (W)ithdraw | (Q)uit
Enter choice: D
Enter Account type (1 for Personal, 2 for Business): 1
Enter deposit amount: 1000
Deposit successful.

(A)ccount Details | (D)eposit | (W)ithdraw | (Q)uit
Enter choice: D
Enter Account type (1 for Personal, 2 for Business): 2
Enter deposit amount: 100000
Deposit successful.

(A)ccount Details | (D)eposit | (W)ithdraw | (Q)uit
Enter choice: A
Enter Account type (1 for Personal, 2 for Business): 1
Personal Account, Balance: $1150.00

(A)ccount Details | (D)eposit | (W)ithdraw | (Q)uit
Enter choice: A
Enter Account type (1 for Personal, 2 for Business): 2
Business Account, Balance: $100600.00

(A)ccount Details | (D)eposit | (W)ithdraw | (Q)uit
Enter choice: W
Enter Account type (1 for Personal, 2 for Business): 2
Enter withdraw amount: 10000
Withdrawal successful.

(A)ccount Details | (D)eposit | (W)ithdraw | (Q)uit
Enter choice: A
Enter Account type (1 for Personal, 2 for Business): 2
Business Account, Balance: $90600.00

(A)ccount Details | (D)eposit | (W)ithdraw | (Q)uit
Enter choice: Q
Exiting program.

 
 */
