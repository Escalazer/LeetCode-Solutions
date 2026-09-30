class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        long l = 1;
        long r = Long.MAX_VALUE;
        for (int t : time)
            r = Math.min(r, t);
        r = r * totalTrips;

        while (l <= r) {
            long mid = (l + r) / 2;
            if (check(time, mid, totalTrips))
                r = mid - 1;
            else
                l = mid + 1;
        }

        return l;
    }

    public boolean check(int[] time, long mid, int totalTrips) {
        long trips = 0;
        for (int t : time)
            trips += mid / t;

        return (trips >= totalTrips);
    }
}