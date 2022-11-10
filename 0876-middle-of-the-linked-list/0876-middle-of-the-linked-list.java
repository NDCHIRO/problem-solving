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
    public ListNode middleNode(ListNode head) {
        ListNode currentNode = head;
        int size = 0;
        while(currentNode != null)
        {
            size=size+1;
            currentNode = currentNode.next;
        }
        currentNode = head;
        int mid = 0;
        while(mid!=(size/2))
        {
            currentNode = currentNode.next;
            mid++;
        }
        return currentNode;
    }
}