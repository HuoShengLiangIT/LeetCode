package _110;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(deep(root.left) - deep(root.right)) <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        } else {
            return false;
        }
    }

    public int deep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int r = 0, l = 0;
        if (root.right != null) {
            r = deep(root.right);
        }
        if (root.left != null) {
            l = deep(root.left);
        }
        return (r > l ? r : l) + 1;
    }
}
