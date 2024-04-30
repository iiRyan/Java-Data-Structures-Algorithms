package com.datastructueres.Heap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Test case 1
        int[] nums1 = {1, 5, 2, 9, 3, 6, 8};
        System.out.println("Test case 1:");
        System.out.println("Input: [1, 5, 2, 9, 3, 6, 8]");
        System.out.println("Expected output: [1, 5, 5, 9, 9, 9, 9]");
        System.out.println("Actual output: " + streamMax(nums1));
        System.out.println();
    }

    public static int findKthSmallest(int[] nums, int k) {
        // Initialize a new Heap instance.
        Heap maxHeap = new Heap();

        // Iterate over every number in the input array.
        for (int num : nums) {
            // Insert current number into the heap.
            // Heap property is maintained after each insertion.
            maxHeap.insert(num);

            // Check if heap size exceeds 'k'.
            if (maxHeap.getHeap().size() > k) {
                // If size exceeds 'k', remove the largest number.
                // Heap property is maintained after each removal.
                maxHeap.remove();
            }
        }

        // At this point, the heap contains the smallest 'k' numbers.
        // The largest number in the heap is the kth smallest number in the array.
        // Therefore, we remove and return it.
        return maxHeap.remove();
    }




    public static List<Integer> streamMax(int[] nums) {
        // Create an instance of a max-heap
        Heap maxHeap = new Heap();

        // Prepare a list to store the max of the stream so far
        List<Integer> maxStream = new ArrayList<>();

        // For each number in the given array
        for (int num : nums) {
            // Insert the current number into the max-heap
            maxHeap.insert(num);

            // After insertion, the max of the heap (which is also
            // the max of the stream so far) is at the root. Add this
            // root to the maxStream list
            maxStream.add(maxHeap.getHeap().get(0));
        }

        // After iterating over all the numbers, return the maxStream list
        // that contains the running maximum of the input stream
        return maxStream;
    }



}
