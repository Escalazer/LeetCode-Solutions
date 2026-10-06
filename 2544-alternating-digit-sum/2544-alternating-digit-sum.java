class Solution {
    public int alternateDigitSum(int n) {
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        int sum = 0;
        int count = 1;
        if (digits % 2 == 0) {
            while (n != 0) {
                int b = n % 10;
                if (count % 2 == 1)
                    sum -= b;
                else
                    sum += b;
                count++;
                n = n / 10;
            }
        }
        else {
            while (n != 0) {
                int b = n % 10;
                if (count % 2 == 1)
                    sum += b;
                else
                    sum -= b;
                count++;
                n = n / 10;
            }
        }
        return sum;
    }
}