package Skillbuilders;


public class QueueTest {
 public static void main(String[] args) {
   
     System.out.println("Testing Queue2:");
     Queue2 queue2 = new Queue2(3);
     queue2.enqueue("Apple");
     queue2.enqueue("Banana");
     queue2.enqueue("Cherry");
     System.out.println("Front of Queue2: " + queue2.front());
     System.out.println("Dequeuing from Queue2: " + queue2.dequeue());
     System.out.println("Size of Queue2: " + queue2.size());

 
     System.out.println("\nTesting Queue3:");
     Queue3 queue3 = new Queue3();
     queue3.enqueue("Orange");
     queue3.enqueue("Grape");
     queue3.enqueue("Mango");
     System.out.println("Front of Queue3: " + queue3.front());
     System.out.println("Dequeuing from Queue3: " + queue3.dequeue());
     System.out.println("Size of Queue3: " + queue3.size());
 }
}
