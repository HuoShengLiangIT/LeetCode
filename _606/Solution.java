package _606;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class Solution {
    public String tree2str(TreeNode t) {
        if(t==null){
            return "";
        }
        StringBuilder s = new StringBuilder();
        contruct(t,s);
        return s.toString();
    }
    public void contruct(TreeNode t,StringBuilder s){
        s.append(t.val);
        if(t.left!=null){
            s.append("(");
            contruct(t.left,s);
            s.append(")");
        }
        if(t.left==null&&t.right!=null){
            s.append("(");
            s.append(")");
        }
        if(t.right!=null){
            s.append("(");
            contruct(t.right,s);
            s.append(")");
        }
    }
}
