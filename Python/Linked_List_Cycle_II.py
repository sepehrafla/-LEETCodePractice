# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        tag = {}
        while head:
            tag[head] = head
            if hash_map.get(head.next, 0):
                return head.next
            head = head.next