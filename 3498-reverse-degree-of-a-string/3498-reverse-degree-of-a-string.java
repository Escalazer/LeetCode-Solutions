class Solution {
    public int reverseDegree(String s) {
        int ans = 0, i;
        for (i = 0; i < s.length(); i++)
            ans += (i + 1) * (122 - s.charAt(i) + 1);

        return ans;
    }
}