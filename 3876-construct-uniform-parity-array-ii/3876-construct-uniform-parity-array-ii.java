class Solution {
    public boolean uniformArray(int[] nums1) {
        int minval = nums1[0];
        boolean oddval = false;
        for (int num : nums1) {
            if (num < minval)
                minval = num;
            if (num % 2 == 1)
                oddval = true;
        }
        return !(oddval && minval % 2 == 0);
    }
}