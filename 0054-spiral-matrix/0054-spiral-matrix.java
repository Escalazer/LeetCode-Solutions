class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                l.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                l.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i>= left; i--) {
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i>= top; i--) {
                    l.add(matrix[i][left]);
                }
                left++;
            }
        }
        return l;
    }
}