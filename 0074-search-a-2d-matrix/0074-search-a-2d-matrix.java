class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int h = (m * n) - 1;
        int guess = 0;

        while (l <= h) {
            guess = (l + h) / 2;

            if (matrix[guess / n][guess % n] == target) return true;

            else if (matrix[guess / n][guess % n] > target) h = guess - 1;

            else l = guess + 1;
        }
        return false;
    }
}