// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class LC0021_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(0);
        ListNode result = list3;
        
        while (list1 != null && list2 != null)
        {
            if (list1.val <= list2.val)
            {
                result.next = list1;
                list1 = list1.next;
            }
            else
            {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }

        if (list1 == null)
        {
            result.next = list2;
        }
        else
        {
            result.next = list1;
        }

        return list3.next;
    }
}