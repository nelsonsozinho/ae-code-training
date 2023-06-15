package br.com.shire42.evaluateExpressionTree;

import br.com.shire42.algo.evaluateExpressionTree.Program;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionTest {

    @Test
    public void TestCase1() {
        Program.BinaryTree tree = new Program.BinaryTree(-1);
        tree.left = new Program.BinaryTree(2);
        tree.right = new Program.BinaryTree(-2);
        tree.right.left = new Program.BinaryTree(5);
        tree.right.right = new Program.BinaryTree(1);
        var expected = 6;
        var actual = new Program().evaluateExpressionTree(tree);

        assertEquals(expected, actual);
    }

}
