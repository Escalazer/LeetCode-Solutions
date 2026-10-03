class Solution {
    public int mySqrt(int x) {
        if (x == 1) return 1;
        int ans = 0, max = 0;
        for (int i = 1; i <= x/2; i++) {
            if ((long)i * i <= x)
                ans = i;
            else if (i * i > x)
                break;
        }
        return ans;
    }
}