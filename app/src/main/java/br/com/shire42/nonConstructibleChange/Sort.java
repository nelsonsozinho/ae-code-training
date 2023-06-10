package br.com.shire42.nonConstructibleChange;

import java.util.Arrays;

public class Sort {


    public void sort(int[] array) {
        mergesort(array);
    }

    private void mergesort(int array[]) {
        int length = array.length;

        if(length < 2) return;

        int mid = length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);;
        int[] right = Arrays.copyOfRange(array, mid, length);

        mergesort(left);
        mergesort(right);
        merge(array, left, right);
    }

    private void merge(int array[], int left[], int right[]) {
        int lengthLeft = left.length;
        int lengthRight = right.length;

        int i = 0, j = 0, k = 0;

        while ( (i < lengthLeft) && (j < lengthRight) ) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < lengthLeft) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < lengthRight) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

}
