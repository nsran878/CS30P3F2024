/*

Program: MySavings.java          Last Date of this Revision: October 23, 2024

Purpose: An application that displays a menu of choices for entering pennies,nickels,dimes,and quarters into a PiggyBank object to store and load from a file 

Author: Noorinder Sran,
School: CHHS
Course: Computer Science 30
 

*/
package Mastery;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MySavings {
	
     static PiggyBank piggyBank = new PiggyBank();
     
    
     public static PiggyBank loadFromFile() 
     {
         try{
        
        	 
        	// Creates a FileInputStream to read from the file "../Chapter11/src/Mastery/piggybank.dat"
             FileInputStream fileIn = new FileInputStream("../Chapter11/src/Mastery/piggybank.dat");
            
             // Creates an ObjectInputStream to read the PiggyBank object from the file
             ObjectInputStream readBank = new ObjectInputStream(fileIn);
             
          // Reads and casts the object in the file to a PiggyBank instance
             piggyBank = (PiggyBank) readBank.readObject();        	
        	 
          // Closes the ObjectInputStream
        	 readBank.close();
            
        	 // Catches exception if the file is not found
         } catch (FileNotFoundException e) {
			System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    		 // Catches other input/output exceptions
         } catch (IOException e) {
			System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
    		
    		// Catches exception if PiggyBank class is not found
         } catch (ClassNotFoundException e) {
			System.out.println("Class could not be used to cast object.");
    		System.err.println("ClassNotFoundException: " + e.getMessage());
		}
         // Returns the PiggyBank object loaded from the file
		return(piggyBank);
     }
	
      public static void storeFile(PiggyBank piggyBank) 
    
      {
    	 
    	 try{
        	 /*write object */
        	 
        	 //FileOutputStrea ....
        	 //ObjectOutputStream writeBank...
        	 //writeBank.writeObjec....
    		 //writeBank...
    		
    		 // Creates a FileOutputStream to write to the file "../Chapter11/src/Mastery/piggybank.dat"
    		 FileOutputStream fileOut = new FileOutputStream("../Chapter11/src/Mastery/piggybank.dat");
    		 // Creates an ObjectOutputStream to write the PiggyBank object to the file
    		 ObjectOutputStream writeBank = new ObjectOutputStream(fileOut);
             
    		// Writes the PiggyBank object to the file
            writeBank.writeObject(piggyBank);
            // Closes the ObjectOutputStream
             writeBank.close();

          // Catches exception if the file is not found
         } catch (FileNotFoundException e) {
			System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    		 // Catches other input/output exceptions
         } catch (IOException e) {
			System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
    	}
    	 
     }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
          int choice;

        do {
        	 // Displays a menu for the user to interact with the PiggyBank
            System.out.println("\n1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
         // Displays total amount
         case 1 -> System.out.println("Total in bank: $" + piggyBank.getTotal());
         // Adds a penny to the PiggyBank      
         case 2 -> piggyBank.addPenny();
         // Adds a nickel to the PiggyBank
         case 3 -> piggyBank.addNickel();
         // Adds a dime to the PiggyBank
         case 4 -> piggyBank.addDime();
         // Adds a quarter to the PiggyBank
         case 5 -> piggyBank.addQuarter();
         // Allows the user to take money out of the PiggyBank
         case 6 -> {
                    System.out.print("Enter amount to take out: ");
                    double amount = scanner.nextDouble();
                    // Removes the specified amount
                    piggyBank.takeMoneyOut(amount);
                }
                case 0 -> {
                	// Exits the program and saves data
                    System.out.println("Exiting and saving data...");
                    
                 // Calls storeFile to save PiggyBank data to a file
                   storeFile(piggyBank);
                }
             // Handles invalid choices
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } 
     // Loops until the user chooses to exit
        while (choice != 0);

        
    }
}

/* Screen Dump

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 1
Total in bank: $1.0

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 6
Enter amount to take out: 0.50
You took out: $0.5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 1
Total in bank: $0.5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 

  */


