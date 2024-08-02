package com.logic;

import java.util.Arrays;

public class SortAndZeroesToEnd {

	public static void main(String[] args) {
        int[] arr = {0, 5, 2, 0, 8, 1, 0};

        sortAndMoveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void sortAndMoveZeroes(int[] arr) {
        int n = arr.length;

        // Sort the array while maintaining relative order
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Fill the remaining positions with zeroes
        while (count < n) {
            arr[count++] = 0;
        }
    }
}