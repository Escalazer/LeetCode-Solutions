class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            maxwater = Math.max(maxwater, (Math.min(height[l], height[r]) * (r - l)));

            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxwater;
    }
}