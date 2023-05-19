package LinkedList;

public class partiton_list_86
    {
        public ListNode partition(ListNode head, int x) {
        // To solve this problem, you can divide this problem into two steps
        // First, you can initialize two linkedlists, one is the smaller lists to store the less items.
        // The other list is the bigger lists to store the large one. Then you combine the both lists
        ListNode lessList = new ListNode(-250);
        ListNode curLessList = lessList;
        ListNode largeList = new ListNode(-250);
        ListNode curLargeList = largeList;

        if (head == null)
        {
            return null;
        }
        while (head != null)
        {
            if (head.val < x)
            {
                curLessList.next = head;
                curLessList = curLessList.next;
            }
            else
            {
                curLargeList.next = head;
                curLargeList = curLargeList.next;
            }
            head = head.next;
        }
        curLargeList.next = null;
        curLessList.next = largeList.next;

        return lessList.next;
    }
}
