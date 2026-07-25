class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, h = matrix.length - 1;
        int guess = 0;
        int row = 0;
        
        //finding the row number
        while (l <= h) {
            guess = (l + h) / 2;
            
            if (matrix[guess][0] == target) return true;

            else if (matrix[guess][0] > target) h = guess - 1;

            else {
                row = guess;
                l = guess + 1;
            }
        }

        l = 0; h = matrix[0].length - 1;
        guess = 0;

        //finding the column number
        while (l <= h) {
            guess = (l + h) / 2;

            if (matrix[row][guess] == target) return true;

            else if (matrix[row][guess] > target) h = guess - 1;

            else l = guess + 1;
        }
        return false;
    }
}