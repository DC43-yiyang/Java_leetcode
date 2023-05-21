package LinkedList;

public class linked_list_cycle_141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        if (fast == null)
        {
            return false;
        }

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
            {
                return true;
            }

        }
        return false;
    }
}
