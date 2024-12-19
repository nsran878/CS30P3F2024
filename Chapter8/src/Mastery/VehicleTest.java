/*

Program: VehicleTest.java          Last Date of this Revision: November 20, 2024

Purpose: An application that is an abstract class defining the general details and actions associated with a vehicle

Author: Noorinder Sran,
School: CHHS
Course: Computer Programming 30
 

*/

 package Mastery;

import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        // Create instances of Car, Truck, and Minivan
        Car car = new Car("Mercedes", "E63S", 2020, 4);
        Truck truck = new Truck("Ram", "1500", 2022, 13000);
        Minivan minivan = new Minivan("Honda", "Odyssey", 2021, 7);

        Scanner input = new Scanner(System.in);
        String action;

        do {
            // Display menu for user action
            System.out.println("\n(V)ehicle Details | (Q)uit");
            System.out.print("Enter choice: ");
            action = input.next();

            if (!action.equalsIgnoreCase("Q")) {
                // Ask for the type of vehicle
                System.out.print("Enter Vehicle type (1 for Car, 2 for Truck, 3 for Minivan): ");
                int vehicleType = input.nextInt();

                Vehicle vehicle = null; // Initialize the vehicle variable

                // Assign the selected vehicle
                switch (vehicleType) {
                    case 1:
                        vehicle = car;
                        break;
                    case 2:
                        vehicle = truck;
                        break;
                    case 3:
                        vehicle = minivan;
                        break;
                    default:
                        System.out.println("Invalid Vehicle type! Please try again.");
                        continue; // Skip to the next iteration
                }

                // Display vehicle details
                if (action.equalsIgnoreCase("V") && vehicle != null) {
                    System.out.println(vehicle.getDetails());
                }
            }
        } while (!action.equalsIgnoreCase("Q"));

        // Exit the program
        System.out.println("Exiting program.");
        input.close();
    }
}

/* Screen Dump



(V)ehicle Details | (Q)uit
Enter choice: V
Enter Vehicle type (1 for Car, 2 for Truck, 3 for Minivan): 2
Truck: 2022 Ram 1500, Payload Capacity: 13000 lbs

(V)ehicle Details | (Q)uit
Enter choice: V
Enter Vehicle type (1 for Car, 2 for Truck, 3 for Minivan): 1
Car: 2020 Mercedes E63S, Doors: 4

(V)ehicle Details | (Q)uit
Enter choice: V
Enter Vehicle type (1 for Car, 2 for Truck, 3 for Minivan): 3
Minivan: 2021 Honda Odyssey, Seating Capacity: 7

(V)ehicle Details | (Q)uit
Enter choice: Q
Exiting program.

 
 */
