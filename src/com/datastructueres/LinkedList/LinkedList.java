package com.datastructueres;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length = 0;

    public LinkedList(int value) {
        Node newNode = new Node(value); // 4
        head = newNode;
        tail = newNode;
    }

    public LinkedList() {
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public Node get(int index) {
        if (index < 0 || index > length)
            return null;

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean set(int index, int value) {

        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length)
            return false;

        /*
         * In case the index was in the First index
         * use the prepend method that already exist.
         */
        if (index == 0) {
            prepend(value);
            return true;
        }
        /*
         * In case the index was last index
         * use append method.
         */

        if (index == length) {
            append(value);
            return true;
        }
        /*
         * In case the index was in the middle
         * myList = 5 , 6 ,7
         * insert at index 1, value = 3)
         */
        Node newNode = new Node(value); // value = 3
        Node temp = get(index - 1); // Point to the node before temp ==> temp = 0 <-- the 0 index which is 5.
        newNode.next = temp.next; // will be point at 6
        temp.next = newNode; // temp(5) is pointing at 6, but now it point at 3.
        length++;

        return true;
    }

    public Node remove(int index) {
        if (0 > index || index >= length)
            return null;
        if (index == 0)
            return removeFirst();
        if (index == length - 1) {
            return removeLast();
        }
        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp = null;
        length--;
        return temp;
    }

    public void append(int value) {
        Node newNode = new Node(value); // Creates a new node with the given value => 5

        if (length == 0) { // Checks if the list is empty. If it is, sets the head and tail to the new node
                           // and increments the length.
            head = newNode; // 5
            tail = newNode; // 5
            length++;
        } else { //
            tail.next = newNode; // point to the newNode which is 5 , sets the next field of the current tail
                                 // node to the new node.
            tail = newNode; // now the tail is 5 , Updates the tail to point to the new node.
            length++; // Increments the length of the list.
        }

    }

    public void prepend(int value) {
        Node newNode = new Node(value); // 5
        if (length == 0) { // If the LinkedList is empty set Head & tail to 5
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head; // set the new node point to the next node
            head = newNode; // and set the head to point to the newNode which is 5 in this case
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0)
            return null;
        Node temp = head; // creates a temporary reference to the first node in the list.
        head = head.next; // moves the head pointer to the second node in the list, effectively removing
                          // the first node from the list.
        temp.next = null; // sets the next field of the removed node to null, breaking the link between
                          // the removed node and the rest of the list.
        // This is indeed a way to "remove" the node from the list, as no other nodes
        // will have a reference to it.
        length--;
        if (length == 0) {
            tail = null; // handles the case where the list becomes empty after removing the first node.
        }
        return temp; // returns the removed node, allowing the caller to access its value.
    }

    public Node removeLast() {
        if (length == 0)
            return null;

        Node temp = head;
        Node pre = head;

        while (temp.next != null) {

            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void revers() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {

            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public Node findMiddleNode() {
        // Initialize slow pointer to the head of the linked list
        Node slow = head;
        // Initialize fast pointer to the head of the linked list
        Node fast = head;
        // Traverse the linked list with two pointers: slow and fast
        // slow moves one node at a time, while fast moves two nodes at a time
        while (fast != null && fast.next != null) {
            // Move slow pointer to the next node
            slow = slow.next;
            // Move fast pointer to the next two nodes
            fast = fast.next.next;
        }
        // Return the Node object representing the middle node of the linked list
        return slow;
    }

    public boolean hasLoop() {
        // Initialize slow pointer to the head of the linked list
        Node slow = head;
        // Initialize fast pointer to the head of the linked list
        Node fast = head;
        // Traverse the linked list with two pointers: slow and fast
        // slow moves one node at a time, while fast moves two nodes at a time
        while (fast != null && fast.next != null) {
            // Move slow pointer to the next node
            slow = slow.next;
            // Move fast pointer to the next two nodes
            fast = fast.next.next;
            // If slow pointer meets fast pointer, then there is a loop in the linked list
            if (slow == fast) {
                return true;
            }
        }

        // If the loop has not been detected after the traversal, then there is no loop
        // in the linked list
        return false;
    }

    /*
     * public Node removeDuplicates(Node head) {
     * 
     * Node current_node = head;
     * 
     * while (current_node != null && current_node.next != null){
     * if (current_node.next.value == current_node.value){
     * current_node.next = current_node.next.next;
     * }else {
     * current_node = current_node.next;
     * }
     * }
     * return head;
     * 
     * }
     */

}
