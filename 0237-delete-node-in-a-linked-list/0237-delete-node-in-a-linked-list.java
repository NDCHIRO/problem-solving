/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode  fast = new ListNode();
        fast = node;
        ListNode  slow = node;
        System.out.println(node.val);
        slow.val = slow.next.val;
        slow.next = slow.next.next;
        }
}