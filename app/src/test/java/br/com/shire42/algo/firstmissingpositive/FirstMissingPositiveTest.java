package br.com.shire42.algo.firstmissingpositive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstMissingPositiveTest {

    private FirstMissingPositive firstMissingPositive;

    @BeforeEach
    public void setup() {
        this.firstMissingPositive = new FirstMissingPositive();
    }

    @Test
    public void testSolution() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int waiting = 10;

        assertEquals(waiting, this.firstMissingPositive.solution(input));
    }

    @Test
    public void testSolution2() {
        int[] input = new int[]{-10, 1, 2, 2, 3, 4, 6, 6, 8};
        int waiting = 5;

        assertEquals(waiting, this.firstMissingPositive.solution(input));
    }

    @Test
    public void testSolution3() {
        int[] input = new int[]{1, 2, 2, 4};
        int waiting = 3;

        assertEquals(waiting, this.firstMissingPositive.solution(input));
    }
    @Test
    public void testSolution4() {
        int[] input = new int[]{1, 2, 4, 5, 6};
        int waiting = 3;

        assertEquals(waiting, this.firstMissingPositive.solution(input));
    }


}
