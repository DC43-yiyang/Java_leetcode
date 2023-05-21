package LinkedList;

public class middle_of_linked_list_876 {
    public ListNode middleNode(ListNode head)
    {
        if (head == null)
        {
            return null;
        }
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null)
        {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return  slowPointer;
    }
}
