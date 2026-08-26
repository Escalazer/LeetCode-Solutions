class Solution {
    public String reverseWords(String s) {
        StringBuilder a = new StringBuilder(s);
        a = a.reverse();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < a.length()) {
            StringBuilder temp = new StringBuilder();
            while (i < a.length() && a.charAt(i) != ' ') {
                temp.append(a.charAt(i));
                i++;
            }
            temp.reverse();
            if (temp.length() > 0) {
                ans.append(" ");
                ans.append(temp);
            }

            i++;
        }
        return ans.substring(1);
    }
}