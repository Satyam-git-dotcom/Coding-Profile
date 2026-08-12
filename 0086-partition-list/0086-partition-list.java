class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode dummyLess = new ListNode(0);
        ListNode dummyGreater = new ListNode(0);

        ListNode less = dummyLess;
        ListNode greater = dummyGreater;

        while (head != null) {

            if (head.val < x) {
                less.next = head;
                less = less.next;
            } else {
                greater.next = head;
                greater = greater.next;
            }

            head = head.next;
        }
        greater.next = null;
        less.next = dummyGreater.next;

        return dummyLess.next;
    }
}