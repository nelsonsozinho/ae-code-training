package br.com.shire42.foobar.getRepeatedNumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGetRepeatedNumbers {

    private ArrayNumbers an;
    private ArraysNumbersBruteForce anbt;

    @BeforeEach
    public void setup() {
        anbt = new ArraysNumbersBruteForce();
        an = new ArrayNumbers();
    }

    @Test
    public void testGetRepeatedNumber() {
        int[] array = new int[]{1, 2, 3, 3, 4, 5};
        int number = an.repeatedNumber(array);
        assertEquals(number, 3);
    }

    @Test
    public void testBruteForce() {
        int[] array = new int[]{1, 2, 3, 3, 4, 5};
        int number = anbt.repeatedNumber(array);
        assertEquals(number, 3);
    }

    @Test
    public void testBruteForce2() {
        int[] array = new int[]{1, 1, 2, 3, 4, 5};
        int number = anbt.repeatedNumber(array);
        assertEquals(number, 1);
    }

    @Test
    public void testBruteForce3Empty() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int number = anbt.repeatedNumber(array);
        assertEquals(number, -1);
    }

}
