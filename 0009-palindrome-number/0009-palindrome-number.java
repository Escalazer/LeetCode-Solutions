class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int a = x, c = 0;
        while (a != 0) {
            int b = a % 10;
            a = a / 10;
            c = c * 10 + b;
        }
        return (c == x);
    }
}