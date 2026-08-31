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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return new int[]{-1, -1};

        List<Integer> list = new ArrayList<>();
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode front = head.next.next;
        int i = 2;
        int first = 0;
        int last = 0;
        int minDist = Integer.MAX_VALUE;
        while (curr.next != null) {
            if ((prev.val < curr.val && curr.val > front.val) || (prev.val > curr.val && curr.val < front.val)) {
                if (first == 0) first = i;
                else minDist = Math.min(minDist, i - last);
                last = i;
            }
            prev = curr;
            curr = front;
            front = front.next;
            i++;
        }
        if (first == last) return new int[]{-1, -1};
        else return new int[]{minDist, last - first};
    }
}