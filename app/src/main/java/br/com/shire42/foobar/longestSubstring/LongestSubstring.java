package br.com.shire42.foobar.longestSubstring;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public int findLongestSubstring(String input, int k) {
        int maxLen = 0;
        int start = 0;

        Map<Character, Integer> charFreq = new HashMap<>();

        for (int end = 0; end < input.length(); end++) {
            charFreq.put(input.charAt(end), charFreq.getOrDefault(input.charAt(end), 0) + 1);

            while (charFreq.size() > k) {
                charFreq.put(input.charAt(start), charFreq.get(input.charAt(start)) - 1);
                if (charFreq.get(input.charAt(start)) == 0) {
                    charFreq.remove(input.charAt(start));
                }
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

}
