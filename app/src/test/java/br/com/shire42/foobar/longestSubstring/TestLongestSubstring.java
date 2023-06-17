package br.com.shire42.foobar.longestSubstring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLongestSubstring {

    private LongestSubstring longest;

    @BeforeEach
    public void setup() {
        longest = new LongestSubstring();
    }

    @Test
    public void testLongestText() {
        String input = "ababcbcca";
        int k = 2;
        assertEquals(longest.findLongestSubstring(input, k), 5);
    }

    @Test
    public void testLongestText2() {
        String input = "aabbcc";
        int k = 2;
        assertEquals(longest.findLongestSubstring(input, k), 2);
    }

}
