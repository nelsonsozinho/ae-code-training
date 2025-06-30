package br.com.shire42.foobar.palindromo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplePalindromoTest {

    private MultiplePalindrome palindrome;

    @BeforeEach
    public void setup() {
        this.palindrome = new MultiplePalindrome();
    }

    @Test
    public void testSuccess() {
        String input = "abaadd";
        String output = "aba";

        assertEquals(output, this.palindrome.solution(input));
    }

    @Test
    public void test2() {
        String input = "abbca";
        String output = "bb";

        assertEquals(output, this.palindrome.solution(input));
    }

}
