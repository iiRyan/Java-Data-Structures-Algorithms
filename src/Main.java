

public class Main {
    public static void main(String[] args) {





        LinkedList myLinkedList = new LinkedList();

        myLinkedList.append(10);
        myLinkedList.append(25);
        myLinkedList.append(7);
        myLinkedList.append(9);


        System.out.println(myLinkedList.removeLast().value);


        System.out.print("\nLinked List: ");
        myLinkedList.printList();

        System.out.print("\nLenght: ");
        myLinkedList.getLength();

    }
}
