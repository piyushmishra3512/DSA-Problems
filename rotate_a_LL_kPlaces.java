public class rotate_a_LL_kPlaces {
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
     public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) 
            return head;
        ListNode tail = head;
        int len = 1 ;
        while(tail.next!=null){
            len++;
            tail = tail.next;
        }
        if(k%len==0){
            return head;
        }
        k = k%len;
        ListNode KthNode = findKthNode(head, len-k);
        tail.next = head;
        head = KthNode.next ;
        KthNode.next = null;
        return head; 

    }
    public ListNode findKthNode(ListNode head, int n){
        n-=1;
        ListNode temp = head;
        while(n!=0){
            n--;
            temp=temp.next;
        }
        return temp;
    }
    
}
