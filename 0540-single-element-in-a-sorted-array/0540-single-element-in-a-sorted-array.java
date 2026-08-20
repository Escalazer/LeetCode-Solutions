class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int l = 1;
        int r = n -2;
        int guess = 0;

        while (l <= r) {
            guess = (l + r) / 2;
            if (nums[guess] != nums[guess - 1] && nums[guess] != nums[guess + 1]) {
                return nums[guess];
            }
            else if ((guess % 2 == 0 && nums[guess] == nums[guess + 1]) || (guess % 2 == 1 && nums[guess] == nums[guess - 1])) {
                l = guess + 1;
            }
            else if ((guess % 2 == 0 && nums[guess] == nums[guess - 1]) || (guess % 2 == 1 && nums[guess] == nums[guess + 1])) {
                r = guess - 1;
            }
        }
        return nums[guess];
    }
}