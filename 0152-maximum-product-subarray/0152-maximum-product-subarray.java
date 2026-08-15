class Solution {
    public int maxProduct(int[] nums) {
        int maxprod = Integer.MIN_VALUE;
        int n = nums.length;
        int prefixprod = 1, suffixprod = 1;

        for (int i = 0; i < nums.length; i++) {
            if (prefixprod == 0) prefixprod = 1;
            if (suffixprod == 0) suffixprod = 1;

            prefixprod *= nums[i];
            suffixprod *= nums[n - 1 - i];

            maxprod = Math.max(maxprod, Math.max(prefixprod, suffixprod));
        }
        return maxprod;
    }
}