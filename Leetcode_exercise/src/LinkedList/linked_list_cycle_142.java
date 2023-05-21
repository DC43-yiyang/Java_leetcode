package LinkedList;

public class linked_list_cycle_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        if (fastPointer == null)
        {
            return null;
        }
        // input- varible judge

        while (fastPointer != null && fastPointer.next != null)
        {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (fastPointer == slowPointer)
            {
                break;
            }
        }

        if (fastPointer == null || fastPointer.next == null)
        {
            return null;
        }

        slowPointer = head;
        // move slowPointer to head

        while (slowPointer != fastPointer)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        return slowPointer;
    }
}
