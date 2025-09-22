package br.com.shire42.algo.arrayRotation;

import java.util.Arrays;

public class ArrayRotation {

    //[1, 2, 3, 4, 5, 6, 7]
    //[7, 6, 5, 4, 3, 2, 1]
    //[5, 6, 7, 1, 2, 3, 4]
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1); //0 -> (3-1)
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String...args) {
        ArrayRotation rotation = new ArrayRotation();
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        rotation.rotate(input, 3);
        System.out.println(Arrays.toString(input));
    }

}
