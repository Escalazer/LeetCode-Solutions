class Solution {
    public int cankokoeat(int[] piles, int speed, int h) {
        int count = 0;
        for (int pile : piles) {
            count += (pile + speed - 1) / speed;
            
            if (count > h) return count;
        }
        return count;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int pile : piles) r = Math.max(r, pile);
        int guess = 0;
        int result = -1;

        while (l <= r) {
            guess = (l + r) / 2;

            if (cankokoeat(piles, guess, h) <= h) {
                result = guess;
                r = guess - 1;
            }
            else l = guess + 1;
        }
        return result;
    }
}