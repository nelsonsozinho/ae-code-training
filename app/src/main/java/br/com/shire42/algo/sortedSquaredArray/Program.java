package br.com.shire42.algo.sortedSquaredArray;

import java.util.Arrays;

public class Program {

    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.

        for (int i=0;i<array.length;i++) {
            array[i] = (int) Math.pow(Math.abs(array[i]), 2);
        }

        Arrays.sort(array);
        return array;
    }

}
