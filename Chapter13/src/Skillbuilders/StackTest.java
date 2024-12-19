package Skillbuilders;


public class StackTest {
    public static void main(String[] args) {
       
        System.out.println("Testing Stack2:");
        Stack2 stack2 = new Stack2(5);
        stack2.push("Apple");
        stack2.push("Banana");
        stack2.push(42);
        System.out.println("Top of Stack2: " + stack2.peek());
        System.out.println("Popping from Stack2: " + stack2.pop());
        System.out.println("Size of Stack2: " + stack2.size());

      
        System.out.println("\nTesting Stack3:");
        Stack3 stack3 = new Stack3();
        stack3.push("Orange");
        stack3.push("Grape");
        stack3.push(99);
        System.out.println("Top of Stack3: " + stack3.peek());
        System.out.println("Popping from Stack3: " + stack3.pop());
        System.out.println("Size of Stack3: " + stack3.size());
    }
}
