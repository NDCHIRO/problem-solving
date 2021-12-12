class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* current=head;
        int size=0;
        while(current != NULL)
        {
            size++;
            current=current->next;
        }
        
        if(size == 1)
            return head->next;
        if(size == n)
            return head->next;

        current = head;
        for(int i=0;i<size-n-1;i++)
            current = current->next;
    
        if(current->next->next!=NULL)
            current->next = current->next->next;
        else
            current->next = NULL;
        
        return head;
    }
};
