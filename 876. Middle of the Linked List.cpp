class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* mid=head;
        int size=1;
        ListNode* currentNode = head;
        while(currentNode->next != nullptr)
        {
            size++;
            currentNode = currentNode->next;
        }

        if(size % 2 == 0)
            size=(size/2)+1;
        else
            size = ceil(size/2+0.5);

        int count = 1;
        while(count < size)
        {
            count++;
            mid = mid->next;
        }
        return mid;
        
        
    }
};
