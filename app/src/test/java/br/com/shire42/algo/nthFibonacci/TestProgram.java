package br.com.shire42.algo.nthFibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProgram {

    @Test
    public void testOne() {
        assertEquals(5, Program.getNthFib(6));
    }

    @Test
    public void testTwo() {
        assertEquals(1, Program.getNthFib(2));
    }

    @Test
    public void testTree() {
        assertEquals(1, Program.getNthFib(1));
    }

    @Test
    public void testFour() {
        assertEquals(0, Program.getNthFib(1));
    }

}
