package _700;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode cur = root;
        while (cur != null) {
            int t = cur.val;
            if (t == val) {
                return cur;
            } else if (t > val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return null;
    }
}