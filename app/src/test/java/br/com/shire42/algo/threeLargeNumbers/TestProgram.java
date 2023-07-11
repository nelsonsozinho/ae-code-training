package br.com.shire42.algo.threeLargeNumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestProgram {

    private Program program;

    @BeforeEach
    public void setup() {
        program = new Program();
    }

    @Test
    public void testOne() {
        int[] input = new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        var output = Program.findThreeLargestNumbers(input);
        assertArrayEquals(output, new int[]{18, 141, 541});
    }

    @Test
    public void testTwo() {
        int[] input = new int[]{-1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7};
        var output = Program.findThreeLargestNumbers(input);
        assertArrayEquals(output, new int[]{-2, -1, 7});
    }

}
