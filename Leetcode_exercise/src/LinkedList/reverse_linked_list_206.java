package LinkedList;

public class reverse_linked_list_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
        {
            return head;
        }

        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return last;

    }
}
