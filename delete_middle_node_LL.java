/*Given the head of a non-empty singly linked list containing integers, delete the middle node of the linked list. Return the head of the modified linked list.
The middle node of a linked list of size n is the (⌊n / 2⌋ + 1)th node from the start using 1-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x. */
public class delete_middle_node_LL {
        class ListNode {
        int val;
        ListNode next;

        ListNode() {
            val = 0;
            next = null;
        }

        ListNode(int data1) {
            val = data1;
            next = null;
        }

        ListNode(int data1, ListNode next1) {
            val = data1;
            next = next1;
        }
    }
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }


        ListNode slow = head;
        ListNode fast = head.next.next;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        slow.next = slow.next.next;
        return head;
    }
    
}
