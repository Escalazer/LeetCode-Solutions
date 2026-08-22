class Solution {
    public int possible(int nums[], int mid) {
        int no_of_stud = 1;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > mid) {
                no_of_stud++;
                sum = num;
            }
        }
        return no_of_stud;
    }

    public int splitArray(int[] nums, int k) {
        int l = 0, r = 0;
        for (int num : nums) {
            l = Math.max(l, num);
            r += num;
        }
        while (l <= r) {
            int mid = (l + r) / 2;
            if (possible(nums, mid) > k)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }
}