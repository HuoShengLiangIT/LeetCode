package _589;

import java.util.ArrayList;
import java.util.List;


// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        pre(root, list);
        return list;
    }

    public void pre(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (Node n : root.children) {
            pre(n, list);
        }
    }
}