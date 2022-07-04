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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        ListNode currentNode=head;
        while(currentNode!=null)
        {
            numbers.add(currentNode.val);
            currentNode=currentNode.next;
        }
        for(int i=0;i<numbers.size()/2;i++)
            if(numbers.get(i)!=numbers.get(numbers.size()-i-1))
                return false;
        return true;
    }
}
