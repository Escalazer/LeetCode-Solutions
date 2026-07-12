/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = reverse(l1);
        ListNode list2 = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        int carry = 0;

        while (list1 != null || list2 != null || carry != 0) {
            if (list1 != null) {
                carry += list1.val;
                list1 = list1.next;
            }
            if (list2 != null) {
                carry += list2.val;
                list2 = list2.next;
            }

            ListNode n = new ListNode(carry % 10);
            carry = carry / 10;
            p.next = n;
            p = p.next;
        }

        return reverse(dummy.next);
    }
}