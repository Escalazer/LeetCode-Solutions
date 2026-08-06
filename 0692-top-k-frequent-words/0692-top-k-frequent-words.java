class Solution {
    class Pair {
        int first;
        String second;
        Pair(int first, String second) {
            this.first = first;
            this.second = second;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> {
                if (a.first != b.first) return (a.first - b.first);
                return (b.second.compareTo(a.second));
            }
        );

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            String word = entry.getKey();

            Pair curr = new Pair(freq, word);

            if (pq.size() < k) pq.offer(curr);
            else {
                if (pq.peek().first < curr.first || curr.first == pq.peek().first && curr.second.compareTo(pq.peek().second) < 0) {
                    pq.poll();
                    pq.offer(curr);
                }
                else continue;
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(pq.peek().second);
            pq.poll();
        }
        Collections.reverse(ans);
        return ans;
    }
}