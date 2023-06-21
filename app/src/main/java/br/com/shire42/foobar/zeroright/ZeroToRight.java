package br.com.shire42.foobar.zeroright;

public class ZeroToRight {

    public int[] solution(int[] input) {
        int j = 0;

        for (int index=0;index<input.length;index++) {
            if(input[index] != 0) {
                swap(input, j, index);
                j++;
            }
        }
//        [3, 0, 5, 6]

        return input;
    }

    private void swap(int[] array, int source, int target) {
        int tmp = array[source];
        array[source] = array[target];
        array[target] = tmp;
    }

}
