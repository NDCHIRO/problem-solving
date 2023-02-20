/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        ListNode current=head;
        while(current!=null)
        {
            if(nodes.contains(current))
                return current;
            nodes.add(current);
            current=current.next;
        }
        return null;
    }
}