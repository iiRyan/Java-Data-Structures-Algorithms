package com.datastructueres.LinkedList;

import com.datastructueres.ListNode;
import com.datastructueres.Node;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        LinkedList secondList = new LinkedList();
        secondList.append(4);
        secondList.append(5);
        secondList.append(6);

        //Node newList = mergeTwoLists(myLinkedList,secondList);

//        Node temp = newList;
//        while (temp.next != null){
//            System.out.println(temp.value);
//            temp = temp.next;
//        }
        // create a loop by connecting the tail to the second node
        // myLinkedList.getTail().next = myLinkedList.getHead().next;

    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode tempNode = new ListNode(0);
        ListNode cureentNode = tempNode;
        while (list1.next != null && list2.next != null){
            if(list1.val < list2.val){
                cureentNode.next = list1;
                list1 = list1.next;
            }else {
                cureentNode.next = list2;
                list2 = list2.next;
            }
        }

        return null;

    }

}
