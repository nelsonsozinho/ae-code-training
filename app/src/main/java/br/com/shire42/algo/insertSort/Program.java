package br.com.shire42.algo.insertSort;

public class Program {

    public static int[] insertionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int j = i;

            while(j > 0 && array[j] < array[j - 1]) {
                swap(j, j-1, array);
                j -= 1;
            }
        }

        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

}
