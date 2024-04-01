package com.datastructueres.Queue;

import com.datastructueres.Node;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Front: null");
        } else {
            System.out.println("Last: " + first.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nQueue:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printQueue();
        }}

    public Node getFirst() {
        return first;
    }


    // Start method

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0 ){
            first = newNode;
            last = newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue(){
        if(length == 0 )return null;
        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        }else{
            first = first.next;
            temp.next = null;
        }
        length--;

        return temp;
    }
}
