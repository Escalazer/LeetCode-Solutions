class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0)
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int factor = 1;
        while(true) {
            int potential_ans = k * factor;
            if (map.containsKey(potential_ans) == false)
                return potential_ans;
            factor++;
        }
    }
}