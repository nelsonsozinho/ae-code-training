package br.com.shire42.algo.nodeDeep;

import java.util.Objects;

public class Program {

    public static int nodeDepths(BinaryTree root) {
        int pathCount = 0;
        return walkInNodeDeep(root, pathCount);
    }

    public static class BinaryTree {
        int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    private static int walkInNodeDeep(BinaryTree root, int pathCount) {
        if (Objects.isNull(root)) {
            return 0;
        }

        return pathCount + walkInNodeDeep(root.left, pathCount + 1) + walkInNodeDeep(root.right, pathCount + 1);
    }


}
