class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        
        String ans = "";
        String temp = "";
        for (int i = 1; i < s.length(); i++) {
            // for odd length palindromic substring
            int low = i;
            int high = i;

            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
                if (low == -1 || high == s.length())
                    break;
            }

            temp = s.substring(low + 1, high);
            if (temp.length() > ans.length())
                ans = temp;
            
            //for even length palindromic substring
            low = i - 1;
            high = i;

            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
                if (low == -1 || high == s.length())
                    break;
            }

            temp = s.substring(low + 1, high);
            if (temp.length() > ans.length())
                ans = temp;
        }
        return ans;
    }
}