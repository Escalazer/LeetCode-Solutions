class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() <= k) return "0";

        Stack<Character> st = new Stack<>();
        char arr[] = num.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && k > 0 && st.peek() > arr[i]) {
                st.pop();
                k--;
            }
            st.push(arr[i]);
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        StringBuilder l = new StringBuilder();
        while (!st.isEmpty()) {
            l.append(st.pop());
        }
        l.reverse();

        int i = 0;
        while (i < l.length() - 1 && l.charAt(i) == '0') i++;

        return l.substring(i);
    }
}