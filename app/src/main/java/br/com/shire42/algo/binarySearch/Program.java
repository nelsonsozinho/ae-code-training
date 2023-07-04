package br.com.shire42.algo.binarySearch;

public class Program {

    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        return walkingThrough(array, target, 0, array.length - 1);
    }

    private static int walkingThrough(int[] array, int target, int left, int right) {
        if(left > right) {
            return -1;
        }

        int middle = Math.round((left + right) / 2f);
        int potentialMatch = array[middle];
        if(target == potentialMatch)
            return middle;
        else if(target < potentialMatch) {
            return walkingThrough(array, target, left, middle - 1);
        } else {
            return walkingThrough(array, target, middle + 1, right);
        }

    }

}
