package br.com.shire42.algo.branchSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Program {

    public static class BinaryTree {
        int value;
        protected BinaryTree left;
        protected BinaryTree right;

        protected BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> path = new ArrayList<>();
        walkTree(path, root, 0);
        return path;
    }

    private static void walkTree(List<Integer> sumPath, BinaryTree root, int sum) {
        int tmpSum = sum;

        if (root == null) {
            return;
        }

        tmpSum += root.value;

        if(Objects.isNull(root.left) && Objects.isNull(root.right)) {
            sumPath.add(tmpSum);
            return;
        }

        walkTree(sumPath, root.left, tmpSum);
        walkTree(sumPath, root.right, tmpSum);
    }
}
