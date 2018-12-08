package _206;


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        //keep the loop invariants
        //pre is new head
        //cur is current node
        while(cur!=null){
            ListNode nextTemp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextTemp;
        }
        //pre is new head
        //cur is current node
        return pre;
    }
}
