package br.com.shire42.algo.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProgram {

    @Test
    public void testOne() {
        int result = Program.binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33);
        assertEquals(result, 3);
    }

    @Test
    public void testTwo() {
        int result = Program.binarySearch(new int[]{1, 5, 23, 111}, 111);
        assertEquals(result, 3);
    }

}
