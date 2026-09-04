class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int suffixmin[] = new int[n];
        suffixmin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            int min = Math.min(nums[i], suffixmin[i + 1]);
            suffixmin[i] = min;
        }
        int prefixmax = 0;
        for (int i = 0; i < n; i++) {
            prefixmax = Math.max(nums[i], prefixmax);
            if (prefixmax - suffixmin[i] <= k)
                return i;
        }
        return -1;
    }
}