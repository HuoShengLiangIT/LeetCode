package _111;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        //如果是叶子节点则层数为1
        if (root.left == null && root.right == null)
            return 1;
        //如果不是叶子节点则往下走，并且返回的之前的层数+1
        if (root.left == null && root.right != null)
            return 1 + minDepth(root.right);
        if (root.right == null && root.left != null)
            return 1 + minDepth(root.left);
        //找到最小的深度
        return Math.min((1 + minDepth(root.left)), (1 + minDepth(root.right)));
    }
}
