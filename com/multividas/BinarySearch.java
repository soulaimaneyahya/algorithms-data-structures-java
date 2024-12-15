package com.multividas;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[500];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int target = 204;

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
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
