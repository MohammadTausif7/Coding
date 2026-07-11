import java.util.HashSet;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LC0160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> s = new HashSet<>();
        
        while (headA != null)
        {
            s.add(headA);
            headA = headA.next;
        }

        while (headB != null)
        {
            if(s.contains(headB))
            {
                return headB;
            }
            headB = headB.next;
        }
        
        return null;
    }
}