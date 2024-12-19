package Skillbuilders;


import java.util.ArrayList;

public class Stack3 {
    private ArrayList<Object> data;

   
    public Stack3() {
        data = new ArrayList<>();
    }

    
    public void push(Object item) {
        data.add(item);
    }

   
    public Object pop() {
        if (!isEmpty()) {
            return data.remove(data.size() - 1);
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
    }

   
    public Object peek() {
        if (!isEmpty()) {
            return data.get(data.size() - 1);
        } else {
            System.out.println("Stack is empty. No top item.");
            return null;
        }
    }

   
    public boolean isEmpty() {
        return data.isEmpty();
    }

    
    public int size() {
        return data.size();
    }
}
