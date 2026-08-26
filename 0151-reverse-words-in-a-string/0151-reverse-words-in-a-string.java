class Solution {
    public String reverseWords(String s) {
        StringBuilder a = new StringBuilder(s);
        a = a.reverse();
        String ans = "";
        int i = 0;
        while (i < a.length()) {
            StringBuilder temp = new StringBuilder();
            while (i < a.length() && a.charAt(i) != ' ') {
                temp.append(a.charAt(i));
                i++;
            }
            temp.reverse();
            if (temp.length() > 0)
                ans += " " + temp;

            i++;
        }
        ans = ans.trim();
        return ans;
    }
}