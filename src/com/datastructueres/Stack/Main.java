package com.datastructueres.Stack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         Stack myStack = new Stack(5);

        myStack.push(10);
        myStack.push(11);
        System.out.println(myStack.pop().value);
         myStack.printAll();
    }
}
