package com.datastructueres.bts;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree myBTS = new BinarySearchTree();
        myBTS.insert(15);
        myBTS.insert(10);
        myBTS.insert(30);
        myBTS.insert(8);
        myBTS.insert(12);
        myBTS.insert(25);
        myBTS.insert(60);
        System.out.println("My BTS: " + myBTS.root.right.left.value);
        System.out.println("Does Contains: " + myBTS.contains(25));





    }


}
