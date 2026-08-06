class Solution {
    class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> {
                if (a.first != b.first) return (a.first - b.first);
                return (a.second - b.second);
            }
        );

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();

            Pair curr = new Pair(freq, element);

            if (pq.size() < k) pq.offer(curr);

            else {
                if (pq.peek().first < curr.first) {
                    pq.poll();
                    pq.offer(curr);
                }
                else continue;
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.peek().second;
            pq.poll();
        }

        return ans;
    }
}