package br.com.shire42.algo.binarySearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProgramTwo {

    private ProgramTwo program;

    @BeforeEach
    public void setup() {
        program = new ProgramTwo();
    }

    @Test
    public void testOne() {
        int result = program.binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33);
        assertEquals(result, 3);
    }

    @Test
    public void testTwo() {
        int result = program.binarySearch(new int[]{1, 5, 23, 111}, 111);
        assertEquals(result, 3);
    }

}
