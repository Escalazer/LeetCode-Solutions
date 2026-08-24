class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        int idx = 0;
        while (idx < Math.min(strs[0].length(), strs[n - 1].length())) {
            if (strs[0].charAt(idx) == strs[n - 1].charAt(idx))
                idx++;
            else
                break;
        }
        return strs[0].substring(0, idx);
    }
}