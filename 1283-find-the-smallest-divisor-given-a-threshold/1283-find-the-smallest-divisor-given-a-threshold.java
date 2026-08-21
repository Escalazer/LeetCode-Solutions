class Solution {
    public boolean possible(int nums[], int threshold, int mid) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] + mid - 1) / mid;
            if (count > threshold)
                return false;
        }
        return true;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int r = Integer.MIN_VALUE;
        for (int num : nums) {
            r = Math.max(r, num);
        }
        int l = 1, mid = -1;

        while (l <= r) {
            mid = (l + r) / 2;
            if (possible(nums, threshold, mid) == true)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}