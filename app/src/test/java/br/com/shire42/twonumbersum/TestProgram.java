package br.com.shire42.twonumbersum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProgram {

    private Program program;

    @BeforeEach
    public void init() {
        program = new Program();
    }

    @Test
    public void testTwoNumberSum() {
        int[] array = new int[]{3, 5, -4, 8, 11, -1, 6};
        int targetSum = 10;

        int[] result =  program.twoNumberSum(array, targetSum);

        assertArrayEquals(result, new int[]{-1, 11});
    }

    @Test
    public void testTwoNumbersSumTestCase9() {
        int[] array = new int[]{-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int targetSum = 164;

        int[] result =  program.twoNumberSum(array, targetSum);

        assertArrayEquals(result, new int[]{-1, 11});
    }

}
