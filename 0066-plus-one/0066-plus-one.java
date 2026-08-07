class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        int[] ans = new int[n];

        while (n >= 1) {
            carry += digits[n - 1];
            ans[n - 1] = carry % 10;
            carry = carry / 10;
            n--;
        }

        if (carry == 0) return ans;
        else {
            int[] ans2 = new int[digits.length + 1];
            ans2[0] = 1;
            for (int i = 1; i < ans2.length; i++) {
                ans2[i] = ans[i - 1];
            }
            return ans2;
        }
    }
}