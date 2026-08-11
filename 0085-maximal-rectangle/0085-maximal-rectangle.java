class Solution {
    public int Largesthistogram(int[] heights) {
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
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i, j;
        int prefixsum[][] = new int[m][n];

        int maxarea = 0;

        for (i = 0; i < n; i++) {
            int sum = 0;
            for (j = 0; j < m; j++) {
                sum += 1;
                if (matrix[j][i] == '0') sum = 0;
                prefixsum[j][i] = sum;
            }
        }
        for (i = 0; i < m; i++) {
            maxarea = Math.max(maxarea, Largesthistogram(prefixsum[i]));
        }
        return maxarea;
    }
}