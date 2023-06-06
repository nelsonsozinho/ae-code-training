package br.com.shire42.nonConstructibleChange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProgram {

    private Program program;
    private Sort sort;

    @BeforeEach
    public void init() {
        program = new Program();
    }

    @Test
    public void testSquare() {
        int coins[] = new int[]{5, 7, 1, 1, 2, 3, 22};
        //sorted = [1, 1, 2, 3, 5, 7, 22]
        int result = program.nonConstructibleChange(coins);
        assertEquals(result, 20);
    }


}
