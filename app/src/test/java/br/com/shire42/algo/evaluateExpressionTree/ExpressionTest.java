package br.com.shire42.algo.evaluateExpressionTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionTest {

    private Program program;

    @BeforeEach
    public void setup() {
        program = new Program();
    }

    @Test
    public void TestCase1() {
        Program.BinaryTree tree = new Program.BinaryTree(-1);
        tree.left = new Program.BinaryTree(-2);

        tree.left.left = new Program.BinaryTree(-4);
        tree.left.right = new Program.BinaryTree(2);

        tree.left.left.right = new Program.BinaryTree(3);
        tree.left.left.left = new Program.BinaryTree(2);

        tree.right = new Program.BinaryTree(-3);
        tree.right.left = new Program.BinaryTree(8);
        tree.right.right = new Program.BinaryTree(3);

        var expected = 6;

        var actual = new Program().evaluateExpressionTree(tree);
        assertEquals(expected, actual);
    }

}
