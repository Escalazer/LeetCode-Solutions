class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int windowlen = -1;
        int maxlen = -1;
        int maxfreq = -1;
        int[] freq = new int[26];

        for (r = 0; r < s.length(); r++) {
            freq[s.charAt(r) - 'A']++;

            maxfreq = Math.max(maxfreq, freq[s.charAt(r) - 'A']);

            windowlen = r - l + 1;

            while(windowlen - maxfreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
                windowlen = r - l + 1;
            }

            maxlen = Math.max(maxlen, windowlen);
        }
        return maxlen;
    }
}