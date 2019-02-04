package _590;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        tra(root, list);
        return list;
    }

    public void tra(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        List<Node> l = root.children;
        int len = l.size();
        for (int i = 0; i < len; i++) {
            Node n = l.get(i);
            tra(n, list);
        }
        list.add(root.val);
    }
}

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