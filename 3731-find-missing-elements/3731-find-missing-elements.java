class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                int j = nums[i] - nums[i - 1];
                j--; // ex:- [0,1,2,5,6] j = 5 - 2 = 3. j-- = 2. 5 - 2 = 3. 5 - 1 = 4.
                while (j > 0) {
                    list.add(nums[i] - j);
                    j--;
                }
            }
        }
        return list;
    }
}