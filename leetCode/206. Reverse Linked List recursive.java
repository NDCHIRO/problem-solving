//recursive solution
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        if(current == null || current.next == null)
            return current;
        ListNode newHead = reverseList(current.next);
        current.next.next = current;
        current.next = null;
        return newHead;
    }
}
