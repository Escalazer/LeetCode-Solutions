class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> newlist = new ArrayList<>();
        boolean insert = false;
        for (int i = 0; i < intervals.length; i++) {
            if (insert == false && intervals[i][0] >= newInterval[0]) {
                newlist.add(newInterval);
                insert = true;
            }
            newlist.add(intervals[i]);
        }
        if (insert == false) {
            newlist.add(newInterval);
        }
        int[][] newIntervals = newlist.toArray(new int[newlist.size()][]);
        List<int[]> ans = new ArrayList<>();

        int start1 = newIntervals[0][0];
        int end1 = newIntervals[0][1];

        for (int i = 1; i < newIntervals.length; i++) {
            int start2 = newIntervals[i][0];
            int end2 = newIntervals[i][1];
            if (end1 >= start2) {
                end1 = Math.max(end1, end2);
            }
            else {
                ans.add(new int[]{start1, end1});
                start1 = start2;
                end1 = end2;
            }
        }
        ans.add(new int[]{start1, end1});

        return ans.toArray(new int[ans.size()][]);
    }
}