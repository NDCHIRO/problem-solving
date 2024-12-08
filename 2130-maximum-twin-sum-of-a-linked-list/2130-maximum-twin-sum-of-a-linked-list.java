class Solution {
    public int pairSum(ListNode head) {
        // Step 1: Find the middle of the list using slow and fast pointers
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode prev = null, current = slow, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Step 3: Calculate the maximum twin sum
        int maxSum = 0;
        ListNode left = head, right = prev; // Right is the head of the reversed second half
        while (right != null) {
            maxSum = Math.max(maxSum, left.val + right.val);
            left = left.next;
            right = right.next;
        }

        return maxSum;
    }
}
