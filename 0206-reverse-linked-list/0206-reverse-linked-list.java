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
    public ListNode reverseList(ListNode head) {
       /*ListNode current = head;
        ListNode prev = null;
        ListNode next = head;
        while(current!=null)
        {
            next = current.next;
            current.next=prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
        ListNode prev = null;*/
        return reverse(head,null);
    }
    
    ListNode reverse(ListNode current,ListNode prev)
    {
        if(current == null)
            return prev;
        ListNode next = current.next;
        current.next = prev;
        return reverse(next,current);
    }
}