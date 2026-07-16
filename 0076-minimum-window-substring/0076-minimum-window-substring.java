class Solution {
    public boolean right(int[] needed, int[] have) {
        for (int j = 0; j< 256; j++) {
            if (have[j] < needed[j]) return false;
        }
        return true;            
    }

    public String minWindow(String s, String t) {
        int[] needed = new int[256];
        int[] have = new int[256];
        int m = s.length();
        int n = t.length();
        for (int i = 0; i < n; i++) {
            needed[t.charAt(i)]++;
        }
        int low = 0, len = 0, start = 0;
        int minl = Integer.MAX_VALUE;
        for (int high = 0; high < m; high++) {
            have[s.charAt(high)]++;
            while (right(needed, have)) {
                len = high - low + 1;
                if (minl > len) {
                    minl = len;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        if (minl == Integer.MAX_VALUE) return "";
        else return s.substring(start, start + minl);
    }
}