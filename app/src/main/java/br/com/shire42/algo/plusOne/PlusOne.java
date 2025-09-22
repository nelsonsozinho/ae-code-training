package br.com.shire42.algo.plusOne;

import java.util.Arrays;

public class PlusOne {

    //[1, 2, 3]
    //123
    //number = string to number
    //number + 1
    public int[] solution(int[] numbers) {
        StringBuilder builder = new StringBuilder();

        for(int num : numbers) {
            builder.append(num);
        }

        char[] numberConcat = Integer.toString(Integer.parseInt(builder.toString()) + 1).toCharArray();
        int[] result = new int[numberConcat.length];

        for(int i=0;i<numberConcat.length;i++) {
            result[i] = Integer.parseInt(Character.toString(numberConcat[i]));
        }

        return result;
    }

    public static void main(String...args) {
        PlusOne plusOne = new PlusOne();
        int[] input = {4,3,2,1};
        int[] result = plusOne.solution(input);
        System.out.println(Arrays.toString(result));
    }

}
