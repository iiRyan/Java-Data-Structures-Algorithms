package com.datastructueres.Heap;

import java.util.*;

public class Heap {
 List<Integer> heap;

 public Heap(){
     this.heap = new ArrayList<>();
 }

 public List<Integer> getHeap(){
     return new ArrayList<>(heap); // The reason we sent a copy of the Heap , we don't give anyone access to the heap.
 }

 public int leftChild(int index){
     //return 2 * index; // in case you keep the first index empty
     return 2 * index + 1; // in case you start from the first index.
 }

 public int rightChild(int index){
     return 2 * index + 2; // remember in this cas we start from the first index.
 }

 public int parent(int index){
     return (index - 1 ) / 2;
 }

 private void swap(int index1, int index2){
     int temp = heap.get(index1);
     heap.set(index1,heap.get(index2));
     heap.set(index2,temp);
    }
 public void insert(int value){
     heap.add(value);
     int current = heap.size() - 1;

     while (current > 0 && heap.get(current) > heap.get(parent(current))){
         swap(current,parent(current));
         current = parent(current);
     }
 }
}
