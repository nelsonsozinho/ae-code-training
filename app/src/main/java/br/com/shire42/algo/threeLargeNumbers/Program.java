package br.com.shire42.algo.threeLargeNumbers;

import java.util.Arrays;

public class Program {

    public static int[] findThreeLargestNumbers(int[] array) {
        Arrays.sort(array);

        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MIN_VALUE;
        int value3 = Integer.MIN_VALUE;

        for (int valueArray : array) {
            if(valueArray > value1 || valueArray > value2 || valueArray > value3) {
                int tmp = value1;
                value1 = valueArray;

                int tmp2 = value2;
                value2 = tmp;

                value3 = tmp2;
            }
        }
        return new int[]{value3, value2, value1};
    }

}
