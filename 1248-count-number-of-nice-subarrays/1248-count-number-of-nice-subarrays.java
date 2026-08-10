class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i;
        int prefixsum = 0;
        int nicecount = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0 , 1);

        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                prefixsum += 1;
            }
            int check = prefixsum - k;
            nicecount += map.getOrDefault(check , 0);
            map.put(prefixsum, map.getOrDefault(prefixsum , 0) + 1);
        }
        return nicecount;
    }
}