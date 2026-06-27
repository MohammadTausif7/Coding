// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class LC0083_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        ListNode temp;
        while (head.next != null)
        {
            if (head.val == head.next.val)
            {
                if (head.next.next == null)
                {
                    head.next = null;
                    break;
                }
                else
                {
                    head.next = head.next.next;
                }
            }
            else 
            {
                temp = head.next;
                head.next = head.next.next;
                head = temp;
            }
        }
        return result;
    }
}