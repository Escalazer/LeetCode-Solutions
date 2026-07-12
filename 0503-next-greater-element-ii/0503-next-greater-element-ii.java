class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[nums.length];
        int n = nums.length;

        for (int j = (2 * n) - 1; j >= 0; j--) {
            int i = j % n;
            while (!st.isEmpty() && nums[i] >= st.peek()) st.pop();

            if (j < n) {
                nge[i] = (st.isEmpty()) ? -1 : st.peek();            
            }
            st.push(nums[i]);
        }
        return nge;
    }
}