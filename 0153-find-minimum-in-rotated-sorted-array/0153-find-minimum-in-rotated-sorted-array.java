class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int result = Integer.MIN_VALUE;
        int guess = 0;

        while (l <= h) {
            guess = (l + h) / 2;
            if (nums[guess] > nums[n - 1]) {
                l = guess + 1;
            }
            else {
                result = guess;
                h = guess - 1;
            }
        }
        return nums[result];
    }
}