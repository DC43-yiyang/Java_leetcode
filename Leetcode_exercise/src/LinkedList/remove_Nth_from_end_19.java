package LinkedList;

public class remove_Nth_from_end_19 {
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode shouldRemoveNode = findNthFromEnd(dummy,n);

        shouldRemoveNode.next = shouldRemoveNode.next.next;

        return dummy.next;
    }

    public ListNode findNthFromEnd(ListNode head, int n)
    {
        ListNode curNode = head;
        ListNode removeNode = head;

        if (curNode == null)
        {
            return null;
        }
        for (int i = 1; i <= n; i++)
        {
            curNode = curNode.next;
        }
        while (curNode != null && curNode.next != null)
        {
            curNode = curNode.next;
            removeNode = removeNode.next;
        }

        return removeNode;
    }
}
