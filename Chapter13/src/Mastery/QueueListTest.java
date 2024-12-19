/*

Program: QueueListTest.java          Last Date of this Revision: November 30th, 2024

Purpose: An application that implements a queue using a linked list that can store object data.

Author: Noorinder Sran, 
School: CHHS
Course: Computer Programming 30 
 

*/
package Mastery;


public class QueueListTest {
    public static void main(String[] args) {
        // Create an instance of QueueList
        QueueList queue = new QueueList();

        // Enqueue items into the queue
        System.out.println("Enqueuing items into the queue:");
        queue.enqueue("Apple"); 
        System.out.println("Enqueued: Apple");
        queue.enqueue("Banana");
        System.out.println("Enqueued: Banana");
        queue.enqueue("Cherry"); 
        System.out.println("Enqueued: Cherry");

        // Peek at the front item of the queue
        System.out.println("\nPeeking at the front item of the queue:");
        System.out.println("Front of queue: " + queue.peek()); 

        // Display the size of the queue
        System.out.println("\nChecking the size of the queue:");
        System.out.println("Queue size: " + queue.size()); 

        // Dequeue items from the queue
        System.out.println("\nDequeuing items from the queue:");
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 

        // Peek at the new front item of the queue
        System.out.println("\nPeeking at the new front item:");
        System.out.println("Front of queue: " + queue.peek()); 

        // Display the size of the queue after dequeuing
        System.out.println("\nChecking the size of the queue after dequeuing:");
        System.out.println("Queue size: " + queue.size()); 

        // Check if the queue is empty
        System.out.println("\nChecking if the queue is empty:");
        System.out.println("Is queue empty? " + queue.isEmpty()); 

        // Dequeue the last item and check again
        System.out.println("\nDequeuing the last item:");
        System.out.println("Dequeued: " + queue.dequeue()); 

        System.out.println("\nChecking if the queue is empty after dequeuing the last item:");
        System.out.println("Is queue empty? " + queue.isEmpty()); 

        // Attempt to dequeue from an empty queue
        System.out.println("\nAttempting to dequeue from an empty queue:");
        System.out.println("Dequeued: " + queue.dequeue()); 
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
