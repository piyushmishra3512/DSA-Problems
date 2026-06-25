public class insertion_at_kth_ll {
    class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;

    public ListNode() {
        this.data = 0;
        this.prev = null;
        this.next = null;
    }

    public ListNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public ListNode(int data, ListNode prev, ListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
    ListNode newNode = new ListNode(X);

  
    if (head == null) return newNode;

  
    if (K == 1) {
        newNode.next = head;
        return newNode;
    }


    ListNode temp = head;
    int cnt = 1;

    while (temp != null) {
        if (cnt == K - 1) {           
            newNode.next = temp.next; 
            temp.next = newNode;      
            break;
        }
        cnt++;
        temp = temp.next;
    }
    return head;
    }
}
    

