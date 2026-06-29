public class add_2_LL {
    class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;
        int carry = 0;
        while((temp1!= null || temp2!= null)|| carry!=0){
            int sum=carry;
            if(temp1!=null){
                sum+=temp1.data;
                                
            }
            if(temp2!=null){
                sum+=temp2.data;
                
            }
            ListNode newNode = new ListNode(sum%10);
            curr.next = newNode;
            curr = curr.next;
            carry = sum/10;
            if(temp1!= null){
                temp1 = temp1.next;

            }
            if(temp2!= null){
                temp2 = temp2.next;
            }
        }
        if(carry!= 0){
            ListNode NewNodenew = new ListNode(0);
            curr.next = NewNodenew;
        }
        return dummyNode.next;
        
    }
    
}                