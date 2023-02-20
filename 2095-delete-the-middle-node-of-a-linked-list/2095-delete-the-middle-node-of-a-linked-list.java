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
    public ListNode deleteMiddle(ListNode head) {
        int size = 0;
        ListNode fast=head;
        while(fast!=null)
        {
            fast=fast.next;
            size++;
        }
        if(size==1) return null;
        if(size==2)
        {
            head.next=null;
            return head;
        }
        fast = head;
        int count=0;
        ListNode current=head;
        size=size/2;
        while(size>0)
        {
            if(count == size-1)
            {
                current.next=current.next.next;
                return head;
            }
            current=current.next;
            count++;
        }
        return head;
    }
}