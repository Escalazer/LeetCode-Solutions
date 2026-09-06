class Solution {
    public void swap (char[] s, int l ,int r) {
        if (l >= r) return;
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        l++;
        r--;
        swap (s,l,r);
    }
    public void reverseString(char[] s) {
        int n = s.length;
        int l = 0;
        int r = n - 1;
        swap (s, l, r);
    }
}