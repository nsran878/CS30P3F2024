/*

Program: Faculty.java          Last Date of this Revision: November 20, 2024

Purpose: An application that include members for storing and returning the department name

Author: Noorinder Sran
School: CHHS
Course: Computer Programming 30
 

*/

package Mastery;

// Class representing a faculty member, inherits from UEmployee
public class Faculty extends UEmployee {
    // Specific field for department
    private String departmentName;

    // Constructor to initialize faculty details
    public Faculty(String name, double salary, String departmentName) {
        super(name, salary); // Call the constructor of UEmployee
        this.departmentName = departmentName;
    }

    // Implementation of the abstract method to provide faculty details
    @Override
    public String getDetails() {
        return super.toString() + ", Department: " + departmentName;
    }
}

