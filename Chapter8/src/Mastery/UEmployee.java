/*

Program: UEmployee.java          Last Date of this Revision: November 20, 2024

Purpose: An application that contains methods for returning the employee name and salary

Author: Noorinder Sran,
School: CHHS
Course: Computer Programming 30
 

*/

package Mastery;

// Abstract base class representing a generic university employee
public abstract class UEmployee {
    // Instance variables
    private String name;
    private double salary;

    // Constructor to initialize the employee's name and salary
    public UEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method to get specific details of the employee
    public abstract String getDetails();

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
    }

    // Common toString method for all employees
    @Override
    public String toString() {
        return String.format("Name: %s, Salary: $%.2f", name, salary);
    }
}
