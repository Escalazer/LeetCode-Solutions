class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum1 = 0;
        int maxsum = 0;
        int sum2 = 0;
        int minsum = 0;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (sum1 < 0) sum1 = 0;
            if (sum2 > 0) sum2 = 0;
            
            sum1 += nums[i];
            sum2 += nums[i];

            maxsum = Math.max(maxsum, sum1);
            minsum = Math.min(minsum, sum2);

            ans = Math.max(ans, Math.max(maxsum, Math.abs(minsum)));
        }
        return ans;
    }
}