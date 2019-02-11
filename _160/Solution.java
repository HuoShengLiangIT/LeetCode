package _160;

public class Solution {
    //只需要关心两个节点走过相同的路径，所以在A遍历完后将A指针指向B继续遍历，B同理，他们两个最终会相交在交点处或者尾指针null
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        if (p1 == null || p2 == null) {
            return null;
        }
        while (p1 != p2) {
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }
            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}