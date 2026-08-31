class Solution {
    public boolean checkDivisibility(int n) {
        int a = n;
        int prod = 1;
        int digitsum = 0;
        while (a > 0) {
            prod *= a % 10;
            digitsum += a % 10;
            a = a / 10;
        }
        int sum = prod + digitsum;
        if (n % sum == 0) return true;
        else return false;
    }
}