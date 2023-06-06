package br.com.shire42.nonConstructibleChange;

public class Sort {


    public void sort(int[] array) {
        mergesort(array);
    }

    private void mergesort(int array[]) {
        int n = array.length;

        if (n < 2) return;

        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];

        for (int i = 0; i < mid; i++)
            left[i] = array[i];

        for (int i = mid; i < n; i++)
            right[i - mid] = array[i];

        mergesort(left);
        mergesort(right);
        merge(array, left, right);
    }

    private void merge(int array[], int left[], int right[]) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;

        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < nL) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < nR) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

}
