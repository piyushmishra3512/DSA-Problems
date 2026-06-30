

public class remove_nTh_node_from_back_LL {
    class ListNode{
        public int data;
        public ListNode next;
        ListNode() { data = 0; next = null; }
        ListNode(int x) { data = x; next = null; }
        ListNode(int x, ListNode next) { data = x; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fastp = head;
        ListNode slowp = head;


        for (int i = 0; i < n; i++) {
            fastp = fastp.next;
        }

        if (fastp == null) {
            return head.next;
        }


        while (fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }


        slowp.next = slowp.next.next;
        return head;
    }
    
}
