package com.multividas;

public class Array {
    // default value of an int field, like count, is 0
    private int count;
    private int[] items;

    /**
     * Constructor to initialize the array with a specific size.
     * 
     * @param size
     */
    public Array(int size) {
        items = new int[size];
    }

    /**
     * Insert value
     * 
     * @param value
     */
    public void insert(int value) {
        // Insert the value at the end
        items[count++] = value;
    }

    /**
     * remove value at index
     * 
     * @param index
     */
    public void removeAt(int index) {
        // Validate the index
        if (!(index >= 0 && index < count)) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        System.out.println("Removing at index: " + index);

        // Shift elements to the left to fill the gap
        for (int i = index; i < count - 1; i++) {
            System.out.println("Deleting element at index: " + i);
            items[i] = items[i + 1];
        }

        /**
         * Clear the last element
         * (optional but good practice)
         */
        items[count - 1] = 0;

        count--;
    }

    /**
     * Method to print all elements in the array
     */
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
