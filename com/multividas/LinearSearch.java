package com.multividas;

/**
 * Frequent Access by Index
 * Arrays allow direct access to any element using its index with constant time
 * complexity O(1).
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = new int[5000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int target = 1829;

        long startTime = System.nanoTime();
        int result = linearSearch(numbers, target);
        long endTime = System.nanoTime();

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                // Return the index if the target is found
                return i;
            }
        }

        // Return -1 if the target is not found in the array
        return -1;
    }
}
