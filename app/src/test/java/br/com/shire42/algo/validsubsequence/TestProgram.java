package br.com.shire42.algo.validsubsequence;

import br.com.shire42.algo.validsubsequence.Program;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProgram {

    private Program program;

    @BeforeEach
    public void init() {
        program = new Program();
    }

    @Test
    public void testTwoNumberSum() {
        final List<Integer> array = new ArrayList<>();
        final List<Integer> sequence = new ArrayList<>();

        array.add(5);
        array.add(1);
        array.add(2);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);

        sequence.add(1);
        sequence.add(6);
        sequence.add(-1);
        sequence.add(10);


        final Boolean result = program.isValidSubsequence(array, sequence);

        assertTrue(result);
    }

    @Test
    public void testSequenceWitheuenceHighThenArray() {
        final List<Integer> array = new ArrayList<>();
        final List<Integer> sequence = new ArrayList<>();

        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);

        sequence.add(5);
        sequence.add(1);
        sequence.add(22);
        sequence.add(22);
        sequence.add(22);
        sequence.add(25);
        sequence.add(26);
        sequence.add(-1);
        sequence.add(8);
        sequence.add(10);


        final Boolean result = program.isValidSubsequence(array, sequence);

        assertFalse(result);
    }

    @Test
    public void testSequenceWithSequencesWithOnes() {
        final List<Integer> array = new ArrayList<>();
        final List<Integer> sequence = new ArrayList<>();

        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);

        sequence.add(5);
        sequence.add(1);
        sequence.add(22);
        sequence.add(22);
        sequence.add(25);
        sequence.add(6);
        sequence.add(-1);
        sequence.add(8);
        sequence.add(10);

        final Boolean result = program.isValidSubsequence(array, sequence);

        assertFalse(result);
    }

    @Test
    public void testSequenceWithEqualsSequence() {
        final List<Integer> array = new ArrayList<>();
        final List<Integer> sequence = new ArrayList<>();

        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);

        sequence.add(1);
        sequence.add(1);
        sequence.add(1);

        final Boolean result = program.isValidSubsequence(array, sequence);

        assertTrue(result);
    }

    @Test
    public void testSequenceWithLessSequence() {
        final List<Integer> array = new ArrayList<>();
        final List<Integer> sequence = new ArrayList<>();

        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);

        sequence.add(1);
        sequence.add(6);
        sequence.add(-1);
        sequence.add(5);

        final Boolean result = program.isValidSubsequence(array, sequence);

        assertFalse(result);
    }

    @Test
    public void testSequenceWithLessSequence1() {
        final List<Integer> array = new ArrayList<>();
        final List<Integer> sequence = new ArrayList<>();

        array.add(1);
        array.add(1);
        array.add(6);
        array.add(1);

        sequence.add(1);
        sequence.add(1);
        sequence.add(1);
        sequence.add(6);

        final Boolean result = program.isValidSubsequence(array, sequence);

        assertFalse(result);
    }


}
