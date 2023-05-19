package LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class merge_k_sorted_lists_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        // finish the implementation of min-priority queue.
        if (lists.length == 0 || lists == null)
        {
            //It is critical to determine whether the pointer is null or not
            return null;
        }


//        The difficulty of this problem is how to get the minimum node of k nodes as soon.
//        To complete this target, we can use the priority queue.
//        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
//            @Override
//            public int compare(ListNode a, ListNode b) {
//                return a.val - b.val;
//            }
//        });
        // If using the lamda is more easier
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, (a,b)->(a.val - b.val));

        ListNode virNode = new ListNode(-1);
        ListNode curNode = virNode;

        for (ListNode head : lists)
        {
            if (head != null)
            {
                pq.add(head);
            }
        }


        while (!pq.isEmpty()) {
            ListNode popNode = new ListNode();
            popNode = pq.poll();
            curNode.next = popNode;
            if (popNode.next != null) {
//                 This part is necessary
//To understand why we check if tail.next is null, and add to the queue,
// we need to understand that the q does not contain ALL the listnodes, only the start of each list.
                pq.add(popNode.next);
            }
            curNode = curNode.next;
        }
        return virNode.next;
    }
}
