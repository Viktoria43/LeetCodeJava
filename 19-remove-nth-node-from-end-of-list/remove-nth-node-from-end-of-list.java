   class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tmp = head;

        int size = 0;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }

        tmp = dummy;
        for (int i = 0; i < size - n; i++) {
            tmp = tmp.next;
        }

        // Remove the nth node from the end by updating the next pointer
        tmp.next = tmp.next.next;

        return dummy.next;
    }
}
