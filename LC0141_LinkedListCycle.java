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

public class LC0141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode cur = head;
        while (cur != null)
        {
            if (hs.contains(cur))
            {
                return true;
            }
            hs.add(cur);
            cur = cur.next;
        }
        return false;
    }
}