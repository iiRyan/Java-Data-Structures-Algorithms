import com.datastructueres.HighArray;
import com.datastructueres.LinkedListCopy;

public class Main {
    public static void main(String[] args) {

        LinkedListCopy myLinkedList = new LinkedListCopy(4);

        for (int i = 1; i <= 5; i++) {
            myLinkedList.append(i);
        }
        myLinkedList.printAll();

        System.out.println(myLinkedList.get(2));
        myLinkedList.printAll();

        // myLinkedList.append(10);
        // myLinkedList.append(25);
        // myLinkedList.append(7);
        // myLinkedList.append(77);

        // myLinkedList.revers();

        // System.out.print("\nLinked List: ");
        // myLinkedList.printList();

        // System.out.print("\nLength: ");
        // myLinkedList.getLength();

        // printItem(10);

        // int maxSize = 10; // array size
        // HighArray arr; // reference to array
        // arr = new HighArray(maxSize); // create the array

        // arr.insert(20); // insert 10 items
        // arr.insert(22);
        // arr.insert(25);
        // arr.insert(30);
        // arr.insert(44);

        // arr.display(); // display items
        // System.out.println();

        // arr.insert(1);
        // arr.insert(12);
        // arr.insert(10);
        // arr.insert(15);

        // arr.display(); // display items
        // System.out.println(arr.binarySearch(1515));

    }
}
