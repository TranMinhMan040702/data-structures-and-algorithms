package com.criscode.dsal.data_structures.arrays;

import java.util.Arrays;

public class MergeSortedArray {

    private int[] mergeSortedArray(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] result = new int[length];
        int m = 0, n = 0, k = 0;

        if (array1.length == 0) {
            return array2;
        }

        if (array2.length == 0) {
            return array1;
        }

        while (m < array1.length && n < array2.length) {
            if (array1[m] < array2[n]) {
                result[k] = array1[m];
                m++;
            } else {
                result[k] = array2[n];
                n++;
            }
            k++;
        }

        while (m < array1.length) {
            result[k] = array1[m];
            k++;
            m++;
        }

        while (n < array2.length) {
            result[k] = array2[n];
            k++;
            n++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{0, 3, 4, 31};
        int[] array2 = new int[]{2, 6, 30};

        MergeSortedArray object = new MergeSortedArray();

        System.out.println(Arrays.toString(object.mergeSortedArray(array1, array2)));
    }

}
