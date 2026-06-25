public class inserttion_before_x_LL {
    class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
    }
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        if(head==null){
            
            return null;
        }
        if (head.data == X) {
            ListNode newNode = new ListNode(val, head);
            return newNode;
        }
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.next.data ==X ){
                ListNode y = new ListNode(val, temp.next);
                temp.next = y;
                break;
            }

            temp = temp.next;

        }
        return head;
    }
    
}
