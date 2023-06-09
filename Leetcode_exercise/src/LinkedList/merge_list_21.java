package LinkedList;

public class merge_list_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode initialNode = new ListNode(-1);
        ListNode currentNode = initialNode;

        while (l1 != null && l2 != null){
            if (l1.val >= l2.val)
            {
                currentNode.next = l2;
                l2 = l2.next;
            }
            else
            {
                currentNode.next = l1;
                l1 = l1.next;
            }
            currentNode = currentNode.next;
        }
        if (l1 != null)
        {
            currentNode.next = l1;
        }
        if (l2 != null)
        {
            currentNode.next = l2;
        }
        return initialNode.next;
    }
}

