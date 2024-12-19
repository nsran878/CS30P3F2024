/*

Program: ReverseList.java          Last Date of this Revision: November 30th, 2024

Purpose: An application that uses a stack of reverse a set of integers entered by the user.

Author: Noorinder Sran,
School: CHHS
Course: Computer Programming 30 
 

*/

package Mastery;

import java.util.Scanner;
import java.util.Stack;

public class ReverseList {
    public static void main(String[] args) {
    	// Create a Scanner for reading user input
    	Scanner input = new Scanner(System.in); 
    	// Create a Stack to store integers
    	Stack<Integer> stack = new Stack<>();   
    	// Prompt the user for input
        System.out.println("Enter a number (999 to quit): "); 
        int num;

        // Loop to read up to 10 numbers or until the user enters 999
        while (stack.size() < 10) { 
        	// Read the next number from the user
        	num = input.nextInt(); 
        	// If the user enters 999, exit the loop
            if (num == 999) { 
                break;
            }
            // Push the number onto the stack
            stack.push(num); 
            // Prompt for the next input
            System.out.println("Enter a number (999 to quit): "); 
        }
         // Output the numbers in reverse order
        System.out.print("Numbers in reverse: "); 

        // While the stack is not empty, pop each number and print it
        while (!stack.isEmpty()) {
        	// Pop the top number and print it  
        	System.out.print(stack.pop() + " "); 
        }
     // Close the Scanner to release resources
        input.close(); 
    }
}

/* Screen Dump

Enter a number (999 to quit): 
20
Enter a number (999 to quit): 
1
Enter a number (999 to quit): 
100
Enter a number (999 to quit): 
2000
Enter a number (999 to quit): 
999
Numbers in reverse: 2000 100 1 20

*/
