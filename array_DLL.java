import java.util.List;

public class array_DLL {
    class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    ListNode(int data);
    ListNode(int data, ListNode prev, ListNode next);
    }
    public ListNode arrayToDoublyLinkedList(List<Integer> arr) {
        if (arr == null || arr.size() == 0) return null;
        ListNode head = new ListNode(arr.get(0));
        ListNode temp = head;
        for(int i = 1 ; i<arr.size();i++){
            ListNode newNode = new ListNode(arr.get(i), temp , null);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }
    
}
