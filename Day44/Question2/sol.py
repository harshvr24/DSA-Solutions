class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None

        while head:
            nxt = head.next
            head.next = prev
            prev = head
            head = nxt

        return prev
