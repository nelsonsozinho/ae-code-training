package br.com.shire42.algo.evaluateExpressionTree;

public class Program {

    public static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int evaluateExpressionTree(BinaryTree tree) {
        return goDeep(tree);
    }

    private int goDeep(BinaryTree root) {
        if(root == null) return 0;

        if(isLeaf(root)) {
            return root.value;
        }

        var left = goDeep(root.left);
        var right = goDeep(root.right);

        return operation(root.value, left, right);
    }

    private boolean isLeaf(BinaryTree tree) {
        return tree.left == null && tree.right == null;
    }

    private int operation(int operation, int left, int right) {
        int result = 0;
        if(operation == -1) {
            result = left + right;
        } else if(operation == -2) {
            result = left - right;
        } else if(operation == -3) {
            result = left / right;
        } else if(operation == -4) {
            result = left * right;
        }

        return result;

    }

}
