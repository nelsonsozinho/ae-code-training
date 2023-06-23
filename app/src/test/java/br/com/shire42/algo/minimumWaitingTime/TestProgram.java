package br.com.shire42.algo.minimumWaitingTime;

import br.com.shire42.algo.minimumWaitingTime.Program;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.Serial;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProgram {

    private Program program;

    @BeforeEach
    public void setup() {
        program = new Program();
    }

    @Test
    public void test1() {
        int[] input = new int[]{3, 2, 1, 2, 6};
        int result = program.solution(input);
        assertEquals(17, result);
    }

    @Test
    public void test2() {
        int[] input = new int[]{2, 1, 1, 1};
        int result = program.solution(input);
        assertEquals(6, result);
    }

}
