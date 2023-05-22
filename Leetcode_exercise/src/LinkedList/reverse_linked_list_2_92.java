package LinkedList;

public class reverse_linked_list_2_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1,head);
        ListNode before = dummy;

        for(int i = 1; i < left; i ++)
        {
            before = before.next;
        }
        ListNode prevNode = before;
        ListNode curNode = before.next;


        for (int i = left; i <= right; i++)
        {
            ListNode nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }

        before.next.next = curNode;
        before.next = prevNode;
        return dummy.next;
    }
}
