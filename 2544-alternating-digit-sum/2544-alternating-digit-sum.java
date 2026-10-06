class Solution {
    public int alternateDigitSum(int n) {
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        int sum = 0;
        int sign = (digits % 2 == 0) ? -1 : 1;
        while (n != 0) {
            int b = n % 10;
            sum += b * sign;
            sign *= -1;
            n = n / 10;
        }
        return sum;
    }
}