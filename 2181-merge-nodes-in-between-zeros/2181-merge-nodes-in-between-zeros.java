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
    public ListNode mergeNodes(ListNode head) {
         /*head=head.next;
     ListNode start=head;
     while(start!=null){
	    ListNode end= start;   
        int sum=0;
        while(end.val!=0) {
            sum+= end.val ;
            end=end.next;
        }
        start.val=sum;  
        start.next=end.next;   
        start=start.next;    
	 }
     return head;*/
        
        int sum=0;
        head=head.next;
        ListNode fast=head;
        ListNode slow=fast;
        while(fast!=null)
        {
            while(fast.val!=0)
            {
                sum+=fast.val;
                fast=fast.next;
            }
            
            if(fast.val==0)
            {
                slow.val = sum;
                slow.next=fast.next;              
                //newList.next = slow;
                fast = fast.next;
                if(fast!=null)
                    slow=fast;
                sum=0;
            }
        }
        return head;
    }
}