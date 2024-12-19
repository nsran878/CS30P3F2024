package Skillbuilders;


public class Queue2 {
 private Object[] data;
 private int front, rear, maxSize;


 public Queue2(int maxItems) {
     data = new Object[maxItems];
     front = -1; 
     rear = -1;
     maxSize = maxItems;
 }


 public void enqueue(Object item) {
     if ((rear + 1) % maxSize == front) {
         System.out.println("Queue is full. Cannot add: " + item);
     } else {
         if (isEmpty()) {
             front = 0;
         }
         rear = (rear + 1) % maxSize;
         data[rear] = item;
     }
 }


 public Object dequeue() {
     if (isEmpty()) {
         System.out.println("Queue is empty. Cannot dequeue.");
         return null;
     } else {
         Object item = data[front];
         if (front == rear) { 
             front = -1;
             rear = -1;
         } else {
             front = (front + 1) % maxSize;
         }
         return item;
     }
 }

 
 public Object front() {
     if (isEmpty()) {
         System.out.println("Queue is empty. No front item.");
         return null;
     } else {
         return data[front];
     }
 }

 
 public boolean isEmpty() {
     return front == -1;
 }


 public int size() {
     if (isEmpty()) {
         return 0;
     } else if (rear >= front) {
         return rear - front + 1;
     } else {
         return maxSize - front + rear + 1;
     }
 }
}
