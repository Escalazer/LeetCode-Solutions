class Solution {
    public int[] sortArray(int[] nums) {
        ms(nums, 0, nums.length - 1);
        return nums;
    }
    void ms(int[] nums, int l, int h) {
        int mid = -1;
        if (l == h) return;
        mid = (l + h) / 2;
        ms(nums, l , mid);
        ms(nums, mid + 1, h);
        merge(nums, l, mid, h);
    }
    void merge(int nums[], int l, int mid, int h) {
        int[] temp = new int[h - l + 1];
        int id = 0;
        int left = l;
        int right = mid + 1;

        while (left <= mid && right <= h) {
            if (nums[left] <= nums[right]) {
                temp[id++] = nums[left++];
            }
            else {
                temp[id++] = nums[right++];
            }
        }
        while (left <= mid) {
            temp[id++] = nums[left++];
        }
        while (right <= h) {
            temp[id++] = nums[right++];
        }
        for (int i = l; i <= h; i++) {
            nums[i] = temp[i - l];
        }
    }
}