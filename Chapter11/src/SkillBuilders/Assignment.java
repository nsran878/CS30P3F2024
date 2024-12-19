package SkillBuilders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the file name
        System.out.print("Enter the name of the file (with path if necessary): ");
        String fileName = scanner.nextLine().trim(); // Trim to handle accidental spaces

        // Create a File object
        File file = new File(fileName);

        // Check if the file exists and is not a directory
        if (file.exists() && !file.isDirectory()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                // Read and display the contents of the file
                System.out.println("File contents:");
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                // Handle potential I/O exceptions
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }
        } else {
            // Inform the user if the file does not exist or is a directory
            System.out.println("The file does not exist or is a directory.");
        }

        // Close the scanner to free resources
        scanner.close();
    }
}

