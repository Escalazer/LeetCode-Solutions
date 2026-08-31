class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            int j = nums[i] - nums[i - 1] - 1; //j is the number of missing elemnets between the current and previous indices
            while (j > 0) {
                list.add(nums[i] - j);
                j--;
            }
        }
        return list;
    }
}