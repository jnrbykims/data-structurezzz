/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytree;
 class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
/**
 *
 * @author ASUS ROG
 */
    
public class Binarytree {

  Node root;

    public Binarytree() {
        root = null;
    }

    
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }
      public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(Node root) {
        if (root != null) {
            inOrderTraversalRecursive(root.left);
            System.out.print(root.data + " ");
            inOrderTraversalRecursive(root.right);
        }
    }

     
    public static void main(String[] args) {
      Binarytree Binarytree = new Binarytree();

        Binarytree.insert(110);
        Binarytree.insert(220);
        Binarytree.insert(330);
        Binarytree.insert(440);
        Binarytree.insert(550);

        
        System.out.println("In-order traversal:");
        Binarytree.inOrderTraversal();
    }
}
    
    

