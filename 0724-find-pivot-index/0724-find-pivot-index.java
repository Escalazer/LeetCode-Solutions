class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int cs = 0;
        int ls = 0;
        int rs = 0;
        for (int i = 0; i < nums.length; i++) {
            ls = cs;
            rs = sum - ls - nums[i];

            if (ls == rs) return i;

            cs += nums[i];
        }
        return -1;
    }
}