package _965;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        int t = root.val;
        int l=-1,r=-1;
        if(root.right!=null){
            r = root.right.val;
            if(t!=r)
                return false;
        }
        if(root.left!=null){
            l =root.left.val;
            if(t!=l)
                return false;
        }
        if(l!=-1&&r!=-1&&l!=r){
            return false;
        }
        return isUnivalTree(root.right)&isUnivalTree(root.left);
    }
}