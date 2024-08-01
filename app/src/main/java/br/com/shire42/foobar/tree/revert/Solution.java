package br.com.shire42.foobar.tree.revert;

public class Solution {

    public TreeNode inverteTree(TreeNode root) {
        if(root == null) return null;

        inverteTree(root.getLeft());
        inverteTree(root.getRight());

        change(root);

        return root;
    }

    public void change(TreeNode root) {
        var tmp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(tmp);
    }

}
