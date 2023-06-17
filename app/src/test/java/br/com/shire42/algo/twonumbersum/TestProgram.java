package br.com.shire42.algo.twonumbersum;

import br.com.shire42.algo.twonumbersum.Program;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


}
