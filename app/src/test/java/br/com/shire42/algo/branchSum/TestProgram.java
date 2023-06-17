package br.com.shire42.algo.branchSum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestProgram {

    private Program porgram;

    @Test
    public void setup() {
        porgram = new Program();
    }

    @Test
    public void testBranchSum() {
        TestBinaryTree tree = new TestBinaryTree(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(15, 16, 18, 10, 11));
        List<Integer> result =  Program.branchSums(tree);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

}
