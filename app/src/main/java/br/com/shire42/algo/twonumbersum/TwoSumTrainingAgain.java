package br.com.shire42.algo.twonumbersum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//[2,7,11,15]
//9
//o(n)2
public class TwoSumTrainingAgain {

    public int[] solution(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int tmpResult = k - nums[i];
            if(map.containsKey(tmpResult)) {
                return new int[]{i, map.get(tmpResult)};
            }
            map.put(nums[i], i);

        }

        return new int[]{};
    }

    public static void main(String...args) {
        TwoSumTrainingAgain training = new TwoSumTrainingAgain();

        int k = 6;
        int[] input = {3,3};

        int[] result = training.solution(input, k);

        System.out.println(Arrays.toString(result));
    }

}
