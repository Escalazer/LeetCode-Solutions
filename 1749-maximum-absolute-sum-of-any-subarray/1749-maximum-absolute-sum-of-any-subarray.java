class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum = 0;
        int minsum = 0;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            maxsum = Math.max(nums[i], maxsum + nums[i]);
            minsum = Math.min(nums[i], minsum + nums[i]);

            ans = Math.max(ans, Math.max(maxsum, Math.abs(minsum)));
        }
        return ans;
    }
}