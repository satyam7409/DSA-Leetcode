public class MergeSort {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }
    public ListNode merge(ListNode left, ListNode right){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while(left != null && right!= null){
            if(left.value < right.value){
                tail.next = left;
                tail = tail.next;
                left = left.next;
            }
            else{
                tail.next = right;
                tail = tail.next;
                right = right.next;
            }
        }
        tail.next = (left != null) ? left : right;

        return dummyHead.next;
    }

    public ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) {
            prev.next = null;
        }

        return slow;
    }
}
