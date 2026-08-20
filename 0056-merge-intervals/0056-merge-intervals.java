class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> l = new ArrayList<>();

        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if (end1 >= start2) {
                end1 = Math.max(end1, end2);
            }
            else {
                List<Integer> temp = new ArrayList<>();
                temp.add(start1);
                temp.add(end1);
                l.add(temp);
                start1 = start2;
                end1 = end2;
            }
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(start1);
        temp.add(end1);
        l.add(temp);

        int ans[][] = new int[l.size()][2];
        for (int i = 0; i < ans.length; i++) {
            ans[i][0] = l.get(i).get(0);
            ans[i][1] = l.get(i).get(1);
        }

        return ans;
    }
}