package br.com.shire42.tournamentwinner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProgram {

    private Program program;

    @BeforeEach
    public void init() {
        program = new Program();
    }

    @Test
    public void testTwoNumberSum() {
        final List<List<String>> competitions = new ArrayList<>();
        final List<Integer> results = new ArrayList<>();

        competitions.add(Arrays.asList("HTML", "C#"));
        competitions.add(Arrays.asList("C#", "Python"));
        competitions.add(Arrays.asList("Python", "HTML"));

        results.addAll(Arrays.asList(0, 0, 1));

        String result = program.tournamentWinner((ArrayList)competitions, (ArrayList<Integer>) results);

        assertEquals("Python", result);
    }



}
