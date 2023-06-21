package br.com.shire42.foobar.zeroright;

public class MyZeroToRight {

    public int[] solution(int[] input) {
        int j = 0;

        for(int index = 0; index <= input.length; index++) {
            if(input[index] != 0) {
                swap(input, j, index);
                j++;
            }
        }

        //[2, 0 , 7, 9]

        return input;
    }

    private void swap(int[] array, int j, int index) {
       int tmp = array[j];
       array[j] = array[index];
       array[index] = tmp;
    }

}
