import java.util.ArrayList;
import java.util.List;

public class traversal_linked{
    class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
    public List<Integer> LLTraversal(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            result.add(temp.data);
            temp = temp.next;
        }
        return result;

    }
}