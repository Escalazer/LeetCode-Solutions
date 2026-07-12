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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
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

        return dummy.next;
    }
}