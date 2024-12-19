/*

Program: FindAndReplace.java          Last Date of this Revision: October 23, 2024

Purpose: An application that prompts the user for a file name, a search word or phrase, and a replacement word or phrase.

Author: Noorinder Sran
School: CHHS
Course: Computer Science 30
 

*/

package Mastery;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompts user to enter the file name and stores it in filename
        System.out.print("Enter the file name: ");
        String filename = scanner.nextLine();
        // Prompts user to enter the word or phrase to search for and stores it in searchWord
        System.out.print("Enter the word or phrase to search: ");
        String searchWord = scanner.nextLine();
        // Prompts user to enter the replacement word or phrase and stores it in replacementWord
        System.out.print("Enter the replacement word or phrase: ");
        String replacementWord = scanner.nextLine();

        try {
        	// Reads the entire content of the file into a single string called content
            String content = new String(Files.readAllBytes(Paths.get(filename)));
         
            // Replaces occurrences of searchWord with replacementWord in the content
            String updatedContent = content.replace(searchWord, replacementWord);
            
            // Opens the file for writing and writes the updated content back to the file
            try (PrintWriter writer = new PrintWriter(filename)) {
                writer.write(updatedContent);
            }
            
            // Notifies the user that the replacement was completed successfully
            System.out.println("Replacement completed successfully.");
      
            // Catches exception if the file is not found
        } catch (FileNotFoundException e) {
            System.out.println("The file '" + filename + "' does not exist.");
        
            // Catches other input/output exceptions
         } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
            
            // Prints stack trace for debugging

            e.printStackTrace();
        }

        
    }
}


/* Screen Dump

Enter the file name: C:\Users\1100064844\git\CS30P3F2024\Chapter11\src\Mastery\findandreplace.txt
Enter the word or phrase to search: go
Enter the replacement word or phrase: stop then go
Replacement completed successfully.


  */
