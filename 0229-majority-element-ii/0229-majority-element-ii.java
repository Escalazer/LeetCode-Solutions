class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int el1 = 0, el2 = 0;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && nums[i] != el2) {
                el1 = nums[i];
                count1 = 1;
            }
            else if (count2 == 0 && nums[i] != el1) {
                el2 = nums[i];
                count2 = 1;
            }
            else {
                if (el1 == nums[i]) count1++;
                else if (el2 == nums[i]) count2++;
                else {
                    count1--;
                    count2--;
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) count1++;
            else if (nums[i] == el2) count2++;
        }
        if (count1 > n / 3) ans.add(el1);
        if (count2 > n / 3) ans.add(el2);

        return ans;
    }
}