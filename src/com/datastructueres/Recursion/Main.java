package com.datastructueres.Recursion;

public class Main {

    public static void main(String[] args) {


        //          start        end
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        reversArrayRecursively(array,0,array.length -1);

        for (int element : array) {
            System.out.print(element + ", ");
        }


    }

    public static int factorial(int n) {
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }

    public static void printNumbers(int n) {
        if (n == 0) return;

        printNumbers(n - 1);
        System.out.print(n + ", ");
    }

    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) return 1; // Any number raised to the power of 0 is 1

        return base * calculatePower(base, exponent - 1);
    }


    /**
     * // "Hello" is entered. The method then calls itself with "ello" and will return the result + "H"
     * // "ello" is entered. The method calls itself with "llo" and will return the result + "e"
     * // "llo" is entered. The method calls itself with "lo" and will return the result + "l"
     * // "lo" is entered. The method calls itself with "o" and will return the result + "l"
     * // "o" is entered. The method will hit the if condition and return "o"
     * //  So now on to the results:
     * //  The total return value will give you the result of the recursive call's plus the first char
     * //  To the return from 5 will be: "o"
     * //  The return from 4 will be: "o" + "l"
     * //  The return from 3 will be: "ol" + "l"
     * //  The return from 2 will be: "oll" + "e"
     * //  The return from 1 will be: "olle" + "H"
     * //  This will give you the result of "olleH"
     */
    public static String reverse(String str) {
        if ((str == null) || (str.length() <= 1)) { // Base case
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        // Base case: if start index is greater than or equal to end index, stop recursion
        // (indicating that the entire array has been reversed)
        if (start >= end) {
            return;
        }

        // Swap elements at start and end indices
        // (you can use a temporary variable for swapping)

        // Recursively reverse the remaining subarray
    }


    public static void reversArrayRecursively(int[] array,int start,int end){
        if(start >= end){
            return;
        }
        int temp;

        temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        reversArrayRecursively(array,start+1,end-1);

    }



    public static void reversArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        System.out.println("The Array before: ");
        for (int element : arr) {
            System.out.print(element + ", ");
        }
        int[] tempArr = new int[arr.length];
        while (start <= arr.length - 1) {
            tempArr[start] = arr[end];
            start++;
            end--;
        }
        System.out.println();
        System.out.println("The Array after: ");

        for (int element : tempArr) {
            System.out.print(element + ", ");
        }
    }
}
