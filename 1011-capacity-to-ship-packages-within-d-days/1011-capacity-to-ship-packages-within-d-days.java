class Solution {
    public boolean possible(int weights[], int mid, int days) {
        int day = 1;
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
            if (sum > mid){
                day++;
                sum = weight;
            }
            if (day > days) return false;
        }
        return true;
    }

    public int shipWithinDays(int[] weights, int days) {
        int l = -1, r = 0;
        for (int weight : weights) {
            r += weight;
            l = Math.max(l, weight);
        }

        while (l <= r) {
            int mid = (l + r) / 2;
            if (possible(weights, mid, days) == true)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}