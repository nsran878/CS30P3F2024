package SkillBuilders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Stats1 {

    public static void main(String[] args) {
        // Define file and variables for statistics
        File dataFile = new File("../Chapter11/src/Skillbuilders/Stats1.dat");
        int totalScores = 0;
        int numScores = 0;
        double avgScore = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;

        try (BufferedReader readFile = new BufferedReader(new FileReader(dataFile))) {
            String name;
            String score;

            // Process file contents
            while ((name = readFile.readLine()) != null) {
                score = readFile.readLine();

                if (score != null) {
                    System.out.println("Student: " + name + ", Score: " + score);

                    // Parse and calculate statistics
                    int scoreValue = Integer.parseInt(score);
                    totalScores += scoreValue;
                    numScores++;

                    if (scoreValue > highestScore) {
                        highestScore = scoreValue;
                    }

                    if (scoreValue < lowestScore) {
                        lowestScore = scoreValue;
                    }
                }
            }

            // Calculate and display averages and other statistics
            if (numScores > 0) {
                avgScore = (double) totalScores / numScores;
                System.out.println("Average Score: " + avgScore);
                System.out.println("Highest Score: " + highestScore);
                System.out.println("Lowest Score: " + lowestScore);
            } else {
                System.out.println("No scores found in the file.");
            }

        } catch (IOException e) {
            // Handle file read errors
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
