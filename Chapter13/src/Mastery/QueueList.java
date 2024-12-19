/*

Program: QueueList.java          Last Date of this Revision: November 30th, 2024 

Purpose: An application that implements a queue using a linked list that can store object data.

Author: Noorinder Sran 
School: CHHS
Course: Computer Programming 30 
 

*/

package Mastery;

public class QueueList {
	// Reference to the front of the queue
	private Node front; 
	// Reference to the rear of the queue
    private Node rear;  

   
    // Initializes an empty queue by setting front and rear to null
    public QueueList() {
        front = null;
        rear = null;
    }

    // Enqueue method to add an item to the queue
    // Adds the item at the rear of the queue
    public void enqueue(Object item) {
        Node newNode = new Node(item); // Create a new node with the given data
        if (isEmpty()) { // If the queue is empty, set both front and rear to the new node
            front = newNode;
        } else { // Otherwise, link the new node to the current rear and update the rear reference
            rear.setNext(newNode);
        }
        rear = newNode; // Update the rear reference to the new node
    }

    // Dequeue method to remove and return the front item of the queue
    // Removes the item at the front of the queue and updates the front reference
    public Object dequeue() {
        if (isEmpty()) { // Check if the queue is empty
            System.out.println("Queue is empty. Cannot dequeue."); // Print an error message
            return null; // Return null if the queue is empty
        } else {
            Object item = front.getData(); // Get the data from the front node
            front = front.getNext(); // Update the front to the next node
            if (front == null) { // If the queue is now empty, set rear to null as well
                rear = null;
            }
            return item; // Return the removed data
        }
    }

    // Peek method to return the front item without removing it
    // Returns the data of the front node, or prints an error if the queue is empty
    public Object peek() {
        if (isEmpty()) { // Check if the queue is empty
            System.out.println("Queue is empty. No front item."); // Print an error message
            return null; // Return null if the queue is empty
        } else {
            return front.getData(); // Return the data of the front node
        }
    }

    // isEmpty method to check if the queue is empty
    // Returns true if both front and rear are null, otherwise false
    public boolean isEmpty() {
        return front == null; // The queue is empty if the front is null
    }

    // Size method to return the number of items in the queue
    // Traverses the queue and counts the number of nodes
    public int size() {
        int count = 0; // Initialize count to 0
        Node current = front; // Start from the front node
        while (current != null) { // Traverse until the end of the queue
            count++; // Increment the count for each node
            current = current.getNext(); // Move to the next node
        }
        return count; // Return the total count
    }

    // Nested Node class
    // Represents a single node in the queue, storing data and a reference to the next node
    private class Node {
        private Object data; // Data stored in the node
        private Node next;   // Reference to the next node

        
        // Initializes the node with the given data and sets the next node to null
        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        // Getter for data
        public Object getData() {
            return data; // Return the data stored in the node
        }

        
        public Node getNext() {
            return next; // Return the next node
        }

       
        public void setNext(Node next) {
            this.next = next; // Set the next node reference
        }
    }
}


/* Screen Dump

Front of queue: Apple
Queue size: 3
Dequeue: Apple
Front of queue: Banana
Queue size: 2
Is queue empty? false
 

*/
