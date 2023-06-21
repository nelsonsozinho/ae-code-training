package br.com.shire42.foobar.zeroright;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestZeroToRight {

    private ZeroToRight solution;

    @BeforeEach
    public void setup() {
        this.solution = new ZeroToRight();
    }

    @Test
    public void testSolution1() {
        int[] input = new int[]{1, 2, 0, 3, 0, 4, 5};
        int[] result = new int[]{1, 2, 3, 4, 5, 0, 0};

        int[] answer = solution.solution(input);

        assertArrayEquals(result, answer);

    }

    @Test
    public void testSolution2() {
        int[] input = new int[]{ 3, 0, 0, 6};
        int[] result = new int[]{ 3, 6, 0, 0};

        int[] answer = solution.solution(input);

        assertArrayEquals(result, answer);

    }



}
