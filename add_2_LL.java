/*Given two non-empty linked lists linkedList1 and linkedList2 which represent two non-negative integers.
The digits are stored in reverse order with each node storing one digit.
Add two numbers and return the sum as a linked list.
The sum Linked List will be in reverse order as well.
The Two given Linked Lists represent numbers without any leading zeros, except when the number is zero itself. */
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