package Skillbuilders;


public class Stack2 {
    private Object[] data;
    private int top;


    public Stack2(int maxItems) {
        data = new Object[maxItems];
        top = -1; 
    }


    public void push(Object item) {
        if (top < data.length - 1) {
            top++;
            data[top] = item;
        } else {
            System.out.println("Stack is full. Cannot add item: " + item);
        }
    }

 
    public Object pop() {
        if (!isEmpty()) {
            Object item = data[top];
            top--;
            return item;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
    }


    public Object peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack is empty. No top item.");
            return null;
        }
    }

    
    public boolean isEmpty() {
        return top == -1;
    }


    public int size() {
        return top + 1;
    }
}
