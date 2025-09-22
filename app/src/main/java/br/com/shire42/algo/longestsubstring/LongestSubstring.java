package br.com.shire42.algo.longestsubstring;

import java.util.HashSet;

//Longest substring without repeating characters
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for(int right=0;right<s.length();right++) {
            while(charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;
    }

    public static void main(String...args) {
        LongestSubstring ls = new LongestSubstring();
        String input = "pwwkew";
        int result = ls.lengthOfLongestSubstring(input);
        System.out.println(result);
    }

}
