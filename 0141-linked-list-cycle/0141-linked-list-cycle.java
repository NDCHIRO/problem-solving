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
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Boolean> map = new HashMap<>();
        ListNode cur = head;
        int i=0;
        while(cur!=null)
        {
            if(map.get(cur)==null)
                map.put(cur,false);
            else
                return true;
            cur=cur.next;
        }
        return false;
    }
}