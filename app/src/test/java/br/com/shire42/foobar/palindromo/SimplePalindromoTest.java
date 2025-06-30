package br.com.shire42.foobar.palindromo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplePalindromoTest {

    private SimplePalindrome palindrome;

    @BeforeEach
    public void setup() {
        this.palindrome = new SimplePalindrome();
    }

    @Test
    public void testSuccess() {
        String input = "civic";
        boolean output = true;

        assertEquals(output, this.palindrome.isPalindrome(input));
    }

    @Test
    public void test2() {
        String input = "abbca";
        boolean output = false;

        assertEquals(output, this.palindrome.isPalindrome(input));
    }

    @Test
    public void test3() {
        String input = "a";
        boolean output = true;

        assertEquals(output, this.palindrome.isPalindrome(input));
    }

    @Test
    public void test4() {
        String input = "ab";
        boolean output = false;

        assertEquals(output, this.palindrome.isPalindrome(input));
    }

}
