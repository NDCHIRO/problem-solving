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
    public int pairSum(ListNode head) {
        int max = 0;
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while(cur!=null) {
            list.add(cur.val);
            cur=cur.next;
        }
        
        int localMax = 0;
        for(int i=0;i<list.size();i++) {
            localMax = 0;
            localMax = list.get(i)+list.get(list.size()-i-1);
            max = Math.max(localMax, max);
        }
        
        return max; 
    }
}