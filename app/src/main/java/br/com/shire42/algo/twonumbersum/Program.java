package br.com.shire42.algo.twonumbersum;

public class Program {

    public int[] twoNumberSum(int[] array, int targetSum) {
        int head = 0;

        if(array.length == 0) {
            return new int[0];
        }

        int[] result = findSum(array, targetSum, 0);

        if(result.length == 0) {
            return new int[0];
        }

        int indexResult1 = result[0];
        int indexResult2 = result[1];

        return new int[]{ array[indexResult2], array[indexResult1] };
    }

    private int[] findSum(int[] array, int targetSum, int head) {
        int index = head;
        int indexCompare = head + 1;

        if(indexCompare == array.length)
            return new int[0];

        while(indexCompare <= array.length - 1) {
            if(array[index] + array[indexCompare] == targetSum) {
                return new int[]{index, indexCompare};
            }

            indexCompare += 1;
        }

        head += 1;

        return findSum(array, targetSum, head);
    }

}
