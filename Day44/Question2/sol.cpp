class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* prev = NULL;

        while(head) {
            ListNode* nxt = head->next;
            head->next = prev;
            prev = head;
            head = nxt;
        }
        return prev;
    }
};
