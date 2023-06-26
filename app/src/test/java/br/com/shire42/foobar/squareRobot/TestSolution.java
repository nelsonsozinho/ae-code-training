package br.com.shire42.foobar.squareRobot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSolution {

    private Solution solution;


    @BeforeEach
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void tetOne() {
        String[] input = new String[]{
                "...X..",
                "....XX",
                "..X..."};
        int result = solution.solution(input);
        assertEquals(6, result);
    }

    @Test
    public void tetTwo() {
        String[] input = new String[]{
                "....X..",
                "X......",
                ".....X.",
                "......."};
        int result = solution.solution(input);
        assertEquals(15, result);
    }

}
