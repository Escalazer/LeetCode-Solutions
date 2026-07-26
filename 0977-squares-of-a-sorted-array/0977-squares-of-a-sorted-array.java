class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int[] res = new int[nums.length];
        int id = res.length - 1;;

        while (i <= j) {
            int s1 = nums[i]*nums[i];
            int s2 = nums[j]*nums[j];

            if (s1 > s2) {
                res[id--] = s1;
                i++;
            }
            else {
                res[id--] = s2;
                j--;
            }
        }
        return res;
    }
}