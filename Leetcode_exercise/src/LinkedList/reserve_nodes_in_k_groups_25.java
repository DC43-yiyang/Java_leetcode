package LinkedList;

public class reserve_nodes_in_k_groups_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1,head);
        ListNode before = dummy;

        while (dummy != null)
        {
            // First you need to check whether K is larger than the length of remain elements
            ListNode checkNode = before;
            for(int i = 0; i < k && checkNode != null; i ++)
            {
                checkNode = checkNode.next;
            }
            if(checkNode == null)
            {
                break;
            }

            ListNode prevNode = before;
            ListNode curNode = before.next;
            for ( int i = 1; i <= k; i++)
            {
                ListNode nextNode = curNode.next;
                curNode.next = prevNode;
                prevNode = curNode;
                curNode = nextNode;
            }
            ListNode tail = before.next;
            tail.next = curNode;
            before.next = prevNode;

            before = tail;
        }
        return dummy.next;
    }
}
