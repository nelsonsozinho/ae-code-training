package br.com.shire42.algo.palindromeCheck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProgram {

    @Test
    public void testOne() {
        assertTrue(Program.isPalindrome("abcdcba"));
    }

    @Test
    public void testTwo() {
        assertTrue(Program.isPalindrome("a"));
    }

    @Test
    public void testThree() {
        assertFalse(Program.isPalindrome("ab"));
    }

    @Test
    public void testFour() {
        assertTrue(Program.isPalindrome("abcdefghhgfedcba"));
    }

}
