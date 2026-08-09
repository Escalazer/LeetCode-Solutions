class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixsum = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixsum += nums[i];
            int check = prefixsum - goal;
            count += map.getOrDefault(check, 0);
            map.put(prefixsum, (map.getOrDefault(prefixsum, 0) + 1));
        }
        return count;
    }
}