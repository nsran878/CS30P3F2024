/*

Program: StackList.java          Last Date of this Revision: November 30, 2024

Purpose: An application that implements a stack using a linked list that can store object data.

Author: Noorinder Sran,
School: CHHS
Course: Computer Programming 30 
 

*/


package Mastery;


public class StackList {
// The top of the stack
	private Node top; 

// Constructor
// Initializes an empty stack by setting the top node to null
 public StackList() {
     top = null;
 }

//Push method to add an item to the stack
// Creates a new node with the item and places it at the top of the stack
 public void push(Object item) {
     Node newNode = new Node(item);
     newNode.setNext(top);
     top = newNode;
 }
 // Pop method to remove and return the top item of the stack
 // Removes the top node and returns its data, or prints an error if the stack is empty
 public Object pop() {
     if (isEmpty()) {
    	// Print error message
    	 System.out.println("Stack is empty. Cannot pop.");
    	// Return null if stack is empty
    	 return null;
     } else {
    	// Get the data from the top node
    	 Object item = top.getData();
    	// Update the top to the next node
    	 top = top.getNext();
    	// Return the removed data
    	 return item;
     }
 }
 // Peek method to return the top item without removing it
 // Returns the data of the top node, or prints an error if the stack is empty
 public Object peek() {
	// Check if the stack is empty
	 if (isEmpty()) {
		// Print error message
		 System.out.println("Stack is empty. No top item.");
		// Return null if stack is empty
		 return null;
     } else {
    	// Return the data of the top node
    	 return top.getData();
     }
 }


 public boolean isEmpty() {
	// The stack is empty if the top node is null
	 return top == null;
 }

 // Size method to return the number of items in the stack
 // Traverses the stack and counts the number of nodes
 public int size() {
	 // Initialize count to 0
	 int count = 0;
	 // Start from the top node
	 Node current = top;
	 // Traverse until the end of the stack
	 while (current != null) {
		// Increment the count for each node
		 count++;
         current = current.getNext();
     }
	// Return the total count
     return count;
 }

 // Represents a single node in the stack, storing data and a reference to the next node
 private class Node {
	 // Data stored in the node
	 private Object data;
	 // Reference to the next node
	 private Node next;

	  // Constructor
     // Initializes the node with the given data and sets the next node to null
     public Node(Object data) {
         this.data = data;
         this.next = null;
     }

     public Object getData() {
    // Return the data stored in the node
    	 return data;
     }

     public Node getNext() {
    // Return the next node
    	 return next;
     }
  // Setter for the next node

     public void setNext(Node next) {
         this.next = next;
     }
 }
}


/* Screen Dump

Top of stack: Cherry
Stack size: 3
Popping: Cherry
Top of stack: Kiwi
Stack size: 2
 
 */
