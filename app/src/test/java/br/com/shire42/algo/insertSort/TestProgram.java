package br.com.shire42.algo.insertSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestProgram {

    @Test
    public void testOne() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        assertArrayEquals(Program.insertionSort(input), expected);
    }

}
