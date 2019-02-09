package _101;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return fun(root, root);

    }

    public static boolean fun(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return (t1.val == t2.val)
                && fun(t1.right, t2.left)
                && fun(t1.left, t2.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}