package br.com.shire42.algo.twonumbersum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SimpleTestProgram {

    private SimpleSolution program;

    @BeforeEach
    public void init() {
        program = new SimpleSolution();
    }

    @Test
    public void testTwoNumberSum() {
        int[] array = new int[]{1, 3, 5, 6};
        int targetSum = 8;
        int[] resultWaiting = new int[]{1, 2};

        int[] result =  program.solution(array, targetSum);

        assertArrayEquals(result, resultWaiting);
    }


}
