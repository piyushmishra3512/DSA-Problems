/*Given the head of a singly linked list and an integer X, delete the node with value X and return the head of the modified list. */

public class delete_in_linkedlist {
    class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
    }
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        if(head.data== X){
            head = head.next;
        }
        ListNode temp = head;
        ListNode prev = null;;
        while(temp!= null){
            if(temp.data == X){
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;            
        }
        return head;

    }

    
}
