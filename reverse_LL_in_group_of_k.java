public class reverse_LL_in_group_of_k {
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode front  = null;
        while(temp!= null){
            ListNode KthNode = findKnode(temp , k);
            if(KthNode == null){
                if(prev!=null){
                    prev.next = temp;
                }
                break;
            }
            front = KthNode.next;
            KthNode.next  = null;
            reverseLL(temp);
            if(temp==head){
                head = KthNode;
            }
            else{
                prev.next = KthNode;
            }

            
            prev = temp;
            temp = front;
            
        }
        return head;

    }
    public ListNode reverseLL(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        } 
        return prev;   
    } 
    public ListNode findKnode(ListNode temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }
    
}
