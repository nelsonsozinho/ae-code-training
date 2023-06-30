package br.com.shire42.foobar.roundedArray;

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
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int round = 2;
        int[] check = new int[]{5, 6, 1, 2, 3, 4};
        int[] result = program.roundedArray(input, round);
        assertArrayEquals(check, result);

    }


    @Test
    public void testTwo() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int round = 4;
        int[] check = new int[]{3, 4, 5, 6, 1, 2};
        int[] result = program.roundedArray(input, round);
        assertArrayEquals(check, result);

    }

    @Test
    public void testThree() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int round = 6;
        int[] check = new int[]{1, 2, 3, 4, 5, 6};
        int[] result = program.roundedArray(input, round);
        assertArrayEquals(check, result);

    }

}
