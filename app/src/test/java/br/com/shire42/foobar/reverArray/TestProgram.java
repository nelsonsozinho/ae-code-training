package br.com.shire42.foobar.reverArray;

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
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] test = new int[]{7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(test, program.solution(input));
    }

    @Test
    public void testTwo() {
        int[] input = new int[]{1, 2, 3};
        int[] test = new int[]{3, 2, 1};
        assertArrayEquals(test, program.solution(input));
    }

    @Test
    public void testThree() {
        int[] input = new int[]{9, 10 , 22, 33, 44, 55, 66};
        int[] test = new int[]{66, 55, 44, 33, 22, 10, 9};
        assertArrayEquals(test, program.solution(input));
    }

}
