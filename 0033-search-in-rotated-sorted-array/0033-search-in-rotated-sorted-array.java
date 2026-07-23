class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int guess = 0;

        while (l <= h) {
            guess = (l + h) / 2;

            if (nums[guess] == target) return guess;

            else if (nums[guess] > nums[n - 1]) {
                if (nums[guess] < target) l = guess + 1;
                else {
                    if (nums[l] > target) l = guess + 1;
                    else h = guess - 1;
                }
            }

            else {
                if (nums[guess] > target) h = guess - 1;
                else {
                    if (nums[h] < target) h = guess - 1;
                    else l = guess + 1;
                }
            }
        }
        return -1;
    }
}