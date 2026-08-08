class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxlen = 0;
        int[] freq = new int[128];

        for (int r = 0; r < s.length(); r++) {
            freq[s.charAt(r)]++;

            while (freq[s.charAt(r)] > 1) {
                freq[s.charAt(l)]--;
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
        }

        return maxlen;
    }
}