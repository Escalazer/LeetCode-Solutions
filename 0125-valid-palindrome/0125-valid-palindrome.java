class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0;
        int j = a.length() - 1;

        while (i < j) {
            if (a.charAt(i) != a.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}