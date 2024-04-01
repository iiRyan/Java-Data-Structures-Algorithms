package com.datastructueres.Queue;

public class Main {

    public static void main(String[] args) {
//        Queue myQueue = new Queue(5);
//
//        myQueue.enqueue(10);
//        myQueue.enqueue(3);
//
//        System.out.println(myQueue.dequeue().value);
//        myQueue.printAll();

        int[] arr = {1,1,1,3,3,4,3,2,4,2};
       System.out.println(containsDuplicate(arr));


    }

    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0;i <nums.length;i++){
            for (int j = i + 1; j < nums.length ; j++) {
                if( nums[i] == nums[j]) return true;
            }
        }
        return false;
    }


}
