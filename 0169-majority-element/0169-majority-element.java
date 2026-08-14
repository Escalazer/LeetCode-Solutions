class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int el = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                el = nums[i];
                count++;
            }
            else {
                if (nums[i] == el) count++;
                else count--;
            }
        }

        return el;
    }
}