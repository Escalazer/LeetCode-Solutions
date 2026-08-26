class Solution {
    public int reverse(int x) {
        int sign = 1;
        if (x < 0) 
            sign = -1;
        int a = Math.abs(x);
        long ans = 0;
        while (a > 0) {
            ans = (ans * 10) + (a % 10);
            if ((ans * sign) > Integer.MAX_VALUE || (ans * sign) < Integer.MIN_VALUE)
                return 0;
            a = a / 10;
        }
        return (int) ans * sign;
    }
}