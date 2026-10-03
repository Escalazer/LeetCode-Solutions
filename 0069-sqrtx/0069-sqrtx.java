class Solution {
    public int mySqrt(int x) {
        if (x == 1) return 1;
        int l = 1, r = x / 2;
        while (l <= r) {
            int guess = (l + r) / 2;
            if ((long)guess * guess <= x)
                l = guess + 1;
            else
                r = guess - 1;
        }
        return r;
    }
}