package Skillbuilders;


public class LinkedList {
 private Node head;

 
 public LinkedList() {
     head = null;
 }


 public void addAtFront(String str) {
     Node newNode = new Node(str);
     newNode.setNext(head);
     head = newNode;
 }


 public void remove(String str) {
     Node current = head, previous = null;

     while (current != null && !current.getData().equals(str)) {
         previous = current;
         current = current.getNext();
     }

     if (current != null) {
         if (current == head) {
             head = head.getNext();
         } else {
             previous.setNext(current.getNext());
         }
     }
 }


 public String toString() {
     if (head == null) {
         return "There are no items in the list.";
     }

     StringBuilder result = new StringBuilder();
     Node current = head;

     while (current != null) {
         result.append(current.getData()).append("\n");
         current = current.getNext();
     }

     return result.toString();
 }


 public int size() {
     int count = 0;
     Node current = head;

     while (current != null) {
         count++;
         current = current.getNext();
     }

     return count;
 }


 public void addAtEnd(String str) {
     Node newNode = new Node(str);

     if (head == null) {
         head = newNode;
     } else {
         Node current = head;
         while (current.getNext() != null) {
             current = current.getNext();
         }
         current.setNext(newNode);
     }
 }


 public void makeEmpty() {
     head = null;
 }

 private class Node {
     private String data;
     private Node next;

     public Node(String data) {
         this.data = data;
         this.next = null;
     }

     public String getData() {
         return data;
     }

     public Node getNext() {
         return next;
     }

     public void setNext(Node next) {
         this.next = next;
     }
 }
}
