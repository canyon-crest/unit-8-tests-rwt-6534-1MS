package com.csplusplus;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
        int ret = 0;
        for (int[] x : array) for (int y : x) ret += y;
        return ret;
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
        int ret = 0;
        for (int[] x : array) for (int y : x) ret += value == y ? 1 : 0;
        return ret;
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
        int mx = array[0][0];
        for (int[] x : array) for (int y : x) mx = Math.max(y, mx);
        return mx;
    }

    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
        for (int i = 0; i < array.length / 2; i++) {
        	for (int j = 0; j < array[i].length; j++) {
        		int tmp = array[i][j];
        		array[i][j] = array[array.length - i - 1][j];
        		array[array.length - i - 1][j] = tmp;
        	}
        }
    }

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
        int[][] ret = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) for (int j = 0; j < array[i].length; j++) {
        	ret[j][i] = array[i][j];
        }
        return ret;
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
        int[][] ret = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) for (int j = 0; j < numCols; j++) {
        	ret[i][j] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return ret;
    }
}