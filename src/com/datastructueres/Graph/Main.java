package com.datastructueres.Graph;

public class Main {

    public static void main(String[] args) {
        Graph myGraph = new Graph();

        myGraph.addVertex("J");
        myGraph.addVertex("R");

        myGraph.addEdge("J","R");
        myGraph.printGraph();

        System.out.println("After Remove");

        myGraph.removeEdge("J","R");
        myGraph.printGraph();

    }

}

