class Solution {
    public int MaxElementinRow(int mat[], int n) {
        int ans = -1;
        int maxelcolno = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i] > ans) {
                ans = mat[i];
                maxelcolno = i;
            }
        }
        return maxelcolno;
    }

    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int u = 0, d = m - 1; //u is the first row, d is the last row
        int maxelcolno = -1;

        while (u <= d) {
            int mid = (u + d) / 2;
            maxelcolno = MaxElementinRow(mat[mid], n);
            int up = (mid - 1 >= 0) ? mat[mid - 1][maxelcolno] : -1;
            int down = (mid + 1 < m) ? mat[mid + 1][maxelcolno] : -1;

            if (mat[mid][maxelcolno] > up && mat[mid][maxelcolno] > down)
                return new int[]{mid, maxelcolno};
            else if (mat[mid][maxelcolno] < up)
                d = mid - 1;
            else
                u = mid + 1;
        }
        return new int[]{-1, -1};
    }
}