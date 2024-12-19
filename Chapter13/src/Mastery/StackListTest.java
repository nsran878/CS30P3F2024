/*

Program: StackListTest.java          Last Date of this Revision: November 30th, 2024

Purpose: An application that implements a stack using a linked list that can store object data.

Author: Noorinder Sran
School: CHHS
Course: Computer Programming 30 
 

*/

package Mastery;


public class StackListTest {
 public static void main(String[] args) {
     // Create an instance of StackList
     StackList stack = new StackList();

     // Push items onto the stack
     System.out.println("Pushing items onto the stack:");
     stack.push("Mango"); 
     System.out.println("Pushed: Mango");
     stack.push("Kiwi"); 
     System.out.println("Pushed: Kiwi");
     stack.push("Cherry"); 
     System.out.println("Pushed: Cherry");

     // Peek at the top item of the stack
     System.out.println("\nPeeking at the top item of the stack:");
     System.out.println("Top of stack: " + stack.peek()); 

     // Display the size of the stack
     System.out.println("\nChecking the size of the stack:");
     System.out.println("Stack size: " + stack.size()); 

     // Pop items from the stack
     System.out.println("\nPopping items from the stack:");
     System.out.println("Popped: " + stack.pop()); 
     System.out.println("Popped: " + stack.pop()); 

     // Peek at the new top item of the stack
     System.out.println("\nPeeking at the new top item:");
     System.out.println("Top of stack: " + stack.peek()); 

     // Display the size of the stack after popping
     System.out.println("\nChecking the size of the stack after popping:");
     System.out.println("Stack size: " + stack.size()); 

     // Check if the stack is empty
     System.out.println("\nChecking if the stack is empty:");
     System.out.println("Is stack empty? " + stack.isEmpty()); 

     // Pop the last item and check again
     System.out.println("\nPopping the last item:");
     System.out.println("Popped: " + stack.pop()); 

     System.out.println("\nChecking if the stack is empty after popping the last item:");
     System.out.println("Is stack empty? " + stack.isEmpty()); 

     // Attempt to pop from an empty stack
     System.out.println("\nAttempting to pop from an empty stack:");
     System.out.println("Popped: " + stack.pop()); // Should display an error message
 }
}
 
/* Screen Dump
Pushing items onto the stack:
Pushed: Mango
Pushed: Kiwi
Pushed: Cherry

Peeking at the top item of the stack:
Top of stack: Cherry

Checking the size of the stack:
Stack size: 3

Popping items from the stack:
Popped: Cherry
Popped: Kiwi

Peeking at the new top item:
Top of stack: Mango

Checking the size of the stack after popping:
Stack size: 1

Checking if the stack is empty:
Is stack empty? false

Popping the last item:
Popped: Mango

Checking if the stack is empty after popping the last item:
Is stack empty? true

Attempting to pop from an empty stack:
Stack is empty. Cannot pop.
Popped: null
*/