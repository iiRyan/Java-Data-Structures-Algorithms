package com.datastructueres.Heap;

public class Main {
    public static void main(String[] args) {


        // Test case 1
        int[] nums1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        System.out.println("Test case 1:");
        System.out.println("Expected output: 7");
        System.out.println("Actual output: " + findKthSmallest(nums1, k1));
        System.out.println();


        int[] nums2 = {2, 1, 3, 5, 6, 4};
        int k2 = 2;
        System.out.println("Test case 2:");
        System.out.println("Expected output: 2");
        System.out.println("Actual output: " + findKthSmallest(nums2, k2));
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
}
