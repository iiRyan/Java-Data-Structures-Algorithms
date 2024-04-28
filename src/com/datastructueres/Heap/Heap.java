package com.datastructueres.Heap;

import java.util.*;

public class Heap {
    List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap); // The reason we sent a copy of the Heap , we don't give anyone access to the heap.
    }

    public int leftChild(int index) {
        //return 2 * index; // in case you keep the first index empty
        return 2 * index + 1; // in case you start from the first index.
    }

    public int rightChild(int index) {
        return 2 * index + 2; // remember in this cas we start from the first index.
    }

    public int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        while (current > 0 && heap.get(current) > heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public Integer remove() {
        if (heap.isEmpty()) {
            return null;
        }
        // in case there's only one item , just remove it.
        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int maxValue = heap.get(0);
        // get last index of the Array
        int lastIndex = heap.remove(heap.size() - 1);

        // remove the last item "bottom right" and then
        // move it to the root, And remove it.
        heap.set(0, lastIndex);
        sinkDown(0);

        return maxValue;
    }

    public void sinkDown(int index) {
        int maxValue = index;


        while (true) {
            int leftChild = leftChild(index);
            int rightChild = rightChild(index);

            if (leftChild < heap.size() && heap.get(leftChild) > heap.get(maxValue)) {
                maxValue = leftChild;
            }
            if (rightChild < heap.size() && heap.get(rightChild) > heap.get(maxValue)) {
                maxValue = rightChild;
            }

            if (maxValue != index) {
                swap(index, maxValue);
                index = maxValue;
            } else {
                return;
            }
        }

    }



}
