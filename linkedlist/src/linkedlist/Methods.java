/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author ASUS ROG
 */
class Methods {
     Node head;

    public void dungag(int input) {
        Node node = new Node();
        node.data = input;
        node.next = null;

        if (head == null) {
            head= node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void print() {
        Node node = head;

        while (node.next != null) {
            System.out.print("[" + node.data + "], ");
            node = node.next;
        }
        System.out.println("[" + node.data + "]");
    }

    public void insertsaSugod(int input) {
        Node node = new Node();
        node.data = input;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertsa(int index, int input) {
        Node node = new Node();
        node.data = input;
        node.next = null;

        if (index == 0) {
            insertsaSugod(input);
        } else {
            Node n = head;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
                if (n == null) {
                    System.out.println("grabe najud ka");
                }
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteangvaluesa(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
                if (n == null) {
                    System.out.println("grabe najud ka!");
                }
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("deleted na [" + n1.data + "] yeyyy");
            n1 = null;
        }
    }

    
}
    
