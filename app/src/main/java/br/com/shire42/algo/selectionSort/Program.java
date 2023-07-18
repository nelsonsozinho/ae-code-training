package br.com.shire42.algo.selectionSort;

public class Program {

    public static int[] selectionSort(int[] array) {
        // Write your code here.
        int currentIndex = 0;
        while(currentIndex < array.length - 1) {
            int smallerIndex = currentIndex;

            for(int i = currentIndex + 1; i < array.length; i++) {
                if(array[smallerIndex] > array[i]) {
                    smallerIndex = i;
                }
            }
            swap(smallerIndex, currentIndex, array);
            currentIndex += 1;
        }

        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

}
