package _2;
 class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
 }

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(0);
        ListNode p = l1,q=l2,c=n;
        int carry=0;
        while(p!=null||q!=null)
        {
            int x = (p!=null)?p.val:0;
            int y = (q!=null)?q.val:0;
            int sum = x+y+carry;
            carry = sum/10;
            c.next = new ListNode(sum%10);
            c = c.next;
            if(q!=null) q=q.next;
            if(p!=null) p=p.next;
        }
        if(carry>0)
        {
            c.next = new ListNode(carry);
        }
        return n.next;
    }
}
