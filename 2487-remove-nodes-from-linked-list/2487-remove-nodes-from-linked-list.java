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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while(head != null){
            stack.push(head);
            head = head.next;
        }
        ListNode result = stack.pop();
        while(!stack.empty())
        {
            ListNode cur = stack.pop();
            if(cur.val < result.val)
                continue;
            else
            {
                cur.next = result;
                result = cur;
            }
        }
        return result;
    }
}