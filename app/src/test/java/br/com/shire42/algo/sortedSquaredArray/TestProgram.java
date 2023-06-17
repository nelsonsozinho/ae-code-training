package br.com.shire42.algo.sortedSquaredArray;

import br.com.shire42.algo.sortedSquaredArray.Program;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestProgram {

    private Program program;

    @BeforeEach
    public void init() {
        program = new Program();
    }

    @Test
    public void testSquare() {
        int[] input = new int[]{1, 2, 3, 5, 6, 8, 9};

        System.out.println(Arrays.toString(program.sortedSquaredArray(input)));
    }
    @Test
    public void testSquare2() {
        int[] input = new int[]{-2,-1};

        System.out.println(Arrays.toString(program.sortedSquaredArray(input)));
    }

}
