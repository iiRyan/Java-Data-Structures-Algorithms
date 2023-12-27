public class LinkedList {

    private Node head;
    private Node tail;
    private int length = 0;

    class Node {
        int value; // Value of the element of LinkedList
        Node next; // This points to the next element of the LinkedList

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value); // 4
        head = newNode;
        tail = newNode;
    }

    public LinkedList() {
    }


    public void append(int value){
        Node newNode = new Node(value); // Creates a new node with the given value => 5

        if(length == 0 ) { // Checks if the list is empty. If it is, sets the head and tail to the new node and increments the length.
            head = newNode; // 5
            tail = newNode; // 5
            length++;
        }else { //
           tail.next = newNode; // point to the newNode which is 5 , sets the next field of the current tail node to the new node.
           tail = newNode; // now the tail is 5 , Updates the tail to point to the new node.
            length++; // Increments the length of the list.
        }

    }

    public void prepend(int value){
        Node newNode = new Node(value); // 5
        if(length == 0 ){ // If the LinkedList is empty set Head & tail to 5
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head; // set the new node point to the next node
            head = newNode; // and set the head to point to the newNode which is 5 in this case
        }
        length++;
    }
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head; // creates a temporary reference to the first node in the list.
        head = head.next; // moves the head pointer to the second node in the list, effectively removing the first node from the list.
        temp.next = null; // sets the next field of the removed node to null, breaking the link between the removed node and the rest of the list.
        // This is indeed a way to "remove" the node from the list, as no other nodes will have a reference to it.
        length--;
        if (length == 0) {
            tail = null; // handles the case where the list becomes empty after removing the first node.
        }
        return temp; // returns the removed node, allowing the caller to access its value.
    }
    public Node removeLast(){

        if(length == 0 ) return null;

        Node temp = head;
        Node pre = head;

        while (temp.next != null){

            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }

    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }




    /*public Node removeDuplicates(Node head) {

        Node current_node = head;

        while (current_node != null && current_node.next != null){
            if (current_node.next.value == current_node.value){
                current_node.next = current_node.next.next;
            }else {
                current_node = current_node.next;
            }
        }
        return head;

    }*/

}

