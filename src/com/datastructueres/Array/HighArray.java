package com.datastructueres;

public class HighArray {

    private long[] array;
    private int numberOfElements;

    public HighArray(int max) {
        array = new long[max];
        numberOfElements = 0;
    }

    public void insert(long value) // put element into array
    {
        int j; // This int hold the target index for the new value.

        // Iterate through the elements of the array until we find an element greater
        // than the value.
        for (j = 0; j < numberOfElements; j++) {
            if (array[j] > value) { // use binarySearch method
                break;
            }
        }

        // here we start from the end of the array to shift the element one position
        // ahead.
        for (int k = numberOfElements; k > j; k--) {
            // move bigger ones up
            array[k] = array[k - 1];
        }
        // set the new value in the j index.
        array[j] = value; // insert it
        numberOfElements++; // increment size
    }

    public int binarySearch(long searchKey) {
        int lowBound = 0;
        int upperBond = numberOfElements - 1; // To target the last index
        int mid = 0;
        boolean isFound = false;
        int counter = 0;

        while (!isFound) {
            if (lowBound > upperBond) {
                System.out.println("Not Found");
                break;
            }
            counter++;
            mid = (lowBound + upperBond) / 2;
            if (array[mid] == searchKey) {
                System.out.println("Number has been found , Counter = " + counter);
                isFound = true;
                return mid;

            }
            if (array[mid] < searchKey) {
                lowBound = mid + 1;
            }
            if (array[mid] > searchKey) {
                upperBond = mid - 1;
            }
        }
        return -1;
    }

    public boolean linearSearch(long searchKey) {

        for (int i = 0; i < numberOfElements; i++) {
            if (array[i] == searchKey) {
                return true;
            }
        }
        return false;
    }

    public boolean delete(long value) {
        for (int i = 0; i < numberOfElements; i++) {
            if (value == array[i]) {
                // Delete the element by shifting elements to the left
                for (int j = i; j < numberOfElements - 1; j++) {
                    array[j] = array[j + 1];
                }
                numberOfElements--; // Decrement the number of elements
                return true; // Return true since deletion was successful
            }
        }
        return false; // If the value is not found, return false
    }

    public void display() {
        System.out.print("{");
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(array[i]);
            if (i != numberOfElements - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }

}
