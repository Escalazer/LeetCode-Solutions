class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 0, high = 0, sum = 0;
        int minlen = Integer.MAX_VALUE;
        while (high < n) {
            sum += nums[high];
            while (sum >= target) {
                int len = high - low + 1;
                sum -= nums[low];
                low++;
                minlen = Math.min(minlen, len);
            }
            high++;
        }
        if (minlen == Integer.MAX_VALUE) return 0;
        else return minlen;
    }
}