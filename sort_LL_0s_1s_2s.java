/*Given the head of a singly linked list consisting of only 0, 1 or 2.
Sort the given linked list and return the head of the modified list.
Do it in-place by changing the links between the nodes without creating new nodes.
Example 1

Input: linkedList = [1, 0, 2, 0 , 1]

Output: [0, 0, 1, 1, 2]

Explanation: The values after sorting are [0, 0, 1, 1, 2]. */
public class sort_LL_0s_1s_2s {
    class ListNode{
        public int data;
        public ListNode next;
        ListNode() { data = 0; next = null; }
        ListNode(int x) { data = x; next = null; }
        ListNode(int x, ListNode next) { data = x; this.next = next; }
    }
    public ListNode sortList(ListNode head) {
        ListNode zeroDummy = new ListNode(-1);
        ListNode oneDummy = new ListNode(-1);
        ListNode twoDummy = new ListNode(-1);

        ListNode zero = zeroDummy;
        ListNode one = oneDummy;
        ListNode two = twoDummy;

        ListNode temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;   
        }

        two.next = null;             
        one.next = twoDummy.next;     
        zero.next = oneDummy.next;    

        return zeroDummy.next;
    }
    
}
