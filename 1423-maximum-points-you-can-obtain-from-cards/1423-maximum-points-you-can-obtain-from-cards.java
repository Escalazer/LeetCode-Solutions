class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0, rsum = 0;
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }
        int maxsum = lsum;
        int n = cardPoints.length;
        int rindex = n-1;
        for (int i = k-1; i >=0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[rindex]; 
            maxsum = Math.max(maxsum, lsum + rsum);
            rindex--;
        }
        return maxsum;
    }
}