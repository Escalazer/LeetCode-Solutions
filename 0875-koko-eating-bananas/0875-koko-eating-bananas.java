class Solution {
    public boolean cankokoeat(int[] piles, int speed, int h) {
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] % speed == 0) count += piles[i] / speed;
            else count += (piles[i] / speed) + 1; 

            if (count > h) return false;
        }
        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int pile : piles) r = Math.max(r, pile);
        int guess = 0;
        int result = -1;

        while (l <= r) {
            guess = (l + r) / 2;

            if (cankokoeat(piles, guess, h)) {
                result = guess;
                r = guess - 1;
            }
            else l = guess + 1;
        }
        return result;
    }
}