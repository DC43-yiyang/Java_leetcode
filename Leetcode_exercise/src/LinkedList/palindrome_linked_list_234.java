package LinkedList;

// first solution.
public class palindrome_linked_list_234 {
    public boolean isPalindrome(ListNode head) {
        // It is easy to judge an array is whether a palindrome or not, because you can assume
        // a right pointer on the last, and let both left and right pointers move to the middle.
        // During the move, you can compare them.
        // As for the linked list, I would like to reverse it first, then compare thin linked list
        // to a new linked list, if they're totally same, then this linked list is palindrome
        if (head.next == null)
        {
            return true;
        }
        ListNode curHead = head;
        ListNode dummy = new ListNode(-1,head);
        ListNode originalLink = dummy;
        // this originalLink is to store the original link
        while (curHead != null)
        {
            originalLink.next = new ListNode(curHead.val);
            curHead = curHead.next;
            originalLink = originalLink.next;

        }

        ListNode newLink = reverseLinkedlist(dummy);

        ListNode head1 = head;
        ListNode head2 = newLink;

        while (head1 != null && head2 != null) {
            if (head1.val == head2.val) {
                head1 = head1.next;
                head2 = head2.next;
            } else {
                return false;
            }
        }

        return true;

    }
    public ListNode reverseLinkedlist(ListNode head) {
        // there are two solutions, first is iteration, the second is recursion
        // Iteration :
        ListNode beforeNode = head;
        ListNode prevNode = head;
        ListNode curNode = head.next;
        while (curNode != null)
        {
            ListNode nextNode = curNode.next;
            curNode.next = prevNode;
            if (nextNode == null)
            {
                break;
            }
            prevNode = curNode;
            curNode = nextNode;
        }

        beforeNode.next.next = null;
        return curNode;
    }
}
