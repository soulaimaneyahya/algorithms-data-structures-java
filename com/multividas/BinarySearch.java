package com.multividas;

/**
 * Efficient Search in Sorted Arrays
 * Binary Search algorithm finds the position of a target value within a sorted
 * array
 * with logarithmic time complexity O(log n), by repeatedly dividing the search
 * interval in half.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[5000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int target = 1829;

        long startTime = System.nanoTime();
        int result = binarySearch(numbers, target);
        long endTime = System.nanoTime();

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                // Return the index if the target is found
                return mid;
            } else if (array[mid] < target) {
                // Adjust the search interval to the right half
                left = mid + 1;
            } else {
                // Adjust the search interval to the left half
                right = mid - 1;
            }
        }

        // Return -1 if the target is not found in the array
        return -1;
    }
}
