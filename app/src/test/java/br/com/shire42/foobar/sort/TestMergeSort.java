package br.com.shire42.foobar.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMergeSort {

    private MergeSort sort;

    @BeforeEach
    public void setup() {
        this.sort = new MergeSort();
    }

    @Test
    public void testSort1() {
        int[] input = new int[]{5, 4, 3, 2, 1};
        int[] ordered = new int[]{1, 2, 3, 4, 5};

        sort.sort(input);

        assertArrayEquals(input, ordered);

    }

}
