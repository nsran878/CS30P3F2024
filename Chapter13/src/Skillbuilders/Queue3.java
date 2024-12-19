package Skillbuilders;


import java.util.ArrayList;

public class Queue3 {
 private ArrayList<Object> data;


 public Queue3() {
     data = new ArrayList<>();
 }


 public void enqueue(Object item) {
     data.add(item);
 }


 public Object dequeue() {
     if (isEmpty()) {
         System.out.println("Queue is empty. Cannot dequeue.");
         return null;
     } else {
         return data.remove(0);
     }
 }


 public Object front() {
     if (isEmpty()) {
         System.out.println("Queue is empty. No front item.");
         return null;
     } else {
         return data.get(0);
     }
 }

 
 public boolean isEmpty() {
     return data.isEmpty();
 }


 public int size() {
     return data.size();
 }
}
