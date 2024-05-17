package com.datastructueres.bts;

import java.util.*;

public class BinarySearchTree {

    Node root; // point at the Parent Node

    public BinarySearchTree() {
    }

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    // Method start

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;

        while (true) {
            if (newNode.value == temp.value) return false; // Indicate the duplicate case. No Duplicate allowed

            if (newNode.value < temp.value) { // Decide where the newNode go Right or left , If greater goes to the right else to the left.
                if (temp.left == null) { // Check the left weather it's open or not.
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;

        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }

        return false;
    }

    public List<Integer> BFS() {
        // Initialize the current node to the root of the tree.
        Node currentNode = root;
        // Create q queue to hold nodes for Traversal.
        Queue<Node> queue = new LinkedList<>();
        // Initialize a list to store the values of the nodes visited
        List<Integer> results = new ArrayList<>();
        // Add the root node to the queue to start the traversal
        queue.add(currentNode);

        // Loop until the queue is empty, indicating all reachable nodes have been visited
        while (!queue.isEmpty()){
            // Remove the first node from the queue
            currentNode = queue.remove();
            results.add(currentNode.value);

            // Check if there's a child nodes.
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return results;
    }

}
