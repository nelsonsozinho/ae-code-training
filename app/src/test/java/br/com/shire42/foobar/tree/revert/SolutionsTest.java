package br.com.shire42.foobar.tree.revert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SolutionsTest {

    private Solution solution;

    @BeforeEach
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(7);

        TreeNode leftLeft = new TreeNode(1);
        TreeNode leftRight = new TreeNode(3);
        TreeNode rightLeft = new TreeNode(6);
        TreeNode rightRight = new TreeNode(9);

        root.setRight(right);
        root.setLeft(left);

        right.setRight(rightRight);
        right.setLeft(rightLeft);

        left.setLeft(leftLeft);
        left.setRight(leftRight);

        var newRoot = solution.inverteTree(root);

        assertNotNull(newRoot);
    }

}
