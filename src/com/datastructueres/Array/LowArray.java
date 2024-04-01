package com.datastructueres;

public class LowArray {

    private Long[] arr; // Ref to the array

    public LowArray(int size) {
        arr = new Long[size];
    }

    public void setElement(int index, Long value) { // Set Value
        arr[index] = value;
    }

    public Long getElement(int index) { // Get Value
        return arr[index];
    }
}