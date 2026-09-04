class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = matrix[0][0];
        int r = matrix[m - 1][n - 1];
        while (l <= r) {
            int mid = (l + r) / 2;
            if (noslessthanequal(matrix, mid, m, n) < k)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }

    public int noslessthanequal(int matrix[][], int mid, int m, int n) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            int l = 0, r = n - 1;
            while (l <= r) {
                int guess = (l + r) / 2;
                if (matrix[i][guess] > mid)
                    r = guess - 1;
                else
                    l = guess + 1;
            }
            count += l;
        }
        return count;
    }
}