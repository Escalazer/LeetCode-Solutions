class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum_of_0_to_n = (n * (n + 1)) / 2;
        int sum_of_nums = 0;

        for (int i = 0; i < n; i++) {
            sum_of_nums += nums[i];
        }

        return sum_of_0_to_n - sum_of_nums;
    }
}