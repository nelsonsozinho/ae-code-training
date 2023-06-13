package br.com.shire42.foobar.getRepeatedNumbers;

public class ArraysNumbersBruteForce {

    public int repeatedNumber(int[] array) {
        return findRepeatedNumber(array);
    }

    private int findRepeatedNumber(int[] array) {

        int index = 0;
        int indexFind = -1;

        while(index < array.length) {

            for(int i=0;i < array.length;i++) {
                if(i != index) {
                    if(array[index] == array[i]) {
                        indexFind = array[index];
                        break;
                    }
                }
            }

            if(indexFind != -1) {
                break;
            }

            index++;
        }

        return indexFind;
    }

}
