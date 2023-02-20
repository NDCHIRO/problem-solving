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
        ListNode slow=head;
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
        /*while(fast!=null &&fast.next!=null)
        {
            fast=fast.next.next;
            slow = slow.next;
            count++;       
        }*/
        ListNode mid=head;
        size=size/2;
        while(size>0)
        {
            if(count == size-1)
            {
                mid.next=mid.next.next;
                return head;
            }
            mid=mid.next;
            count++;
        }
        return head;
    }
}