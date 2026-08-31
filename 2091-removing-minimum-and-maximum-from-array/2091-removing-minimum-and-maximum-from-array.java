class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if  (n <= 2) return n;

        int max = nums[0];
        int maxindex = 0;
        int min = nums[0];
        int minindex = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxindex = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minindex = i;
            }
        }
        int left = Math.min(maxindex, minindex);
        int right = Math.max(maxindex, minindex);
        int ans = Math.min((n - left), (right + 1));
        ans = Math.min(ans, ((n - right) + (left + 1)));
        return ans;
    }
}