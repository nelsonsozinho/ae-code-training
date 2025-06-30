package br.com.shire42.algo.twonumbersum;

//ar = [1,3,5,6]
//target = 8

public class SimpleSolution {

    public int[] solution(int[] input, int target) {

        for(int i=0; i< input.length; i++) {
            for(int j = i+1; j<input.length; j++) {
                if(input[i] + input[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }

}
