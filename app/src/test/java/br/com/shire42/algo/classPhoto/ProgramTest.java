package br.com.shire42.algo.classPhoto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramTest {

    private Program program;

    @BeforeEach
    public void setup() {
        program = new Program();
    }

    @Test
    public void test1() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5));
        boolean expected = true;
        boolean actual = new Program().classPhotos(redShirtHeights, blueShirtHeights);
        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5));
        boolean expected = true;
        boolean actual = new Program().classPhotos(blueShirtHeights, redShirtHeights);
        assertEquals(actual, expected);
    }

    @Test
    public void test3() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(2, 4, 7, 5, 1));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 8, 2));
        boolean expected = true;
        boolean actual = new Program().classPhotos(blueShirtHeights, redShirtHeights);
        assertEquals(actual, expected);
    }

    @Test
    public void test4() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 6));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 4));
        boolean expected = true;
        boolean actual = new Program().classPhotos(blueShirtHeights, redShirtHeights);
        assertEquals(actual, expected);
    }

}
