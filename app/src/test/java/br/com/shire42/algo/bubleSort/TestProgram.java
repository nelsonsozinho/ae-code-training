package br.com.shire42.algo.bubleSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestProgram {

    @Test
    public void testOne() {
        int[] input = new int[]{8, 5, 2, 9, 5, 6, 3};
        int[] compare = new int[]{2, 3, 5, 5, 6, 8, 9};
        assertArrayEquals(compare, Program.bubbleSort(input));
    }

    @Test
    public void testTwo() {
        int[] input = new int[]{1};
        int[] compare = new int[]{1};
        assertArrayEquals(compare, Program.bubbleSort(input));
    }

    @Test
    public void testThree() {
        int[] input = new int[]{2, 1};
        int[] compare = new int[]{1, 2};
        assertArrayEquals(compare, Program.bubbleSort(input));
    }

}
