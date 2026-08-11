class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int pse, nse;
        Stack<Integer> st = new Stack<>();
        int area = 0, maxarea = 0;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
                int index = st.pop();
                nse = i;
                pse = (st.isEmpty()) ? -1 : st.peek();
                area = heights[index] * (nse - pse - 1);
                maxarea = Math.max(maxarea, area);
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int index = st.pop();
            nse = n;
            pse = (st.isEmpty()) ? -1 : st.peek();
            area = heights[index] * (nse - pse - 1);
            maxarea = Math.max(maxarea, area);
        }

        return maxarea;
    }
}