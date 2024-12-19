package SkillBuilders;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Stats2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get output file name and number of students
        System.out.print("Enter the output file name: ");
        String fileName = input.nextLine();
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine(); // Consume leftover newline

        // Write student data to file
        try (BufferedWriter writeFile = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter student name: ");
                String studentName = input.nextLine();
                System.out.print("Enter student score: ");
                int score = input.nextInt();
                input.nextLine(); // Consume leftover newline

                writeFile.write(studentName);
                writeFile.newLine();
                writeFile.write(String.valueOf(score));
                writeFile.newLine();
            }
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read and process data from file
        try (BufferedReader readFile = new BufferedReader(new FileReader(fileName))) {
            String name;
            String score;
            int totalScores = 0;
            int numScores = 0;
            int highestScore = Integer.MIN_VALUE;
            int lowestScore = Integer.MAX_VALUE;

            System.out.println("\nFile contents:");
            while ((name = readFile.readLine()) != null) {
                score = readFile.readLine();
                if (score != null) {
                    System.out.println("Student: " + name + ", Score: " + score);

                    int scoreValue = Integer.parseInt(score);
                    totalScores += scoreValue;
                    numScores++;

                    // Update highest and lowest scores
                    if (scoreValue > highestScore) highestScore = scoreValue;
                    if (scoreValue < lowestScore) lowestScore = scoreValue;
                }
            }

            // Display statistics
            if (numScores > 0) {
                double avgScore = (double) totalScores / numScores;
                System.out.println("\nAverage Score: " + avgScore);
                System.out.println("Highest Score: " + highestScore);
                System.out.println("Lowest Score: " + lowestScore);
            } else {
                System.out.println("No scores found in the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        input.close();
    }
}
