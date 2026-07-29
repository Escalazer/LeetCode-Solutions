class Solution {
    public void sortColors(int[] nums) {
        int low = 0, med = 0, high = nums.length - 1;
        while (med <= high) {
            if (nums[med] == 0) {
                int temp = nums[med];
                nums[med] = nums[low];
                nums[low] = temp;
                low++;
                med++;
            }
            else if (nums[med] == 1) {
                med++;
            }
            else {
                int temp = nums[med];
                nums[med] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}