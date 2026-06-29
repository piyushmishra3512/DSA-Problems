/*Given the head of a singly linked list. Group all the nodes with odd indices followed by all the nodes with even indices and return the reordered list.
Consider the 1st node to have index 1 and so on. The relative order of the elements inside the odd and even group must remain the same as the given input. */

public class Segregate_odd_and_even_nodes_LL {
    class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(0);
        ListNode eventemp = even;
        ListNode odd= new ListNode (0);
        ListNode oddtemp = odd;
        ListNode temp = head;
        int index = 1;
        while(temp!=null){
            if(index%2==0){
                

                eventemp.next =new ListNode(temp.data);
                eventemp = eventemp.next;
            }
            if(index%2!=0){
                

                oddtemp.next =new ListNode(temp.data);
                oddtemp = oddtemp.next;
            }
            index++;
            temp = temp.next;
        }
        
        oddtemp.next = even.next;
        return odd.next;
    }

    
}
