class Solution {
    class Pair {
        int first;
        int second;
        Pair (int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> (b.first - a.first)
        );

        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int sum = (point[0]*point[0]) + (point[1]*point[1]);

            Pair curr = new Pair(sum, i);

            if (pq.size() < k) pq.offer(curr);

            else {
                if (curr.first < pq.peek().first) {
                    pq.poll();
                    pq.offer(curr);
                }
            }
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 2; j++) {
                ans[i][j] = points[pq.peek().second][j];
            }
            pq.poll();
        }

        return ans;
    }
}