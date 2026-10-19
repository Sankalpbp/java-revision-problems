package dsaPrimer;

public class RemoveDupsList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preptr = head;
        ListNode ptr = head;

        while (ptr != null) {
            if (preptr.val == ptr.val) {
                ptr = ptr.next;
            } else {
                preptr.next = ptr;
                ptr = ptr.next;
                preptr = preptr.next;
            }
        }

        preptr.next = ptr;

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
