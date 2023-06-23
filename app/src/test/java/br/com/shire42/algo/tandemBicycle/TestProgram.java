package br.com.shire42.algo.tandemBicycle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProgram {

    private Program program;

    @BeforeEach
    public void setup() {
        program = new Program();
    }

    @Test
    public void testOne() {
        int[] red = new int[]{5, 5, 3, 9, 2};
        int[] blue = new int[]{3, 6, 7, 2, 1};
        boolean faster = true;

        int result = program.tandemBicycle(red, blue, faster);
        assertEquals(result, 32);

    }

    @Test
    public void testTwo() {
        int[] red = new int[]{5, 5, 3, 9, 2};
        int[] blue = new int[]{3, 6, 7, 2, 1};
        boolean faster = false;

        int result = program.tandemBicycle(red, blue, faster);
        assertEquals(result, 25);

    }

}
