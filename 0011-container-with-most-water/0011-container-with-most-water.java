class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int maxwater = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            water = Math.min(height[l], height[r]) * (r - l);
            maxwater = Math.max(maxwater, water);

            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxwater;
    }
}