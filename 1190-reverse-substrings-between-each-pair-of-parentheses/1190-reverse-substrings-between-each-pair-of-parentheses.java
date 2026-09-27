class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Integer> open_brac_idx = new Stack<>();
        int door[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(')
                open_brac_idx.push(i);
            else if (s.charAt(i) == ')') {
                int j = open_brac_idx.pop();
                door[i] = j;
                door[j] = i;
            }
        }

        StringBuilder ans = new StringBuilder();
        int flag = 1;
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = door[i];
                flag = -1 * flag;
                i += flag;
            }
            else {
                ans.append(s.charAt(i));
                i += flag;
            }
        }

        return ans.toString();
    }
}