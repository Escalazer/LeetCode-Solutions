class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, (k - 1));
    }

    public int atmost(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (r = 0; r < nums.length; r++) {
            //map1 is to store frequency of each integer
            //count1 is to count no of subarrays with <= k distinct numbers
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }

            count += r - l + 1;
        }
        return count;
    }
}