package com.datastructueres;

public class Stack {
    private Node top;
    private int length;

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        length++;
    }
}
