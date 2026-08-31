class Solution {
    public int maximumLengthSubstring(String s) {
        int map[] = new int[26];
        int n = s.length();
        int l = 0;
        int r = 0;
        int res = 0;
        while (r < n) {
            map[s.charAt(r) - 'a']++;
            while (map[s.charAt(r) - 'a'] > 2) {
                map[s.charAt(l) - 'a']--;
                l++;
            }
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;
    }
}