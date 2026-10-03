class Solution {
    public boolean isPalindrome(int x) {
        int a = x, c = 0;
        while (a != 0) {
            int b = a % 10;
            a = a / 10;
            c = c * 10 + b;
        }
        return (x >= 0) ? (c == x) : false;
    }
}