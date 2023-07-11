package br.com.shire42.algo.bubleSort;

public class Program {

    public static int[] bubbleSort(int[] array) {
        // Write your code here.

        boolean ordered = false;

        if(array.length < 2) {
            return array;
        }

        while(!ordered) {
            for (int i = 0; i < array.length; i++) {
                int next = i+1;

                if(next == array.length)
                    break;

                if(array[next] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[next];
                    array[next] = tmp;
                }
            }

            for (int i = 0; i < array.length; i++) {
                int next = i + 1;

                if(next == array.length)
                    break;

                ordered = true;
                if(array[i] > array[next]) {
                    ordered = false;
                    break;
                }
            }
        }

        return array;
    }

}
