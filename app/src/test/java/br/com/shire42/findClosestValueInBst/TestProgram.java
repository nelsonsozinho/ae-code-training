package br.com.shire42.findClosestValueInBst;

import br.com.shire42.algo.findClosestValueInBst.Program;
import org.junit.jupiter.api.Test;

import static br.com.shire42.algo.findClosestValueInBst.Program.BST;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProgram {

    @Test
    public void testSquare() {
        var root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.right = new BST(15);
        root.right.left = new BST(13);
        root.right.left.right = new BST(14);
        root.right.right = new BST(22);

        var expected = 13;
        var actual = Program.findClosestValueInBst(root, 12);
        assertEquals(expected, actual);
    }

    @Test
    public void testSquare2() {
        var root = new BST(100);
        root.left = new BST(5);
        root.right = new BST(502);
        root.right.right = new BST(55000);
        root.right.left = new BST(204);
        root.right.right.right = null;
        root.right.right.left = new BST(1001);
        root.right.right.left.left = null;
        root.right.right.left.right = new BST(4500);
        root.right.right.left.right.right = null;
        root.right.right.left.right.left = null;

        var expected = 1001;
        var actual = Program.findClosestValueInBst(root, 1001);
        assertEquals(expected, actual);
    }

}
