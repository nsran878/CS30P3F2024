/*

Program: University.java          Last Date of this Revision: November 20, 2024

Purpose: An application that contains member variables for the university employee name and salary 

Author: Noorinder Sran,
School: CHHS
Course: Computer Programming 30
 */
package Mastery;

import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        // Create instances of Faculty and Staff
        Faculty faculty = new Faculty("Dr. Sran", 500000, "Software Engineer");
        Staff staff = new Staff("Hulk", 45000, "Lab Technician");

        Scanner input = new Scanner(System.in);
        String action;

        do {
            // Display menu for user action
            System.out.println("\n(E)mployee Details | (Q)uit");
            System.out.print("Enter choice: ");
            action = input.next();

            if (!action.equalsIgnoreCase("Q")) {
                // Ask for the type of employee
                System.out.print("Enter Employee number (1 for Faculty, 2 for Staff): ");
                int empNum = input.nextInt();

                UEmployee employee = null; // Reset employee for safety

                // Assign the selected employee
                switch (empNum) {
                    case 1:
                        employee = faculty;
                        break;
                    case 2:
                        employee = staff;
                        break;
                    default:
                        System.out.println("Invalid Employee number!");
                        continue; // Skip to next iteration
                }

                // Display details of the selected employee
                if (action.equalsIgnoreCase("E") && employee != null) {
                    System.out.println(employee.getDetails());
                }
            }
        } while (!action.equalsIgnoreCase("Q"));

        // Exit the program
        System.out.println("Exiting program.");
        input.close();
    }
}


 /* Screen Dump

(E)mployee Details | (Q)uit
Enter choice: E
Enter Employee number (1 for Faculty, 2 for Staff): 1
Name: Dr. Sran, Salary: $500000.00, Department: Software Engineer

(E)mployee Details | (Q)uit
Enter choice: E
Enter Employee number (1 for Faculty, 2 for Staff): 2
Name: Hulk, Salary: $45000.00, Job Title: Lab Technician

(E)mployee Details | (Q)uit
Enter choice: Q
Exiting program.
*/
