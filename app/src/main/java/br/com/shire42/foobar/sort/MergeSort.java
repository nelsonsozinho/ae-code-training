package br.com.shire42.foobar.sort;

import java.util.Arrays;

public class MergeSort {


    public void sort(int[] array) {
        mergesort(array);
    }

    private void mergesort(int[] array) {
        int length = array.length;

        if(length < 2) return;

        int mid = length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);;
        int[] right = Arrays.copyOfRange(array, mid, length);

        mergesort(left);
        mergesort(right);
        merge(array, left, right);
    }

    private void merge(int[] array, int[] left, int[] right) {
        int lengthLeft = left.length;
        int lengthRight = right.length;

        int indexLeft = 0, indexRight = 0, indexInput = 0;

        while ( (indexLeft < lengthLeft) && (indexRight < lengthRight) ) {
            if (left[indexLeft] <= right[indexRight]) {
                array[indexInput] = left[indexLeft];
                indexLeft++;
            } else {
                array[indexInput] = right[indexRight];
                indexRight++;
            }

            indexInput++;
        }

        while (indexLeft < lengthLeft) {
            array[indexInput] = left[indexLeft];
            indexLeft++;
            indexInput++;
        }

        while (indexRight < lengthRight) {
            array[indexInput] = right[indexRight];
            indexRight++;
            indexInput++;
        }
    }

}
