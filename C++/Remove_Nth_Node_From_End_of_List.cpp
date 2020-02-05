class Solution {
public:
    int count = 0;
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if (head == NULL) {
            return NULL;
        }
        if (head->next == NULL) {
            count = 1;
        } else {
            head->next = removeNthFromEnd(head->next, n);
            count+=1;
        }
        if (count == n) {
            return head->next;
        }
        return head;
    }
};