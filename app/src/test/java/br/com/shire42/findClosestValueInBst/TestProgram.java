package br.com.shire42.findClosestValueInBst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProgram {

    private Program program;

    @BeforeEach
    public void init() {
        program = new Program();
    }

    @Test
    public void testSquare() {
        Program.BST bst = new Program.BST(0);
        int result = Program.findClosestValueInBst(bst, 10);
        assertEquals(result, 12);
    }

}
