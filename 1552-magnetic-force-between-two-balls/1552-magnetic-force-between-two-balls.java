class Solution {
    public boolean canweplace(int[] position, int dist, int balls) {
        int ballcount = 1;
        int curr_pos = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - curr_pos >= dist) {
                ballcount++;
                curr_pos = position[i];
            }
            if (ballcount == balls) return true;
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1;
        int h = position[position.length - 1] - position[0];
        int guess = 0;
        int result = -1;

        while (l <= h) {
            guess = (l + h) / 2;

            if (canweplace(position, guess, m)) {
                result = guess;
                l = guess + 1;
            }
            else h = guess - 1;
        }
        return result;
    }
}