/*

Program: WordCount.java          Last Date of this Revision: October 23, 2024

Purpose: An application that displays the number of words and average word length in a textfile named source.txt

Author: Noorinder Sran, 
School: CHHS
Course: Computer Science 30
 

*/

package Mastery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
    	// Specifies the file path
    	String fileName = "../Chapter11/src/Mastery/WordCount.txt"; 
    	// Initializes a counter for the number of words
    	int wordCount = 0;
    	// Initializes a counter for the total length of all words
    	int totalLength = 0;
    	
    	// Opens the file for reading
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
           
            // Reads each line of the file until there are no more lines
            while ((line = br.readLine()) != null) {
            	
             // Splits the line into words based on non-word characters (spaces, punctuation)
            String[] words = line.split("\\W+"); 
            // Loops through each word  
            for (String word : words) {
            	 // Checks if the word is not empty
            	if (!word.isEmpty()) {
            		 // Increments the word count
            		wordCount++;
            		// Adds the word's length to the total length
            		totalLength += word.length();
                    }
                }
            }
        } 
        // Catches any input/output exceptions
        catch (IOException e) {
        // Prints stack trace for debugging	
        e.printStackTrace();
        }
        // Checks if there were any words in the file
        if (wordCount > 0) {
        	// Calculates the average word length by dividing total length by word count
            double averageWordLength = (double) totalLength / wordCount;
         // Prints the word count
            System.out.println("Number of words: " + wordCount);
         // Prints the average word length
            System.out.println("Average word length: " + averageWordLength);
        } else {
        	// Prints message if no words were found
        	System.out.println("No words found.");
        }
    }
}

/* Screen Dump

Number of words: 11
Average word length: 2.8181818181818183
 
 */

