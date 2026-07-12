class Solution {
    public int[] asteroidCollision(int[] a) {
        int n = a.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (a[i] > 0) st.push(a[i]);
            else {
                while (!st.empty() && st.peek() > 0 && -a[i] > st.peek()) st.pop();
                if (!st.empty() && -a[i] == st.peek()) st.pop();
                else if (st.empty() || st.peek() < 0) st.push(a[i]);
            }
        }
        int b = st.size();
        int[] ans = new int[b
        ];
        for (int i = b - 1; i >= 0; i--) {
            ans[i] = st.peek();
            st.pop();
        }

        return ans;
    }
}