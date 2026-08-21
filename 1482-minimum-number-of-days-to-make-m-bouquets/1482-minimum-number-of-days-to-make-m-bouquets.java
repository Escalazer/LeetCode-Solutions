class Solution {
    public boolean possible(int[] arr, int mid, int m, int k) {
        int n = arr.length;
        int count = 0;
        int no_of_bouquets = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= mid) {
                count++;
            }
            else {
                no_of_bouquets += count / k;
                count = 0;
            }
        }
        no_of_bouquets += count / k;
        if (no_of_bouquets >= m)
            return true;
        else
            return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < (long)m * k) return -1;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int bloom : bloomDay) {
            max = Math.max(max, bloom);
            min = Math.min(min, bloom);
        }
        int l = min, r = max, mid = -1;
        while (l <= r) {
            mid = (l + r) / 2;
            boolean poss = possible(bloomDay, mid, m, k);
            if (poss == true)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}