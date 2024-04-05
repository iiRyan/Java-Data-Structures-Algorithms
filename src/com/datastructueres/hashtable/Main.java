package com.datastructueres.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.set("Galaxy",2);
        myHashTable.set("Apple",20);
        myHashTable.set("Apple",1000);
        myHashTable.set("Seven Up",3);
        myHashTable.set("Rice",20);

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

    }

    public static boolean itemInCommon(int[] arr1, int[] arr2){
        /*
         * using a Boolean value as the value associated with the keys in the HashMap
         * doesn't serve a functional purpose in this particular implementation.
         */
        HashMap<Integer,Boolean> myHashMap = new HashMap<>();

        for (int i : arr1){
            myHashMap.put(i,true);
        }

        /*
        * If myHashMap.get(j) returns a non-null value, it means that j exists in arr1,
        * so it returns true, indicating that there is at least one common element
        * between the arrays.
         */
        for (int j : arr2){
            if(myHashMap.get(j) != null) return true;
        }
        return false;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> numCounts = new HashMap<>();
        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

}
