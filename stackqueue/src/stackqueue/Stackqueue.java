/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackqueue;
 


class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
// Stack class using linked list

class Stack {

    private LinkedList list;

    public Stack() {
        this.list = new LinkedList();
    }

    public void push(int data) {
        list.insert(data);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = list.head.data;
        list.head = list.head.next;
        return data;
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void display() {
        list.display();
    }
}

// Queue class using linked list
class Queue {

    private LinkedList list;

    public Queue() {
        this.list = new LinkedList();
    }

    public void enqueue(int data) {
        list.insert(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Node current = list.head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        int data = current.data;
        if (prev != null) {
            prev.next = null;
        } else {
            list.head = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void display() {
        list.display();
    }
}
    public class Stackqueue {
  
     
      public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(97);
        stack.push(96);
        stack.push(95);

        System.out.println("Stack:");
        stack.display();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop:");
        stack.display();

        // Queue example
        Queue queue = new Queue();
        queue.enqueue(127);
        queue.enqueue(116);
        queue.enqueue(114);

        System.out.println("Queue:");
        queue.display();

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Queue after dequeue:");
        queue.display();
    }
}
