/*
Program: Vehicle.java          Last Date of this Revision: November 20, 2024

Purpose: An application that is an abstract class defining the general details and actions associated with a vehicle

Author: Noorinder Sran,
School: CHHS
Course: Computer Programming 30

 */
package Mastery;

// Abstract base class representing a generic vehicle
public abstract class Vehicle {
    // Instance variables
    private String make;
    private String model;
    private int year;

    // Constructor to initialize vehicle details
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Abstract method to get specific vehicle details
    public abstract String getDetails();

    // Common toString method for all vehicles
    @Override
    public String toString() {
        return String.format("%d %s %s", year, make, model);
    }
}
