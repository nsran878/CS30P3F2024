package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class Roster {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for file name
        System.out.print("Enter the file name to store student data (e.g., students.dat): ");
        String fileName = input.nextLine();

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine(); // Consume leftover newline

        // Array to store student data
        StuName[] students = new StuName[numStudents];

        // Input student details
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter first name of student " + (i + 1) + ": ");
            String firstName = input.nextLine();
            System.out.print("Enter last name of student " + (i + 1) + ": ");
            String lastName = input.nextLine();

            students[i] = new StuName(firstName, lastName);
        }

        // Write student data to file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (StuName student : students) {
                out.writeObject(student);
            }
            System.out.println("\nStudent data has been written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read and display student data from file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            System.out.println("\nClass Roster:");
            for (int i = 0; i < numStudents; i++) {
                StuName student = (StuName) in.readObject();
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }

        // Close the scanner
        input.close();
    }
}

