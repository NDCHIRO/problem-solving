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
    public ListNode mergeNodes(ListNode head) {
        
        int sum=0;
        head=head.next;
        ListNode fast=head;
        ListNode slow=fast;
        while(fast!=null)
        {
            if(fast.val!=0)
            {
                sum+=fast.val;
                fast=fast.next;
            }
            
            else
            {
                slow.val = sum;
                slow.next=fast.next;              
                fast = fast.next;
                slow=fast;
                sum=0;
            }
        }
        return head;
    }
}