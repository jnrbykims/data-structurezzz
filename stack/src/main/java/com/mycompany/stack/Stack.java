/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
/**
 *
 * @author ASUS ROG
 */
public class Stack<T> {
 private List<T> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items.remove(items.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items.get(items.size() - 1);
    }
    
     public int size() {
        return items.size();
    }
     
    public static void main(String[] args) {
         Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: " + stack.items);  // Output: Stack: [1, 2, 3]
        System.out.println("Pop: " + stack.pop());    // Output: Pop: 3
        System.out.println("Peek: " + stack.peek());  // Output: Peek: 2
        System.out.println("Size: " + stack.size());  // Output: Size: 2
    }
}   

