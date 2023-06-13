package br.com.shire42.algo.findClosestValueInBst;

import java.util.Objects;

public class Program {

    public static int findClosestValueInBst(BST tree, int target) {
        var closeNumber = tree.value;
        return findCloseNumber(tree, target, closeNumber);
    }

    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    private static int findCloseNumber(BST root, int target, int close) {
        if(Objects.isNull(root) )
            return close;

        if(root.value == target)
            return root.value;

        if( Math.abs(root.value - target) <= Math.abs(close - target))  {
            close = root.value;
        }

        if(target > root.value) {
            return findCloseNumber(root.right, target, close);
        } else {
            return findCloseNumber(root.left, target, close);
        }
    }

}
