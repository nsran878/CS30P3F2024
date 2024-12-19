package SkillBuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile2 {
    public static void main(String[] args) {
        // Initialize file and scanner
        File file = new File("../Chapter11/src/Skillbuilders/zzz.txt");
        Scanner scanner = new Scanner(System.in);

        try {
            // Check if the file exists
            if (file.exists()) {
                System.out.println("File already exists.");
                
                // Prompt user to delete the file
                System.out.print("Do you want to delete it? (yes/no): ");
                String response = scanner.nextLine().trim();

                // Handle user response
                if (response.equalsIgnoreCase("yes")) {
                    if (file.delete()) {
                        System.out.println("File has been deleted successfully.");
                    } else {
                        System.out.println("Failed to delete the file.");
                    }
                }
            } else {
                // Create the file if it does not exist
                if (file.createNewFile()) {
                    System.out.println("File has been created successfully.");
                } else {
                    System.out.println("Failed to create the file.");
                }
            }
        } catch (IOException e) {
            // Handle potential I/O errors
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            // Close the scanner to release resources
            scanner.close();
        }
    }
}
