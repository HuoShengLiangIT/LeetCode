package _145;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    //迭代解法
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
            list.addFirst(node.val);
        }
        return list;
    }

    //递归解法
    public List<Integer> postorderTraversal1(TreeNode root) {
        List list = new ArrayList();
        helper(root, list);
        return list;
    }

    private void helper(TreeNode root, List list) {
        if (root == null) return;
        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);
    }

}
