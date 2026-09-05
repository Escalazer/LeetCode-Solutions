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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode first = head;
        ListNode second = head.next;

        ListNode prev = dummy;
        
        while (first != null && first.next != null) {
            //swapping pairs
            first.next = second.next;
            second.next = first;
            prev.next = second;

            //keeping prev pointer on the first element of previous pair
            prev = first;

            //moving to the next pair
            first = first.next;
            if (first != null)
                second = first.next;
        }
        return dummy.next;
    }
}