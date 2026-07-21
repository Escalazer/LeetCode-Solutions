class Solution {
    public int search(int[] nums, int target) {
        int guess = 0;
        int l = 0;
        int h = nums.length - 1;

        if (nums[l] == target) return l;

        if (nums[h] == target) return h;

        while (l <= h) {
            guess = (l + h) / 2;

            if (nums[guess] == target) return guess;

            if (nums[guess] < target) l = guess + 1;

            else h = guess - 1;
        }
        return -1;
    }
}