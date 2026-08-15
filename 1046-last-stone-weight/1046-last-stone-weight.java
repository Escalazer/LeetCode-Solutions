class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int temp1 = pq.poll();
            int temp2 = pq.poll();
            if (temp1 == temp2) continue;
            else pq.offer(temp1 - temp2);
        }
        return pq.size() == 0 ? 0 : pq.poll();
    }
}