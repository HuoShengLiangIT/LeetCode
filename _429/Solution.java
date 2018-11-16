package _429;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> listlist = new ArrayList<>();
        LinkedList<Node> nodelist = new LinkedList<Node>();
        nodelist.add(root);
        while(!nodelist.isEmpty()){
            //在此处可以获取到该层有多少个节点
            int len = nodelist.size();
            ArrayList<Integer> intlist = new ArrayList<Integer>(len);
            for(int i=0;i<len;i++){
                Node node = nodelist.removeFirst();
                nodelist.addAll(node.children);
                intlist.add(node.val);
            }
            listlist.add(intlist);
        }
        return listlist;
    }
}
