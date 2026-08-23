class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int row = 0;

        for (int i = 0; i < mat.length; i++) {
            int count = 0;

            for (int j = 0; j < mat[i].length; j++) {
                count += mat[i][j];
            }

            if (count > max) {
                max = count;
                row = i;
            }
        }

        return new int[]{row, max};
    }
}