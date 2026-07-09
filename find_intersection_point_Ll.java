public class find_intersection_point_Ll {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!= temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1==temp2) return temp1;
            if(temp1==null) temp1 = headB;
            if(temp2==null) temp2 = headA;
        }
        return temp1;


    }
    
}
