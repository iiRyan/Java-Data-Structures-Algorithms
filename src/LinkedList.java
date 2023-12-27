public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

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
        length = 1;
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
        }
        length++; // Increments the length of the list.
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

