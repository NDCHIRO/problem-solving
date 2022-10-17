/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while(cur!=null)
        {
            size++;
            cur=cur.next;
        }
        cur=head;
        int res=0;
        while(cur!=null)
        {
            res+=(cur.val*(Math.pow(2,size-1)));
            cur=cur.next;
            size--;
        }
        return res;
    }
}