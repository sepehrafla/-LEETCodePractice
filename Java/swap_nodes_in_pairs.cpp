/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        ListNode* temp=head;
        if(head==NULL || head->next==NULL)
            return head;
        else
        {
            while(temp!=NULL && temp->next!=NULL)
            {
                int value=temp->val;
                temp->val=temp->next->val;
                temp->next->val=value;
                temp=temp->next;
                temp=temp->next;
            }
        }
        return head;
    }
};