package br.com.shire42.nonConstructibleChange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSort {

    private Sort sort;

    @BeforeEach
    public void init() {
        sort = new Sort();
    }

    @Test
    public void testMergeSort() {
        int[] array = new int[]{4,3,2,1};
        sort.sort(array);
        assertArrayEquals(array, new int[]{1, 2, 3, 4});
    }

    @Test
    public void testMergeSort2() {
        int[] array = new int[]{2,1};
        sort.sort(array);
        assertArrayEquals(array, new int[]{1, 2});
    }

    @Test
    public void testMergeSort3() {
        int[] array = new int[]{7, 6, 5, 4, 3, 2, 1};
        sort.sort(array);
        assertArrayEquals(array, new int[]{1, 2, 3, 4, 5, 6, 7});
    }

}
