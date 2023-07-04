package br.com.shire42.algo.binarySearch;

public class ProgramTwo {

    public int binarySearch(int[] array, int target) {
        return binarySearchHelper(array, target, 0, array.length - 1);
    }

    private int binarySearchHelper(int[] array, int target, int left, int right) {
        if(left > right)
            return -1;

        int middle = Math.round((left + right) / 2f);
        int match = array[middle];

        if(match == target){
            return middle;
        } else if(match > target) {
            return binarySearchHelper(array, target, left, middle -1);
        } else {
            return binarySearchHelper(array, target, middle + 1, right);
        }
    }

}
