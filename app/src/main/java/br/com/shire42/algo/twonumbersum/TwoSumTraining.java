package br.com.shire42.algo.twonumbersum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//[2,7,11,15]
//9
//o(n)2
public class TwoSumTraining {

    public int[] solution(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int tmp = k - nums[i];

            if(map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(tmp, i);
            }
        }

        return null;
    }

    public static void main(String...args) {
        TwoSumTraining training = new TwoSumTraining();

        int k = 6;
        int[] input = {3,3};

        int[] result = training.solution(input, k);

        System.out.println(Arrays.toString(result));
    }

}
