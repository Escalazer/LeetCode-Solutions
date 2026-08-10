class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int l1 = 0;
        int l2 = 0;
        int r = 0;
        int count1 = 0;
        int count2 = 0;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (r = 0; r < nums.length; r++) {
            //map1 is to store frequency of each integer
            //count1 is to count no of subarrays with <= k distinct numbers
            map1.put(nums[r], map1.getOrDefault(nums[r], 0) + 1);

            while (map1.size() > k) {
                map1.put(nums[l1], map1.get(nums[l1]) - 1);
                if (map1.get(nums[l1]) == 0) {
                    map1.remove(nums[l1]);
                }
                l1++;
            }

            if (map1.size() <= k) {
                count1 += r - l1 + 1;
            }

            //map2 is to store frequency of each integer
            //count2 is to count no of subarrays with < k distinct numbers
            map2.put(nums[r], map2.getOrDefault(nums[r], 0) + 1);

             while (map2.size() >= k) {
                map2.put(nums[l2], map2.get(nums[l2]) - 1);
                if (map2.get(nums[l2]) == 0) {
                    map2.remove(nums[l2]);
                }
                l2++;
            }
            if (map2.size() < k) {
                count2 += r - l2+ 1;
            }
        }
        return (count1 - count2);
    }
}