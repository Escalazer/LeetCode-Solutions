class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int pse = -1;
        Stack<Integer> st = new Stack<>();
        int area = 0, maxarea = 0;

        for (int i = 0; i < n; i++) {

            if (st.isEmpty()) {
                st.push(i);
            }
            else if (heights[st.peek()] <= heights[i]) {
                st.push(i);
            }
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                int index = st.pop();

                if (st.isEmpty()) pse = -1;
                else pse = st.peek();

                area = heights[index] * (i - pse - 1);
                maxarea = Math.max(maxarea, area);
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int index = st.pop();
            
            if (st.isEmpty()) pse = -1;
            else pse = st.peek();

            area = heights[index] * (n - pse - 1);
            maxarea = Math.max(maxarea, area);
        }

        return maxarea;
    }
}