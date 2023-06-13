package br.com.shire42.algo.nonConstructibleChange;

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
        int[] right = Arrays.copyOfRange(array, mid, length - 1);

        mergesort(left);
        mergesort(right);
        merge(array, left, right);

    }

    private void merge(int array[], int left[], int right[]) {
        int leftLength = left.length;
        int rightLength = right.length;

        int indexLeft = 0;
        int indexRight = 0;
        int indexK = 0;

        while(indexLeft < leftLength && indexRight < rightLength) {
            if(left[indexLeft] <= right[indexRight]) {
                array[indexK] = left[indexLeft];
                indexLeft++;
            } else {
                array[indexK] = right[indexRight];
                indexRight++;
            }

            indexK++;
        }

        while(indexLeft < leftLength) {
            array[indexK] = left[indexLeft];
            indexLeft++;
            indexK++;
        }

        while(indexRight < rightLength) {
            array[indexK] = right[indexRight];
            indexRight++;
            indexK++;
        }

    }

}
